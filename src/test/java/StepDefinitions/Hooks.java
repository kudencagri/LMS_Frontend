package StepDefinitions;

import Utility.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;

public class Hooks {
    @Before
    public void before(){

    }
    @After
    public void after(){
        //*** *********************************************** normal zamanda bu kapalı kalsın yoksa hata verirr RAPORLAMA plugin olduğu zanaman aç
//        if (senaryo.isFailed()){
//            TakesScreenshot ts=((TakesScreenshot) GWD_old.getDriver());
//            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
//            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
//        }

        GWD.quitDriver();
    }
}
