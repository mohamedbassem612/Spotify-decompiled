package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bon0 implements c7r0, gq80 {
    public final b7r0 a;
    public final xnn0 b;
    public war0 c;
    public bn70 d;
    public vir0 e;
    public boolean f;
    public final qpj0 g = new qpj0(this, (byte) 3);

    public bon0(b7r0 b7r0Var, xnn0 xnn0Var) {
        this.a = b7r0Var;
        this.b = xnn0Var;
    }

    public final void a(upn1 upn1Var) {
        if (upn1Var instanceof m7r0) {
            if (this.f) {
                return;
            }
            this.f = true;
            war0 war0Var = this.c;
            this.d = war0Var != null ? (bn70) war0Var.a() : null;
            c();
            return;
        }
        if ((upn1Var instanceof n7r0) && this.f) {
            this.f = false;
            bn70 bn70Var = this.d;
            this.b.a(new y9r0(bn70Var != null ? bn70Var.b : null));
        }
    }

    public final void c() {
        bn70 bn70Var = this.d;
        lik1 lik1Var = bn70Var != null ? bn70Var.b : null;
        n6r0 n6r0Var = bn70Var != null ? bn70Var.a : null;
        y6r0 y6r0Var = this.a.get();
        car0 x9r0Var = new x9r0(lik1Var, n6r0Var, (mir0) null, y6r0Var != null ? y6r0Var.a : null, 4);
        xnn0 xnn0Var = this.b;
        xnn0Var.a(x9r0Var);
        bn70 bn70Var2 = this.d;
        if (bn70Var2 != null) {
            xnn0Var.a(new bar0(bn70Var2.c));
        }
        vir0 vir0Var = this.e;
        if (vir0Var != null) {
            xnn0Var.a(new z9r0(vir0Var));
        }
    }

    public final Bundle d() {
        return null;
    }

    public final void dispose() {
        if (this.f) {
            this.f = false;
            bn70 bn70Var = this.d;
            this.b.a(new y9r0(bn70Var != null ? bn70Var.b : null));
        }
        war0 war0Var = this.c;
        if (war0Var != null) {
            war0Var.c(this.g);
        }
        this.c = null;
    }

    public final void e(vir0 vir0Var) {
        if (u890.j(this.e, vir0Var)) {
            return;
        }
        this.e = vir0Var;
        if (this.f) {
            this.b.a(new z9r0(vir0Var));
        }
    }

    public final void g(bbr0 bbr0Var) {
        war0 war0Var = this.c;
        qpj0 qpj0Var = this.g;
        if (war0Var != null) {
            war0Var.c(qpj0Var);
        }
        war0 war0VarB0 = bbr0Var.b0(bn70.class);
        this.c = war0VarB0;
        war0VarB0.d(qpj0Var);
    }

    @Override // p.gq80
    public final void j() {
        if (this.f) {
            c();
        }
    }

    public final void b(Bundle bundle) {
    }
}
