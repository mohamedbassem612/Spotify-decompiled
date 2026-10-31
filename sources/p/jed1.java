package p;

import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jed1 implements lnm {
    public final /* synthetic */ ifl1 a;
    public final /* synthetic */ tqt b;

    public jed1(tqt tqtVar, ifl1 ifl1Var) {
        this.b = tqtVar;
        this.a = ifl1Var;
    }

    public final o8n getContext() {
        return o6x.a;
    }

    public final void resumeWith(Object obj) {
        ifl1 ifl1Var = this.a;
        try {
            if (obj != null) {
                AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                boolean zIsLimitAdTrackingEnabled = info.isLimitAdTrackingEnabled();
                String id = !zIsLimitAdTrackingEnabled ? info.getId() : null;
                tqt tqtVar = this.b;
                tqtVar.b = zIsLimitAdTrackingEnabled ? 1 : 0;
                tqtVar.c = id;
            }
        } catch (Exception e) {
            i1k0.n("Error in continuation: " + e);
        } finally {
            ifl1Var.m();
        }
    }
}
