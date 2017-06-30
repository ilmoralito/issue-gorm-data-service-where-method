package demo

class BootStrap {

    def init = { servletContext ->
        Band band1 = new Band(name: 'Band1')

        band1
            .addToAlbums(new Album(name: 'Album1'))
            .addToAlbums(new Album(name: 'Album2'))
            .addToAlbums(new Album(name: 'Album3'))
            .addToAlbums(new Album(name: 'Album4'))
            .addToAlbums(new Album(name: 'Album5'))

        band1.save()

        Band band2 = new Band(name: 'Band2')

        band2
            .addToAlbums(new Album(name: 'Album6'))
            .addToAlbums(new Album(name: 'Album7'))
            .addToAlbums(new Album(name: 'Album8'))
            .addToAlbums(new Album(name: 'Album9'))
            .addToAlbums(new Album(name: 'Album10'))

        band2.save()

    }
    def destroy = {
    }
}
