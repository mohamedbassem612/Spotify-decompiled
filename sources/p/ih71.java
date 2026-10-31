package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ih71 extends u1p1 {
    public final o571 c;
    public final ela1 d;
    public final bb71 e;
    public final bkc0 f;
    public final p371 g;
    public final String h;
    public final ou80 i;
    public final n3o1 j;
    public final z771 k;

    public ih71(o571 o571Var, ela1 ela1Var, bb71 bb71Var, bkc0 bkc0Var, p371 p371Var, String str, ou80 ou80Var, n3o1 n3o1Var, z771 z771Var) {
        this.c = o571Var;
        this.d = ela1Var;
        this.e = bb71Var;
        this.f = bkc0Var;
        this.g = p371Var;
        this.h = str;
        this.i = ou80Var;
        this.j = n3o1Var;
        this.k = z771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih71)) {
            return false;
        }
        ih71 ih71Var = (ih71) obj;
        return u890.j(this.c, ih71Var.c) && this.d.equals(ih71Var.d) && u890.j(this.e, ih71Var.e) && u890.j(this.f, ih71Var.f) && u890.j(this.g, ih71Var.g) && u890.j(this.h, ih71Var.h) && u890.j(this.i, ih71Var.i) && u890.j(this.j, ih71Var.j) && u890.j(this.k, ih71Var.k);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31;
        bkc0 bkc0Var = this.f;
        int iHashCode2 = (iHashCode + (bkc0Var == null ? 0 : bkc0Var.hashCode())) * 31;
        p371 p371Var = this.g;
        int iD = cy30.d((iHashCode2 + (p371Var == null ? 0 : p371Var.hashCode())) * 31, 31, this.h);
        ou80 ou80Var = this.i;
        int iHashCode3 = (this.j.hashCode() + ((iD + (ou80Var == null ? 0 : ou80Var.a.hashCode())) * 31)) * 31;
        z771 z771Var = this.k;
        return iHashCode3 + (z771Var != null ? z771Var.a.hashCode() : 0);
    }
}
