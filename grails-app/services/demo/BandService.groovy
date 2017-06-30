package demo

import grails.gorm.services.Service
import grails.gorm.services.Where

@Service(Band)
interface BandService {

    @Where({ name == bandName && albums { name == albumName } })
    List<Band> byBandAndAlbumName(String bandName, String albumName)
}
