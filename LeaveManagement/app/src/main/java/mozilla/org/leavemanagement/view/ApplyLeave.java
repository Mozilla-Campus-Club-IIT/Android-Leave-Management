package mozilla.org.leavemanagement.view;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import mozilla.org.leavemanagement.R;
import mozilla.org.leavemanagement.helper.AsyncTaskHelper;
import mozilla.org.leavemanagement.helper.SharedPrefHelper;
import mozilla.org.leavemanagement.model.Leave;
import mozilla.org.leavemanagement.model.User;
import mozilla.org.leavemanagement.service.LeaveService;

import static mozilla.org.leavemanagement.R.id.reason;


public class ApplyLeave extends Activity {

    private Calendar myCalendar;
    private EditText starDateEditText;
    private EditText endDateEditText;
    private EditText reasonEditText;
    private DatePickerDialog.OnDateSetListener startDate;
    private DatePickerDialog.OnDateSetListener endDate;
    private Activity mActivity;

    private Button cancelButton;
    private Button applyButton;
    private AsyncTaskHelper asyncTaskHelper;
    private User user;

    Boolean isLeaveCreted = true;
    Boolean isLeaveUpdated = true;
    boolean isEdit = false;
    Leave leave;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apply_leave);

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
