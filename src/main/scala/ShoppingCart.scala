import akka.actor.Actor

class ShoppingCart extends Actor {
  override def receive: Receive = {
    case _ => println("shopping cart receive")
  }

  override def postRestart(reason: Throwable): Unit = {}

  override def postStop(): Unit = {}

  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {}

  override def preStart(): Unit = {
    println("shopping cart pre start")
  }
}
