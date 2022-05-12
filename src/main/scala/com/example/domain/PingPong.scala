package com.example.domain

import com.example
import com.google.protobuf.empty.Empty
import kalix.scalasdk.valueentity.ValueEntity
import kalix.scalasdk.valueentity.ValueEntityContext

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

class PingPong(context: ValueEntityContext) extends AbstractPingPong {
  override def emptyState: PingPongState = PingPongState(pinged=true)

  override def ping(currentState: PingPongState, pingValue: example.PingValue): ValueEntity.Effect[Empty] = {
    println("PING")
    if (currentState.pinged)
      effects.error(s"Cannot ping an already pinged PingPong!")
    else {
      val newState = currentState.copy(pinged=true)
      effects
        .updateState(newState)
        .thenReply(Empty.defaultInstance)
    }
  }
  override def pong(currentState: PingPongState, pongValue: example.PongValue): ValueEntity.Effect[Empty] = {
    println("PONG")
    if (!currentState.pinged)
      effects.error(s"Cannot pong an already ponged PingPong!")
    else {
      val newState = currentState.copy(pinged=false)
      effects
        .updateState(newState)
        .thenReply(Empty.defaultInstance)
    }
  }

  override def getCurrentPingPong(currentState: PingPongState, getPingPong: example.GetPingPong): ValueEntity.Effect[example.CurrentPingPong] =
    effects.reply(example.CurrentPingPong(pinged=currentState.pinged))

}


