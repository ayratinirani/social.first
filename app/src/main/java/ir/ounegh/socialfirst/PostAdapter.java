package ir.ounegh.socialfirst;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by aseme on 04/07/2017.
 */

class PostAdapter extends RecyclerView.Adapter <PostAdapter.MviewHolder>{
    Context context;
    public PostAdapter(Context c) {
        context=c;
    }

    @Override
    public MviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_item, parent, false);

        return new MviewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MviewHolder holder, int position) {
     holder.post_user_name.setText("کاربرشماره"+position);
        holder.Post_text.setText("متن پست کامل شماره"+position);

    }


    @Override
    public int getItemCount() {
        return 22;
    }

  public  class MviewHolder extends RecyclerView.ViewHolder{
       ImageButton btn_comment,btn_like,btn_share;
      ImageView post_image;
      ImageView profileImage;
      TextView Post_text,post_user_name;
      public MviewHolder(View itemView) {
          super(itemView);
          btn_comment=(ImageButton)itemView.findViewById(R.id.img_post_comment);
          btn_like=(ImageButton)itemView.findViewById(R.id.img_post_like);
          btn_share=(ImageButton)itemView.findViewById(R.id.img_post_share);
          post_image=(ImageView)itemView.findViewById(R.id.post_image);
          profileImage=(ImageView) itemView.findViewById(R.id.post_profile_image);
          Post_text=(TextView)itemView.findViewById(R.id.post_text);
          post_user_name=(TextView)itemView.findViewById(R.id.post_user_name);
      }


  }

}
