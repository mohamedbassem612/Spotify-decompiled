package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rbt0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final lax d;
    public final boolean e;
    public final boolean f;

    public rbt0(boolean z, boolean z2, boolean z3, lax laxVar, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = laxVar;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbt0)) {
            return false;
        }
        rbt0 rbt0Var = (rbt0) obj;
        return this.a == rbt0Var.a && this.b == rbt0Var.b && this.c == rbt0Var.c && u890.j(this.d, rbt0Var.d) && this.e == rbt0Var.e && this.f == rbt0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g((this.d.hashCode() + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }
}
