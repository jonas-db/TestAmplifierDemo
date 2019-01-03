import org.scalatest.{BeforeAndAfterAll, FunSuite}

class MyActorFunSpec extends FunSuite  with BeforeAndAfterAll {

    var i:Int = 1
    var aa:MyActor = null

    override protected def beforeAll(): Unit = {
        i = 2
        aa = null
    }

    test("1")  {
        println(aa.toString)
    }

    test("2") {
        println(i)
    }

    test("3") {
        println(i)
        aa
    }

    test("3") {
        println(i)
        aa = null
    }

}
