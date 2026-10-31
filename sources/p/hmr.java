package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class hmr {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT >= 28;
    }
}
