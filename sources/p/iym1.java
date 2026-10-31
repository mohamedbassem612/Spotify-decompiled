package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iym1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public iym1(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iym1)) {
            return false;
        }
        iym1 iym1Var = (iym1) obj;
        return this.a == iym1Var.a && this.b == iym1Var.b && this.c == iym1Var.c && this.d == iym1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
