package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kxt0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public kxt0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxt0)) {
            return false;
        }
        kxt0 kxt0Var = (kxt0) obj;
        return this.a == kxt0Var.a && this.b == kxt0Var.b && this.c == kxt0Var.c && this.d == kxt0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
