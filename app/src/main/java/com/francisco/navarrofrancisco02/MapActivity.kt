package com.francisco.navarrofrancisco02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.francisco.navarrofrancisco02.databinding.ActivityMapBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityMapBinding
    private lateinit var googleMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragmentMap = supportFragmentManager.findFragmentById(R.id.fcv_map) as SupportMapFragment
        fragmentMap.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map

        val kfcLocation = LatLng(-12.005847252951417,-77.06927301714956)
        val idatTomasValleLocation = LatLng(-12.011682968869676,-77.07131579458162)
        val megaplazaLocation = LatLng(-11.994195328766535,-77.06119514248377)
        googleMap.addMarker(MarkerOptions().position(kfcLocation).title("KFC - Los Olivos "))
        googleMap.addMarker(MarkerOptions().position(idatTomasValleLocation).title("IDAT- Tomás Valle"))
        googleMap.addMarker(MarkerOptions().position(megaplazaLocation).title("Mega Plaza"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(kfcLocation))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(idatTomasValleLocation))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(megaplazaLocation))
    }
}