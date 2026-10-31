package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kz91 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final x4i1 d;
    public final ez91 e;

    public kz91(int i, boolean z, boolean z2, x4i1 x4i1Var, ez91 ez91Var) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = x4i1Var;
        this.e = ez91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz91)) {
            return false;
        }
        kz91 kz91Var = (kz91) obj;
        return this.a == kz91Var.a && this.b == kz91Var.b && this.c == kz91Var.c && u890.j(this.d, kz91Var.d) && this.e.equals(kz91Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        x4i1 x4i1Var = this.d;
        return this.e.hashCode() + ((iG + (x4i1Var == null ? 0 : x4i1Var.hashCode())) * 31);
    }
}
