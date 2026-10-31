package p;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w3o1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ j4o1 a;

    public w3o1(j4o1 j4o1Var) {
        this.a = j4o1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.b(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        j4o1 j4o1Var = this.a;
        synchronized (j4o1Var.h) {
            try {
                j4o1.l.a("the network is lost", new Object[0]);
                if (j4o1Var.e.remove(network)) {
                    j4o1Var.d.remove(network);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j4o1Var.c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        j4o1 j4o1Var = this.a;
        synchronized (j4o1Var.h) {
            j4o1.l.a("all networks are unavailable.", new Object[0]);
            j4o1Var.d.clear();
            j4o1Var.e.clear();
        }
        j4o1Var.c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
