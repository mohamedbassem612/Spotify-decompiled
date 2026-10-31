package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q1e1 implements s1e1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final s171 g;

    public q1e1(String str, String str2, String str3, String str4, String str5, int i, s171 s171Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = s171Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1e1)) {
            return false;
        }
        q1e1 q1e1Var = (q1e1) obj;
        return this.a.equals(q1e1Var.a) && u890.j(this.b, q1e1Var.b) && this.c.equals(q1e1Var.c) && u890.j(this.d, q1e1Var.d) && this.e.equals(q1e1Var.e) && this.f == q1e1Var.f && u890.j(this.g, q1e1Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iF = kaa0.f(this.f, cy30.d(cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
        s171 s171Var = this.g;
        return iF + (s171Var != null ? s171Var.hashCode() : 0);
    }
}
