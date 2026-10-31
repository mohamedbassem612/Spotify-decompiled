package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t6e1 implements b4e1 {
    public final /* synthetic */ x6e1 a;

    public t6e1(x6e1 x6e1Var) {
        this.a = x6e1Var;
    }

    @Override // p.b4e1
    public final void a() {
        x6e1 x6e1Var = this.a;
        x6e1Var.q(null);
        x6e1Var.p(null);
    }

    @Override // p.b4e1
    public final void b(long j, f341 f341Var) {
        z9e1 z9e1VarD;
        x6e1 x6e1Var = this.a;
        long jA = px51.a(x6e1Var.j(true));
        r1c0 r1c0Var = x6e1Var.d;
        if (r1c0Var == null || (z9e1VarD = r1c0Var.d()) == null) {
            return;
        }
        long jE = z9e1VarD.e(jA);
        x6e1Var.n = jE;
        x6e1Var.p(new Offset(jE));
        x6e1Var.f167p = 0L;
        x6e1Var.q(qr50.a);
        x6e1Var.u(false);
    }

    @Override // p.b4e1
    public final void d() {
        x6e1 x6e1Var = this.a;
        x6e1Var.q(null);
        x6e1Var.p(null);
    }

    @Override // p.b4e1
    public final void e(long j) {
        z9e1 z9e1VarD;
        sct0 sct0Var;
        x6e1 x6e1Var = this.a;
        x6e1Var.f167p = Offset.g(x6e1Var.f167p, j);
        r1c0 r1c0Var = x6e1Var.d;
        if (r1c0Var == null || (z9e1VarD = r1c0Var.d()) == null) {
            return;
        }
        x6e1Var.p(new Offset(Offset.g(x6e1Var.n, x6e1Var.f167p)));
        hyp0 hyp0Var = x6e1Var.b;
        Offset offsetG = x6e1Var.g();
        offsetG.getClass();
        int i = hyp0Var.i(z9e1VarD.b(offsetG.a, true));
        long jE = e6p1.e(i, i);
        if (nbe1.c(jE, x6e1Var.l().b)) {
            return;
        }
        r1c0 r1c0Var2 = x6e1Var.d;
        if ((r1c0Var2 == null || ((Boolean) r1c0Var2.q.getValue()).booleanValue()) && (sct0Var = x6e1Var.j) != null) {
            sct0Var.a(9);
        }
        x6e1Var.c.invoke(x6e1.b(x6e1Var.l().a, jE));
        x6e1Var.v = new nbe1(jE);
    }

    @Override // p.b4e1
    public final void c() {
    }

    @Override // p.b4e1
    public final void onCancel() {
    }
}
