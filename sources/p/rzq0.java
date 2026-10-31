package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rzq0 implements ft40 {
    public final pzq0 a;
    public final pzq0 b;
    public final pzq0 c;
    public final pzq0 d;
    public final pzq0 e;
    public final pzq0 f;

    public /* synthetic */ rzq0(pzq0 pzq0Var, pzq0 pzq0Var2, pzq0 pzq0Var3, pzq0 pzq0Var4) {
        this(new pzq0(0.0f, 3), pzq0Var, pzq0Var2, new pzq0(0.0f, 3), pzq0Var3, pzq0Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzq0)) {
            return false;
        }
        rzq0 rzq0Var = (rzq0) obj;
        return u890.j(this.a, rzq0Var.a) && u890.j(this.b, rzq0Var.b) && u890.j(this.c, rzq0Var.c) && u890.j(this.d, rzq0Var.d) && u890.j(this.e, rzq0Var.e) && u890.j(this.f, rzq0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.a + ", start=" + this.b + ", top=" + this.c + ", right=" + this.d + ", end=" + this.e + ", bottom=" + this.f + ')';
    }

    public rzq0(pzq0 pzq0Var, pzq0 pzq0Var2, pzq0 pzq0Var3, pzq0 pzq0Var4, pzq0 pzq0Var5, pzq0 pzq0Var6) {
        this.a = pzq0Var;
        this.b = pzq0Var2;
        this.c = pzq0Var3;
        this.d = pzq0Var4;
        this.e = pzq0Var5;
        this.f = pzq0Var6;
    }
}
