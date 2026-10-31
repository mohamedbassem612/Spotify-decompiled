package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iog1 {
    public final s29 a;
    public final String b;
    public final bbx c;
    public final jgg1 d;
    public final jog1 e;

    public iog1(s29 s29Var, String str, bbx bbxVar, jgg1 jgg1Var, jog1 jog1Var) {
        this.a = s29Var;
        this.b = str;
        this.c = bbxVar;
        this.d = jgg1Var;
        this.e = jog1Var;
    }

    public final void a(r09 r09Var, log1 log1Var) {
        zwg zwgVarA = a29.a();
        zwgVarA.J(this.a);
        zwgVarA.E(r09Var);
        zwgVarA.K(this.b);
        zwgVarA.I(this.d);
        zwgVarA.D(this.c);
        a29 a29VarG = zwgVarA.g();
        jog1 jog1Var = this.e;
        gns gnsVar = jog1Var.c;
        s29 s29VarB = a29VarG.e().b(a29VarG.c().c);
        em0 em0Var = new em0();
        em0Var.Q0(new HashMap());
        em0Var.T0(jog1Var.a.b());
        em0Var.V0(jog1Var.b.b());
        em0Var.U0(a29VarG.f());
        em0Var.S0(new rax(a29VarG.b(), a29VarG.d()));
        em0Var.R0(a29VarG.c().a);
        a29VarG.c().getClass();
        a29VarG.c().getClass();
        gnsVar.b.execute(new m2d(gnsVar, s29VarB, log1Var, em0Var.t(), (byte) 3));
    }

    public final void b(r09 r09Var) {
        a(r09Var, new t8e1((byte) 7));
    }
}
