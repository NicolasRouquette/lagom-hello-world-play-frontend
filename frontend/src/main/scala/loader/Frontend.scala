package loader

import com.example.helloworld.api.HelloWorldService
import com.github.ghik.silencer.silent
import com.softwaremill.macwire.wire
import com.lightbend.lagom.scaladsl.api.{LagomConfigComponent, ProvidesAdditionalConfiguration, ServiceAcl, ServiceInfo}
import com.lightbend.lagom.scaladsl.client.LagomServiceClientComponents
import com.lightbend.lagom.scaladsl.playjson.ProvidesJsonSerializerRegistry
import com.lightbend.lagom.scaladsl.server.AkkaManagementComponents
import controllers.{AssetsComponents, AssetsFinder, HomeController}
import org.webjars.play.{RequireJS, WebJarAssets, WebJarsUtil}
import play.api.ApplicationLoader.Context
import play.api.inject.ApplicationLifecycle
import play.api.libs.ws.ahc.AhcWSComponents
import play.api.mvc.EssentialFilter
import play.api.{BuiltInComponentsFromContext, Configuration, Environment}

import scala.collection.immutable
import scala.concurrent.ExecutionContext

abstract class Frontend(
    context: Context,
    override val httpFilters: Seq[EssentialFilter]
) extends BuiltInComponentsFromContext(context)
  with ProvidesAdditionalConfiguration
  with ProvidesJsonSerializerRegistry
  with LagomServiceClientComponents
  with LagomConfigComponent
  with AkkaManagementComponents
  with AssetsComponents
  with AhcWSComponents {

  override lazy val environment: Environment = context.environment

  override lazy val configuration: Configuration = {
    Configuration.load(environment) ++ context.initialConfiguration
  }

  override lazy val applicationLifecycle: ApplicationLifecycle = context.lifecycle

  implicit override lazy val executionContext: ExecutionContext = actorSystem.dispatcher

  override lazy val serviceInfo: ServiceInfo = ServiceInfo(
    "frontend",
    Map(
      "frontend" -> immutable.Seq(ServiceAcl.forPathRegex("(?!/api/).*"))
    )
  )

  implicit override val assetsFinder: AssetsFinder = assetsMetadata.finder

  lazy val helloWorldService: HelloWorldService =
    serviceClient.implement[HelloWorldService]

  lazy val frontend: HomeController = wire[HomeController]

  implicit lazy val webjarUtils: WebJarsUtil = wire[WebJarsUtil]

  implicit lazy val webjarAssets: WebJarAssets = wire[WebJarAssets]

  lazy val requireJS: RequireJS = wire[RequireJS]

  override lazy val router: _root_.router.Routes = {
    val webjarRoutes @ _: _root_.webjars.Routes = wire[_root_.webjars.Routes]

    @silent val prefix = "/"
    wire[_root_.router.Routes]
  }
}
