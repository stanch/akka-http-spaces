import akka.actor.ActorSystem
import akka.http.scaladsl.server.directives.FileAndResourceDirectives.ResourceFile

object Test extends App {
  val defaultClassLoader = classOf[ActorSystem].getClassLoader
  println(Option(defaultClassLoader.getResource("test.txt")) flatMap ResourceFile.apply)
}
