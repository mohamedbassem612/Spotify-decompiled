package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kcc0 {
    public final String a;
    public final boolean b;
    public final int c;
    public final xwp0 d;

    public kcc0(String str, boolean z, int i, xwp0 xwp0Var) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = xwp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcc0)) {
            return false;
        }
        kcc0 kcc0Var = (kcc0) obj;
        return this.a.equals(kcc0Var.a) && this.b == kcc0Var.b && this.c == kcc0Var.c && this.d.equals(kcc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
