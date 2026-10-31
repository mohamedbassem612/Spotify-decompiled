package p;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class p8o0 {
    public static final /* synthetic */ int a = 0;

    static {
        qs10.c("NetworkStateTracker");
    }

    public static final m8o0 a(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        boolean zHasCapability;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
            } catch (SecurityException unused) {
                qs10.a().getClass();
            }
            z2 = z;
            try {
                return new m8o0(z3, zHasCapability, ot11.I(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true, z2);
            } catch (SecurityException unused2) {
                qs10.a().getClass();
                return new m8o0(false, false, false, true, z2);
            }
        } catch (SecurityException unused3) {
            z2 = z;
            qs10.a().getClass();
            return new m8o0(false, false, false, true, z2);
        }
    }
}
