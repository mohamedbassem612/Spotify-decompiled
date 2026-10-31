package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f2d0 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public f2d0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2d0)) {
            return false;
        }
        f2d0 f2d0Var = (f2d0) obj;
        return this.a == f2d0Var.a && this.b == f2d0Var.b && this.c == f2d0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(kaa0.f(this.a, Integer.hashCode(0) * 31, 31), 31, this.b);
    }
}
