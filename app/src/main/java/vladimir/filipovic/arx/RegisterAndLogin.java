package vladimir.filipovic.arx;

import android.util.Log;
import android.widget.Button;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class RegisterAndLogin extends BaseObservable {
    Button registerButton;
    String email;
    String password;
    String cpassword;

    @Bindable
    public String getPassword() {
        return password;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    @Bindable
    public String getCpassword() {
        return cpassword;
    }

    @Bindable
    public void setPassword (String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
        Log.wtf("password",password);
    }

    @Bindable
    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
        notifyPropertyChanged(BR.cpassword);
    }

    @Bindable
    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }
}
