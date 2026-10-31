package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w7a1 implements y7a1 {
    public final String a;
    public final String b;
    public final c380 c;
    public final String d;

    public w7a1(String str, String str2, c9 c9Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = c9Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7a1)) {
            return false;
        }
        w7a1 w7a1Var = (w7a1) obj;
        return u890.j(this.a, w7a1Var.a) && u890.j(this.b, w7a1Var.b) && this.c.equals(w7a1Var.c) && u890.j(this.d, w7a1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iF = kk0.f(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.d;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }
}
