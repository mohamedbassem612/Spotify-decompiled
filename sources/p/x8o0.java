package p;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x8o0 implements sod {
    public final e1h1 a;
    public Function0 b;
    public final x8o0 c;
    public final y0h1 d;
    public final znb0 e;

    public x8o0(e1h1 e1h1Var, Function0 function0, x8o0 x8o0Var, y0h1 y0h1Var) {
        this.a = e1h1Var;
        this.b = function0;
        this.c = x8o0Var;
        this.d = y0h1Var;
        this.e = dm5.S(2, new jqb0((Object) this, (byte) 7));
    }

    public final Collection d() {
        z6x z6xVar = (List) this.e.getValue();
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        return (Collection) z6xVar;
    }

    public final g6b0 e() {
        return rzn1.s(this.a.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x8o0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        x8o0 x8o0Var = (x8o0) obj;
        x8o0 x8o0Var2 = this.c;
        if (x8o0Var2 != null) {
            this = x8o0Var2;
        }
        x8o0 x8o0Var3 = x8o0Var.c;
        if (x8o0Var3 != null) {
            obj = x8o0Var3;
        }
        return this == obj;
    }

    public final List getParameters() {
        return z6x.a;
    }

    public final int hashCode() {
        x8o0 x8o0Var = this.c;
        return x8o0Var != null ? x8o0Var.hashCode() : super.hashCode();
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
        return "CapturedType(" + this.a + ')';
    }

    public /* synthetic */ x8o0(e1h1 e1h1Var, rht rhtVar, y0h1 y0h1Var, int i) {
        this(e1h1Var, (i & 2) != 0 ? null : rhtVar, (x8o0) null, (i & 8) != 0 ? null : y0h1Var);
    }
}
