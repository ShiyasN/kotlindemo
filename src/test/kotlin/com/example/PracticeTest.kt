package com.example
//
//import com.example.models.out.Customer
//import io.kotest.core.spec.style.*
//import io.kotest.matchers.shouldBe
//import io.micronaut.test.extensions.kotest.annotation.MicronautTest
//
//@MicronautTest(transactional = false)
//class PracticeTest : BehaviorSpec({
//
////    given("the math service") {
////
////        `when`("the service is called") {
////            val result = Customer()
////            then("the result is HelloWorld") {
////                result shouldBe "Hello World"
////            }
////        }
////    }
//})
//
//class funTest : FunSpec({
//    test("String length should return the length of the string") {
//        test().length shouldBe 6
//        "".length shouldBe 0
//    }
//})
//
//fun test(): String {
//    return "Shiyas"
//}
//
//class stringTest : StringSpec({
//    "String length should return the length of the string".config(enabled = false) {
//        test().length shouldBe 6
//        "".length shouldBe 0
//    }
//})
//
//class shouldTests : ShouldSpec({
//    should("return the length of the string") {
//        "sammy".length shouldBe 5
//        "".length shouldBe 0
//    }
//
//    context("this outer block is enabled") {
//        xshould("this test is disabled") {
//            // test here
//            "shiyas".length shouldBe 6
//        }
//    }
//    xcontext("this block is disabled") {
//        should("disabled by inheritance from the parent") {
//            // test here
//            "shiyasn".length shouldBe 7
//        }
//    }
//
//})
//
//class wordTests : WordSpec({
//    "String.length" should {
//        "return the length of the string" {
//            "sammy".length shouldBe 5
//            "".length shouldBe 0
//        }
//    }
//
//    "Hello" When {
//        "asked for length" should {
//            "return 5" {
//                "Hello".length shouldBe 5
//            }
//        }
//        "appended to Bob" should {
//            "return Hello Bob" {
//                "Hello " + "Bob" shouldBe "Hello Bob"
//            }
//        }
//    }
//})
//
//class AnnotationSpecExample : AnnotationSpec() {
//
//    @BeforeEach
//    fun beforeTest() {
//        println("Before each test")
//    }
//
//    @Test
//    fun test1() {
//        1 shouldBe 1
//    }
//
//    @Test
//    fun test3(){
////        var num: Any
////        num = 5
//////        var num2: Int = num as String
////        num = "5"
////        var num1: Int = num as Int
////        var list: List<Int> = arrayListOf(1,2,3,4)
////        var mutList: MutableList<Int> = list as MutableList<Int>
//    }
//
//    @Test
//    fun test2() {
//        3 shouldBe 3
//    }
//}
//
//
//
//
////Conditional Evaluation
//
///*By Config
//
//"should do something".config(enabled = false) {
//  ...
//}
//
//Focus
//
//class FocusExample : StringSpec({
//    "test 1" {
//     // this will be skipped
//    }
//
//    "f:test 2" {
//     // this will be executed
//    }
//
//    "test 3" {
//     // this will be skipped
//    }
//})
//
//
//Bang
//
//class BangExample : StringSpec({
//
//  "!test 1" {
//    // this will be ignored
//  }
//
//  "test 2" {
//    // this will run
//  }
//
//  "test 3" {
//    // this will run too
//  }
//})
//
//
//X-Methods#
//
//class XMethodsExample : ShouldSpec({
//
//  xshould("this block and it's children are now disabled") {
//    it("will not run") {
//      // disabled test
//    }
//  }
//
//})
//
//
//@Ignored#
//class test:FunSpec({
//
//})
//
//Testing Exceptions
//
//val exception = shouldThrow<IllegalAccessException> {
//   // code in here that you expect to throw an IllegalAccessException
//}
//exception.message should startWith("Something went wrong")
//
//
//
//
// */
//
//
//
