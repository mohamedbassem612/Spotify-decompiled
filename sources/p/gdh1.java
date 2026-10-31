package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gdh1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public gdh1(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdh1)) {
            return false;
        }
        gdh1 gdh1Var = (gdh1) obj;
        return this.a == gdh1Var.a && this.b == gdh1Var.b && this.c == gdh1Var.c && this.d == gdh1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
