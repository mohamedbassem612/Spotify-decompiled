package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xx41 implements by41 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public xx41(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx41)) {
            return false;
        }
        xx41 xx41Var = (xx41) obj;
        return u890.j(this.a, xx41Var.a) && u890.j(this.b, xx41Var.b) && this.c == xx41Var.c && this.d == xx41Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
