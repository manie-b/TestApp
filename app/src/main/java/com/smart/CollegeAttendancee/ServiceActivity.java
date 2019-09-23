package com.smart.CollegeAttendancee;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView termsand_conditions,privacy_policy,refund_policy,call,mail,website,facebook,twitter,youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        //define cards
        termsand_conditions=findViewById(R.id.terms_conditionsbct);
        privacy_policy=findViewById(R.id.privacy_policybct);
        refund_policy=findViewById(R.id.refund_policybct);
        call=findViewById(R.id.call_bct);
        mail=findViewById(R.id.email_bct);
        website=findViewById(R.id.web_bct);
        facebook=findViewById(R.id.facebook_bct);
        twitter=findViewById(R.id.twitter_bct);
        youtube=findViewById(R.id.youtube_bct);

        //Add click listeners to the cards
        termsand_conditions.setOnClickListener(this);
        privacy_policy.setOnClickListener(this);
        refund_policy.setOnClickListener(this);
        call.setOnClickListener(this);
        mail.setOnClickListener(this);
        website.setOnClickListener(this);
        facebook.setOnClickListener(this);
        twitter.setOnClickListener(this);
        youtube.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId())

        {
            case R.id.terms_conditionsbct:
                AlertDialog.Builder builder=new AlertDialog.Builder(ServiceActivity.this);
                builder.setIcon(R.drawable.termsandconditionslogo);
                builder.setTitle("Terms And Conditions");
                builder.setMessage(R.string.termsandcondition_bct);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ServiceActivity.this, "", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.create().show();
                break;

            case R.id.privacy_policybct:
                AlertDialog.Builder builderp=new AlertDialog.Builder(ServiceActivity.this);
                builderp.setIcon(R.drawable.termsandconditionslogo);
                builderp.setTitle("Privacy Policy");
                builderp.setMessage(R.string.privacypolicly_bct);
                builderp.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ServiceActivity.this, "", Toast.LENGTH_SHORT).show();
                    }
                });

                builderp.create().show();
                break;

            case R.id.refund_policybct:
                AlertDialog.Builder builderr=new AlertDialog.Builder(ServiceActivity.this);
                builderr.setIcon(R.drawable.termsandconditionslogo);
                builderr.setTitle("Refund Policy");
                builderr.setMessage(R.string.refundpolicy_bct);
                builderr.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ServiceActivity.this, "", Toast.LENGTH_SHORT).show();
                    }
                });

                builderr.create().show();
                break;


            case R.id.call_bct:
                android.app.AlertDialog.Builder alert=new android.app.AlertDialog.Builder(this);
                final String[] phone={"98410 53111","95001 22697"};
                alert.setTitle("Our Contact Numbers:");
                alert.setItems(phone, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone[i].toString()));
                        startActivity(intent);
                    }
                });
                alert.create().show();
                break;

            case R.id.email_bct:
                try{
                    Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "balajitrst@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Your Subject:");
                    intent.putExtra(Intent.EXTRA_TEXT, "Your Feedback:");
                    startActivity(intent);
                }catch(ActivityNotFoundException e){

                }
                break;

            case R.id.web_bct:
                Uri uri = Uri.parse("http://www.balajicharitabletrust.co.in"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;

            case R.id.facebook_bct:
                Uri urif = Uri.parse("https://www.facebook.com/Balaji-Charitable-Trust-2121321211464229"); // missing 'http://' will cause crashed
                Intent intentf = new Intent(Intent.ACTION_VIEW, urif);
                startActivity(intentf);
                break;

            case R.id.twitter_bct:
                Uri urit = Uri.parse("https://twitter.com/balaji_trust"); // missing 'http://' will cause crashed
                Intent intentt = new Intent(Intent.ACTION_VIEW, urit);
                startActivity(intentt);
                break;

            case R.id.youtube_bct:
                Uri uriy = Uri.parse("https://www.youtube.com/channel/UCxqf80RBYjDMzq7EtTk4C_g"); // missing 'http://' will cause crashed
                Intent intenty = new Intent(Intent.ACTION_VIEW, uriy);
                startActivity(intenty);
                break;

        }

    }
}
