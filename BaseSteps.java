package steps;

import core.Driver;
import org.junit.After;
import org.junit.Before;

public class BaseSteps {

    @Before
    public void abreNavegador(){
        Driver.abreNavegdor();
    }

    @After
    public void fechaNavegador(){
        Driver.fechaNavegador();
    }
}
