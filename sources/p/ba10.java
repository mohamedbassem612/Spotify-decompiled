package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ba10 {
    public final m8a a;
    public final cj31 b;
    public final cj31 c;
    public final cj31 d;
    public final cj31 e;
    public final cj31 f;
    public final String g;
    public final boolean h;

    public ba10(m8a m8aVar, cj31 cj31Var, cj31 cj31Var2, cj31 cj31Var3, cj31 cj31Var4, cj31 cj31Var5, String str, boolean z) {
        this.a = m8aVar;
        this.b = cj31Var;
        this.c = cj31Var2;
        this.d = cj31Var3;
        this.e = cj31Var4;
        this.f = cj31Var5;
        this.g = str;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba10)) {
            return false;
        }
        ba10 ba10Var = (ba10) obj;
        return this.a.equals(ba10Var.a) && u890.j(this.b, ba10Var.b) && u890.j(this.c, ba10Var.c) && u890.j(this.d, ba10Var.d) && u890.j(this.e, ba10Var.e) && u890.j(this.f, ba10Var.f) && u890.j(this.g, ba10Var.g) && this.h == ba10Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        cj31 cj31Var = this.e;
        int iHashCode2 = (iHashCode + (cj31Var == null ? 0 : cj31Var.hashCode())) * 31;
        cj31 cj31Var2 = this.f;
        int iHashCode3 = (iHashCode2 + (cj31Var2 == null ? 0 : cj31Var2.hashCode())) * 31;
        String str = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
