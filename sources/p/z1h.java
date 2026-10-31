package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z1h {
    public final String a;
    public final int b;
    public final cet0 c;
    public final se81 d;
    public final g330 e;
    public final sru f;
    public final zbm g;

    public z1h(String str, int i, cet0 cet0Var, se81 se81Var, g330 g330Var, sru sruVar, zbm zbmVar) {
        this.a = str;
        this.b = i;
        this.c = cet0Var;
        this.d = se81Var;
        this.e = g330Var;
        this.f = sruVar;
        this.g = zbmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1h)) {
            return false;
        }
        z1h z1hVar = (z1h) obj;
        return this.a.equals(z1hVar.a) && this.b == z1hVar.b && this.c.equals(z1hVar.c) && u890.j(this.d, z1hVar.d) && this.e.equals(z1hVar.e) && this.f.equals(z1hVar.f) && this.g.equals(z1hVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31;
        se81 se81Var = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (se81Var == null ? 0 : se81Var.hashCode())) * 31)) * 31)) * 31);
    }
}
