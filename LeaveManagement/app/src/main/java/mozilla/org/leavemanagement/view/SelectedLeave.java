package mozilla.org.leavemanagement.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

import mozilla.org.leavemanagement.R;
import mozilla.org.leavemanagement.helper.AsyncTaskHelper;
import mozilla.org.leavemanagement.model.Leave;


public class SelectedLeave extends Activity {

    private Activity mActivity;

    private TextView reasonTextView;
    private TextView fromDateTextView;
    private TextView toDateTextView;
    private TextView statusTextView;

    private Leave leaveObject;

    private Button deleteButton;
    private Button editButton;
    private Button backButton;
    private AsyncTaskHelper asyncTaskHelper;

    private boolean isLeaveDeleted;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_leave);

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
