package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class k7b0 extends j7b0 implements gma0 {
    public final znb0 b = dm5.S(2, new x5u(this, (byte) 26));

    public final boolean equals(Object obj) {
        return (obj instanceof k7b0) && u890.j(t(), ((k7b0) obj).t());
    }

    public final List f() {
        return t().f();
    }

    public final rzc getCaller() {
        return (rzc) this.b.getValue();
    }

    public final String getName() {
        return gvg.k(new StringBuilder("<get-"), t().e.b, '>');
    }

    public final List getParameters() {
        return t().getParameters();
    }

    public final oma0 getReturnType() {
        return t().getReturnType();
    }

    public final int hashCode() {
        return t().hashCode();
    }

    @Override // p.j7b0
    public final x3b0 s() {
        return t().e.c;
    }

    public final String toString() {
        return "getter of " + t();
    }
}
