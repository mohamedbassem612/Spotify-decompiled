package p;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ohr0 implements ihr0 {
    public final pf30 X;
    public final nhr0 Y;
    public final j4m Z;
    public final phi0 a;
    public final dcr0 b;
    public final wao0 c;
    public final jhl d;
    public final air0 e;
    public final mr20 f;
    public final ve01 g;
    public final AtomicInteger h = new AtomicInteger();
    public final llm i;
    public final pf30 t;

    public ohr0(phi0 phi0Var, dcr0 dcr0Var, wao0 wao0Var, jhl jhlVar, air0 air0Var, mr20 mr20Var, ve01 ve01Var, Bundle bundle) {
        this.a = phi0Var;
        this.b = dcr0Var;
        this.c = wao0Var;
        this.d = jhlVar;
        this.e = air0Var;
        this.f = mr20Var;
        this.g = ve01Var;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        this.i = smo1.e(ha71.A(j0d1VarB, pyf0.a.f));
        xy50 xy50Var = new xy50(this, (byte) 24);
        this.t = a(new cj8(xy50Var, (byte) 9), new e1r0((byte) 5));
        wvq0 wvq0Var = new wvq0(this, (byte) 10);
        this.X = a(new cj8(wvq0Var, (byte) 8), new e1r0((byte) 3));
        nhr0 nhr0Var = new nhr0(this);
        this.Y = nhr0Var;
        this.Z = dcr0Var.i.g(nhr0Var, bundle);
    }

    public final pf30 a(bh0 bh0Var, o1p1 o1p1Var) {
        jhl jhlVar = this.d;
        if (jhlVar.c.i.a(w8c0.c)) {
            eg.m("Check failed.");
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        atomicReference.set(((Activity) this.a.j().invoke()).m().g("page_" + this.b.h + "_rq#" + this.h.getAndIncrement(), jhlVar, o1p1Var, bh0Var));
        return new pf30(atomicReference, (byte) 1);
    }

    @Override // p.ihr0
    public final boolean b(ehr0 ehr0Var) {
        f4h1 f4h1VarC = this.Z.c();
        ihr0 ihr0Var = f4h1VarC instanceof ihr0 ? (ihr0) f4h1VarC : null;
        if (ihr0Var != null) {
            return ihr0Var.b(ehr0Var);
        }
        return false;
    }
}
