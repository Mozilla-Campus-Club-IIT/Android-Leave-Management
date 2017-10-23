package mozilla.org.leavemanagement.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import mozilla.org.leavemanagement.R;
import mozilla.org.leavemanagement.helper.SharedPrefHelper;
import mozilla.org.leavemanagement.model.BaseElement;


public class Dashboard extends Activity {

    private Activity mActivity;

    private Button applyButton;
    private Button viewRequestButton;
    private ArrayList<BaseElement> leaveList;

    private TextView remainigTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

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
