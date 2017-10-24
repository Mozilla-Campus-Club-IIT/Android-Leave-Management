package mozilla.org.leavemanagement.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import mozilla.org.leavemanagement.R;
import mozilla.org.leavemanagement.adapter.LazyAdapter;
import mozilla.org.leavemanagement.helper.AsyncTaskHelper;
import mozilla.org.leavemanagement.model.BaseElement;


public class HrViewRequestedLeave extends Activity {

    private Activity mActivity;

    private LazyAdapter mAdapter;
    private ListView mlistView;

    private AsyncTaskHelper asyncTaskHelper;
    private ArrayList<BaseElement> leaveList;
    private Button logoutButton;

    private TextView noRequestsTextView;


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
