package p;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n8o0 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ uo5 b;

    public n8o0(ssw0 ssw0Var, uo5 uo5Var) {
        this.a = ssw0Var;
        this.b = uo5Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.a.l(this.b.N(networkCapabilities));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.l(k8o0.a);
    }
}
