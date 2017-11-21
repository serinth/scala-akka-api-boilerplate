import org.scalatest.{ Matchers, WordSpec }
import akka.http.scaladsl.testkit.ScalatestRouteTest

import com.mycompany.myproject.api.routes.Health

class HealthSpec extends WordSpec with Matchers with ScalatestRouteTest {

  val expectedSuccessResponse = "{\"status\":\"OK\"}"

  "The service" should {
    "return Success Response with status 200" in {
      Get("/health") ~> Health.route ~> check {
        responseAs[String] shouldEqual expectedSuccessResponse
        status.isSuccess() shouldBe true
      }
    }
  }

}