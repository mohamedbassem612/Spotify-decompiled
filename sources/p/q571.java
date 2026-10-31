package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q571 {
    public final int a;
    public final hyo1 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public q571(int i, hyo1 hyo1Var, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = hyo1Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q571)) {
            return false;
        }
        q571 q571Var = (q571) obj;
        return this.a == q571Var.a && u890.j(this.b, q571Var.b) && this.c == q571Var.c && this.d == q571Var.d && this.e == q571Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, true), 31, this.c), 31, this.d);
    }
}
