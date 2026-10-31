package p;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wv4 implements NsdManager.DiscoveryListener {
    public final /* synthetic */ ssw0 a;

    public wv4(ssw0 ssw0Var) {
        this.a = ssw0Var;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
        this.a.l(lcu.a);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
        this.a.l(lcu.b);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        this.a.l(new icu(nsdServiceInfo));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getServiceName();
        this.a.l(new jcu(nsdServiceInfo));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        this.a.l(new kcu(i));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        this.a.l(new mcu(i));
    }
}
