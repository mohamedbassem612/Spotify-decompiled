package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lqs0 extends aa implements u380, p280 {
    public static final lqs0 d;
    public final Object a;
    public final Object b;
    public final dps0 c;

    static {
        wdu0 wdu0Var = wdu0.P0;
        dps0 dps0Var = dps0.d;
        hso1.y();
        d = new lqs0(wdu0Var, wdu0Var, dps0.d);
    }

    public lqs0(Object obj, Object obj2, dps0 dps0Var) {
        this.a = obj;
        this.b = obj2;
        this.c = dps0Var;
    }

    @Override // p.k6
    public final int b() {
        return this.c.c();
    }

    @Override // p.k6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // p.aa, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        dps0 dps0Var = this.c;
        Set set = (Set) obj;
        if (dps0Var.c() != set.size()) {
            return false;
        }
        if (set instanceof lqs0) {
            return dps0Var.b.g(((lqs0) obj).c.b, cps0.P0);
        }
        return set instanceof nqs0 ? dps0Var.b.g(((nqs0) obj).d().g(), cps0.Q0) : super.equals(obj);
    }

    @Override // p.aa, java.util.Collection, java.util.Set
    public final int hashCode() {
        return pto1.z(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new pqs0(this.a, this.c);
    }
}
