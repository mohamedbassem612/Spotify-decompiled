package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m6g0 extends n6g0 {
    public final String a;
    public final String b;

    public m6g0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6g0)) {
            return false;
        }
        m6g0 m6g0Var = (m6g0) obj;
        return u890.j(this.a, m6g0Var.a) && u890.j(this.b, m6g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
