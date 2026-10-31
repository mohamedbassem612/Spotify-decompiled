package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class st01 {
    public final ou80 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public st01(ou80 ou80Var, String str, String str2, String str3, String str4) {
        this.a = ou80Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st01)) {
            return false;
        }
        st01 st01Var = (st01) obj;
        return u890.j(this.a, st01Var.a) && this.b.equals(st01Var.b) && this.c.equals(st01Var.c) && u890.j(this.d, st01Var.d) && u890.j(this.e, st01Var.e);
    }

    public final int hashCode() {
        ou80 ou80Var = this.a;
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d((ou80Var == null ? 0 : ou80Var.a.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
