import akka.actor.{ActorSystem, Props}

object ReactiveEnterprise {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("ReactiveEnterprise")

    val processManagersRef = system.actorOf(Props[ProcessManagers], "processManagers")
    processManagersRef ! BrokerForLoan()
  }
}
