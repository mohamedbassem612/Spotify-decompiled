package p;

import android.os.SystemClock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class aqn1 {
    public static final a6o1 a;

    static {
        vpn1 vpn1Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            vpn1Var = new vpn1((byte) 0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            vpn1Var = new vpn1((byte) 1);
        }
        a = vpn1Var;
    }
}
