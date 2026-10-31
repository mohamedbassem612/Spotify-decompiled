package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s7r0 {
    public final Function0 a;
    public final iac0 b;
    public final iac0 c;
    public final sck1 d;
    public final p1r0 e;
    public final n2r0 f;
    public final kvn0 g;
    public final q7r0 h;
    public final cbr0 i;
    public final r7r0 j;
    public final h0r0 k;
    public final idd1 l;

    public s7r0(mvn0 mvn0Var, mvn0 mvn0Var2, Function0 function0, iac0 iac0Var, iac0 iac0Var2, sck1 sck1Var, xu30 xu30Var, p1r0 p1r0Var, n2r0 n2r0Var, kvn0 kvn0Var) {
        h0r0 h0r0VarH;
        this.a = function0;
        this.b = iac0Var;
        this.c = iac0Var2;
        this.d = sck1Var;
        this.e = p1r0Var;
        this.f = n2r0Var;
        this.g = kvn0Var;
        q7r0 q7r0Var = new q7r0(this);
        this.h = q7r0Var;
        this.j = new r7r0(this);
        this.l = new idd1(new ft0(xu30Var, this, (byte) 17));
        if (mvn0Var2 != null) {
            fyv0 fyv0Var = (fyv0) mvn0Var2.invoke(q7r0Var);
            this.i = fyv0Var.a();
            h0r0VarH = fyv0Var.h();
            if (h0r0VarH.a() != fyv0Var.a()) {
                bhn0.f(h0r0VarH.getClass().getName().concat(" prepared a PagePropertySet before construction but exposes a different instance through Page.properties. Inject the prepared PagePropertySet instead of constructing a new one."));
                throw null;
            }
        } else {
            h0r0VarH = (h0r0) mvn0Var.invoke(q7r0Var);
        }
        this.k = h0r0VarH;
        p1r0Var.b(h0r0VarH.a());
        a().g(h0r0VarH.a());
    }

    public final c7r0 a() {
        return (c7r0) this.l.getValue();
    }

    public final h0r0 b() {
        h0r0 h0r0Var = this.k;
        if (h0r0Var != null) {
            return h0r0Var;
        }
        eg.m("can't access the Page instance while it's being constructed");
        return null;
    }
}
