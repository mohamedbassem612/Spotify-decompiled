package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class pk30 implements ahn0 {
    public static final String a;

    static {
        StringBuilder sb = new StringBuilder("android.media:");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        a = sb.toString();
        v280 v280Var = new v280(4);
        v280Var.d(new String[]{"video/avc", "video/3gpp", "video/mp4v-es"});
        v280Var.c("video/hevc");
        if (i >= 33) {
            v280Var.c("video/dolby-vision");
        }
        if (i >= 34) {
            v280Var.c("video/av01");
        }
        if (i >= 36) {
            v280Var.c("video/apv");
        }
        v280Var.g();
        Object[] objArr = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"};
        i8p1.m(objArr);
        b380.l(3, objArr);
    }
}
