import akka.actor.{ActorSystem, Props}

object ReactiveEnterprise {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("ReactiveEnterprise")

    val processManagersRef = system.actorOf(Props[ProcessManagers], "processManagers")
    processManagersRef ! BrokerForLoan()

    val selection = system.actorSelection("/user/processManagers")
    selection ! BrokerForLoan()

    system.actorOf(Props[DomainModels], "domainModels")

    val domainModelsSelection = system.actorSelection("/user/domainModels/shoppingCart")
    domainModelsSelection ! Book()
  }
}
