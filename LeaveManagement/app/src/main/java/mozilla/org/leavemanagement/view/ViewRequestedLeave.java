package mozilla.org.leavemanagement.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import mozilla.org.leavemanagement.R;


public class ViewRequestedLeave extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_applied_leaves);

        defineLayout();
        initiliazeData();
        setListneres();
    }

    /**
     * To define all the layouts
     */
    public void defineLayout() {


    }

    /**
     * To initiliaze Data
     */
    public void initiliazeData() {
    }

    /**
     * To set the listneres
     */
    public void setListneres() {

    }


}
