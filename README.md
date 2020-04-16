# Hello World with Play frontend

This project is based on the basic lagom/lagom-scala.g8 template
with a Play frontend added to it following the ideas described in this article:
https://xebia.com/blog/the-complete-picture-lagom-and-play-in-action-java/

Specifically, the templates instantiated were:

- `sbt new lagom/lagom-scala.g8 --branch 1.6.x`
- `sbt new playframework/play-scala-seed.g8 --branch 2.8.x` (in the folder: `frontend`)

Unlike the article, this project is scala-only with compile-time dependency injection.

```shell
sbt runAll
...
[info] (Services started, press enter to stop and go back to the console...)
```

Then, in a separate terminal:

```shell
curl -v http://localhost:9000/api/hello/Nicolas                                                                                                                                                                                                                                                                                                 ✔  kube/caesar-test ⎈  1616  15:45:13
*   Trying 127.0.0.1:9000...
* TCP_NODELAY set
* Connected to localhost (127.0.0.1) port 9000 (#0)
> GET /api/hello/Nicolas HTTP/1.1
> Host: localhost:9000
> User-Agent: curl/7.65.3
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< Date: Thu, 16 Apr 2020 22:45:18 GMT
< Server: akka-http/10.1.11
< Content-Type: text/plain
< Content-Length: 15
< 
* Connection #0 to host localhost left intact
Hello, Nicolas!%                 
```