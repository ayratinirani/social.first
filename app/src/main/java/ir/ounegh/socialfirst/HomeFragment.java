package ir.ounegh.socialfirst;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

   View view;
    PostAdapter postAdapter;
    RecyclerView recyclerView;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_home, container, false);
        LinearLayoutManager llm= new LinearLayoutManager(getContext());
        recyclerView= (RecyclerView) view.findViewById(R.id.homelist);
        recyclerView.setLayoutManager(llm);
        postAdapter=new PostAdapter(getActivity());
        recyclerView.setAdapter(postAdapter);
        return view;
    }

}
