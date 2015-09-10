package com.lyterk.location_receiver

import org.scalatra._
import scalate.ScalateSupport

class Kevin_Servlet extends Learning_serverStack {

  get("/guess/*") {
    "You missed!"
  }

  get("/guess/:who") {
    params("who") match {
      case "Frank" => "You got me"
      case _       => pass()
    }
  }

  notFound {
    <h1>Not found.</h1>
  }
}
