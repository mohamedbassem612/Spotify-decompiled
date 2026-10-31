package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f7t0 {
    public final p7t0 a;
    public final int b;
    public final boolean c;

    public f7t0(p7t0 p7t0Var, int i, boolean z) {
        this.a = p7t0Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7t0)) {
            return false;
        }
        f7t0 f7t0Var = (f7t0) obj;
        return u890.j(this.a, f7t0Var.a) && this.b == f7t0Var.b && this.c == f7t0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
