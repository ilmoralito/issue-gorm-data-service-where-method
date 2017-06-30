package demo

class Band {
    String name

    static constraints = {
        name blank: false
    }

    static hasMany = [albums: Album]
}
