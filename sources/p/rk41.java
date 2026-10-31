package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rk41 {
    public final boolean a;
    public final boolean b;
    public final Object c;

    public rk41(boolean z, boolean z2, Object obj) {
        this.a = z;
        this.b = z2;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk41)) {
            return false;
        }
        rk41 rk41Var = (rk41) obj;
        return this.a == rk41Var.a && this.b == rk41Var.b && u890.j(this.c, rk41Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        Object obj = this.c;
        return iG + (obj == null ? 0 : obj.hashCode());
    }
}
