package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class n7b0 extends j7b0 implements tla0 {
    public final znb0 b = dm5.S(2, new l7b0(this, 0));
    public final znb0 c = dm5.S(2, new l7b0(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof n7b0) && u890.j(t(), ((n7b0) obj).t());
    }

    public final List f() {
        return o7h.O0(this.b.getValue(), t().f());
    }

    public final rzc getCaller() {
        return (rzc) this.c.getValue();
    }

    public final String getName() {
        return gvg.k(new StringBuilder("<set-"), t().e.b, '>');
    }

    public final List getParameters() {
        return o7h.O0(this.b.getValue(), t().getParameters());
    }

    public final oma0 getReturnType() {
        return pfb1.e;
    }

    public final int hashCode() {
        return t().hashCode();
    }

    public final String toString() {
        return "setter of " + t();
    }
}
