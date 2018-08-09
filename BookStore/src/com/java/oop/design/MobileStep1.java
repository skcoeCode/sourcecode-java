package com.java.oop.design;

public interface MobileStep1 {
    void call();
    void playmusic();
}

interface Mobile2018 {
    void takePhoto();

}
class Iphone implements MobileStep1,Mobile2018 {
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

class Sumsung implements MobileStep1 {
    @Override
    public void call() {       
    }

    @Override
    public void playmusic() {        
    }

}

