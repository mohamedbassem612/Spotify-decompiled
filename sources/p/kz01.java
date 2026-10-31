package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kz01 implements pz01 {
    public final String a;
    public final String b;
    public final tv80 c;

    public kz01(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz01)) {
            return false;
        }
        kz01 kz01Var = (kz01) obj;
        return u890.j(this.a, kz01Var.a) && u890.j(this.b, kz01Var.b) && u890.j(this.c, kz01Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
