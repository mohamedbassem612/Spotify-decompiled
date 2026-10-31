package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yag1 implements xpw {
    public static final Set e = f46.S0(new aq21[]{new yp21(mdz.class), new yp21(ddz.class)});
    public final y861 a;
    public final js20 b;
    public final ia00 c;
    public final psw d;

    public yag1(zob1 zob1Var, iac0 iac0Var, lep lepVar, s801 s801Var, lik1 lik1Var) {
        f9p f9pVar = (f9p) lepVar.a.c;
        qns0 qns0Var = (qns0) ((e7z) f9pVar.X).w.get();
        c8o.l(qns0Var);
        b7n b7nVar = (b7n) ((e7z) f9pVar.X).x.get();
        c8o.l(b7nVar);
        e7z e7zVar = (e7z) f9pVar.X;
        as00 as00Var = (as00) e7zVar.A.get();
        c8o.l(as00Var);
        luk lukVarB = e7zVar.b();
        c8o.l(lukVarB);
        y861 y861Var = new y861(zob1Var, iac0Var, qns0Var, b7nVar, as00Var, new i55(false, lukVarB).a(), f9pVar.b().c());
        this.a = y861Var;
        this.b = x3p1.m((xe01) y861Var.d, h5g1.Q0, ggf1.U0, (o8n) null, new d(this, s801Var, (byte) 24), 8);
        this.c = n3o1.q(this).a(new vm11(lik1Var, (byte) 1), vrf1.V0);
        j2i j2iVar = ynj.c;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
