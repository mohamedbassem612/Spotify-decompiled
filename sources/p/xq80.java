package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xq80 {
    public final String a;
    public final String b;
    public final String c;

    public xq80(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq80)) {
            return false;
        }
        xq80 xq80Var = (xq80) obj;
        return u890.j(this.a, xq80Var.a) && this.b.equals(xq80Var.b) && this.c.equals(xq80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
