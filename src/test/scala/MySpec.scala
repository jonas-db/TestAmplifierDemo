import akka.actor.{ActorSystem, Props}
import akka.testkit.TestActors.EchoActor
import akka.testkit.{ImplicitSender, TestActors, TestKit}
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}

class MySpec() extends TestKit(ActorSystem("MySpec")) with ImplicitSender
    with WordSpecLike with Matchers with BeforeAndAfterAll {

    var i:Int = 1
    var aa:MyActor = null

    override protected def beforeAll(): Unit = {
        i = 2
        aa = null
    }

    override def afterAll: Unit = {
        TestKit.shutdownActorSystem(system)
    }

    "An Echo actor" must {

        "send back messages unchanged" in {
            val echo = system.actorOf(Props[MyActor]())
            echo ! SimpleMessage
            expectMsg("hello world")

            i = 3
            println(aa.toString)

            echo ! ComplexMessage(2)
            expectMsg("hello world")
        }

    }
}