package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d011 implements j011 {
    public final String a;
    public final String b;
    public final String c;
    public final tv80 d;

    public d011(String str, String str2, String str3, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d011)) {
            return false;
        }
        d011 d011Var = (d011) obj;
        return u890.j(this.a, d011Var.a) && u890.j(this.b, d011Var.b) && u890.j(this.c, d011Var.c) && u890.j(this.d, d011Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        tv80 tv80Var = this.d;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
