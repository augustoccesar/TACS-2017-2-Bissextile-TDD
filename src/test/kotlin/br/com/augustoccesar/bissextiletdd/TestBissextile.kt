package br.com.augustoccesar.bissextiletdd

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldThrow
import io.kotlintest.specs.FreeSpec
import isBissextile

class TestBissextile : FreeSpec() {
    init {
        "isBissextile" - {
            "should throw exception if < 1000" {
                val exception = shouldThrow<IllegalArgumentException> {
                    isBissextile(900)
                }

                exception.message shouldBe "Input number must be >= 1000"
            }

            "should return true if valid and end with 00" {
                isBissextile(1600) shouldBe (true)
            }

            "should return true if valid and don't end with 00" {
                isBissextile(2004) shouldBe (true)
            }

            "should return false if not valid and end with 00" {
                isBissextile(1500) shouldBe (false)
            }

            "should return false if not valid and don't end with 00" {
                isBissextile(1990) shouldBe (false)
            }
        }
    }
}