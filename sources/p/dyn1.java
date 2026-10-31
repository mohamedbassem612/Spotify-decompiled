package p;

import com.google.android.gms.internal.wearable.zzfh;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class dyn1 extends nrn1 {
    public final vyn1 a;
    public vyn1 b;

    public dyn1(vyn1 vyn1Var) {
        this.a = vyn1Var;
        if (vyn1Var.c()) {
            hhg1.n("Default instance must be immutable.");
            throw null;
        }
        this.b = vyn1Var.e();
    }

    public final Object clone() {
        dyn1 dyn1Var = (dyn1) this.a.b(5, null);
        boolean zC = this.b.c();
        vyn1 vyn1Var = this.b;
        if (zC) {
            vyn1Var.f();
            vyn1Var = this.b;
        }
        dyn1Var.b = vyn1Var;
        return dyn1Var;
    }

    public final void d() {
        if (this.b.c()) {
            return;
        }
        vyn1 vyn1VarE = this.a.e();
        w5o1.c.b(vyn1VarE.getClass()).a(vyn1VarE, this.b);
        this.b = vyn1VarE;
    }

    public final vyn1 e() {
        boolean zC = this.b.c();
        vyn1 vyn1Var = this.b;
        if (zC) {
            vyn1Var.f();
            vyn1Var = this.b;
        }
        vyn1Var.getClass();
        if (vyn1.m(vyn1Var, true)) {
            return vyn1Var;
        }
        throw new zzfh();
    }
}
