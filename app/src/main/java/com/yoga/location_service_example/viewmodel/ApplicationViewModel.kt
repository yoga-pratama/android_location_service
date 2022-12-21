package com.yoga.location_service_example.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.yoga.location_service_example.LocationLiveData


class ApplicationViewModel(application: Application) : AndroidViewModel(application) {

    private  val locationLiveData  = LocationLiveData(application)
    fun getLocationLiveData() = locationLiveData

    fun startLocationUpdates(){
         locationLiveData.startLocationUpdates()
    }

}