import akka.actor.Actor

case class SimpleMessage()
case class ComplexMessage(i: Int)
class MyActor extends Actor {

    override def receive: Receive = {
        case a: SimpleMessage => 1
        case ComplexMessage(z) => z
    }

}
