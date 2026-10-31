package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jq7 implements lq7 {
    public final hq7 a;
    public final String b;
    public final long c;
    public final String d;

    public jq7(hq7 hq7Var, String str, long j, String str2) {
        this.a = hq7Var;
        this.b = str;
        this.c = j;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq7)) {
            return false;
        }
        jq7 jq7Var = (jq7) obj;
        return u890.j(this.a, jq7Var.a) && u890.j(this.b, jq7Var.b) && this.c == jq7Var.c && u890.j(this.d, jq7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
