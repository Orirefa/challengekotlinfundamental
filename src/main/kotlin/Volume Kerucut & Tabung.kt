import java.util.*

public var input = Scanner(System.`in`);
fun main() {


    println("===============================")
    print("Nama :")
    val nama: String? = input.nextLine()

    if (nama.isNullOrEmpty()) {
        println("Mohon diisi")
        menu()
    }
    print("Kelas :")
    val kelas: String = input.nextLine()
    print("No Absen :")
    val Absen = input.nextInt()
    print("Github:")
    val git: String? = null
    val gitLength = git?.length ?: "orirefa"
    println(gitLength)
    println("===============================")
    menu()
}
fun menu(){
    println("1. Kerucut\n2. Tabung\n ")
    print ("Pilih Menu Diatas : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> kerucut()
        2 -> tabung()
        else -> {
            println("Pilihan tidak ada")
            menu()
        }
    }
}
fun kerucut() {
    println("===============================");
    print("Masukkan Tinggi Kerucut : ");
    val tinggi: Double = input.nextDouble();
    print("Masukkan Jari-Jari Kerucut : ");
    val jari: Double = input.nextDouble();

    val v: Double = (0.33333) * Math.PI * (jari * jari) * tinggi;
    println("===============================");
    print("Volume dari kerucut adalah ");
    System.out.printf("%.2f", v);
    println()
    println("===============================");
    menu()
}
fun tabung() {
    println("===============================");
    print("Masukkan Tinggi Tabung : ");
    var tinggi: Double? = null
    tinggi = input.nextDouble();
    print("Masukkan Jari-Jari Tabung : ");
    var jari: Double? = null
    jari = input.nextDouble();
    val v = Math.PI * jari * jari * tinggi;
    println("===============================");
    print("Volume dari tabung adalah ")
    System.out.printf("%.2f", v);
    println()



}