package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m6v0 extends n6v0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final long f;
    public final long g;

    public m6v0(String str, String str2, String str3, String str4, boolean z, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6v0)) {
            return false;
        }
        m6v0 m6v0Var = (m6v0) obj;
        return this.a.equals(m6v0Var.a) && this.b.equals(m6v0Var.b) && this.c.equals(m6v0Var.c) && this.d.equals(m6v0Var.d) && this.e == m6v0Var.e && this.f == m6v0Var.f && this.g == m6v0Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + cy30.f(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31);
    }
}
