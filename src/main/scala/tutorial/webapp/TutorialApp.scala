package tutorial.webapp

import com.raquo.airstream.core
import com.raquo.laminar.CollectionCommand
import org.scalajs.dom
import org.scalajs.dom.document
import com.raquo.laminar.api.L._
import com.raquo.airstream.eventbus.EventBus

object TutorialApp {
  def main(args: Array[String]): Unit = {
    println("Hello")
  }

  //def Counter(label: String): Div = {
  //  val diffBus = new EventBus[Int]
  //  val diffStream = diffBus.events
  //  val $count: Signal[Int] = diffStream.foldLeft(initial = 0)(_ + _)
  //
  // div(
  //    label + ": ",
  //    b(child.text <-- $count),
  //    button("-", onClick.mapTo(-1) --> diffBus),
  //    button("+", onClick.mapTo(+1) --> diffBus),
  //  )
  //}
  //

//  def Counter(label: String, initialStep : Int): HtmlElement = {
//    val allowedSteps = List(1, 2, 3, 5, 10)
//
//    val stepVar = Var(initialStep)
//
//    val diffBus = new EventBus[Int]
//
//    val $count: Signal[Int] = diffBus.events.foldLeft(initial = 0)(_ + _)
//
//    div(
//      p(
//        "Step: ",
//        select(
//          value <-- stepVar.signal.map(_.toString),
//          onChange.mapToValue.map(_.toInt) --> stepVar,
//          allowedSteps.map { step =>
//            option(value := step.toString, step)
//          }
//        )
//      ),
//      p(
//        label + ": ",
//        b(child.text <-- $count),
//        " ",
//        // Two different ways to get stepVar's value:
//        button(
//          "–",
//          onClick.mapTo(-1 * stepVar.now()) --> diffBus
//        ),
//        button(
//          "+",
//          inContext(_.events(onClick).sample(stepVar.signal) --> diffBus)
//        )
//      )
//    )
//  }
//    val newElem = div(
//      h1("Let's count"),
//      Counter("Sheep", 3)
//    )
//
//
//  val newVal = Var(initial = "Anna")
//
//  val rootElement = div(
//   label("Your name, "),
//    input(
//      onMountFocus,
//      onInput.mapToValue --> newVal
//    ),
//    span(
//      "Hello, ",
//      child.text <-- newVal.signal.map(_.toUpperCase)
//    ),
//    newElem
////    button(
////      child.text <-- newVal.signal.map(_.toString)
////    )
//  )







  //var currentValue  = "world"
  //val nameVar = Var(currentValue)
  //  var currentValue1  = "1"
  //  val nameVar1 = Var(currentValue1)
  //  val inputCaption = span("First & last name:")
  //  val inputMods = Seq(typ := "text", defaultValue := "Me")
  //  def TextInput(): Input = input(typ := "text")


  //  val rootElement = div(
  //    input(
  //      cls := "NameInput",
  //      placeholder := "Enter your name",
  //      inContext{ thisNode => onInput.map(_=> thisNode.ref.value) --> nameVar}
  //      // inContext - это просто оболочка которая нам предоставляет простую сылку на инпут, который мы уже создали
  //      // thisNode - является этой ссылкой
  //      // onInput - срабатывает при каждом нажатии клавиши, когда пользователь вводит что-то в инпут,
  //      // map - это выражение, которое позволяет нам захватить текстовое значение этого элемента ввода
  //    ),
  //    span(
  //      "Hello, ",
  //      child.text <-- nameVar.signal.map(_.toUpperCase)),
  //
  //
  //
  //  div(
  //    "Please enter your name: ",
  //    TextInput().amend {
  //      inContext { thisNode =>
  //        onInput.mapTo(thisNode.ref.value) --> nameVar1
  //      }
  //    }
  //  ),
  //
  //  div(
  //    h1("Hello world", color := "red"),
  //    inputCaption,
  //    input(inputMods, name := "fullName"),
  //    div(
  //      ">>",
  //      button("Submit"),
  //      "<<"
  //    )
  //  )
  //  )


  render(dom.document.querySelector(("#appContainer")), rootElement)

  trait Modifier[-El] {
    def apply(element: El): Unit
  }
var x = 0
  for (i <- 0 until 100)
    x += i * i
println(x)

  val p = Array("Fox", "jumped", "over", "me")
  for (s <- p) {
    println(s"Word $s")
  }



//  val myMap = Map("a" -> 42, "b" -> 43)
//  def getMapValue(t: String): String =
//    myMap.get(t).map("Value found: " + _).getOrElse("No value found")
//  println(getMapValue("a"))
//  println(getMapValue("c"))
//




}

