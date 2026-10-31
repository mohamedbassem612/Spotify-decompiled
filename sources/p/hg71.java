package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hg71 extends tg71 {
    public final o571 a;
    public final te71 b;
    public final p371 c;
    public final String d;
    public final Integer e;
    public final q6q0 f;
    public final ou80 g;

    public hg71(o571 o571Var, te71 te71Var, p371 p371Var, String str, Integer num, q6q0 q6q0Var, ou80 ou80Var) {
        this.a = o571Var;
        this.b = te71Var;
        this.c = p371Var;
        this.d = str;
        this.e = num;
        this.f = q6q0Var;
        this.g = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg71)) {
            return false;
        }
        hg71 hg71Var = (hg71) obj;
        return u890.j(this.a, hg71Var.a) && this.b.equals(hg71Var.b) && u890.j(this.c, hg71Var.c) && u890.j(this.d, hg71Var.d) && u890.j(this.e, hg71Var.e) && u890.j(this.f, hg71Var.f) && u890.j(this.g, hg71Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        p371 p371Var = this.c;
        int iHashCode2 = (iHashCode + (p371Var == null ? 0 : p371Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        q6q0 q6q0Var = this.f;
        int iHashCode5 = (iHashCode4 + (q6q0Var == null ? 0 : q6q0Var.hashCode())) * 31;
        ou80 ou80Var = this.g;
        return iHashCode5 + (ou80Var != null ? ou80Var.a.hashCode() : 0);
    }
}
