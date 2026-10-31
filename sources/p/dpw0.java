package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dpw0 {
    public final boolean a;
    public final l2r0 b;
    public final String c;
    public final boolean d;

    public dpw0(boolean z, l2r0 l2r0Var, String str, boolean z2) {
        this.a = z;
        this.b = l2r0Var;
        this.c = str;
        this.d = z2;
    }

    public static dpw0 a(dpw0 dpw0Var, boolean z, l2r0 l2r0Var, String str, int i) {
        if ((i & 1) != 0) {
            z = dpw0Var.a;
        }
        if ((i & 2) != 0) {
            l2r0Var = dpw0Var.b;
        }
        if ((i & 4) != 0) {
            str = dpw0Var.c;
        }
        return new dpw0(z, l2r0Var, str, (i & 8) != 0 ? dpw0Var.d : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpw0)) {
            return false;
        }
        dpw0 dpw0Var = (dpw0) obj;
        return this.a == dpw0Var.a && this.b == dpw0Var.b && u890.j(this.c, dpw0Var.c) && this.d == dpw0Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
