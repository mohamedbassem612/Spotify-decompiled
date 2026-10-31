package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x2h0 implements e4h0 {
    public final String a;
    public final c380 b;
    public final String c;

    public x2h0(String str, String str2, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2h0)) {
            return false;
        }
        x2h0 x2h0Var = (x2h0) obj;
        return u890.j(this.a, x2h0Var.a) && u890.j(this.b, x2h0Var.b) && u890.j(this.c, x2h0Var.c);
    }

    public final int hashCode() {
        int iF = kk0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
