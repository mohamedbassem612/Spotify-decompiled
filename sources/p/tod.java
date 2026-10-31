package p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tod implements sod {
    public final e1h1 a;
    public x8o0 b;

    public tod(e1h1 e1h1Var) {
        this.a = e1h1Var;
        e1h1Var.a();
    }

    public final Collection d() {
        e1h1 e1h1Var = this.a;
        a8b0 a8b0VarB = e1h1Var.a() == 3 ? e1h1Var.b() : e().p();
        a8b0VarB.getClass();
        return Collections.singletonList(a8b0VarB);
    }

    public final g6b0 e() {
        return this.a.b().t0().e();
    }

    public final List getParameters() {
        return z6x.a;
    }

    @Override // p.sod
    public final e1h1 l() {
        return this.a;
    }

    public final jfg s() {
        return null;
    }

    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }
}
