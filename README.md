```
cd "вложенная папка"
sbt run
```
```
[error] (run-main-0) java.io.FileNotFoundException: /home/stanch/projects/akka-http-spaces/вложенная%20папка/lib/test.jar (No such file or directory)
java.io.FileNotFoundException: /home/stanch/projects/akka-http-spaces/вложенная%20папка/lib/test.jar (No such file or directory)
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:220)
	at java.util.zip.ZipFile.<init>(ZipFile.java:150)
	at java.util.zip.ZipFile.<init>(ZipFile.java:121)
	at akka.http.scaladsl.server.directives.FileAndResourceDirectives$ResourceFile$.apply(FileAndResourceDirectives.scala:210)
```
