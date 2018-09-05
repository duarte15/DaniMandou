package danimandou;
import java.util.*;

public abstract class MyFile{    
    
    private String srcAddress;
    private String destAddress;
    
    public abstract String converter();

    public String getSrcAddress() {
        return srcAddress;
    }

    public void setSrcAddress(String srcAddress) {
        this.srcAddress = srcAddress;
    }
}
