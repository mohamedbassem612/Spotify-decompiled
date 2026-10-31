package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qij1 {
    public final jlw0 a;
    public final jlw0 b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final s171 g;
    public final String h;

    public qij1(jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str, String str2, s171 s171Var, String str3) {
        this.a = jlw0Var;
        this.b = jlw0Var2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = s171Var;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qij1)) {
            return false;
        }
        qij1 qij1Var = (qij1) obj;
        return u890.j(this.a, qij1Var.a) && u890.j(this.b, qij1Var.b) && this.c == qij1Var.c && this.d == qij1Var.d && u890.j(this.e, qij1Var.e) && u890.j(this.f, qij1Var.f) && u890.j(this.g, qij1Var.g) && u890.j(this.h, qij1Var.h);
    }

    public final int hashCode() {
        jlw0 jlw0Var = this.a;
        int iHashCode = (this.g.hashCode() + cy30.d(cy30.d(kaa0.f(this.d, kaa0.f(this.c, (this.b.hashCode() + ((jlw0Var == null ? 0 : jlw0Var.hashCode()) * 31)) * 31, 31), 31), 31, this.e), 31, this.f)) * 31;
        String str = this.h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
