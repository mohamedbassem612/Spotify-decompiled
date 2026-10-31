package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q8a0 {
    public static final q8a0 f = new q8a0(null, false);
    public final iep0 a;
    public final rcn0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public q8a0(iep0 iep0Var, rcn0 rcn0Var, boolean z, boolean z2, boolean z3) {
        this.a = iep0Var;
        this.b = rcn0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8a0)) {
            return false;
        }
        q8a0 q8a0Var = (q8a0) obj;
        return this.a == q8a0Var.a && this.b == q8a0Var.b && this.c == q8a0Var.c && this.d == q8a0Var.d && this.e == q8a0Var.e;
    }

    public final int hashCode() {
        iep0 iep0Var = this.a;
        int iHashCode = (iep0Var == null ? 0 : iep0Var.hashCode()) * 31;
        rcn0 rcn0Var = this.b;
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g((iHashCode + (rcn0Var != null ? rcn0Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.a);
        sb.append(", mutability=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", isNullabilityQualifierForWarning=");
        sb.append(this.d);
        sb.append(", isMutabilityQualifierForWarning=");
        return f4i1.g(sb, this.e, ')');
    }

    public /* synthetic */ q8a0(iep0 iep0Var, boolean z) {
        this(iep0Var, null, z, false, false);
    }
}
