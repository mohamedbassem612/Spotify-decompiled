package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gj3 {
    public final boolean a;
    public final boolean b;
    public final tv80 c;
    public final boolean d;

    public gj3(int i, tv80 tv80Var) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) != 0;
        tv80Var = (i & 4) != 0 ? null : tv80Var;
        boolean z3 = (i & 8) == 0;
        this.a = z;
        this.b = z2;
        this.c = tv80Var;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj3)) {
            return false;
        }
        gj3 gj3Var = (gj3) obj;
        return this.a == gj3Var.a && this.b == gj3Var.b && u890.j(this.c, gj3Var.c) && this.d == gj3Var.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return xcg1.g((iG + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31, 31, this.d);
    }
}
