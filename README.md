# Hello World with Play frontend

This project is based on the basic lagom/lagom-scala.g8 template
with a Play frontend added to it following the ideas described in this article:
https://xebia.com/blog/the-complete-picture-lagom-and-play-in-action-java/

Specifically, the templates instantiated were:

- `sbt new lagom/lagom-scala.gt --branch 1.6.x`
- `sbt new playframework/play-scala-seed.g8 --branch 2.8.x` (in the folder: `frontend`)

Unlike the article, this project is scala-only with compile-time dependency injection.

With Lagom 1.6.1 / Play 2.8.0 / Scala 2.13.1, this project exhibits the following:

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
[info] Starting Cassandra
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
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
2020-04-13T03:33:37.843Z [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
2020-04-13T03:33:38.740Z [warn] akka.actor.ActorSystemImpl [akkaAddress=akka://application, sourceThread=pool-19-thread-1, akkaSource=akka.actor.ActorSystemImpl(application), sourceActorSystem=application, akkaTimestamp=03:33:38.740UTC] - Detected that Hostname Verification is disabled globally (via ssl-config's akka.ssl-config.loose.disableHostnameVerification) for the Http extension! This is very dangerous and may expose you to man-in-the-middle attacks. If you are forced to interact with a server that is behaving such that you must disable this setting, please disable it for a given connection instead, by configuring a specific HttpsConnectionContext for use only for the trusted target that hostname verification would have blocked.
2020-04-13T03:33:39.051Z [info] com.lightbend.lagom.registry.impl.ServiceLocatorServer [] - Service locator can be reached at 127.0.0.1
2020-04-13T03:33:39.052Z [info] com.lightbend.lagom.registry.impl.ServiceLocatorServer [] - Service gateway can be reached at localhost
[info] Service locator is running at http://127.0.0.1:9008
[info] Service gateway is running at http://127.0.0.1:9000
20:33:39.861 [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
20:33:39.942 [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
20:33:40.696 [info] play.core.server.AkkaHttpServer [] - Listening for HTTP on /127.0.0.1:49636
[info] Compiling 1 Scala source to /opt/local/github.lagom/tests/hello-world/hello-world-api/target/scala-2.13/classes ...
[info] Compiling 1 Scala source to /opt/local/github.lagom/tests/hello-world/hello-world-stream-api/target/scala-2.13/classes ...
[info] p.c.s.AkkaHttpServer - Listening for HTTP on /127.0.0.1:60417
20:33:40.946 [info] play.core.server.AkkaHttpServer [] - Listening for HTTP on /127.0.0.1:53713
[info] Compiling 2 Scala sources to /opt/local/github.lagom/tests/hello-world/hello-world-stream-impl/target/scala-2.13/classes ...
[info] Compiling 3 Scala sources to /opt/local/github.lagom/tests/hello-world/hello-world-impl/target/scala-2.13/classes ...
20:33:43.997 [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
20:33:44.746 [info] play.api.Play [] - Application started (Dev) (no global state)
20:33:45.636 [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
[info] Compiling 10 Scala sources and 1 Java source to /opt/local/github.lagom/tests/hello-world/frontend/target/scala-2.13/classes ...
20:33:45.898 [info] akka.remote.artery.tcp.ArteryTcpTransport [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=pool-19-thread-10, akkaSource=ArteryTcpTransport(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:45.897UTC] - Remoting started with transport [Artery tcp]; listening on address [akka://hello-world-impl-application@127.0.0.1:42177] with UID [1388289847101755994]
20:33:45.914 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=pool-19-thread-10, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:45.913UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:42177] - Starting up, Akka version [2.6.3] ...
20:33:45.944 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=pool-19-thread-10, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:45.944UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:42177] - Registered cluster JMX MBean [akka:type=Cluster,port=42177]
20:33:45.944 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=pool-19-thread-10, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:45.944UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:42177] - Started up successfully
20:33:45.972 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-13, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:45.972UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:42177] - No downing-provider-class configured, manual cluster downing required, see https://doc.akka.io/docs/akka/current/typed/cluster.html#downing
20:33:45.972 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-13, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:45.972UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:42177] - No seed-nodes configured, manual cluster join required, see https://doc.akka.io/docs/akka/current/typed/cluster.html#joining
20:33:46.231 [info] akka.cluster.Cluster [akkaRemoteAddressUid=1388289847101755994, akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-14, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaRemoteAddress=akka://hello-world-impl-application@127.0.0.1:42177, akkaTimestamp=03:33:46.230UTC, akkaMemberStatus=Joining] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:42177] - Node [akka://hello-world-impl-application@127.0.0.1:42177] is JOINING itself (with roles [dc-default]) and forming new cluster
20:33:46.234 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-14, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.233UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:42177] - is the new leader among reachable nodes (more leaders may exist)
20:33:46.241 [info] akka.cluster.Cluster [akkaRemoteAddressUid=1388289847101755994, akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-14, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaRemoteAddress=akka://hello-world-impl-application@127.0.0.1:42177, akkaTimestamp=03:33:46.241UTC, akkaMemberStatus=Up] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:42177] - Leader is moving node [akka://hello-world-impl-application@127.0.0.1:42177] to [Up]
20:33:46.655 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-2, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/user/cassandraOffsetStorePrepare-singleton, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.655UTC] - Singleton manager starting singleton actor [akka://hello-world-impl-application/user/cassandraOffsetStorePrepare-singleton/singleton]
20:33:46.657 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-2, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/user/cassandraOffsetStorePrepare-singleton, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.657UTC] - ClusterSingletonManager state change [Start -> Oldest]
20:33:46.662 [info] com.lightbend.lagom.internal.persistence.cluster.ClusterStartupTaskActor [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-16, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/user/cassandraOffsetStorePrepare-singleton/singleton/cassandraOffsetStorePrepare, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.662UTC] - Executing cluster start task cassandraOffsetStorePrepare.
20:33:46.699 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-13, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/system/sharding/kafkaProducer-greetingsCoordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.699UTC] - Singleton manager starting singleton actor [akka://hello-world-impl-application/system/sharding/kafkaProducer-greetingsCoordinator/singleton]
20:33:46.700 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-13, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/system/sharding/kafkaProducer-greetingsCoordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.699UTC] - ClusterSingletonManager state change [Start -> Oldest]
20:33:46.727 [info] akka.cluster.sharding.ShardRegion [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-13, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/system/sharding/kafkaProducer-greetings, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.727UTC] - kafkaProducer-greetings: Idle entities will be passivated after [2.000 min]
20:33:46.731 [info] akka.cluster.sharding.DDataShardCoordinator [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-16, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/system/sharding/kafkaProducer-greetingsCoordinator/singleton/coordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.731UTC] - ShardCoordinator was moved to the active state State(Map())
20:33:46.736 [info] akka.cluster.sharding.typed.scaladsl.ClusterSharding [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=pool-19-thread-10, akkaSource=ClusterSharding(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.736UTC] - Starting Shard Region [HelloWorldAggregate]...
20:33:46.741 [info] akka.cluster.sharding.ShardRegion [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-3, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/system/sharding/HelloWorldAggregate, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.741UTC] - HelloWorldAggregate: Idle entities will be passivated after [2.000 min]
20:33:46.745 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-2, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/system/sharding/HelloWorldAggregateCoordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.745UTC] - Singleton manager starting singleton actor [akka://hello-world-impl-application/system/sharding/HelloWorldAggregateCoordinator/singleton]
20:33:46.745 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-2, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/system/sharding/HelloWorldAggregateCoordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.745UTC] - ClusterSingletonManager state change [Start -> Oldest]/ compileIncremental 0s
20:33:46.749 [info] akka.cluster.sharding.DDataShardCoordinator [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-16, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/system/sharding/HelloWorldAggregateCoordinator/singleton/coordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:46.748UTC] - ShardCoordinator was moved to the active state State(Map())
20:33:46.994 [info] play.api.Play [] - Application started (Dev) (no global state)
20:33:47.590 [info] com.lightbend.lagom.internal.persistence.cluster.ClusterStartupTaskActor [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-16, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/user/cassandraOffsetStorePrepare-singleton/singleton/cassandraOffsetStorePrepare, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:47.590UTC] - Cluster start task cassandraOffsetStorePrepare done.
20:33:47.613 [info] akka.cluster.singleton.ClusterSingletonProxy [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-21, akkaSource=akka://hello-world-impl-application@127.0.0.1:42177/user/cassandraOffsetStorePrepare-singletonProxy, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:47.613UTC] - Singleton identified at [akka://hello-world-impl-application/user/cassandraOffsetStorePrepare-singleton/singleton]
20:33:48.521 [info] akka.persistence.cassandra.query.EventsByTagStage [akkaAddress=akka://hello-world-impl-application@127.0.0.1:42177, sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-16, akkaSource=EventsByTagStage(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:33:48.521UTC] - [30bb2317-f984-41a1-8e75-7fce7832f8c4]: EventsByTag query [com.example.helloworld.impl.HelloWorldEvent] starting with EC delay 5000ms: fromOffset [b67b4000-db52-11e5-8080-808080808080 (2016-02-25 00:00:00:000)] toOffset [None]
2020-04-12 20:33:49 INFO  play.api.Play  Application started (Dev) (no global state)
[info] Service hello-world-impl listening for HTTP on 127.0.0.1:53713
[info] Service frontend listening for HTTP on 127.0.0.1:60417
[info] Service hello-world-stream-impl listening for HTTP on 127.0.0.1:49636
[info] (Services started, press enter to stop and go back to the console...)
```

Then, from a separate terminal:

```shell
╰─ curl -s http://localhost:9008/services | jq .                                                                                                                                                  ✔  kube/caesar-test ⎈  1466  20:34:42 
[
  {
    "name": "frontend",
    "url": "http://0.0.0.0:9000",
    "portName": "http"
  },
  {
    "name": "frontend",
    "url": "http://0.0.0.0:9000",
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
```

Note that the address of the frontend is http://0.0.0.0:9000.
Based on the SBT output above, we also know that the frontend is listening at http://127.0.0.1:60417

```shell
curl -s http://127.0.0.1:60417/hello/Nicolas                                                                                                                                                   ✔  kube/caesar-test ⎈  1467  20:34:48


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

```

But trying to do this on the service gateway fails:

```shell
curl -v http://127.0.0.1:9000/hello/Nicolas                                                                                                                                                    ✔  kube/caesar-test ⎈  1469  20:37:11
*   Trying 127.0.0.1:9000...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9000 (#0)
> GET /hello/Nicolas HTTP/1.1
> Host: 127.0.0.1:9000
> User-Agent: curl/7.65.3
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 500 Internal Server Error
< Server: akka-http/10.1.11
< Date: Mon, 13 Apr 2020 03:37:17 GMT
< Connection: close
< Content-Length: 0
< 
* Closing connection 0

```

Meanwhile, the sbt shell shows this output:

```shell
2020-04-13T03:37:11.253Z [error] akka.actor.ActorSystemImpl [akkaAddress=akka://application, sourceThread=application-akka.actor.default-dispatcher-18, akkaSource=akka.actor.ActorSystemImpl(application), sourceActorSystem=application, akkaTimestamp=03:37:11.245UTC] - Internal server error, sending 500 response
akka.stream.StreamTcpException: Tcp command [Connect(0.0.0.0:9000,None,List(),Some(10 seconds),true)] failed because of java.net.ConnectException: Connection refused
Caused by: java.net.ConnectException: Connection refused
        at java.base/sun.nio.ch.SocketChannelImpl.checkConnect(Native Method)
        at java.base/sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:779)
        at akka.io.TcpOutgoingConnection$$anonfun$connecting$1.$anonfun$applyOrElse$3(TcpOutgoingConnection.scala:104)
        at akka.io.TcpOutgoingConnection.akka$io$TcpOutgoingConnection$$reportConnectFailure(TcpOutgoingConnection.scala:51)
        at akka.io.TcpOutgoingConnection$$anonfun$connecting$1.applyOrElse(TcpOutgoingConnection.scala:104)
        at akka.actor.Actor.aroundReceive(Actor.scala:534)
        at akka.actor.Actor.aroundReceive$(Actor.scala:532)
        at akka.io.TcpConnection.aroundReceive(TcpConnection.scala:32)
        at akka.actor.ActorCell.receiveMessage(ActorCell.scala:573)
  | => Tat akka.actor.ActorCell.invoke(ActorCell.scala:543)
        at akka.dispatch.Mailbox.processMailbox(Mailbox.scala:269)
        at akka.dispatch.Mailbox.run(Mailbox.scala:230)
        at akka.dispatch.Mailbox.exec(Mailbox.scala:242)
        at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:290)
        at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1020)
        at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1656)
        at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1594)
        at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:177)

```

Tried the following:

```shell
sbt -Dhttp.address=127.0.0.1 runAll                                                                                                                                                                                                                                                                                                                                                         ✔  kube/caesar-test ⎈  ⚙  1463  20:38:08
[info] Loading settings for project global-plugins from dependency-graph.sbt ...
[info] Loading global plugins from /home/rouquette/.sbt/1.0/plugins
[info] Loading settings for project hello-world-build from lagom.sbt,sbt-digest.sbt,plugins.sbt,sbt-requirejs.sbt,sbt-gzip.sbt ...
[info] Loading project definition from /opt/local/github.lagom/tests/hello-world/project
[info] Loading settings for project hello-world from build.sbt ...
[info] Set current project to hello-world (in build file:/opt/local/github.lagom/tests/hello-world/)
[info] Starting Kafka
[info] Starting Cassandra
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
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
2020-04-13T03:38:30.455Z [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
2020-04-13T03:38:31.410Z [warn] akka.actor.ActorSystemImpl [akkaAddress=akka://application, sourceThread=pool-12-thread-1, akkaSource=akka.actor.ActorSystemImpl(application), sourceActorSystem=application, akkaTimestamp=03:38:31.409UTC] - Detected that Hostname Verification is disabled globally (via ssl-config's akka.ssl-config.loose.disableHostnameVerification) for the Http extension! This is very dangerous and may expose you to man-in-the-middle attacks. If you are forced to interact with a server that is behaving such that you must disable this setting, please disable it for a given connection instead, by configuring a specific HttpsConnectionContext for use only for the trusted target that hostname verification would have blocked.
2020-04-13T03:38:31.613Z [info] com.lightbend.lagom.registry.impl.ServiceLocatorServer [] - Service locator can be reached at 127.0.0.1
2020-04-13T03:38:31.614Z [info] com.lightbend.lagom.registry.impl.ServiceLocatorServer [] - Service gateway can be reached at localhost
[info] Service locator is running at http://127.0.0.1:9008
[info] Service gateway is running at http://127.0.0.1:9000
20:38:32.462 [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
20:38:32.464 [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
20:38:33.366 [info] play.core.server.AkkaHttpServer [] - Listening for HTTP on /127.0.0.1:49636
20:38:33.371 [info] play.core.server.AkkaHttpServer [] - Listening for HTTP on /127.0.0.1:53713
[info] p.c.s.AkkaHttpServer - Listening for HTTP on /127.0.0.1:60417
20:38:33.890 [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
20:38:34.601 [info] akka.event.slf4j.Slf4jLogger [] - Slf4jLogger started
20:38:34.653 [info] play.api.Play [] - Application started (Dev) (no global state)
20:38:34.764 [info] akka.remote.artery.tcp.ArteryTcpTransport [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=pool-12-thread-14, akkaSource=ArteryTcpTransport(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:34.763UTC] - Remoting started with transport [Artery tcp]; listening on address [akka://hello-world-impl-application@127.0.0.1:43807] with UID [7853859112804265459]
20:38:34.800 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=pool-12-thread-14, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:34.800UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:43807] - Starting up, Akka version [2.6.3] ...
20:38:34.842 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=pool-12-thread-14, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:34.842UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:43807] - Registered cluster JMX MBean [akka:type=Cluster,port=43807]
20:38:34.842 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=pool-12-thread-14, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:34.842UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:43807] - Started up successfully
20:38:34.874 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-5, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:34.874UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:43807] - No downing-provider-class configured, manual cluster downing required, see https://doc.akka.io/docs/akka/current/typed/cluster.html#downing
20:38:34.874 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-5, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:34.874UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:43807] - No seed-nodes configured, manual cluster join required, see https://doc.akka.io/docs/akka/current/typed/cluster.html#joining
20:38:35.125 [info] akka.cluster.Cluster [akkaRemoteAddressUid=7853859112804265459, akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-5, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaRemoteAddress=akka://hello-world-impl-application@127.0.0.1:43807, akkaTimestamp=03:38:35.125UTC, akkaMemberStatus=Joining] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:43807] - Node [akka://hello-world-impl-application@127.0.0.1:43807] is JOINING itself (with roles [dc-default]) and forming new cluster
20:38:35.127 [info] akka.cluster.Cluster [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-5, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.127UTC] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:43807] - is the new leader among reachable nodes (more leaders may exist)
20:38:35.131 [info] akka.cluster.Cluster [akkaRemoteAddressUid=7853859112804265459, akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-5, akkaSource=Cluster(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaRemoteAddress=akka://hello-world-impl-application@127.0.0.1:43807, akkaTimestamp=03:38:35.131UTC, akkaMemberStatus=Up] - Cluster Node [akka://hello-world-impl-application@127.0.0.1:43807] - Leader is moving node [akka://hello-world-impl-application@127.0.0.1:43807] to [Up]
20:38:35.454 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-14, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/user/cassandraOffsetStorePrepare-singleton, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.454UTC] - Singleton manager starting singleton actor [akka://hello-world-impl-application/user/cassandraOffsetStorePrepare-singleton/singleton]
20:38:35.455 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-14, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/user/cassandraOffsetStorePrepare-singleton, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.455UTC] - ClusterSingletonManager state change [Start -> Oldest]
20:38:35.459 [info] com.lightbend.lagom.internal.persistence.cluster.ClusterStartupTaskActor [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-17, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/user/cassandraOffsetStorePrepare-singleton/singleton/cassandraOffsetStorePrepare, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.459UTC] - Executing cluster start task cassandraOffsetStorePrepare.
20:38:35.489 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-14, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/system/sharding/kafkaProducer-greetingsCoordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.488UTC] - Singleton manager starting singleton actor [akka://hello-world-impl-application/system/sharding/kafkaProducer-greetingsCoordinator/singleton]
20:38:35.489 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-14, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/system/sharding/kafkaProducer-greetingsCoordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.489UTC] - ClusterSingletonManager state change [Start -> Oldest]
2020-04-12 20:38:35 INFO  play.api.Play  Application started (Dev) (no global state)
20:38:35.506 [info] akka.cluster.sharding.ShardRegion [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-14, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/system/sharding/kafkaProducer-greetings, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.506UTC] - kafkaProducer-greetings: Idle entities will be passivated after [2.000 min]gomRun 2s
20:38:35.513 [info] akka.cluster.sharding.typed.scaladsl.ClusterSharding [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=pool-12-thread-14, akkaSource=ClusterSharding(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.513UTC] - Starting Shard Region [HelloWorldAggregate]...
20:38:35.513 [info] akka.cluster.sharding.DDataShardCoordinator [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-19, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/system/sharding/kafkaProducer-greetingsCoordinator/singleton/coordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.513UTC] - ShardCoordinator was moved to the active state State(Map())
20:38:35.517 [info] akka.cluster.sharding.ShardRegion [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-5, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/system/sharding/HelloWorldAggregate, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.517UTC] - HelloWorldAggregate: Idle entities will be passivated after [2.000 min]
20:38:35.518 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-2, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/system/sharding/HelloWorldAggregateCoordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.518UTC] - Singleton manager starting singleton actor [akka://hello-world-impl-application/system/sharding/HelloWorldAggregateCoordinator/singleton]
20:38:35.518 [info] akka.cluster.singleton.ClusterSingletonManager [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-2, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/system/sharding/HelloWorldAggregateCoordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.518UTC] - ClusterSingletonManager state change [Start -> Oldest]
20:38:35.522 [info] akka.cluster.sharding.DDataShardCoordinator [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-20, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/system/sharding/HelloWorldAggregateCoordinator/singleton/coordinator, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:35.522UTC] - ShardCoordinator was moved to the active state State(Map())
20:38:35.690 [info] play.api.Play [] - Application started (Dev) (no global state)
[info] Service hello-world-impl listening for HTTP on 127.0.0.1:53713
[info] Service frontend listening for HTTP on 127.0.0.1:60417
[info] Service hello-world-stream-impl listening for HTTP on 127.0.0.1:49636
[info] (Services started, press enter to stop and go back to the console...)
20:38:36.124 [info] com.lightbend.lagom.internal.persistence.cluster.ClusterStartupTaskActor [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-19, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/user/cassandraOffsetStorePrepare-singleton/singleton/cassandraOffsetStorePrepare, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:36.124UTC] - Cluster start task cassandraOffsetStorePrepare done.
20:38:36.432 [info] akka.cluster.singleton.ClusterSingletonProxy [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.internal-dispatcher-22, akkaSource=akka://hello-world-impl-application@127.0.0.1:43807/user/cassandraOffsetStorePrepare-singletonProxy, sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:36.432UTC] - Singleton identified at [akka://hello-world-impl-application/user/cassandraOffsetStorePrepare-singleton/singleton]
20:38:36.831 [info] akka.persistence.cassandra.query.EventsByTagStage [akkaAddress=akka://hello-world-impl-application@127.0.0.1:43807, sourceThread=hello-world-impl-application-akka.actor.default-dispatcher-20, akkaSource=EventsByTagStage(akka://hello-world-impl-application), sourceActorSystem=hello-world-impl-application, akkaTimestamp=03:38:36.830UTC] - [48ce4c70-51df-496c-8701-785466f775ed]: EventsByTag query [com.example.helloworld.impl.HelloWorldEvent] starting with EC delay 5000ms: fromOffset [b67b4000-db52-11e5-8080-808080808080 (2016-02-25 00:00:00:000)] toOffset [None]
```

Then in a separate terminal:

```shell
curl -s http://localhost:9008/services | jq .                                                                                                                                                  ✔  kube/caesar-test ⎈  1470  20:37:18 
[
  {
    "name": "frontend",
    "url": "http://127.0.0.1:9000",
    "portName": "http"
  },
  {
    "name": "frontend",
    "url": "http://127.0.0.1:9000",
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
╰─ curl -s http://127.0.0.1:60417/hello/Nicolas                                                                                                                                                   ✔  kube/caesar-test ⎈  1472  20:38:46


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
╰─ curl -v http://127.0.0.1:9000/hello/Nicolas                                                                                                                                                    ✔  kube/caesar-test ⎈  1473  20:38:59
*   Trying 127.0.0.1:9000...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9000 (#0)
> GET /hello/Nicolas HTTP/1.1
> Host: 127.0.0.1:9000
> User-Agent: curl/7.65.3
> Accept: */*
> 

```

The last curl does not return.

