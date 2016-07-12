package com.shoyu666.util.bsdiff;


import android.os.AsyncTask;

import java.io.File;

/**
 * 异步patch
 * Created by shoyu666 on 16/7/11.
 */
public class BsPatchAsyncTask extends AsyncTask<File, Integer, File> {
    @Override
    protected File doInBackground(File... files) {
        if (checkParams(files)) {
            File old = files[0];
            File patcher = files[1];
            File newFile = files[2];
            try {
                BsPatch.bspatch(old.getAbsolutePath(), patcher.getAbsolutePath(),newFile.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (newFile.exists()) {
                return newFile;
            }
        }
        return null;
    }


    private boolean checkParams(File... files) {
        boolean result = false;
        if (files != null && files.length == 3) {
            File old = files[0];
            File patcher = files[1];
            File newFile = files[2];
            if (old != null && patcher != null && old.canRead() && patcher.canRead()) {
                if (newFile.exists()) {
                    newFile.delete();
                }
                result= true;
            }
        }
        return result;
    }
}
