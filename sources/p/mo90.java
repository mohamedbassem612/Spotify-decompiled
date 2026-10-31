package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mo90 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public mo90(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo90)) {
            return false;
        }
        mo90 mo90Var = (mo90) obj;
        return this.a == mo90Var.a && this.b == mo90Var.b && this.c == mo90Var.c && this.d == mo90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
