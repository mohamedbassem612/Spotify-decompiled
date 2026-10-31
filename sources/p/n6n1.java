package p;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n6n1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ t6n1 a;
    public final /* synthetic */ ohd b;

    public n6n1(t6n1 t6n1Var, ohd ohdVar) {
        this.a = t6n1Var;
        this.b = ohdVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        System.currentTimeMillis();
        t6n1 t6n1Var = this.a;
        long j = t6n1Var.e;
        t6n1Var.b = networkCapabilities;
        t6n1Var.d(networkCapabilities, this.b);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.b();
        super.onLost(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.a.b();
        ohd ohdVar = this.b;
        boolean z = ohdVar.s() instanceof ago0;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (!z) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            ohdVar.resumeWith((Object) null);
        }
        super.onUnavailable();
    }
}
