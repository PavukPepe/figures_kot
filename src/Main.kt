fun main() {
    do {
        println("1. Квадрат\n2. Треугольник\n3. Круг\n4. Ромб\n5. Прямоугольник\n6. Стоп")
        val a: String = readln()

        when (a) {
            "1" -> {
                print("Введите длину стороны: ")
                val square = Square(readln().toDouble())
                println("Периметр: " + square.P() + " Площадь: " + square.S())
            }

            "2" -> {
                print("Введите длину стороны: ")
                val triangle = Triangle_racn(readln().toDouble())
                println("Периметр: " + triangle.P() + " Площадь: " + triangle.S())
            }

            "3" -> {
                print("Введите радиус: ")
                val circle = Circle(readln().toDouble())
                println("Периметр: " + circle.P() + " Площадь: " + circle.S())
            }
            "4" -> {
                print("Введите сторону: ")
                val a = readln().toDouble()
                print("Введите высоту: ")
                val h = readln().toDouble()
                val romb = Romb(a, h)
                println("Периметр: " + romb.P() + " Площадь: " + romb.S())
            }
            "5" -> {
                print("Введите сторону 1: ")
                val a = readln().toDouble()
                print("Введите высоту 2: ")
                val b = readln().toDouble()
                val rectangle = Rectangle(a, b)
                println("Периметр: " + rectangle.P() + " Площадь: " + rectangle.S())
            }
        }
    } while (a != "6")
}


