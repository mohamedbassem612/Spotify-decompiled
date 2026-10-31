package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y4k0 {
    public final String a;
    public final String b;
    public final String c;

    public y4k0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4k0)) {
            return false;
        }
        y4k0 y4k0Var = (y4k0) obj;
        return u890.j(this.a, y4k0Var.a) && this.b.equals(y4k0Var.b) && u890.j(this.c, y4k0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
