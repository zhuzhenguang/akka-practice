import akka.actor.{Actor, Props}

class DomainModels extends Actor {
  override def receive: Receive = {
    case _ =>
  }

  override def preStart(): Unit = {
    context.actorOf(Props[ShoppingCart], "shoppingCart")
  }
}
