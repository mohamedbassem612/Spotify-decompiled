package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q5l1 extends r5l1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final u7h f;

    public q5l1(String str, String str2, String str3, String str4, boolean z, u7h u7hVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5l1)) {
            return false;
        }
        q5l1 q5l1Var = (q5l1) obj;
        return u890.j(this.a, q5l1Var.a) && this.b.equals(q5l1Var.b) && u890.j(this.c, q5l1Var.c) && u890.j(this.d, q5l1Var.d) && this.e == q5l1Var.e && u890.j(this.f, q5l1Var.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        u7h u7hVar = this.f;
        return iG + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a));
    }
}
