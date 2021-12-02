class Box<T>(type: T, vol: Int){
    var furniture = type
    var volume = vol
    fun getBoxVolume(): Int{
        return volume
    }
    fun getFurnitureFromBox(): T {
        return furniture
    }
}

class Fridge{}
class Armchair{}
