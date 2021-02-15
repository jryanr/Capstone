package com.example.capstonenum_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Geolocation : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geolocation)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val home = LatLng(16.42335684880961, 120.59914748093094)
        mMap.addMarker(MarkerOptions().position(home).title("My Marker"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(home, 16f))

        val distc1 = LatLng(16.425928516152755, 120.59901873489626)
        mMap.addMarker(MarkerOptions().position(distc1).title("distc1 marker"))

        val distc2 = LatLng(16.422833265110928, 120.59789701181015)
        mMap.addMarker(MarkerOptions().position(distc2).title("distc2 marker"))

        val distc3 = LatLng(16.42282583394309, 120.59790320960624)
        mMap.addMarker(MarkerOptions().position(distc3).title("distc3 marker"))

        val distc4 = LatLng(16.41842915219455, 120.59882424705035)
        mMap.addMarker(MarkerOptions().position(distc4).title("distc4 marker"))

        val distc5 = LatLng(16.415584748386923, 120.59555307468449)
        mMap.addMarker(MarkerOptions().position(distc5).title("distc5 marker"))

        val distc6 = LatLng(16.42383145512323, 120.58698459062974)
        mMap.addMarker(MarkerOptions().position(distc6).title("distc6 marker"))

        val distc7 = LatLng(16.416092600044784, 120.61085399022492)
        mMap.addMarker(MarkerOptions().position(distc7).title("distc7 marker"))

        val distc8 = LatLng(16.40898024498362, 120.61068088966617)
        mMap.addMarker(MarkerOptions().position(distc8).title("distc8 marker"))
    }
}