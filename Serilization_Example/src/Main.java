import com.service.DeSerialization;
import com.service.DemoSerialization;
import com.service.ExternalizationService;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Hello world!");
//        DemoSerialization demoSerialization = new DemoSerialization();
//        demoSerialization.demo();

//        DeSerialization demoSerialization = new DeSerialization();
//        demoSerialization.demo();
        ExternalizationService service = new ExternalizationService();
        service.demoSerilaization();
        service.demoDeSerilaization();




    }
}