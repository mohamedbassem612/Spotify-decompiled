package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h5n0 {
    public final String a;
    public final String b;
    public final String c;

    public h5n0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5n0)) {
            return false;
        }
        h5n0 h5n0Var = (h5n0) obj;
        return this.a.equals(h5n0Var.a) && this.b.equals(h5n0Var.b) && u890.j(this.c, h5n0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
