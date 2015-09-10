import com.lyterk.location_receiver._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new Kevin_Servlet, "/*")
  }
}
