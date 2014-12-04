package com.test



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ExtendController)
@Mock([Extend, Abstract])
class ExtendControllerTests {

	@Test
    void testList() {
       def extend1 = new Extend(name:"Extend Test 1", surname: "Extend Test 1")
       extend1.save()
       def extend2 = new Extend(name:"Extend Test 2", surname: "Extend Test 2")
       extend2.save()
       def extend3 = new Extend(name:"Extend Test 3", surname: "Extend Test 3")
       extend3.save()

       given:
       params.max = 5
       params.offset = 0
       params.sort = 'id'
       params.order = 'asc'

       then:
       assert controller.list() == [extend1, extend2, extend3]
    }
}
