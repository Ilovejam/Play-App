// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Lenovo/Desktop/Play-Videos-master/server/conf/routes
// @DATE:Fri Feb 04 12:59:20 EET 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:68
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def at(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:69
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "versionedAssets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:52
  class ReverseTaskList5(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def delete(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deleteTask5")
    }
  
    // @LINE:54
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create5")
    }
  
    // @LINE:56
    def addTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addTask5")
    }
  
    // @LINE:55
    def taskList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "taskList5")
    }
  
    // @LINE:58
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout5")
    }
  
    // @LINE:53
    def validate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validate5")
    }
  
    // @LINE:52
    def load(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "load5")
    }
  
  }

  // @LINE:36
  class ReverseTaskList3(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def delete(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deleteTask3")
    }
  
    // @LINE:38
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create3")
    }
  
    // @LINE:40
    def addTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addTask3")
    }
  
    // @LINE:39
    def taskList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "taskList3")
    }
  
    // @LINE:42
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout3")
    }
  
    // @LINE:37
    def validate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validate3")
    }
  
    // @LINE:36
    def load(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "load3")
    }
  
  }

  // @LINE:25
  class ReverseTaskList2(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def delete(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deleteTask2")
    }
  
    // @LINE:33
    def generatedJS(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "generatedJS")
    }
  
    // @LINE:29
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create2")
    }
  
    // @LINE:31
    def addTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addTask2")
    }
  
    // @LINE:27
    def taskList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "taskList2")
    }
  
    // @LINE:32
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout2")
    }
  
    // @LINE:28
    def validate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validate2")
    }
  
    // @LINE:25
    def load(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "load2")
    }
  
    // @LINE:26
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login2")
    }
  
  }

  // @LINE:61
  class ReverseTaskList6(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def load(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "load6")
    }
  
  }

  // @LINE:45
  class ReverseWebSocketChat(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chatSocket")
    }
  
    // @LINE:45
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chat")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def product(prodType:String, prodNum:Int): Call = {
    
      (prodType: @unchecked, prodNum: @unchecked) match {
      
        // @LINE:7
        case (prodType, prodNum)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "productArgs" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("prodType", prodType)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("prodNum", prodNum)))))
      
      }
    
    }
  
    // @LINE:10
    def randomNumber(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "random")
    }
  
    // @LINE:11
    def randomString(length:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "randomString/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("length", length)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseTaskList1(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def valdiateLoginGet(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "validateGet1" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:17
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createUser1")
    }
  
    // @LINE:18
    def createUserForm(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createUserForm1")
    }
  
    // @LINE:21
    def addTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addTask1")
    }
  
    // @LINE:22
    def deleteTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deleteTask1")
    }
  
    // @LINE:19
    def taskList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "taskList1")
    }
  
    // @LINE:20
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout1")
    }
  
    // @LINE:16
    def validateLoginPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validatePost1")
    }
  
    // @LINE:14
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login1")
    }
  
  }

  // @LINE:64
  class ReverseTaskList7(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def load(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "load7")
    }
  
  }

  // @LINE:49
  class ReverseTaskList4(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def load(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "load4")
    }
  
  }


}
