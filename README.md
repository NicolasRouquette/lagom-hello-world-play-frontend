# Hello World

This project is based on the basic lagom/lagom-scala.g8 template
with a Play frontend added to it following the ideas described in this article:
https://xebia.com/blog/the-complete-picture-lagom-and-play-in-action-java/

Specifically, the templates instantiated were:

- `sbt new lagom/lagom-scala.gt --branch 1.5.x`
- `sbt new playframework/play-scala-seed.g8 --branch 2.7.x` (in the folder: `frontend`)

Unlike the article, this project is scala-only with compile-time dependency injection.

With Lagom 1.5.5 / Play 2.7.4 / Scala 2.12.9, this project exhibits the following:


```shell
sbt runAll
[info] Loading settings for project global-plugins from dependency-graph.sbt ...
[info] Loading global plugins from /home/rouquette/.sbt/1.0/plugins
[info] Loading settings for project hello-world-build from lagom.sbt,sbt-digest.sbt,plugins.sbt,sbt-requirejs.sbt,sbt-gzip.sbt ...
[info] Loading project definition from /opt/local/github.lagom/tests/hello-world/project
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Loading settings for project hello-world from build.sbt ...
[info] Set current project to hello-world (in build file:/opt/local/github.lagom/tests/hello-world/)
[info] Starting Kafka
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
[info] Starting Cassandra
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by javassist.util.proxy.SecurityActions (file:/home/rouquette/.cache/coursier/v1/https/repo1.maven.org/maven2/org/javassist/javassist/3.24.0-GA/javassist-3.24.0-GA.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of javassist.util.proxy.SecurityActions
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.apache.cassandra.utils.FBUtilities (file:/opt/local/github.lagom/tests/hello-world/target/embedded-cassandra/cassandra-bundle.jar) to field java.io.FileDescriptor.fd
WARNING: Please consider reporting this to the maintainers of org.apache.cassandra.utils.FBUtilities
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release

[info] Cassandra server running at 127.0.0.1:4000
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/home/rouquette/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/inject/guice/4.2.2/guice-4.2.2.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
2020-04-13T03:42:27.394Z [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
2020-04-13T03:42:28.144Z [warn] akka.actor.ActorSystemImpl [sourceThread=pool-19-thread-2, akkaSource=akka.actor.ActorSystemImpl(application), sourceActorSystem=application, akkaTimestamp=03:42:28.143UTC] - Detected that Hostname Verification is disabled globally (via ssl-config's akka.ssl-config.loose.disableHostnameVerification) for the Http extension! This is very dangerous and may expose you to man-in-the-middle attacks. If you are forced to interact with a server that is behaving such that you must disable this setting, please disable it for a given connection instead, by configuring a specific HttpsConnectionContext for use only for the trusted target that hostname verification would have blocked.
2020-04-13T03:42:28.452Z [info] com.lightbend.lagom.registry.impl.ServiceLocatorServer [] - Service locator can be reached at 127.0.0.1
2020-04-13T03:42:28.453Z [info] com.lightbend.lagom.registry.impl.ServiceLocatorServer [] - Service gateway can be reached at 127.0.0.1
[info] Service locator is running at http://127.0.0.1:9008
[info] Service gateway is running at http://127.0.0.1:9000
20:42:29.632 [info] play.core.server.AkkaHttpServer [] - Listening for HTTP on /127.0.0.1:49636
20:42:29.935 [info] play.core.server.AkkaHttpServer [] - Listening for HTTP on /127.0.0.1:53713
[info] Compiling 1 Scala source to /opt/local/github.lagom/tests/hello-world/hello-world-api/target/scala-2.12/classes ...
[info] Compiling 1 Scala source to /opt/local/github.lagom/tests/hello-world/hello-world-stream-api/target/scala-2.12/classes ...
20:42:30.198 [info] play.core.server.AkkaHttpServer [] - Listening for HTTP on /127.0.0.1:60417
[info] Compiling 2 Scala sources to /opt/local/github.lagom/tests/hello-world/hello-world-stream-impl/target/scala-2.12/classes ...
[info] Compiling 3 Scala sources to /opt/local/github.lagom/tests/hello-world/hello-world-impl/target/scala-2.12/classes ...
20:42:33.366 [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
20:42:34.219 [info] play.api.Play [] - Application started (Dev) (no global state)
[info] Compiling 10 Scala sources and 1 Java source to /opt/local/github.lagom/tests/hello-world/frontend/target/scala-2.12/classes ...
20:42:37.255 [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
20:42:37.276 [info] akka.remote.Remoting [sourceThread=pool-19-thread-8, akkaSource=akka.remote.Remoting, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:42:37.275UTC] - Starting remoting
20:42:37.379 [info] akka.remote.Remoting [sourceThread=pool-19-thread-8, akkaSource=akka.remote.Remoting, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:42:37.379UTC] - Remoting started; listening on addresses :[akka.tcp://hello-world-impl-application@127.0.0.1:43283]
20:42:37.381 [info] akka.remote.Remoting [sourceThread=pool-19-thread-8, akkaTimestamp=03:42:37.380UTC, akkaSource=akka.remote.Remoting, sourceActorSystem=hello-world-impl-application] - Remoting now listens on addresses: [akka.tcp://hello-world-impl-application@127.0.0.1:43283]
20:42:37.393 [info] akka.cluster.Cluster(akka://hello-world-impl-application) [sourceThread=pool-19-thread-8, akkaTimestamp=03:42:37.393UTC, akkaSource=akka.cluster.Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application] - Cluster Node [akka.tcp://hello-world-impl-application@127.0.0.1:43283] - Starting up, Akka version [2.5.26] ...
20:42:37.416 [info] akka.cluster.Cluster(akka://hello-world-impl-application) [sourceThread=pool-19-thread-8, akkaTimestamp=03:42:37.415UTC, akkaSource=akka.cluster.Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application] - Cluster Node [akka.tcp://hello-world-impl-application@127.0.0.1:43283] - Registered cluster JMX MBean [akka:type=Cluster,port=43283]
20:42:37.416 [info] akka.cluster.Cluster(akka://hello-world-impl-application) [sourceThread=pool-19-thread-8, akkaTimestamp=03:42:37.416UTC, akkaSource=akka.cluster.Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application] - Cluster Node [akka.tcp://hello-world-impl-application@127.0.0.1:43283] - Started up successfully
20:42:37.439 [info] akka.cluster.Cluster(akka://hello-world-impl-application) [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-3, akkaTimestamp=03:42:37.438UTC, akkaSource=akka.cluster.Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application] - Cluster Node [akka.tcp://hello-world-impl-application@127.0.0.1:43283] - No seed-nodes configured, manual cluster join required, see https://doc.akka.io/docs/akka/current/cluster-usage.html#joining-to-seed-nodes
20:42:37.501 [info] akka.cluster.Cluster(akka://hello-world-impl-application) [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-3, akkaSource=akka.cluster.Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:42:37.500UTC] - Cluster Node [akka.tcp://hello-world-impl-application@127.0.0.1:43283] - Node [akka.tcp://hello-world-impl-application@127.0.0.1:43283] is JOINING itself (with roles [dc-default]) and forming new cluster
20:42:37.502 [info] akka.cluster.Cluster(akka://hello-world-impl-application) [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-3, akkaTimestamp=03:42:37.502UTC, akkaSource=akka.cluster.Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application] - Cluster Node [akka.tcp://hello-world-impl-application@127.0.0.1:43283] - is the new leader among reachable nodes (more leaders may exist)
20:42:37.509 [info] akka.cluster.Cluster(akka://hello-world-impl-application) [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-3, akkaTimestamp=03:42:37.509UTC, akkaSource=akka.cluster.Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application] - Cluster Node [akka.tcp://hello-world-impl-application@127.0.0.1:43283] - Leader is moving node [akka.tcp://hello-world-impl-application@127.0.0.1:43283] to [Up]
20:42:37.810 [info] akka.cluster.singleton.ClusterSingletonManager [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-4, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/user/cassandraOffsetStorePrepare-singleton, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:42:37.810UTC] - Singleton manager starting singleton actor [akka://hello-world-impl-application/user/cassandraOffsetStorePrepare-singleton/singleton]
20:42:37.811 [info] akka.cluster.singleton.ClusterSingletonManager [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-4, akkaTimestamp=03:42:37.811UTC, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/user/cassandraOffsetStorePrepare-singleton, sourceActorSystem=hello-world-impl-application] - ClusterSingletonManager state change [Start -> Oldest]
20:42:37.816 [info] com.lightbend.lagom.internal.persistence.cluster.ClusterStartupTaskActor [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-4, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/user/cassandraOffsetStorePrepare-singleton/singleton/cassandraOffsetStorePrepare, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:42:37.815UTC] - Executing cluster start task cassandraOffsetStorePrepare.
20:42:37.846 [info] akka.cluster.singleton.ClusterSingletonManager [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-19, akkaTimestamp=03:42:37.846UTC, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/system/sharding/kafkaProducer-greetingsCoordinator, sourceActorSystem=hello-world-impl-application] - Singleton manager starting singleton actor [akka://hello-world-impl-application/system/sharding/kafkaProducer-greetingsCoordinator/singleton]
20:42:37.846 [info] akka.cluster.singleton.ClusterSingletonManager [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-19, akkaTimestamp=03:42:37.846UTC, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/system/sharding/kafkaProducer-greetingsCoordinator, sourceActorSystem=hello-world-impl-application] - ClusterSingletonManager state change [Start -> Oldest]
20:42:37.872 [info] akka.cluster.singleton.ClusterSingletonManager [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-21, akkaTimestamp=03:42:37.872UTC, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/system/sharding/HelloWorldEntityCoordinator, sourceActorSystem=hello-world-impl-application] - Singleton manager starting singleton actor [akka://hello-world-impl-application/system/sharding/HelloWorldEntityCoordinator/singleton]
20:42:37.873 [info] akka.cluster.singleton.ClusterSingletonManager [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-21, akkaTimestamp=03:42:37.872UTC, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/system/sharding/HelloWorldEntityCoordinator, sourceActorSystem=hello-world-impl-application] - ClusterSingletonManager state change [Start -> Oldest]
20:42:37.875 [info] akka.cluster.sharding.DDataShardCoordinator [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-2, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/system/sharding/kafkaProducer-greetingsCoordinator/singleton/coordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:42:37.875UTC] - ShardCoordinator was moved to the active state State(Map())
20:42:37.875 [info] akka.cluster.sharding.DDataShardCoordinator [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-4, akkaTimestamp=03:42:37.875UTC, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/system/sharding/HelloWorldEntityCoordinator/singleton/coordinator, sourceActorSystem=hello-world-impl-application] - ShardCoordinator was moved to the active state State(Map())
2020-04-12 20:42:38 INFO  play.api.Play  Application started (Dev) (no global state)
20:42:38.151 [info] play.api.Play [] - Application started (Dev) (no global state)
[info] Service hello-world-impl listening for HTTP on 127.0.0.1:53713
[info] Service frontend listening for HTTP on 127.0.0.1:60417
[info] Service hello-world-stream-impl listening for HTTP on 127.0.0.1:49636
[info] (Services started, press enter to stop and go back to the console...)
20:42:38.522 [info] com.lightbend.lagom.internal.persistence.cluster.ClusterStartupTaskActor [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-21, akkaTimestamp=03:42:38.522UTC, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/user/cassandraOffsetStorePrepare-singleton/singleton/cassandraOffsetStorePrepare, sourceActorSystem=hello-world-impl-application] - Cluster start task cassandraOffsetStorePrepare done.
20:42:38.794 [info] akka.cluster.singleton.ClusterSingletonProxy [sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-21, akkaTimestamp=03:42:38.793UTC, akkaSource=akka.tcp://hello-world-impl-application@127.0.0.1:43283/user/cassandraOffsetStorePrepare-singletonProxy, sourceActorSystem=hello-world-impl-application] - Singleton identified at [akka://hello-world-impl-application/user/cassandraOffsetStorePrepare-singleton/singleton]

```

