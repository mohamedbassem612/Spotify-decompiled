package p;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class swa0 {
    public final f3b a;
    public final bza0 b;
    public final nwa c;
    public twa0 d;

    public swa0(qe41 qe41Var, f3b f3bVar, bza0 bza0Var, nwa nwaVar) {
        this.a = f3bVar;
        this.b = bza0Var;
        this.c = nwaVar;
        qe41Var.p().e("kid_creation_account_state");
        qe41Var.p().c("kid_creation_account_state", new uk(this, (byte) 8));
        qe41Var.getLifecycle().a(new vk(this, qe41Var, (byte) 1));
        Parcelable.Creator<twa0> creator = twa0.CREATOR;
        rzn1.t();
        this.d = twa0.N0;
    }

    public static boolean e(twa0 twa0Var) {
        return twa0Var.h && twa0Var.g;
    }

    public final void a(tv80 tv80Var) {
        lik1 lik1Var;
        lik1 lik1Var2;
        boolean zE = e(this.d);
        twa0 twa0Var = this.d;
        f3b f3bVar = this.a;
        txa0 txa0Var = txa0.a;
        if (zE) {
            yxa0 yxa0Var = twa0Var.Y;
            if (u890.j(yxa0Var, txa0Var)) {
                lik1Var2 = nik1.y3;
            } else {
                if (!(yxa0Var instanceof uxa0)) {
                    if (yxa0Var instanceof xxa0) {
                        eg.m("ParentalConsent flows should use AccountCreationFlowManager");
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                lik1Var2 = nik1.J3;
            }
            Bundle bundle = new Bundle();
            bundle.putString("name", this.d.b);
            bundle.putParcelable("pages", d(lik1Var2));
            bundle.putParcelable("flow_type", this.d.Y);
            f3bVar.c(lik1Var2.a, tv80Var, bundle);
            return;
        }
        yxa0 yxa0Var2 = twa0Var.Y;
        if (u890.j(yxa0Var2, txa0Var)) {
            lik1Var = nik1.t3;
        } else {
            if (!(yxa0Var2 instanceof uxa0)) {
                if (yxa0Var2 instanceof xxa0) {
                    eg.m("ParentalConsent flows should use AccountCreationFlowManager");
                    return;
                } else {
                    eg.o();
                    return;
                }
            }
            lik1Var = nik1.K3;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("pin", this.d.a);
        bundle2.putParcelable("pages", d(lik1Var));
        bundle2.putParcelable("key_flow_type", this.d.Y);
        f3bVar.c(lik1Var.a, tv80Var, bundle2);
    }

    public final String b() {
        yxa0 yxa0Var = this.d.Y;
        if (u890.j(yxa0Var, txa0.a)) {
            return nik1.z3.a;
        }
        if (yxa0Var instanceof uxa0) {
            return nik1.M3.a;
        }
        if (yxa0Var instanceof xxa0) {
            eg.m("ParentalConsent flows should use AccountCreationFlowManager");
            return null;
        }
        eg.o();
        return null;
    }

    public final int c() {
        return e(this.d) ? 4 : 5;
    }

    public final okr0 d(lik1 lik1Var) {
        if (lik1Var.equals(nik1.t3) || lik1Var.equals(nik1.K3)) {
            twa0 twa0Var = this.d;
            if (!twa0Var.h || !twa0Var.g) {
                return new okr0(1, c());
            }
            hhg1.n("The page shouldn't be reachable");
            return null;
        }
        if (lik1Var.equals(nik1.y3) || lik1Var.equals(nik1.J3)) {
            return new okr0(e(this.d) ? 1 : 2, c());
        }
        if (lik1Var.equals(nik1.u3)) {
            return new okr0(e(this.d) ? 2 : 3, c());
        }
        if (lik1Var.equals(nik1.z3)) {
            return new okr0(e(this.d) ? 3 : 4, c());
        }
        if (lik1Var.equals(nik1.A3) || lik1Var.equals(nik1.N3)) {
            return new okr0(e(this.d) ? 4 : 5, c());
        }
        return new okr0(0, 0);
    }
}
