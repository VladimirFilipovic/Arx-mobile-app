package vladimir.filipovic.arx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseObject;
import com.parse.SignUpCallback;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.ParseInstallation;

import vladimir.filipovic.arx.databinding.ActivityMainBindingImpl;


public class MainActivity extends AppCompatActivity {
    Button registerButton;

    String emailInput;
    String password;
    String cpasswordInput;

    ActivityMainBindingImpl mBinding;
    RegisterAndLogin registerAndLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerAndLogin = new RegisterAndLogin();
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ParseInstallation.getCurrentInstallation().saveInBackground();
        mBinding.setRegisterAndLogin(registerAndLogin);

    }
}
