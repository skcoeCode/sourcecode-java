package com.java.oop.design;

public interface MobileStep2 {
    void call();
    void playmusic();
}

interface Mobile2018 extends MobileStep2{
    void takePhoto();

}
class Iphone implements Mobile2018 {
    @Override
    public void takePhoto() {        
    }

    @Override
    public void call() {      
    }

    @Override
    public void playmusic() {        
    }
}

class Sumsung implements MobileStep2 {
    @Override
    public void call() {       
    }

    @Override
    public void playmusic() {        
    }

}

