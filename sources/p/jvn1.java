package p;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jvn1 {
    public static final pue0 d = new pue0("AnalyticsConsent", (String) null);
    public final pxo1 a;
    public final long b;
    public final jim0 c = new jim0(Looper.getMainLooper(), (byte) 5);

    public jvn1(long j, Context context) {
        this.a = new pxo1(context, (Activity) null, ybo1.a, new hbo1(), jz40.c);
        this.b = j;
    }
}
