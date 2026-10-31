package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m40 implements x40 {
    public final String a;
    public final String b;
    public final hux c;
    public final qex d;
    public final String e;
    public final b50 f;
    public final iu30 g;

    public m40(String str, String str2, hux huxVar, String str3, b50 b50Var, iu30 iu30Var, int i) {
        pex pexVar = pex.b;
        str3 = (i & 16) != 0 ? null : str3;
        this.a = str;
        this.b = str2;
        this.c = huxVar;
        this.d = pexVar;
        this.e = str3;
        this.f = b50Var;
        this.g = iu30Var;
    }

    @Override // p.x40
    public final b50 a() {
        return this.f;
    }

    @Override // p.x40
    public final iu30 b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        m40 m40Var = (m40) obj;
        return this.a.equals(m40Var.a) && u890.j(this.b, m40Var.b) && u890.j(this.c, m40Var.c) && this.d.equals(m40Var.d) && u890.j(this.e, m40Var.e) && this.f.equals(m40Var.f) && this.g.equals(m40Var.g);
    }

    @Override // p.x40
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + eqq.k(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
