package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class htx0 extends ktx0 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;

    public htx0(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htx0)) {
            return false;
        }
        htx0 htx0Var = (htx0) obj;
        return this.a.equals(htx0Var.a) && this.b.equals(htx0Var.b) && this.c == htx0Var.c && this.d == htx0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
