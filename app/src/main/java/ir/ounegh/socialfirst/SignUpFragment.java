package ir.ounegh.socialfirst;


import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {

    TextInputEditText username,password,fullname,email;
    TextView login;

    Button b;
    View v;
    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_sign_up, container, false);
        setupUI();
        return v;
    }

    private void setupUI() {
        username= (TextInputEditText) v.findViewById(R.id.signup_username);
        fullname= (TextInputEditText) v.findViewById(R.id.full_name);
        email= (TextInputEditText) v.findViewById(R.id.signup_email);
        password= (TextInputEditText) v.findViewById(R.id.signup_password);
        b= (Button) v.findViewById(R.id.btn_signUp);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        login= (TextView) v.findViewById(R.id.lbl_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new LoginFragment()).commit();
            }
        });
    }


}
