package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p3y0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public p3y0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3y0)) {
            return false;
        }
        p3y0 p3y0Var = (p3y0) obj;
        return u890.j(this.a, p3y0Var.a) && this.b == p3y0Var.b && this.c == p3y0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
