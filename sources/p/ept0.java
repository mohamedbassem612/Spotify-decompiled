package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ept0 {
    public final String a;
    public final boolean b;
    public final ipt0 c;
    public final boolean d;
    public final rgg e;
    public final boolean f;

    public /* synthetic */ ept0(String str, boolean z, ipt0 ipt0Var, int i) {
        this(str, z, (i & 4) != 0 ? fpt0.a : ipt0Var, (i & 8) != 0, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ept0)) {
            return false;
        }
        ept0 ept0Var = (ept0) obj;
        return u890.j(this.a, ept0Var.a) && this.b == ept0Var.b && u890.j(this.c, ept0Var.c) && this.d == ept0Var.d && u890.j(this.e, ept0Var.e) && this.f == ept0Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        rgg rggVar = this.e;
        return Boolean.hashCode(this.f) + ((iG + (rggVar == null ? 0 : Integer.hashCode(rggVar.a))) * 31);
    }

    public ept0(String str, boolean z, ipt0 ipt0Var, boolean z2, rgg rggVar, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = ipt0Var;
        this.d = z2;
        this.e = rggVar;
        this.f = z3;
    }
}
