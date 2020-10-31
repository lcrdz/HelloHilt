package com.lcardoso.hellohilt

import android.util.Log
import javax.inject.Inject

class AuditLogger @Inject constructor() {

    fun log(message: String) {
        Log.d(TAG, message)
    }

    companion object {
        private const val TAG = "AuditLogger"
    }
}