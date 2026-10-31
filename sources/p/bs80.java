package p;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bs80 implements h0h1 {
    public final Set a;
    public final idd1 b;

    public bs80(Set set) {
        e0h1.b.getClass();
        e0h1 e0h1Var = e0h1.c;
        y3o1.j0(z6x.a, bkz.a(2, true, "unknown integer literal type"), e0h1Var, this, false);
        this.b = new idd1(new b69(this, (byte) 12));
        this.a = set;
    }

    public final Collection d() {
        return (List) this.b.getValue();
    }

    public final g6b0 e() {
        throw null;
    }

    public final List getParameters() {
        return z6x.a;
    }

    public final jfg s() {
        return null;
    }

    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + o7h.y0(this.a, ",", (String) null, (String) null, aht.O0, 30) + ']');
    }
}
