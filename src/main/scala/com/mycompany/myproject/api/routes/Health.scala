package com.mycompany.myproject.api.routes

import akka.http.scaladsl.server.Directives
import com.mycompany.myproject.api.routes.responses.{JsonSupport, Success}

object Health extends Directives with JsonSupport {

  val route =
    get {
      path("health") {
        complete(Success("OK"))
      }
    }
}