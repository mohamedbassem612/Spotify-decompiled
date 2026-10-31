package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y6k1 {
    public final String a;
    public final String b;
    public final d8r0 c;

    public y6k1(String str, String str2, d8r0 d8r0Var) {
        this.a = str;
        this.b = str2;
        this.c = d8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6k1)) {
            return false;
        }
        y6k1 y6k1Var = (y6k1) obj;
        return u890.j(this.a, y6k1Var.a) && u890.j(this.b, y6k1Var.b) && this.c.equals(y6k1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
