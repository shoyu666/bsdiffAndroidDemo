package com.shoyu666.util.bsdiff;

import java.io.File;

/**
 * patch入口
 * Created by shoyu666 on 16/7/12.
 */
public class BsPatch {
    public static final String TAG="BsPatch";
    static {
        System.loadLibrary("bsdiff");
    }

    /**
     * patch操作
     * @param old  老的apk路径
     * @param patch  补丁路径
     * @param newapk  新的apk路径
     */
    public static native void bspatch(String old, String patch, String newapk);

    /**
     *测试下库是否正常
     * @return
     */
    public static native String test();

    /**
     * 启动一部patch
     * @param files
     */
    public static void patchSync(File... files){
        BsPatchAsyncTask task = new BsPatchAsyncTask();
        task.execute(files);
    }
}
