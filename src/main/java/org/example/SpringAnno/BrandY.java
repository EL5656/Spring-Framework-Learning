package org.example.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class BrandY implements DeviceProcessor{
    @Override
    public void process() {
        System.out.println("World best CPU");
    }
}
