// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Lenovo/Documents/GitHub/Play-Videos/server/conf/routes
// @DATE:Fri Feb 04 15:44:39 EET 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_6: controllers.Application,
  // @LINE:14
  TaskList1_8: controllers.TaskList1,
  // @LINE:25
  TaskList2_2: controllers.TaskList2,
  // @LINE:36
  TaskList3_5: controllers.TaskList3,
  // @LINE:45
  WebSocketChat_3: controllers.WebSocketChat,
  // @LINE:49
  TaskList4_0: controllers.TaskList4,
  // @LINE:52
  TaskList5_7: controllers.TaskList5,
  // @LINE:61
  TaskList6_1: controllers.TaskList6,
  // @LINE:64
  TaskList7_4: controllers.TaskList7,
  // @LINE:68
  Assets_9: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_6: controllers.Application,
    // @LINE:14
    TaskList1_8: controllers.TaskList1,
    // @LINE:25
    TaskList2_2: controllers.TaskList2,
    // @LINE:36
    TaskList3_5: controllers.TaskList3,
    // @LINE:45
    WebSocketChat_3: controllers.WebSocketChat,
    // @LINE:49
    TaskList4_0: controllers.TaskList4,
    // @LINE:52
    TaskList5_7: controllers.TaskList5,
    // @LINE:61
    TaskList6_1: controllers.TaskList6,
    // @LINE:64
    TaskList7_4: controllers.TaskList7,
    // @LINE:68
    Assets_9: controllers.Assets
  ) = this(errorHandler, Application_6, TaskList1_8, TaskList2_2, TaskList3_5, WebSocketChat_3, TaskList4_0, TaskList5_7, TaskList6_1, TaskList7_4, Assets_9, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, TaskList1_8, TaskList2_2, TaskList3_5, WebSocketChat_3, TaskList4_0, TaskList5_7, TaskList6_1, TaskList7_4, Assets_9, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productArgs""", """controllers.Application.product(prodType:String, prodNum:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """prodType<[^/]+>/""" + "$" + """prodNum<[^/]+>""", """controllers.Application.product(prodType:String, prodNum:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productRE/""" + "$" + """prodType<[a-z]{2}\d\d>/""" + "$" + """prodNum<[^/]+>""", """controllers.Application.product(prodType:String, prodNum:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """random""", """controllers.Application.randomNumber"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """randomString/""" + "$" + """length<[^/]+>""", """controllers.Application.randomString(length:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login1""", """controllers.TaskList1.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateGet1""", """controllers.TaskList1.valdiateLoginGet(username:String, password:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validatePost1""", """controllers.TaskList1.validateLoginPost"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createUser1""", """controllers.TaskList1.createUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createUserForm1""", """controllers.TaskList1.createUserForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskList1""", """controllers.TaskList1.taskList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout1""", """controllers.TaskList1.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask1""", """controllers.TaskList1.addTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteTask1""", """controllers.TaskList1.deleteTask"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """load2""", """controllers.TaskList2.load"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login2""", """controllers.TaskList2.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskList2""", """controllers.TaskList2.taskList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate2""", """controllers.TaskList2.validate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create2""", """controllers.TaskList2.createUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteTask2""", """controllers.TaskList2.delete"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask2""", """controllers.TaskList2.addTask"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout2""", """controllers.TaskList2.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """generatedJS""", """controllers.TaskList2.generatedJS"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """load3""", """controllers.TaskList3.load"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate3""", """controllers.TaskList3.validate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create3""", """controllers.TaskList3.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskList3""", """controllers.TaskList3.taskList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask3""", """controllers.TaskList3.addTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteTask3""", """controllers.TaskList3.delete"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout3""", """controllers.TaskList3.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chat""", """controllers.WebSocketChat.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chatSocket""", """controllers.WebSocketChat.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """load4""", """controllers.TaskList4.load"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """load5""", """controllers.TaskList5.load"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate5""", """controllers.TaskList5.validate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create5""", """controllers.TaskList5.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskList5""", """controllers.TaskList5.taskList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask5""", """controllers.TaskList5.addTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteTask5""", """controllers.TaskList5.delete"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout5""", """controllers.TaskList5.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """load6""", """controllers.TaskList6.load"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """load7""", """controllers.TaskList7.load"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """versionedAssets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_6.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_product1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productArgs")))
  )
  private[this] lazy val controllers_Application_product1_invoker = createInvoker(
    Application_6.product(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "product",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """productArgs""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_product2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("prodType", """[^/]+""",true), StaticPart("/"), DynamicPart("prodNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_product2_invoker = createInvoker(
    Application_6.product(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "product",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """product/""" + "$" + """prodType<[^/]+>/""" + "$" + """prodNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_product3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productRE/"), DynamicPart("prodType", """[a-z]{2}\d\d""",false), StaticPart("/"), DynamicPart("prodNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_product3_invoker = createInvoker(
    Application_6.product(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "product",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """productRE/""" + "$" + """prodType<[a-z]{2}\d\d>/""" + "$" + """prodNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_randomNumber4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("random")))
  )
  private[this] lazy val controllers_Application_randomNumber4_invoker = createInvoker(
    Application_6.randomNumber,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "randomNumber",
      Nil,
      "GET",
      this.prefix + """random""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_randomString5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("randomString/"), DynamicPart("length", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_randomString5_invoker = createInvoker(
    Application_6.randomString(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "randomString",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """randomString/""" + "$" + """length<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_TaskList1_login6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login1")))
  )
  private[this] lazy val controllers_TaskList1_login6_invoker = createInvoker(
    TaskList1_8.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1",
      "login",
      Nil,
      "GET",
      this.prefix + """login1""",
      """ Routes for version 1""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_TaskList1_valdiateLoginGet7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateGet1")))
  )
  private[this] lazy val controllers_TaskList1_valdiateLoginGet7_invoker = createInvoker(
    TaskList1_8.valdiateLoginGet(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1",
      "valdiateLoginGet",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """validateGet1""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_TaskList1_validateLoginPost8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validatePost1")))
  )
  private[this] lazy val controllers_TaskList1_validateLoginPost8_invoker = createInvoker(
    TaskList1_8.validateLoginPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1",
      "validateLoginPost",
      Nil,
      "POST",
      this.prefix + """validatePost1""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_TaskList1_createUser9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createUser1")))
  )
  private[this] lazy val controllers_TaskList1_createUser9_invoker = createInvoker(
    TaskList1_8.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1",
      "createUser",
      Nil,
      "POST",
      this.prefix + """createUser1""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_TaskList1_createUserForm10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createUserForm1")))
  )
  private[this] lazy val controllers_TaskList1_createUserForm10_invoker = createInvoker(
    TaskList1_8.createUserForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1",
      "createUserForm",
      Nil,
      "POST",
      this.prefix + """createUserForm1""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_TaskList1_taskList11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskList1")))
  )
  private[this] lazy val controllers_TaskList1_taskList11_invoker = createInvoker(
    TaskList1_8.taskList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1",
      "taskList",
      Nil,
      "GET",
      this.prefix + """taskList1""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_TaskList1_logout12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout1")))
  )
  private[this] lazy val controllers_TaskList1_logout12_invoker = createInvoker(
    TaskList1_8.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout1""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_TaskList1_addTask13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask1")))
  )
  private[this] lazy val controllers_TaskList1_addTask13_invoker = createInvoker(
    TaskList1_8.addTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1",
      "addTask",
      Nil,
      "POST",
      this.prefix + """addTask1""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_TaskList1_deleteTask14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteTask1")))
  )
  private[this] lazy val controllers_TaskList1_deleteTask14_invoker = createInvoker(
    TaskList1_8.deleteTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList1",
      "deleteTask",
      Nil,
      "POST",
      this.prefix + """deleteTask1""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_TaskList2_load15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("load2")))
  )
  private[this] lazy val controllers_TaskList2_load15_invoker = createInvoker(
    TaskList2_2.load,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2",
      "load",
      Nil,
      "GET",
      this.prefix + """load2""",
      """Routes for version 2""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_TaskList2_login16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login2")))
  )
  private[this] lazy val controllers_TaskList2_login16_invoker = createInvoker(
    TaskList2_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2",
      "login",
      Nil,
      "GET",
      this.prefix + """login2""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_TaskList2_taskList17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskList2")))
  )
  private[this] lazy val controllers_TaskList2_taskList17_invoker = createInvoker(
    TaskList2_2.taskList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2",
      "taskList",
      Nil,
      "GET",
      this.prefix + """taskList2""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_TaskList2_validate18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate2")))
  )
  private[this] lazy val controllers_TaskList2_validate18_invoker = createInvoker(
    TaskList2_2.validate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2",
      "validate",
      Nil,
      "POST",
      this.prefix + """validate2""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_TaskList2_createUser19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create2")))
  )
  private[this] lazy val controllers_TaskList2_createUser19_invoker = createInvoker(
    TaskList2_2.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2",
      "createUser",
      Nil,
      "POST",
      this.prefix + """create2""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_TaskList2_delete20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteTask2")))
  )
  private[this] lazy val controllers_TaskList2_delete20_invoker = createInvoker(
    TaskList2_2.delete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2",
      "delete",
      Nil,
      "POST",
      this.prefix + """deleteTask2""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_TaskList2_addTask21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask2")))
  )
  private[this] lazy val controllers_TaskList2_addTask21_invoker = createInvoker(
    TaskList2_2.addTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2",
      "addTask",
      Nil,
      "POST",
      this.prefix + """addTask2""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_TaskList2_logout22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout2")))
  )
  private[this] lazy val controllers_TaskList2_logout22_invoker = createInvoker(
    TaskList2_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout2""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_TaskList2_generatedJS23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("generatedJS")))
  )
  private[this] lazy val controllers_TaskList2_generatedJS23_invoker = createInvoker(
    TaskList2_2.generatedJS,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList2",
      "generatedJS",
      Nil,
      "GET",
      this.prefix + """generatedJS""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_TaskList3_load24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("load3")))
  )
  private[this] lazy val controllers_TaskList3_load24_invoker = createInvoker(
    TaskList3_5.load,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList3",
      "load",
      Nil,
      "GET",
      this.prefix + """load3""",
      """Routes for version 3""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_TaskList3_validate25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate3")))
  )
  private[this] lazy val controllers_TaskList3_validate25_invoker = createInvoker(
    TaskList3_5.validate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList3",
      "validate",
      Nil,
      "POST",
      this.prefix + """validate3""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_TaskList3_createUser26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create3")))
  )
  private[this] lazy val controllers_TaskList3_createUser26_invoker = createInvoker(
    TaskList3_5.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList3",
      "createUser",
      Nil,
      "POST",
      this.prefix + """create3""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_TaskList3_taskList27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskList3")))
  )
  private[this] lazy val controllers_TaskList3_taskList27_invoker = createInvoker(
    TaskList3_5.taskList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList3",
      "taskList",
      Nil,
      "GET",
      this.prefix + """taskList3""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_TaskList3_addTask28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask3")))
  )
  private[this] lazy val controllers_TaskList3_addTask28_invoker = createInvoker(
    TaskList3_5.addTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList3",
      "addTask",
      Nil,
      "POST",
      this.prefix + """addTask3""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_TaskList3_delete29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteTask3")))
  )
  private[this] lazy val controllers_TaskList3_delete29_invoker = createInvoker(
    TaskList3_5.delete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList3",
      "delete",
      Nil,
      "POST",
      this.prefix + """deleteTask3""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_TaskList3_logout30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout3")))
  )
  private[this] lazy val controllers_TaskList3_logout30_invoker = createInvoker(
    TaskList3_5.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList3",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout3""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_WebSocketChat_index31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chat")))
  )
  private[this] lazy val controllers_WebSocketChat_index31_invoker = createInvoker(
    WebSocketChat_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebSocketChat",
      "index",
      Nil,
      "GET",
      this.prefix + """chat""",
      """Routes for WebSocket chat Application""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_WebSocketChat_socket32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chatSocket")))
  )
  private[this] lazy val controllers_WebSocketChat_socket32_invoker = createInvoker(
    WebSocketChat_3.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebSocketChat",
      "socket",
      Nil,
      "GET",
      this.prefix + """chatSocket""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_TaskList4_load33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("load4")))
  )
  private[this] lazy val controllers_TaskList4_load33_invoker = createInvoker(
    TaskList4_0.load,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList4",
      "load",
      Nil,
      "GET",
      this.prefix + """load4""",
      """Routes for version 4""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_TaskList5_load34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("load5")))
  )
  private[this] lazy val controllers_TaskList5_load34_invoker = createInvoker(
    TaskList5_7.load,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList5",
      "load",
      Nil,
      "GET",
      this.prefix + """load5""",
      """Routes for version 5""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_TaskList5_validate35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate5")))
  )
  private[this] lazy val controllers_TaskList5_validate35_invoker = createInvoker(
    TaskList5_7.validate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList5",
      "validate",
      Nil,
      "POST",
      this.prefix + """validate5""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_TaskList5_createUser36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create5")))
  )
  private[this] lazy val controllers_TaskList5_createUser36_invoker = createInvoker(
    TaskList5_7.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList5",
      "createUser",
      Nil,
      "POST",
      this.prefix + """create5""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_TaskList5_taskList37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskList5")))
  )
  private[this] lazy val controllers_TaskList5_taskList37_invoker = createInvoker(
    TaskList5_7.taskList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList5",
      "taskList",
      Nil,
      "GET",
      this.prefix + """taskList5""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_TaskList5_addTask38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask5")))
  )
  private[this] lazy val controllers_TaskList5_addTask38_invoker = createInvoker(
    TaskList5_7.addTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList5",
      "addTask",
      Nil,
      "POST",
      this.prefix + """addTask5""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_TaskList5_delete39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteTask5")))
  )
  private[this] lazy val controllers_TaskList5_delete39_invoker = createInvoker(
    TaskList5_7.delete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList5",
      "delete",
      Nil,
      "POST",
      this.prefix + """deleteTask5""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_TaskList5_logout40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout5")))
  )
  private[this] lazy val controllers_TaskList5_logout40_invoker = createInvoker(
    TaskList5_7.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList5",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout5""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_TaskList6_load41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("load6")))
  )
  private[this] lazy val controllers_TaskList6_load41_invoker = createInvoker(
    TaskList6_1.load,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList6",
      "load",
      Nil,
      "GET",
      this.prefix + """load6""",
      """Routes for version 6""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_TaskList7_load42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("load7")))
  )
  private[this] lazy val controllers_TaskList7_load42_invoker = createInvoker(
    TaskList7_4.load,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskList7",
      "load",
      Nil,
      "GET",
      this.prefix + """load7""",
      """Routes for version 7""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_Assets_at43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at43_invoker = createInvoker(
    Assets_9.at(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Prefix must match `play.assets.urlPrefix`""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_Assets_versioned44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("versionedAssets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned44_invoker = createInvoker(
    Assets_9.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """versionedAssets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params@_) =>
      call { 
        controllers_Application_index0_invoker.call(Application_6.index)
      }
  
    // @LINE:7
    case controllers_Application_product1_route(params@_) =>
      call(params.fromQuery[String]("prodType", None), params.fromQuery[Int]("prodNum", None)) { (prodType, prodNum) =>
        controllers_Application_product1_invoker.call(Application_6.product(prodType, prodNum))
      }
  
    // @LINE:8
    case controllers_Application_product2_route(params@_) =>
      call(params.fromPath[String]("prodType", None), params.fromPath[Int]("prodNum", None)) { (prodType, prodNum) =>
        controllers_Application_product2_invoker.call(Application_6.product(prodType, prodNum))
      }
  
    // @LINE:9
    case controllers_Application_product3_route(params@_) =>
      call(params.fromPath[String]("prodType", None), params.fromPath[Int]("prodNum", None)) { (prodType, prodNum) =>
        controllers_Application_product3_invoker.call(Application_6.product(prodType, prodNum))
      }
  
    // @LINE:10
    case controllers_Application_randomNumber4_route(params@_) =>
      call { 
        controllers_Application_randomNumber4_invoker.call(Application_6.randomNumber)
      }
  
    // @LINE:11
    case controllers_Application_randomString5_route(params@_) =>
      call(params.fromPath[Int]("length", None)) { (length) =>
        controllers_Application_randomString5_invoker.call(Application_6.randomString(length))
      }
  
    // @LINE:14
    case controllers_TaskList1_login6_route(params@_) =>
      call { 
        controllers_TaskList1_login6_invoker.call(TaskList1_8.login)
      }
  
    // @LINE:15
    case controllers_TaskList1_valdiateLoginGet7_route(params@_) =>
      call(params.fromQuery[String]("username", None), params.fromQuery[String]("password", None)) { (username, password) =>
        controllers_TaskList1_valdiateLoginGet7_invoker.call(TaskList1_8.valdiateLoginGet(username, password))
      }
  
    // @LINE:16
    case controllers_TaskList1_validateLoginPost8_route(params@_) =>
      call { 
        controllers_TaskList1_validateLoginPost8_invoker.call(TaskList1_8.validateLoginPost)
      }
  
    // @LINE:17
    case controllers_TaskList1_createUser9_route(params@_) =>
      call { 
        controllers_TaskList1_createUser9_invoker.call(TaskList1_8.createUser)
      }
  
    // @LINE:18
    case controllers_TaskList1_createUserForm10_route(params@_) =>
      call { 
        controllers_TaskList1_createUserForm10_invoker.call(TaskList1_8.createUserForm)
      }
  
    // @LINE:19
    case controllers_TaskList1_taskList11_route(params@_) =>
      call { 
        controllers_TaskList1_taskList11_invoker.call(TaskList1_8.taskList)
      }
  
    // @LINE:20
    case controllers_TaskList1_logout12_route(params@_) =>
      call { 
        controllers_TaskList1_logout12_invoker.call(TaskList1_8.logout)
      }
  
    // @LINE:21
    case controllers_TaskList1_addTask13_route(params@_) =>
      call { 
        controllers_TaskList1_addTask13_invoker.call(TaskList1_8.addTask)
      }
  
    // @LINE:22
    case controllers_TaskList1_deleteTask14_route(params@_) =>
      call { 
        controllers_TaskList1_deleteTask14_invoker.call(TaskList1_8.deleteTask)
      }
  
    // @LINE:25
    case controllers_TaskList2_load15_route(params@_) =>
      call { 
        controllers_TaskList2_load15_invoker.call(TaskList2_2.load)
      }
  
    // @LINE:26
    case controllers_TaskList2_login16_route(params@_) =>
      call { 
        controllers_TaskList2_login16_invoker.call(TaskList2_2.login)
      }
  
    // @LINE:27
    case controllers_TaskList2_taskList17_route(params@_) =>
      call { 
        controllers_TaskList2_taskList17_invoker.call(TaskList2_2.taskList)
      }
  
    // @LINE:28
    case controllers_TaskList2_validate18_route(params@_) =>
      call { 
        controllers_TaskList2_validate18_invoker.call(TaskList2_2.validate)
      }
  
    // @LINE:29
    case controllers_TaskList2_createUser19_route(params@_) =>
      call { 
        controllers_TaskList2_createUser19_invoker.call(TaskList2_2.createUser)
      }
  
    // @LINE:30
    case controllers_TaskList2_delete20_route(params@_) =>
      call { 
        controllers_TaskList2_delete20_invoker.call(TaskList2_2.delete)
      }
  
    // @LINE:31
    case controllers_TaskList2_addTask21_route(params@_) =>
      call { 
        controllers_TaskList2_addTask21_invoker.call(TaskList2_2.addTask)
      }
  
    // @LINE:32
    case controllers_TaskList2_logout22_route(params@_) =>
      call { 
        controllers_TaskList2_logout22_invoker.call(TaskList2_2.logout)
      }
  
    // @LINE:33
    case controllers_TaskList2_generatedJS23_route(params@_) =>
      call { 
        controllers_TaskList2_generatedJS23_invoker.call(TaskList2_2.generatedJS)
      }
  
    // @LINE:36
    case controllers_TaskList3_load24_route(params@_) =>
      call { 
        controllers_TaskList3_load24_invoker.call(TaskList3_5.load)
      }
  
    // @LINE:37
    case controllers_TaskList3_validate25_route(params@_) =>
      call { 
        controllers_TaskList3_validate25_invoker.call(TaskList3_5.validate)
      }
  
    // @LINE:38
    case controllers_TaskList3_createUser26_route(params@_) =>
      call { 
        controllers_TaskList3_createUser26_invoker.call(TaskList3_5.createUser)
      }
  
    // @LINE:39
    case controllers_TaskList3_taskList27_route(params@_) =>
      call { 
        controllers_TaskList3_taskList27_invoker.call(TaskList3_5.taskList)
      }
  
    // @LINE:40
    case controllers_TaskList3_addTask28_route(params@_) =>
      call { 
        controllers_TaskList3_addTask28_invoker.call(TaskList3_5.addTask)
      }
  
    // @LINE:41
    case controllers_TaskList3_delete29_route(params@_) =>
      call { 
        controllers_TaskList3_delete29_invoker.call(TaskList3_5.delete)
      }
  
    // @LINE:42
    case controllers_TaskList3_logout30_route(params@_) =>
      call { 
        controllers_TaskList3_logout30_invoker.call(TaskList3_5.logout)
      }
  
    // @LINE:45
    case controllers_WebSocketChat_index31_route(params@_) =>
      call { 
        controllers_WebSocketChat_index31_invoker.call(WebSocketChat_3.index)
      }
  
    // @LINE:46
    case controllers_WebSocketChat_socket32_route(params@_) =>
      call { 
        controllers_WebSocketChat_socket32_invoker.call(WebSocketChat_3.socket)
      }
  
    // @LINE:49
    case controllers_TaskList4_load33_route(params@_) =>
      call { 
        controllers_TaskList4_load33_invoker.call(TaskList4_0.load)
      }
  
    // @LINE:52
    case controllers_TaskList5_load34_route(params@_) =>
      call { 
        controllers_TaskList5_load34_invoker.call(TaskList5_7.load)
      }
  
    // @LINE:53
    case controllers_TaskList5_validate35_route(params@_) =>
      call { 
        controllers_TaskList5_validate35_invoker.call(TaskList5_7.validate)
      }
  
    // @LINE:54
    case controllers_TaskList5_createUser36_route(params@_) =>
      call { 
        controllers_TaskList5_createUser36_invoker.call(TaskList5_7.createUser)
      }
  
    // @LINE:55
    case controllers_TaskList5_taskList37_route(params@_) =>
      call { 
        controllers_TaskList5_taskList37_invoker.call(TaskList5_7.taskList)
      }
  
    // @LINE:56
    case controllers_TaskList5_addTask38_route(params@_) =>
      call { 
        controllers_TaskList5_addTask38_invoker.call(TaskList5_7.addTask)
      }
  
    // @LINE:57
    case controllers_TaskList5_delete39_route(params@_) =>
      call { 
        controllers_TaskList5_delete39_invoker.call(TaskList5_7.delete)
      }
  
    // @LINE:58
    case controllers_TaskList5_logout40_route(params@_) =>
      call { 
        controllers_TaskList5_logout40_invoker.call(TaskList5_7.logout)
      }
  
    // @LINE:61
    case controllers_TaskList6_load41_route(params@_) =>
      call { 
        controllers_TaskList6_load41_invoker.call(TaskList6_1.load)
      }
  
    // @LINE:64
    case controllers_TaskList7_load42_route(params@_) =>
      call { 
        controllers_TaskList7_load42_invoker.call(TaskList7_4.load)
      }
  
    // @LINE:68
    case controllers_Assets_at43_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_at43_invoker.call(Assets_9.at(file))
      }
  
    // @LINE:69
    case controllers_Assets_versioned44_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned44_invoker.call(Assets_9.versioned(path, file))
      }
  }
}
