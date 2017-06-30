package demo

class Album {
    String name

    static constraints = {
        name blank: false
    }

    static belongsTo = [band: Band]
}
