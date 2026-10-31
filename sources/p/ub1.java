package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ub1 {
    public final String a;
    public final iyr0 b;
    public final boolean c;
    public final boolean d;

    public ub1(String str, iyr0 iyr0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = iyr0Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub1)) {
            return false;
        }
        ub1 ub1Var = (ub1) obj;
        return u890.j(this.a, ub1Var.a) && this.b == ub1Var.b && this.c == ub1Var.c && this.d == ub1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
