// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Lenovo/Desktop/Play-Videos-master/server/conf/routes
// @DATE:Fri Feb 04 12:59:20 EET 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
