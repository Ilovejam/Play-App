// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Lenovo/Documents/GitHub/Play-Videos/server/conf/routes
// @DATE:Fri Feb 04 15:44:39 EET 2022


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
