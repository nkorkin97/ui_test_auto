package config;

import pages.basepage.Header;
import pages.basepage.LeftPanel;

public class BasePage {

    protected static LeftPanel leftPanel;
    protected static Header header;

    public LeftPanel leftPanel() {
        if(leftPanel==null) {
            leftPanel=new LeftPanel();
        }
        return leftPanel;
    }

    public Header header() {
        if(header==null) {
            header=new Header();
        }
        return header;
    }
}
