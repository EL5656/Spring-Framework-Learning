package org.example.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BrandZ implements DeviceProcessor{
    @Override
    public void process() {
        System.out.println("2nd best CPU");
    }
}
