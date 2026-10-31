package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zia1 {
    public final dia1 a;
    public final as3 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public zia1(dia1 dia1Var, as3 as3Var, boolean z, boolean z2, boolean z3) {
        this.a = dia1Var;
        this.b = as3Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zia1)) {
            return false;
        }
        zia1 zia1Var = (zia1) obj;
        return this.a == zia1Var.a && this.b == zia1Var.b && this.c == zia1Var.c && this.d == zia1Var.d && this.e == zia1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }
}
