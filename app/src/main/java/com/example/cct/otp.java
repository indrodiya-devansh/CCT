package com.example.cct;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class otp extends AppCompatActivity {
    private EditText ic;
    private String Verificationid;
    private Button btnUpload;
    private FirebaseDatabase database;
    private FirebaseStorage storage;
    ImageView imageView;
    ActivityResultLauncher<String> Gphoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        imageView = (ImageView) findViewById(R.id.imageView);
        database = FirebaseDatabase.getInstance();
        storage = FirebaseStorage.getInstance();
        Gphoto = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback<Uri>(){
            @Override
            public void onActivityResult(Uri result) {
                imageView.setImageURI(result);
                final StorageReference reference = storage.getReference("Images").child("image");
                reference.putFile(result).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {

                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                database.getReference("ImagesUrl").child("image")
                                        .setValue(uri.toString()).addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void unused) {
                                                Toast.makeText(getApplicationContext(),"image Uploaded",Toast.LENGTH_SHORT).show();
                                            }
                                        });
                            }
                        });
                    }
                });

            }
        });



    }




    public void submit(View view) {
        TextView textmobile = (TextView) findViewById(R.id.textmobile);
        textmobile.setText(String.format("+91-%s",getIntent().getStringExtra("mobile")));
        ic = (EditText) findViewById(R.id.inputcode);
        Verificationid = getIntent().getStringExtra("verificationId");
        if(ic.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "please enter valid code", Toast.LENGTH_SHORT).show();
            return;
        }
        String code = ic.getText().toString();
        if(Verificationid !=null){


            PhoneAuthCredential phoneAuthCredential = PhoneAuthProvider.getCredential(Verificationid, code);
            FirebaseAuth.getInstance().signInWithCredential(phoneAuthCredential)
                        .addOnCompleteListener(task -> {

                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Intent intent = new Intent(getApplicationContext(),home.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                                startActivity(intent);

                            } else {
                                Toast.makeText(otp.this,"code wrong",Toast.LENGTH_LONG).show();
                                }
                            }
                        );
            }
        }

    public void onClick(View view) {
        Gphoto.launch("image/*");
    }
}
