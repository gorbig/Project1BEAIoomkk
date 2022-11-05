package com.beaiteam.project1beai.help;

public class ContentForVIP extends ContentDecorator{


    public ContentForVIP(ContentInterface contentInterface) {
        super(contentInterface);
    }


    public String getMusikI2() {
        return " Smth about me";

    }
    @Override
    public String getMusikI() {
        return contentInterface.getMusikI() +  getMusikI2();

    }

}
