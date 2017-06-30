package demo

class BandController {
    @Autowired BandService bandService

    def index() {
        render bandService.byBandAndAlbumName('Band1', 'Album1')
    }
}
