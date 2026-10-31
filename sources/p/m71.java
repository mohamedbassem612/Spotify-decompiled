package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m71 extends n71 {
    public final String a;
    public final String b;
    public final x8t0 c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public m71(String str, String str2, x8t0 x8t0Var, boolean z, String str3, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = x8t0Var;
        this.d = z;
        this.e = str3;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m71)) {
            return false;
        }
        m71 m71Var = (m71) obj;
        return u890.j(this.a, m71Var.a) && this.b.equals(m71Var.b) && u890.j(this.c, m71Var.c) && this.d == m71Var.d && u890.j(this.e, m71Var.e) && this.f == m71Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }
}
