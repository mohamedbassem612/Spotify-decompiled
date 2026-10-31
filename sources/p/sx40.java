package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sx40 extends tx40 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    public sx40(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx40)) {
            return false;
        }
        sx40 sx40Var = (sx40) obj;
        return this.a.equals(sx40Var.a) && this.b.equals(sx40Var.b) && this.c == sx40Var.c && this.d.equals(sx40Var.d) && u890.j(this.e, sx40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }
}
