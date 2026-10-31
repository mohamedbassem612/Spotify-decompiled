package p;

import com.spotify.coremediarenderer.bridge.CmrBridge;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class usg implements AutoCloseable {
    public final AtomicBoolean a = new AtomicBoolean();
    public final /* synthetic */ CmrBridge b;
    public final /* synthetic */ tsg c;
    public final /* synthetic */ wtg d;

    public usg(CmrBridge cmrBridge, tsg tsgVar, wtg wtgVar) {
        this.b = cmrBridge;
        this.c = tsgVar;
        this.d = wtgVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.a.compareAndSet(false, true)) {
            CmrBridge cmrBridge = this.b;
            cmrBridge.d(null);
            cmrBridge.a.a(null);
            this.c.close();
            this.d.close();
        }
    }
}
