package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pr0 {
    public final ji0 a;
    public final boolean b;
    public final String c;

    public pr0(ji0 ji0Var, boolean z, String str) {
        this.a = ji0Var;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr0)) {
            return false;
        }
        pr0 pr0Var = (pr0) obj;
        return u890.j(this.a, pr0Var.a) && this.b == pr0Var.b && u890.j(this.c, pr0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
