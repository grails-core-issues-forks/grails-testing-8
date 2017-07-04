package testing_fw_model

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ApplicationControllerSpec extends Specification implements ControllerUnitTest<ApplicationController> {
   def "index returns valid model"() {
       when:
       controller.index()

       then:
       model.keySet().size() == 2
       model.keySet().contains 'grailsApplication'
       model.keySet().contains 'pluginManager'
   }
}
