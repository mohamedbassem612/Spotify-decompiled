package p;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ked1 implements lnm {
    public final /* synthetic */ ifl1 a;
    public final /* synthetic */ tqt b;

    public ked1(tqt tqtVar, ifl1 ifl1Var) {
        this.b = tqtVar;
        this.a = ifl1Var;
    }

    @Override // p.lnm
    public final o8n getContext() {
        return o6x.a;
    }

    @Override // p.lnm
    public final void resumeWith(Object obj) {
        tqt tqtVar = this.b;
        ifl1 ifl1Var = this.a;
        try {
            if (obj != null) {
                AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                boolean zIsLimitAdTrackingEnabled = info.isLimitAdTrackingEnabled();
                String id = !zIsLimitAdTrackingEnabled ? info.getId() : null;
                tqtVar.F(zIsLimitAdTrackingEnabled ? 1 : 0);
                tqtVar.E(id);
            }
        } catch (Exception e) {
            i1k0.n("Error in continuation: " + e);
        } finally {
            ifl1Var.m();
        }
    }
}
