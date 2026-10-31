package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t6f1 {
    public final String a;
    public final c380 b;
    public final String c;
    public final s6f1 d;
    public final boolean e;

    public t6f1(String str, c380 c380Var, String str2, s6f1 s6f1Var, boolean z) {
        this.a = str;
        this.b = c380Var;
        this.c = str2;
        this.d = s6f1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6f1)) {
            return false;
        }
        t6f1 t6f1Var = (t6f1) obj;
        return this.a.equals(t6f1Var.a) && u890.j(this.b, t6f1Var.b) && this.c.equals(t6f1Var.c) && u890.j(this.d, t6f1Var.d) && this.e == t6f1Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(kk0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        s6f1 s6f1Var = this.d;
        return Boolean.hashCode(this.e) + ((iD + (s6f1Var == null ? 0 : s6f1Var.hashCode())) * 31);
    }
}
