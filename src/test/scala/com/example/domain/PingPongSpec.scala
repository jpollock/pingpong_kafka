package com.example.domain

import com.example
import com.google.protobuf.empty.Empty
import kalix.scalasdk.testkit.ValueEntityResult
import kalix.scalasdk.valueentity.ValueEntity
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PingPongSpec
    extends AnyWordSpec
    with Matchers {

  "PingPong" must {

    "have example test that can be removed" in {
      val service = PingPongTestKit(new PingPong(_))
      pending
      // use the testkit to execute a command
      // and verify final updated state:
      // val result = service.someOperation(SomeRequest)
      // verify the reply
      // val reply = result.getReply()
      // reply shouldBe expectedReply
      // verify the final state after the command
      // service.currentState() shouldBe expectedState
    }

    "handle command Ping" in {
      val service = PingPongTestKit(new PingPong(_))
      pending
      // val result = service.ping(example.PingValue(...))
    }

    "handle command Pong" in {
      val service = PingPongTestKit(new PingPong(_))
      pending
      // val result = service.pong(example.PongValue(...))
    }

    "handle command GetCurrentPingPong" in {
      val service = PingPongTestKit(new PingPong(_))
      pending
      // val result = service.getCurrentPingPong(example.GetPingPong(...))
    }

  }
}