And in a separate terminal:

```shell
╰─ curl -s http://localhost:9008/services | jq .                                                                                                                                                  ✔  kube/caesar-test ⎈  1475  20:41:11 
[
  {
    "name": "frontend",
    "url": "http://127.0.0.1:60417",
    "portName": "http"
  },
  {
    "name": "frontend",
    "url": "http://127.0.0.1:60417",
    "portName": null
  },
  {
    "name": "hello-world",
    "url": "http://127.0.0.1:53713",
    "portName": "http"
  },
  {
    "name": "hello-world-stream",
    "url": "http://127.0.0.1:49636",
    "portName": "http"
  },
  {
    "name": "cas_native",
    "url": "tcp://127.0.0.1:4000/cas_native",
    "portName": null
  },
  {
    "name": "cas_native",
    "url": "tcp://127.0.0.1:4000/cas_native",
    "portName": "tcp"
  },
  {
    "name": "kafka_native",
    "url": "tcp://localhost:9092/kafka_native",
    "portName": "tcp"
  },
  {
    "name": "hello-world-stream",
    "url": "http://127.0.0.1:49636",
    "portName": null
  },
  {
    "name": "hello-world",
    "url": "http://127.0.0.1:53713",
    "portName": null
  },
  {
    "name": "kafka_native",
    "url": "tcp://localhost:9092/kafka_native",
    "portName": null
  }
]
╭─ rouquette@rouquette-Precision-7530  …/github.imce-caesar/caesar-services-branch-integration   master ●  
╰─ curl -s http://127.0.0.1:60417/hello/Nicolas                                                                                                                                                   ✔  kube/caesar-test ⎈  1477  20:42:44 


<!DOCTYPE html>
<html lang="en">
    <head>
        
        <title>Hello, Nicolas!</title>
        <link rel="stylesheet" media="screen" href="/assets/stylesheets/main.css">
        <link rel="shortcut icon" type="image/png" href="/assets/images/favicon.png">

    </head>
    <body>
        
        
    <h1>Welcome to Play!</h1>


      <script src="/assets/javascripts/main.js" type="text/javascript"></script>
    </body>
</html>

╭─ rouquette@rouquette-Precision-7530  …/github.imce-caesar/caesar-services-branch-integration   master ●  
╰─ curl -v http://127.0.0.1:9000/hello/Nicolas                                                                                                                                                    ✔  kube/caesar-test ⎈  1478  20:42:50 
*   Trying 127.0.0.1:9000...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9000 (#0)
> GET /hello/Nicolas HTTP/1.1
> Host: 127.0.0.1:9000
> User-Agent: curl/7.65.3
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< Date: Mon, 13 Apr 2020 03:42:56 GMT
< Server: akka-http/10.1.11
< Content-Type: text/html; charset=UTF-8
< Content-Length: 439
< 


<!DOCTYPE html>
<html lang="en">
    <head>
        
        <title>Hello, Nicolas!</title>
        <link rel="stylesheet" media="screen" href="/assets/stylesheets/main.css">
        <link rel="shortcut icon" type="image/png" href="/assets/images/favicon.png">

    </head>
    <body>
        
        
    <h1>Welcome to Play!</h1>


      <script src="/assets/javascripts/main.js" type="text/javascript"></script>
    </body>
</html>

* Connection #0 to host 127.0.0.1 left intact
```

The behavior is as expected.