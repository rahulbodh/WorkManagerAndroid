package com.rahul.workmanagerapplication

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {
        override fun doWork(): Result {

            for (i in 0..999999) {
                Log.d("MyWorker", "i = $i")
            }

            // Indicate whether the work finished successfully with the Result
            return Result.success()
        }


}