package p;

import com.spotify.coremediarenderer.bridge.CmrBridge;
import com.spotify.coremediarenderer.bridge.CmrVideoQualityCallback;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class otg {
    public final CmrBridge a;
    public CmrVideoQualityCallback b;
    public final bpb1 c;
    public final xe01 d;

    public otg(CmrBridge cmrBridge) {
        this.a = cmrBridge;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.c = bpb1VarB;
        this.d = d5p1.h(bpb1VarB);
    }

    public final void a(tsg tsgVar) {
        synchronized (this.a) {
            try {
                CmrVideoQualityCallback cmrVideoQualityCallback = this.b;
                if (cmrVideoQualityCallback != null) {
                    smo1.p(cmrVideoQualityCallback.c, (CancellationException) null);
                }
                this.b = null;
                this.c.l((Object) null);
                if (this.a.getNThis() == 0) {
                    return;
                }
                CmrVideoQualityCallback cmrVideoQualityCallback2 = tsgVar != null ? new CmrVideoQualityCallback(this, tsgVar) : null;
                this.b = cmrVideoQualityCallback2;
                this.a.g(cmrVideoQualityCallback2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
