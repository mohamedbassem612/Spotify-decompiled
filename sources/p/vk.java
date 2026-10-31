package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vk implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vk(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public final void onCreate(iac0 iac0Var) {
        twa0 twa0Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((xk) obj).i((qe41) obj2);
                break;
            case 1:
                swa0 swa0Var = (swa0) obj;
                twa0 twa0Var2 = swa0Var.d;
                twa0 twa0Var3 = twa0.N0;
                if (u890.j(twa0Var2, twa0Var3)) {
                    Bundle bundleA = ((qe41) obj2).p().a("kid_creation_account_state");
                    if (bundleA != null && (twa0Var = (twa0) bundleA.getParcelable("kid_creation_account_model")) != null) {
                        twa0Var3 = twa0Var;
                    }
                    swa0Var.d = twa0Var3;
                }
                break;
            default:
                t0n0 t0n0Var = (t0n0) obj2;
                oe41 oe41Var = (oe41) obj;
                Bundle bundleA2 = oe41Var.a("MusicAppNavigationBarActiveItemProvider");
                if (bundleA2 != null) {
                    t0n0Var.b = (lik1) jhc1.t(bundleA2, "lastItemUri", lik1.class);
                    t0n0Var.c = (lik1) jhc1.t(bundleA2, "lastItemWithoutClosableTargetUri", lik1.class);
                }
                oe41Var.c("MusicAppNavigationBarActiveItemProvider", new uk(t0n0Var, (byte) 11));
                break;
        }
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((qe41) obj).getLifecycle().d(this);
                break;
            case 1:
                ((qe41) obj).getLifecycle().d(this);
                break;
            default:
                ((oe41) this.c).e("MusicAppNavigationBarActiveItemProvider");
                break;
        }
    }
}
