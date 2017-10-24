package mozilla.org.leavemanagement;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import mozilla.org.leavemanagement.helper.AsyncTaskHelper;
import mozilla.org.leavemanagement.model.User;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private Activity mActivity;

    private AsyncTaskHelper asyncTaskHelper;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
