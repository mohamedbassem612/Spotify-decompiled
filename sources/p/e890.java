package p;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e890 implements h0h1, i0h1 {
    public a8b0 a;
    public final LinkedHashSet b;
    public final int c;

    public e890(AbstractCollection abstractCollection) {
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    public final qx81 a() {
        e0h1.b.getClass();
        return y3o1.k0(e0h1.c, this, z6x.a, false, ryn1.q("member scope for intersection type", this.b), new p5(this, (byte) 24));
    }

    public final String b(iu30 iu30Var) {
        return o7h.y0(o7h.a1(this.b, new xvd(iu30Var, (byte) 17)), " & ", "{", "}", new qv40(iu30Var, (byte) 1), 24);
    }

    public final Collection d() {
        return this.b;
    }

    public final g6b0 e() {
        return ((a8b0) this.b.iterator().next()).t0().e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e890)) {
            return false;
        }
        return this.b.equals(((e890) obj).b);
    }

    public final List getParameters() {
        return z6x.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final jfg s() {
        return null;
    }

    public final boolean t() {
        return false;
    }

    public final String toString() {
        return b(aht.P0);
    }
}
