// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Lenovo/Documents/GitHub/Play-Videos/server/conf/routes
// @DATE:Fri Feb 04 15:44:39 EET 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:68
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
    // @LINE:69
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "versionedAssets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:52
  class ReverseTaskList5(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList5.delete",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteTask5"})
        }
      """
    )
  
    // @LINE:54
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList5.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create5"})
        }
      """
    )
  
    // @LINE:56
    def addTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList5.addTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTask5"})
        }
      """
    )
  
    // @LINE:55
    def taskList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList5.taskList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskList5"})
        }
      """
    )
  
    // @LINE:58
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList5.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout5"})
        }
      """
    )
  
    // @LINE:53
    def validate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList5.validate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validate5"})
        }
      """
    )
  
    // @LINE:52
    def load: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList5.load",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "load5"})
        }
      """
    )
  
  }

  // @LINE:36
  class ReverseTaskList3(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList3.delete",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteTask3"})
        }
      """
    )
  
    // @LINE:38
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList3.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create3"})
        }
      """
    )
  
    // @LINE:40
    def addTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList3.addTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTask3"})
        }
      """
    )
  
    // @LINE:39
    def taskList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList3.taskList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskList3"})
        }
      """
    )
  
    // @LINE:42
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList3.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout3"})
        }
      """
    )
  
    // @LINE:37
    def validate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList3.validate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validate3"})
        }
      """
    )
  
    // @LINE:36
    def load: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList3.load",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "load3"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseTaskList2(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2.delete",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteTask2"})
        }
      """
    )
  
    // @LINE:33
    def generatedJS: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2.generatedJS",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "generatedJS"})
        }
      """
    )
  
    // @LINE:29
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create2"})
        }
      """
    )
  
    // @LINE:31
    def addTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2.addTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTask2"})
        }
      """
    )
  
    // @LINE:27
    def taskList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2.taskList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskList2"})
        }
      """
    )
  
    // @LINE:32
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout2"})
        }
      """
    )
  
    // @LINE:28
    def validate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2.validate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validate2"})
        }
      """
    )
  
    // @LINE:25
    def load: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2.load",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "load2"})
        }
      """
    )
  
    // @LINE:26
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList2.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login2"})
        }
      """
    )
  
  }

  // @LINE:61
  class ReverseTaskList6(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def load: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList6.load",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "load6"})
        }
      """
    )
  
  }

  // @LINE:45
  class ReverseWebSocketChat(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebSocketChat.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chatSocket"})
        }
      """
    )
  
    // @LINE:45
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebSocketChat.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chat"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def product: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.product",
      """
        function(prodType0,prodNum1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productArgs" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("prodType", prodType0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("prodNum", prodNum1)])})
          }
        
        }
      """
    )
  
    // @LINE:10
    def randomNumber: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.randomNumber",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "random"})
        }
      """
    )
  
    // @LINE:11
    def randomString: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.randomString",
      """
        function(length0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "randomString/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("length", length0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseTaskList1(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def valdiateLoginGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1.valdiateLoginGet",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validateGet1" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:17
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createUser1"})
        }
      """
    )
  
    // @LINE:18
    def createUserForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1.createUserForm",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createUserForm1"})
        }
      """
    )
  
    // @LINE:21
    def addTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1.addTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTask1"})
        }
      """
    )
  
    // @LINE:22
    def deleteTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1.deleteTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteTask1"})
        }
      """
    )
  
    // @LINE:19
    def taskList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1.taskList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskList1"})
        }
      """
    )
  
    // @LINE:20
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout1"})
        }
      """
    )
  
    // @LINE:16
    def validateLoginPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1.validateLoginPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validatePost1"})
        }
      """
    )
  
    // @LINE:14
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList1.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login1"})
        }
      """
    )
  
  }

  // @LINE:64
  class ReverseTaskList7(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def load: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList7.load",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "load7"})
        }
      """
    )
  
  }

  // @LINE:49
  class ReverseTaskList4(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def load: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskList4.load",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "load4"})
        }
      """
    )
  
  }


}
