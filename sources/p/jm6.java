package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jm6 {
    public final String a;
    public final c380 b;
    public final nm6 c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final boolean h;

    public jm6(String str, c9 c9Var, nm6 nm6Var, String str2, String str3, String str4, long j, boolean z) {
        this.a = str;
        this.b = c9Var;
        this.c = nm6Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = j;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm6)) {
            return false;
        }
        jm6 jm6Var = (jm6) obj;
        if (!u890.j(this.a, jm6Var.a) || !this.b.equals(jm6Var.b) || !u890.j(this.c, jm6Var.c) || !this.d.equals(jm6Var.d) || !this.e.equals(jm6Var.e) || !this.f.equals(jm6Var.f)) {
            return false;
        }
        long j = jm6Var.g;
        int i = u7h.l;
        return z4h1.b(this.g, j) && this.h == jm6Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d((this.c.hashCode() + kk0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        int i = u7h.l;
        return Boolean.hashCode(this.h) + cy30.f(iD, this.g, 31);
    }
}
