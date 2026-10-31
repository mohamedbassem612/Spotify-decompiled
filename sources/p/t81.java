package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t81 extends u4p1 {
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public t81(String str, boolean z, String str2, boolean z2) {
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t81)) {
            return false;
        }
        t81 t81Var = (t81) obj;
        return u890.j(this.c, t81Var.c) && u890.j(this.d, t81Var.d) && this.e == t81Var.e && this.f == t81Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }
}
