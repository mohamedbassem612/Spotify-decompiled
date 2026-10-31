package p;

import android.content.Intent;
import com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class fxp0 {
    public final /* synthetic */ gxp0 a;

    public final void a(orp0 orp0Var) {
        int iOrdinal = orp0Var.ordinal();
        gxp0 gxp0Var = this.a;
        if (iOrdinal != 5) {
            if (iOrdinal == 7 && ((s5w0) gxp0Var).F1 != null) {
                Intent intent = new Intent(gxp0Var.h0(), (Class<?>) OfflineDeviceLimitReachedActivity.class);
                intent.addFlags(1073741824);
                intent.addFlags(65536);
                gxp0Var.M1.add(intent);
                ((s5w0) gxp0Var).F1.Z0(gxp0Var);
                return;
            }
            return;
        }
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963270});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", 2131963270, gxp0Var.N0().getString(2131959365), (Integer) null, new kpt(gxp0Var, (byte) 4), (cvr) null, (xq91) null, false);
        boolean zG = gxp0Var.J1.g();
        kt91 kt91Var = gxp0Var.J1;
        if (zG) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }
}
