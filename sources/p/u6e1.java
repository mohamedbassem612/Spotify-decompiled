package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u6e1 implements b4e1 {
    public final /* synthetic */ x6e1 a;
    public final /* synthetic */ boolean b;

    public u6e1(x6e1 x6e1Var, boolean z) {
        this.a = x6e1Var;
        this.b = z;
    }

    @Override // p.b4e1
    public final void a() {
        x6e1 x6e1Var = this.a;
        x6e1Var.q(null);
        x6e1Var.p(null);
        x6e1Var.u(true);
    }

    @Override // p.b4e1
    public final void c() {
        z9e1 z9e1VarD;
        boolean z = this.b;
        qr50 qr50Var = z ? qr50.b : qr50.c;
        x6e1 x6e1Var = this.a;
        x6e1Var.q(qr50Var);
        long jA = px51.a(x6e1Var.j(z));
        r1c0 r1c0Var = x6e1Var.d;
        if (r1c0Var == null || (z9e1VarD = r1c0Var.d()) == null) {
            return;
        }
        long jE = z9e1VarD.e(jA);
        x6e1Var.n = jE;
        x6e1Var.p(new Offset(jE));
        x6e1Var.f167p = 0L;
        x6e1Var.s = -1;
        r1c0 r1c0Var2 = x6e1Var.d;
        if (r1c0Var2 != null) {
            r1c0Var2.q.setValue(Boolean.TRUE);
        }
        x6e1Var.u(false);
    }

    @Override // p.b4e1
    public final void d() {
        x6e1 x6e1Var = this.a;
        x6e1Var.q(null);
        x6e1Var.p(null);
        x6e1Var.u(true);
    }

    @Override // p.b4e1
    public final void e(long j) {
        x6e1 x6e1Var = this.a;
        long jG = Offset.g(x6e1Var.f167p, j);
        x6e1Var.f167p = jG;
        x6e1Var.p(new Offset(Offset.g(x6e1Var.n, jG)));
        c8e1 c8e1VarL = x6e1Var.l();
        Offset offsetG = x6e1Var.g();
        offsetG.getClass();
        x6e1Var.v(c8e1VarL, offsetG.a, false, this.b, w1x0.O0, true, new vs50(9));
        x6e1Var.u(false);
    }

    @Override // p.b4e1
    public final void onCancel() {
    }

    @Override // p.b4e1
    public final void b(long j, f341 f341Var) {
    }
}
