package org.example.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BrandX {
    @Autowired
    @Qualifier("brandY")
    DeviceProcessor cpu;//b
    public DeviceProcessor getCpu() {
        return cpu;
    }
    public void setCpu(DeviceProcessor cpu) {
        this.cpu = cpu;
    }
    public void config(){//step 2
        System.out.println("Octa Core, 4 gb Ram, 12MP camera");
        cpu.process();//c
    }
}
