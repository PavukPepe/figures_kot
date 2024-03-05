import kotlin.math.sqrt

class Rectangle(val a: Double, val b: Double) : Figure()
{
    override fun S(): Double {
        return (a * b)
    }
    override fun P(): Double {
        return (a + b) * 2
    }
}

class Circle(val r: Double) : Figure()
{
    override fun S(): Double {
        return (Pi * r * r)
    }
    override fun P(): Double {
        return (2 * Pi * r)
    }
}

class Square(val a: Double) : Figure()
{
    override fun S(): Double {
        return (a * a)
    }
    override fun P(): Double {
        return (a * 4)
    }
}

class Romb(val a: Double, val h: Double) : Figure()
{
    override fun S(): Double {
        return (a * h)
    }
    override fun P(): Double {
        return (a * 4)
    }
}

class Triangle_racn (val a: Double) : Figure()
{
    override fun S(): Double {
        return ((a * a * sqrt(3.0)) / 4)
    }
    override fun P(): Double {
        return (a * 3)
    }
}


