package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o990 {
    public final vzq0 a;
    public final String b;
    public final n990 c;
    public final c380 d;
    public final String e;

    public o990(vzq0 vzq0Var, String str, n990 n990Var, c380 c380Var, String str2) {
        this.a = vzq0Var;
        this.b = str;
        this.c = n990Var;
        this.d = c380Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o990)) {
            return false;
        }
        o990 o990Var = (o990) obj;
        return this.a.equals(o990Var.a) && u890.j(this.b, o990Var.b) && u890.j(this.c, o990Var.c) && u890.j(this.d, o990Var.d) && u890.j(this.e, o990Var.e);
    }

    public final int hashCode() {
        int iF = kk0.f(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        String str = this.e;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
