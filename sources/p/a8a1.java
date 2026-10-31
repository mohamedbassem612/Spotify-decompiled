package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a8a1 {
    public final String a;
    public final String b;
    public final c380 c;
    public final u7h d;
    public final int e;
    public final int f;

    public a8a1(String str, String str2, c380 c380Var, u7h u7hVar, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = u7hVar;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8a1)) {
            return false;
        }
        a8a1 a8a1Var = (a8a1) obj;
        return this.a.equals(a8a1Var.a) && u890.j(this.b, a8a1Var.b) && u890.j(this.c, a8a1Var.c) && u890.j(this.d, a8a1Var.d) && this.e == a8a1Var.e && this.f == a8a1Var.f;
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        u7h u7hVar = this.d;
        return Integer.hashCode(this.f) + kaa0.f(this.e, (iF + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31, 31);
    }
}
