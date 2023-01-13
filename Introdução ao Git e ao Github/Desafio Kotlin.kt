enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuarios(val nome: String, val idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

  	val inscritos1 = mutableListOf<Usuarios>()
  	val inscritos2 = mutableListOf<Usuarios>()
  
    fun matricular1(usuario: Usuarios) {
        inscritos1.add(usuario)
        
        
    }
    fun matricular2(usuario: Usuarios) {
        inscritos2.add(usuario)
        
    }
    fun print1() {
        println("$inscritos1 matriculados no ${conteudos[0]}")
    }
	fun print2() {
        println("$inscritos2 matriculado no ${conteudos[1]}")
    }
}

fun main() {
    val user1 = Usuarios("Marcos", 25)
	  val user2 = Usuarios("João", 35)
    val user3 = Usuarios("Ademir", 18)

    
    val conteudo1 = ConteudoEducacional("Kotlin Experience", 40, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Formação Power BI Analyst", 60, nivel = Nivel.INTERMEDIARIO)

    val formacao1 = Formacao("$conteudo1", listOf(conteudo1, conteudo2))
    
    formacao1.matricular1(user1)
    formacao1.matricular1(user2)
    formacao1.matricular2(user3)
    
    formacao1.print1()
    formacao1.print2()
}