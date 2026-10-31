package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gz01 implements pz01 {
    public final String a;
    public final String b;
    public final String c;
    public final tv80 d;

    public gz01(String str, String str2, String str3, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz01)) {
            return false;
        }
        gz01 gz01Var = (gz01) obj;
        return u890.j(this.a, gz01Var.a) && u890.j(this.b, gz01Var.b) && u890.j(this.c, gz01Var.c) && u890.j(this.d, gz01Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        tv80 tv80Var = this.d;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
