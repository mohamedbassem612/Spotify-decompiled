package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m081 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public m081(String str, int i, String str2, String str3, boolean z, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m081)) {
            return false;
        }
        m081 m081Var = (m081) obj;
        return this.a.equals(m081Var.a) && this.b.equals(m081Var.b) && this.c.equals(m081Var.c) && this.d.equals(m081Var.d) && this.e == m081Var.e && this.f == m081Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i = this.f;
        return iG + (i == 0 ? 0 : l1d.C(i));
    }
}
