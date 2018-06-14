import akka.actor.Actor

class ProcessManagers extends Actor {
  override def receive: Receive = {
    case BrokerForLoan => println("broker for loan")
    case _ => println("process managers")
  }
}
