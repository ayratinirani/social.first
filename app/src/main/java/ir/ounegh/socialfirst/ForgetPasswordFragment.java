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
public class  ForgetPasswordFragment extends Fragment {
    TextInputEditText mail;
    TextView signup;

    Button b;
    View v;
    public ForgetPasswordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_forget_password, container, false);
        setupUI();
        return v;
    }

    private void setupUI() {

        mail= (TextInputEditText) v.findViewById(R.id.forgetpass_email);
        b= (Button) v.findViewById(R.id.forgetpass_send);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        signup= (TextView) v.findViewById(R.id.frg_sign_up);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new SignUpFragment()).commit();

            }
        });
    }

}
