package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wcz0 implements Action {
    public final /* synthetic */ tig0 a;
    public final /* synthetic */ kdy0 b;
    public final /* synthetic */ adz0 c;
    public final /* synthetic */ ou80 d;
    public final /* synthetic */ boolean e;

    public wcz0(tig0 tig0Var, kdy0 kdy0Var, adz0 adz0Var, ou80 ou80Var, boolean z) {
        this.a = tig0Var;
        this.b = kdy0Var;
        this.c = adz0Var;
        this.d = ou80Var;
        this.e = z;
    }

    public final void run() {
        jx20 jx20Var;
        esg1 esg1Var;
        a1r0 a1r0Var = (a1r0) this.b.b;
        rig0 rig0Var = this.a;
        boolean z = rig0Var instanceof rig0;
        ou80 ou80Var = this.d;
        adz0 adz0Var = this.c;
        if (z) {
            int i = rig0Var.a;
            if (adz0Var instanceof ycz0) {
                esg1Var = esg1.d;
            } else if (adz0Var instanceof xpf1) {
                esg1Var = csg1.d;
            } else {
                if (!(adz0Var instanceof zcz0) && !(adz0Var instanceof ypf1)) {
                    eg.o();
                    return;
                }
                esg1Var = bsg1.d;
            }
            a1r0.j(a1r0Var, esg1Var.b(i), ou80Var != null ? ou80Var.a : null, (Bundle) null, true, 4);
            return;
        }
        if (this.e) {
            if (adz0Var instanceof ycz0) {
                jx20Var = jx20.d;
            } else if (adz0Var instanceof xpf1) {
                jx20Var = hx20.d;
            } else {
                if (!(adz0Var instanceof zcz0) && !(adz0Var instanceof ypf1)) {
                    eg.o();
                    return;
                }
                jx20Var = lx20.d;
            }
            a1r0.j(a1r0Var, jx20Var.g(), ou80Var != null ? ou80Var.a : null, (Bundle) null, true, 4);
            return;
        }
        if (adz0Var instanceof ycz0) {
            a1r0.j(a1r0Var, nik1.Q5.a, ou80Var != null ? ou80Var.a : null, (Bundle) null, true, 4);
            return;
        }
        if (adz0Var instanceof ypf1) {
            a1r0.j(a1r0Var, nik1.y6.a, ou80Var != null ? ou80Var.a : null, (Bundle) null, true, 4);
            return;
        }
        boolean z2 = adz0Var instanceof zcz0;
        if (!z2 && !adz0Var.equals(xpf1.a)) {
            eg.o();
            return;
        }
        String str = nik1.A6.a;
        String str2 = ou80Var != null ? ou80Var.a : null;
        String str3 = "reorder_restricted";
        if (!(adz0Var instanceof xpf1) && z2) {
            str3 = "songs_in_random_order";
        }
        a1r0Var.n(str, str2, cy30.g("upsellReasonKey", str3), true);
    }
}
