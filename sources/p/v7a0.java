package p;

import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v7a0 {
    public final bvl1 a;
    public final Collection b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public v7a0(bvl1 bvl1Var, Collection collection, int i) {
        this(bvl1Var, collection, bvl1Var.a == iep0.c, (i & 8) == 0, (i & 16) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7a0)) {
            return false;
        }
        v7a0 v7a0Var = (v7a0) obj;
        return u890.j(this.a, v7a0Var.a) && u890.j(this.b, v7a0Var.b) && this.c == v7a0Var.c && this.d == v7a0Var.d && this.e == v7a0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.d);
        sb.append(", preferQualifierOverSupertype=");
        return f4i1.g(sb, this.e, ')');
    }

    public v7a0(bvl1 bvl1Var, Collection collection, boolean z, boolean z2, boolean z3) {
        this.a = bvl1Var;
        this.b = collection;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
