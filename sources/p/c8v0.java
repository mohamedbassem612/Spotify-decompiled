package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c8v0 extends e8v0 {
    public final String c;
    public final boolean d;
    public final boolean e;

    public c8v0(String str, boolean z, boolean z2) {
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8v0)) {
            return false;
        }
        c8v0 c8v0Var = (c8v0) obj;
        return u890.j(this.c, c8v0Var.c) && this.d == c8v0Var.d && this.e == c8v0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(this.c.hashCode() * 31, 31, this.d);
    }
}
