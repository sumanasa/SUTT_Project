package com.example.win10.su;

import android.support.v4.app.Fragment;
import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class ContactsFragment extends Fragment {
    private View contactsView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contactsView = inflater.inflate(R.layout.fragment_contacts, container, false);
        setUpViews();
        return contactsView;
    }

    private void setUpViews() {

        contactsView.findViewById(R.id.augustina).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dial("7287070196");
                }
        });
        contactsView.findViewById(R.id.deepak).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dial("7780689988");
            }

        });
        contactsView.findViewById(R.id.lahari).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dial("9444924727");
            }

        });
        contactsView.findViewById(R.id.riya).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dial("7893116995");
            }

        });
        contactsView.findViewById(R.id.william).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dial("9515464004");
            }

        });

    }
    private void dial(final String MobNo) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", MobNo, null)));
    }
}
