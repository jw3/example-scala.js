package tutorial.webapp

import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>[message]</p>")
  }

  def setupUI(): Unit = {
    jQuery("""<button type="button">Click me!</button>""")
    .click(addClickedMessage _)
    .appendTo(jQuery("body"))

    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World</p>")
  }


}
