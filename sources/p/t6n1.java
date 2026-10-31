package p;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t6n1 {
    public static final String f;
    public final Application a;
    public NetworkCapabilities b;
    public n6n1 c;
    public final ConnectivityManager d;
    public long e;

    static {
        String canonicalName = ConnectivityManager.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "ConnectivityManager";
        }
        f = canonicalName;
    }

    public t6n1(Application application, sug sugVar) {
        this.a = application;
        this.d = (ConnectivityManager) application.getSystemService("connectivity");
    }

    public final void b() {
        n6n1 n6n1Var = this.c;
        if (n6n1Var != null) {
            try {
                try {
                    this.d.unregisterNetworkCallback(n6n1Var);
                } catch (IllegalArgumentException unused) {
                    String str = f;
                    utw0 utw0Var = ike1.a;
                    utw0Var.y(str);
                    utw0Var.o("Callback was already unregistered", new Object[0]);
                }
            } finally {
                this.c = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    public final Object c(mx mxVar) {
        n6n1 n6n1Var;
        ohd ohdVar = new ohd(1, aym.t(mxVar));
        ohdVar.t();
        boolean z = ohdVar.s() instanceof ago0;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (!z) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            if (this.c == null) {
                this.c = null;
                this.c = new n6n1(this, ohdVar);
                this.e = System.currentTimeMillis();
                if (x74.j(this.a, "android.permission.ACCESS_NETWORK_STATE") == 0 || (n6n1Var = this.c) == null) {
                    ohdVar.resumeWith((Object) null);
                } else {
                    this.d.registerDefaultNetworkCallback(n6n1Var);
                }
            } else {
                NetworkCapabilities networkCapabilities = this.b;
                if ((networkCapabilities != null ? d(networkCapabilities, ohdVar) : null) == null) {
                    this.c = null;
                    this.c = new n6n1(this, ohdVar);
                    this.e = System.currentTimeMillis();
                    if (x74.j(this.a, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        ohdVar.resumeWith((Object) null);
                    } else {
                        ohdVar.resumeWith((Object) null);
                    }
                }
            }
        }
        ohdVar.n(new gla0(this, (byte) 4));
        return ohdVar.r();
    }

    public final rih1 d(NetworkCapabilities networkCapabilities, ohd ohdVar) {
        boolean z = ohdVar.s() instanceof ago0;
        Boolean boolValueOf = Boolean.valueOf(z);
        String str = null;
        if (!z) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        if (networkCapabilities.hasTransport(2)) {
            str = "bluetooth";
        } else if (networkCapabilities.hasTransport(0)) {
            str = "cellular";
        } else if (networkCapabilities.hasTransport(3)) {
            str = "ethernet";
        } else if (networkCapabilities.hasTransport(6)) {
            str = "lowpan";
        } else if (networkCapabilities.hasTransport(8)) {
            str = "usb";
        } else if (networkCapabilities.hasTransport(4)) {
            str = "vpn";
        } else if (networkCapabilities.hasTransport(1)) {
            str = "wifi";
        } else if (networkCapabilities.hasTransport(5)) {
            str = "wifiAware";
        }
        b();
        ohdVar.resumeWith(str);
        return rih1.a;
    }
}
