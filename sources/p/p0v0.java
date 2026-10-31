package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p0v0 {
    public final boolean a;
    public final boolean b;
    public final String c;

    public p0v0(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0v0)) {
            return false;
        }
        p0v0 p0v0Var = (p0v0) obj;
        return this.a == p0v0Var.a && this.b == p0v0Var.b && u890.j(this.c, p0v0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
