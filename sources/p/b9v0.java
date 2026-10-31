package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b9v0 implements ez00 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;

    public b9v0(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z && !z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9v0)) {
            return false;
        }
        b9v0 b9v0Var = (b9v0) obj;
        return this.a == b9v0Var.a && this.b == b9v0Var.b && this.c == b9v0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
