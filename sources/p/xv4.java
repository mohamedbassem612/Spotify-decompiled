package p;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xv4 implements NsdManager.ResolveListener {
    public final /* synthetic */ ohd a;

    public xv4(ohd ohdVar) {
        this.a = ohdVar;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        this.a.resumeWith(new cap0(i));
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        this.a.resumeWith(new eap0(nsdServiceInfo));
    }
}
