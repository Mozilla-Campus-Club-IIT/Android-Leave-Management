package mozilla.org.leavemanagement.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import mozilla.org.leavemanagement.MainActivity;
import mozilla.org.leavemanagement.R;
import mozilla.org.leavemanagement.adapter.LazyAdapter;
import mozilla.org.leavemanagement.helper.AsyncTaskHelper;
import mozilla.org.leavemanagement.helper.SharedPrefHelper;
import mozilla.org.leavemanagement.model.BaseElement;
import mozilla.org.leavemanagement.service.LeaveService;
import mozilla.org.leavemanagement.util.AdapterElement;


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
        mActivity = this;

        mlistView = (ListView) findViewById(R.id.listView);
        logoutButton = (Button) findViewById(R.id.logout);
        noRequestsTextView = (TextView) findViewById(R.id.noRequest);

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
