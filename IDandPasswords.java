import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Muhittin20","a1b2c3d4");
        logininfo.put("RTE","tayyo123");
        logininfo.put("Kilicdar","KK123");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
