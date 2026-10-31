package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y920 {
    public final q620 a;
    public final int b;
    public final boolean c;

    public y920(q620 q620Var, int i, boolean z) {
        this.a = q620Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y920)) {
            return false;
        }
        y920 y920Var = (y920) obj;
        return u890.j(this.a, y920Var.a) && this.b == y920Var.b && this.c == y920Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
