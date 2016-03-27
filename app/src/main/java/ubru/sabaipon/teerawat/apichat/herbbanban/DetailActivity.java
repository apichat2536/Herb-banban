package ubru.sabaipon.teerawat.apichat.herbbanban;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.picasso.Picasso;

public class DetailActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String nameString, imageString,
            descripString, howtoString, latString, lngString;
    private TextView nameTextView, descripTextView, howtoTextView;
    private ImageView imageView;
    private double latADouble, lngADouble;
    private LatLng centerLatLng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_detail_layout);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        //บาย วิกเกต
        bindwidget();
        //โชวิว
        showView();
    }//เมนเหมดตอส

    private void showView() {

        nameString = getIntent().getStringExtra("Name");
        imageString = getIntent().getStringExtra("Image");
        descripString = getIntent().getStringExtra("Description");
        howtoString = getIntent().getStringExtra("HowTo");
        latString = getIntent().getStringExtra("Lat");
        lngString = getIntent().getStringExtra("Lng");

        latADouble = Double.parseDouble(latString);
        lngADouble = Double.parseDouble(lngString);
        centerLatLng = new LatLng(latADouble, lngADouble);



        nameTextView.setText(nameString);
        Picasso.with(DetailActivity.this).load(imageString).resize(200,200).into(imageView);
        descripTextView.setText(descripString);
        howtoTextView.setText(howtoString);


    }

    private void bindwidget() {

        nameTextView = (TextView) findViewById(R.id.textView15);
        descripTextView = (TextView) findViewById(R.id.textView17);
        howtoTextView = (TextView) findViewById(R.id.textView19);
        imageView = (ImageView) findViewById(R.id.imageView6);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centerLatLng,12));



    }//ออนแมบ
}//เมนคลาส
