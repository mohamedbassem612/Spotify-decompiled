package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m98 {
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;
    public final double e;
    public final String f;

    public m98(boolean z, String str, String str2, int i, double d, String str3) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = d;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m98)) {
            return false;
        }
        m98 m98Var = (m98) obj;
        return this.a == m98Var.a && this.b.equals(m98Var.b) && u890.j(this.c, m98Var.c) && this.d == m98Var.d && Double.compare(this.e, m98Var.e) == 0 && u890.j(this.f, m98Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iE = xcg1.e(this.e, kaa0.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }
}
