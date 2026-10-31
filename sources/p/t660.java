package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t660 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final wfm0 g;
    public final String h;
    public final boolean i;
    public final s660 j;

    public t660(int i, String str, String str2, String str3, long j, String str4, wfm0 wfm0Var, String str5, boolean z, s660 s660Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = str4;
        this.g = wfm0Var;
        this.h = str5;
        this.i = z;
        this.j = s660Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t660)) {
            return false;
        }
        t660 t660Var = (t660) obj;
        if (this.a != t660Var.a || !this.b.equals(t660Var.b) || !this.c.equals(t660Var.c) || !this.d.equals(t660Var.d)) {
            return false;
        }
        long j = t660Var.e;
        int i = u7h.l;
        return z4h1.b(this.e, j) && this.f.equals(t660Var.f) && this.g.equals(t660Var.g) && u890.j(this.h, t660Var.h) && this.i == t660Var.i && u890.j(this.j, t660Var.j);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = u7h.l;
        int iHashCode = (this.g.hashCode() + cy30.d(cy30.f(iD, this.e, 31), 31, this.f)) * 31;
        String str = this.h;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        s660 s660Var = this.j;
        return iG + (s660Var != null ? s660Var.hashCode() : 0);
    }
}
