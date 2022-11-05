package com.beaiteam.project1beai.help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Primary
public abstract class ContentDecorator implements ContentInterface {
    @Autowired
    @Qualifier
    ContentInterface contentInterface;


    public ContentDecorator(ContentInterface contentInterface) {
        this.contentInterface = contentInterface;
    }
    @Override
    public String getMusikI() {
        return contentInterface.getMusikI();
    }

}
