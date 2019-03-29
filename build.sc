import mill._,scalalib._



trait CommonModule extends ScalaModule {
    def scalaVersion = "2.12.8"
}

object core extends ScalaModule with CommonModule{

}

object api extends ScalaModule with CommonModule{

}
object adminapi extends ScalaModule with CommonModule{

}

object lib extends ScalaModule with CommonModule{

}
