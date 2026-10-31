package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mk70 {
    public static final t380 a;

    static {
        a = Build.VERSION.SDK_INT < 32 ? t380.v(12, 252, 6396, 4) : t380.w(12, 252, 6396, 4, 3145980, 82172, new Integer[]{737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172});
    }
}
