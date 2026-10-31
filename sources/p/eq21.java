package p;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eq21 extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ at7 c;

    public eq21(at7 at7Var) {
        this.c = at7Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        at7.a(this.c).post(new dq21(this, (byte) 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        at7.a(this.c).post(new dq21(this, (byte) 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.a;
        at7 at7Var = this.c;
        if (z && this.b == zHasCapability) {
            if (zHasCapability) {
                at7.a(at7Var).post(new dq21(this, (byte) 1));
            }
        } else {
            this.a = true;
            this.b = zHasCapability;
            at7.a(at7Var).post(new dq21(this, (byte) 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        at7.a(this.c).post(new dq21(this, (byte) 0));
    }
}
