package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s67 extends x7e0 {
    public final d0r d;
    public llm e;
    public t67 f;

    public s67(d0r d0rVar) {
        this.d = d0rVar;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        j0d1 j0d1VarB = guo1.B();
        bs50Var.getClass();
        this.e = smo1.e(flo1.l(bs50Var, j0d1VarB));
        this.f = new t67(z6x.a);
    }

    public final void e() {
        j();
        faa0 faa0VarA = this.e.a.A(fkj0.W0);
        faa0VarA.getClass();
        if (!faa0VarA.isActive()) {
            fns fnsVar = igu.a;
            bs50 bs50Var = pyf0.a.f;
            j0d1 j0d1VarB = guo1.B();
            bs50Var.getClass();
            this.e = smo1.e(flo1.l(bs50Var, j0d1VarB));
        }
        fn31.T(this.e, (o8n) null, 0, new k96((Object) this, (Object) w3p1.o(new l4r(jd0.c, 1, fz6.Y0, new j4r(fz6.a1), fz6.Z0), fz6.b1), (lnm) null, (byte) 9), 3);
    }

    public final void f() {
        smo1.p(this.e, (CancellationException) null);
    }
}
