package com.tyf.mars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

@SpringBootTest
class MarsApplicationTests {

    @Test
    void testMarRover() {
        Coordinate coordinate = new Coordinate(5 ,6 , Constants.NORTH );
        Rover car = new Rover(coordinate);
        car.setOperate("f r f b b l f b");
        Assert.assertEquals(car.coordinate, new Coordinate(4,7,Constants.NORTH));
    }

    @Test
    void test_rover_go_front(){
        Coordinate coordinate = new Coordinate(5 ,6 , Constants.NORTH );
        Rover car = new Rover(coordinate);
        car.setOperate("f");
        Assert.assertEquals(car.coordinate, new Coordinate(5,7,Constants.NORTH));
    }

    @Test
    void test_rover_go_back(){
        Coordinate coordinate = new Coordinate(5 ,6 , Constants.NORTH );
        Rover car = new Rover(coordinate);
        car.setOperate("b");
        Assert.assertEquals(car.coordinate, new Coordinate(5,5,Constants.NORTH));
    }

    @Test
    void test_rover_turn_left(){
        Coordinate coordinate = new Coordinate(5 ,6 , Constants.NORTH );
        Rover car = new Rover(coordinate);
        car.setOperate("l");
        Assert.assertEquals(car.coordinate, new Coordinate(5,6,Constants.WEST));
    }

    @Test
    void test_rover_turn_right(){
        Coordinate coordinate = new Coordinate(5 ,6 , Constants.NORTH );
        Rover car = new Rover(coordinate);
        car.setOperate("r");
        Assert.assertEquals(car.coordinate, new Coordinate(5,6,Constants.EAST));
    }
}
