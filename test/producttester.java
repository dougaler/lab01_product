import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class producttester {
    Product p1,p2,p3,p4;
    @BeforeEach
    void setup(){
        p1 = new Product("Tool","Item ued to fix things","00000A",8.13);
        p2 = new Product("Cereal","Dry breakfast food","00000B",3.50);
        p3 = new Product("Fun","Intangible feeling of euphoria while doing an activity","00000C",0.00);
        p4 = new Product("Computer","Electronic device","00000D",480.19);
    }
    @Test
    void getName() {
        Assertions.assertEquals("Tool", p1.getName());
    }
    @Test
    void getDescription() {
        Assertions.assertEquals("Dry breakfast food", p2.getDescription());
    }
    @Test
    void getID() {
        Assertions.assertEquals("00000C", p3.getID());
    }
    @Test
    void getCost() {
        Assertions.assertEquals(480.19, p4.getCost());
    }

    @Test
    void setName() {
        p1.setName("Tool");
        Assertions.assertEquals("Tool",p1.getName());
    }
    @Test
    void setDescription() {
        p1.setDescription("Dry breakfast food");
        Assertions.assertEquals("Dry breakfast food",p1.getDescription());
    }
    @Test
    void setID() {
        p1.setID("00000C");
        Assertions.assertEquals("00000C",p1.getID());
    }
    @Test
    void setCost() {
        p1.setCost(480.19);
        Assertions.assertEquals(480.19,p1.getCost());
    }
}