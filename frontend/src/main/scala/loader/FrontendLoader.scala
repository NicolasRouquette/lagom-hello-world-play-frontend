package loader

import com.lightbend.lagom.scaladsl.akka.discovery.AkkaDiscoveryComponents
import com.lightbend.lagom.scaladsl.devmode.LagomDevModeComponents
import play.api.ApplicationLoader.Context
import play.api.{Application, ApplicationLoader, Mode}

class FrontendLoader extends ApplicationLoader {

  override def load(context: Context): Application = {
    context.environment.mode match {
      case Mode.Dev => loadDevMode(context)
      case _        => loadInternal(context)
    }
  }

  def loadInternal(context: Context): Application =
    (new Frontend(context, Seq.empty) with AkkaDiscoveryComponents).application

  def loadDevMode(context: Context): Application =
    (new Frontend(context, Seq.empty) with LagomDevModeComponents).application

}
