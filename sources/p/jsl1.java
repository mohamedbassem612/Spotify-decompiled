package p;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class jsl1 {
    public static final float a = ViewConfiguration.getScrollFriction();
    public static final double b;
    public static final double c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        b = dLog;
        c = dLog - 1.0d;
    }
}
