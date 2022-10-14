import kotlin.text.toInt as toInt1

fun main(args: Array<String>) {

    var Usuario1=Usuario(43844509, 27438445094, "Jael", "Gamarra", "Calle 13, N 380",
        "3564332441", "jaelgamarra15@gmail.com")
    val ListaUsuarios=ArrayList<Usuario>()

    println("     Municipalidad de Cordoba     ")
    println("¿Que operacion desea realizar?: ")
    println("1- Registrarse")
    println("2- Iniciar Sesion")
    println("3- Registrar incidente")

    val operacion= readLine()!!.toInt1()

    when(operacion){
        1->{
            val usuario=nuevoUsuario()
            ListaUsuarios.add(usuario)
            println("Usted ha sido registrado con exito!")
        }
        2->{
                val CUIL = iniciarSesion()
                if(CUIL==27438445094){
            println("Usted ha iniciado sesion con exito")
            } else {
                println("Vuelva a ingresar correctamente su CUIL")
                }
        }
        3->{
            val incidente=registrarIncidente()
            println("El incidente se ha registrado con exito")
        }
    }
}
fun nuevoUsuario(): Usuario {
    println("DNI: ")
    val DNI = readLine()!!.toInt1()
    println("CUIL: ")
    val CUIL = readLine()!!.toLong()
    println("Nombre: ")
    val nombre = readLine()!!.toString()
    println("Apellido: ")
    val apellido = readLine()!!.toString()
    println("Domicilio: ")
    val domicilio = readLine()!!.toString()
    println("Telefono: ")
    val telefono = readLine()!!.toString()
    println("e-mail: ")
    val email = readLine()!!.toString()

    val usuario=Usuario(DNI=DNI, CUIL=CUIL, nombre=nombre, apellido=apellido, domicilio=domicilio, telefono=telefono,
    email=email)

    return usuario
}
fun iniciarSesion(): Long{
    println("CUIL: ")
    val CUIL = readLine()!!.toLong()
    println("Contraseña: ")
    val contrasenia = readLine()!!.toString()

    return CUIL
}
fun registrarIncidente(){
    println("Categoria: ")
    val categoria = readLine()!!.toString()
    println("Subcategoria: ")
    val subcategoria = readLine()!!.toString()
    println("Ubicacion: ")
    val ubicacion = readLine()!!.toString()
    println("Fecha(DD/MM/AA): ")
    val fecha = readLine()!!.toString()
    println("Hora: ")
    val hora = readLine()!!.toString()
}