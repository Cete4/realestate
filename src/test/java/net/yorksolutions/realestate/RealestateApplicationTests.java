package net.yorksolutions.realestate;

import net.yorksolutions.realestate.controller.RealEstateController;
import net.yorksolutions.realestate.model.RealEstate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.Objects;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RealestateApplicationTests {

    @Autowired
    private RealEstateController controller;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    void RealEstateControllerLoads() {
        assertThat(controller).isNotNull();
    }

//    @Test
//    void realEstateGetAll() {
//        RealEstate[] realEstates = restTemplate.getForObject("http://localhost:" + port + "/realestate/all", RealEstate[].class);
//        assertThat(realEstates).isNotNull();
//    }
//
//    @Test
//    void RealEstateGetByRows() {
//        int test = 2;
//        RealEstate[] realEstates = restTemplate.getForObject("http://localhost:" + port + "/realestate/getbyRowAmount?rows=" + test, RealEstate[].class);
//        assertThat(realEstates).isNotNull();
//        assertThat(realEstates.length).isLessThan(test);
//    }
//
//    @Test
//    void RealEstateSearch() {
//        String baseUrl = "http://localhost:" + port + "/realestate/";
//        String fname = "Madison";
//        RealEstate[] realEstates = restTemplate.getForObject("http://localhost:/" + port + "/search?fname=" + fname, RealEstate[].class);
//        assertThat(realEstates).isNotNull();
//
//
//        RealEstate realEstate = new RealEstate();
//        realEstate.setFname("Madison");
//        String response = restTemplate.postForObject(baseUrl + "add", realEstate, String.class);
//        assertThat(response).isEqualTo("success");
//
//        realEstates = restTemplate.getForObject("http://localhost:" + port + "/realestate/search?fname=" + fname, RealEstate[].class);
//        assertThat(realEstates).isNotNull();
//        assertThat(realEstates).hasSizeGreaterThan(0);
//
//        for(RealEstate realEstate1: realEstates){
//            assertThat(realEstate1.getFname()).isEqualTo("Madison");
//        }
//    }
}
