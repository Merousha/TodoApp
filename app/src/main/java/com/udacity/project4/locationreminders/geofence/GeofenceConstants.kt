package com.udacity.project4.locationreminders.geofence

import com.google.android.gms.location.Geofence

internal object GeofenceConstants {
    const val GEOFENCE_RADIUS_IN_METERS = 500f
    const val ACTION_GEOFENCE_EVENT =
        "GEOFENCE_EVENT"

    const val NEVER_EXPIRES = Geofence.NEVER_EXPIRE
}