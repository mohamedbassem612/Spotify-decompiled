package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zyq0 {
    public final String a;
    public final String b;
    public final long c;
    public final yj41 d;
    public final yj41 e;
    public final yj41 f;

    public zyq0(String str, String str2, long j, yj41 yj41Var, yj41 yj41Var2, yj41 yj41Var3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = yj41Var;
        this.e = yj41Var2;
        this.f = yj41Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyq0)) {
            return false;
        }
        zyq0 zyq0Var = (zyq0) obj;
        if (!u890.j(this.a, zyq0Var.a) || !u890.j(this.b, zyq0Var.b)) {
            return false;
        }
        long j = zyq0Var.c;
        int i = u7h.l;
        return z4h1.b(this.c, j) && u890.j(this.d, zyq0Var.d) && u890.j(this.e, zyq0Var.e) && u890.j(this.f, zyq0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        int i = u7h.l;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + cy30.f(iD, this.c, 31)) * 31)) * 31);
    }
}
