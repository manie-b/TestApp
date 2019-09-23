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

public class ContactActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView address_contact,mobilenum_contact,email_contact,location_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        //ini
        address_contact=findViewById(R.id.map_contact);
        mobilenum_contact=findViewById(R.id.mobnum_contact);
        email_contact=findViewById(R.id.email_contactus);
        location_map=findViewById(R.id.location_bct);

        //onclick listeners

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId())

        {
            case R.id.map_contact:
                AlertDialog.Builder builder=new AlertDialog.Builder(ContactActivity.this);
                builder.setIcon(R.drawable.termsandconditionslogo);
                builder.setTitle("Terms And Conditions");
                builder.setMessage(R.string.address);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ContactActivity.this, "", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.create().show();
                break;

            case R.id.mobnum_contact:
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


            case R.id.email_contactus:
                try{
                    Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "balajitrst@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Your Subject:");
                    intent.putExtra(Intent.EXTRA_TEXT, "Your Feedback:");
                    startActivity(intent);
                }catch(ActivityNotFoundException e){

                }
                break;

        }

    }
}
