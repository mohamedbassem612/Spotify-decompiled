package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jh71 extends u1p1 {
    public final s4b1 c;
    public final o571 d;
    public final bb71 e;
    public final ou80 f;
    public final ela1 g;
    public final wgf h;
    public final p371 i;
    public final s7q0 j;
    public final n3o1 k;
    public final z771 l;

    public jh71(s4b1 s4b1Var, o571 o571Var, bb71 bb71Var, ou80 ou80Var, ela1 ela1Var, wgf wgfVar, p371 p371Var, s7q0 s7q0Var, n3o1 n3o1Var, z771 z771Var) {
        this.c = s4b1Var;
        this.d = o571Var;
        this.e = bb71Var;
        this.f = ou80Var;
        this.g = ela1Var;
        this.h = wgfVar;
        this.i = p371Var;
        this.j = s7q0Var;
        this.k = n3o1Var;
        this.l = z771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh71)) {
            return false;
        }
        jh71 jh71Var = (jh71) obj;
        return u890.j(this.c, jh71Var.c) && u890.j(this.d, jh71Var.d) && this.e.equals(jh71Var.e) && u890.j(this.f, jh71Var.f) && this.g.equals(jh71Var.g) && u890.j(this.h, jh71Var.h) && u890.j(this.i, jh71Var.i) && u890.j(this.j, jh71Var.j) && u890.j(this.k, jh71Var.k) && u890.j(this.l, jh71Var.l);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + cy30.d((this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31, 31, this.f.a)) * 31;
        wgf wgfVar = this.h;
        int iHashCode2 = (iHashCode + (wgfVar == null ? 0 : wgfVar.hashCode())) * 31;
        p371 p371Var = this.i;
        int iHashCode3 = (iHashCode2 + (p371Var == null ? 0 : p371Var.hashCode())) * 31;
        s7q0 s7q0Var = this.j;
        int iHashCode4 = (this.k.hashCode() + ((iHashCode3 + (s7q0Var == null ? 0 : s7q0Var.hashCode())) * 31)) * 31;
        z771 z771Var = this.l;
        return iHashCode4 + (z771Var != null ? z771Var.a.hashCode() : 0);
    }
}
