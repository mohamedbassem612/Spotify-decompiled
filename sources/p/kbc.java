package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class kbc {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            jbc.b(30);
        }
        if (i >= 30) {
            jbc.b(31);
        }
        if (i >= 30) {
            jbc.b(33);
        }
        if (i >= 30) {
            jbc.b(1000000);
        }
    }

    public static final boolean a() {
        return Build.VERSION.SDK_INT >= 36 && ibc.a() >= 3600001;
    }
}
