package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jvn0 implements d8q0 {
    public final iac0 a;
    public final adh1 b;
    public final vn41 c;
    public th61 d;
    public final ArrayList e = new ArrayList();
    public final nt21 f;
    public final k5g g;

    public jvn0(iac0 iac0Var, qe41 qe41Var, adh1 adh1Var, vn41 vn41Var) {
        this.a = iac0Var;
        this.b = adh1Var;
        this.c = vn41Var;
        this.f = vn41Var.b(new ivn0(this, (byte) 0));
        k5g k5gVar = new k5g(this, (byte) 1);
        this.g = k5gVar;
        iac0Var.getLifecycle().a(k5gVar);
        qe41Var.getLifecycle().a(new i83(this, (byte) 14));
    }

    @Override // p.d8q0
    public final void a(th61 th61Var) {
        this.d = th61Var;
        c();
    }

    public final boolean b() {
        boolean zA = this.a.getLifecycle().b().a(w8c0.e);
        t3b1 t3b1Var = (t3b1) this.b;
        boolean zU = t3b1Var.e0().U();
        th61 th61Var = this.d;
        boolean z = false;
        boolean z2 = th61Var != null && th61Var.b;
        boolean z3 = this.c.a() != null;
        if (zA && !zU && z2 && z3) {
            z = true;
        }
        if (!z) {
            t3b1Var.e0().U();
        }
        return z;
    }

    public final void c() {
        if (b()) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((hvn0) it.next()).a();
            }
        }
    }
}
