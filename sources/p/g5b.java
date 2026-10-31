package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g5b implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lzn0 b;

    public /* synthetic */ g5b(lzn0 lzn0Var, byte b) {
        this.a = b;
        this.b = lzn0Var;
    }

    public final void run() {
        byte b = this.a;
        lzn0 lzn0Var = this.b;
        switch (b) {
            case 0:
                lzn0Var.g(pzm.g("pending_invitation", true), nik1.k3.a);
                break;
            case 1:
                lzn0Var.g(pzm.g("link_expired", true), nik1.k3.a);
                break;
            case 2:
                lzn0Var.e();
                break;
            case 3:
                lzn0Var.d(blc0.W9);
                break;
            case 4:
                lzn0Var.f(new dwn0(nik1.z0.a, "", false, false, 0, 0, true, (a690) null, (Bundle) null, (cwn0) null));
                break;
            case 5:
                lzn0Var.f(new dwn0(nik1.Z0.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                break;
            default:
                lzn0Var.e();
                break;
        }
    }
}
