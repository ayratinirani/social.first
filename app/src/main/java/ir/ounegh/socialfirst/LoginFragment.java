package ir.ounegh.socialfirst;


import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
   TextInputEditText username,password;
    TextView signup;
    TextView fogetpassword;
   Button b;
   View v;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_login, container, false);
        setupUI();
        return v;
    }

    private void setupUI() {
        username= (TextInputEditText) v.findViewById(R.id.login_username);
        password= (TextInputEditText) v.findViewById(R.id.login_password);
        b= (Button) v.findViewById(R.id.btn_login);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        fogetpassword=(TextView) v.findViewById(R.id.lbl_forget_password);
        fogetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new ForgetPasswordFragment()).commit();

            }
        });
        signup= (TextView) v.findViewById(R.id.lbl_sign_up);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new SignUpFragment()).commit();

            }
        });
    }

}
