package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m0k0 implements k1k0 {
    public final String a;
    public final String b;
    public final ntf1 c;

    public m0k0(String str, String str2, ntf1 ntf1Var) {
        this.a = str;
        this.b = str2;
        this.c = ntf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0k0)) {
            return false;
        }
        m0k0 m0k0Var = (m0k0) obj;
        return u890.j(this.a, m0k0Var.a) && u890.j(this.b, m0k0Var.b) && this.c.equals(m0k0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
