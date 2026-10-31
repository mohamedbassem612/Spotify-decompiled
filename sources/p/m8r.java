package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m8r {
    public final c380 a;
    public final String b;

    public m8r(String str, c380 c380Var) {
        this.a = c380Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8r)) {
            return false;
        }
        m8r m8rVar = (m8r) obj;
        return u890.j(this.a, m8rVar.a) && this.b.equals(m8rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
