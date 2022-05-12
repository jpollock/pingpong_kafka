package com.example

import kalix.scalasdk.action.Action
import kalix.scalasdk.action.ActionCreationContext

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

class PingPongHttpServiceAction(creationContext: ActionCreationContext) extends AbstractPingPongHttpServiceAction {

  override def httpPing(pingValue: PingValue): Action.Effect[PingValue] = {
    effects.reply(pingValue)
  }
  override def httpPong(pongValue: PongValue): Action.Effect[PongValue] = {
    effects.reply(pongValue)
  }
}

