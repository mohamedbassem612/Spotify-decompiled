package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uv11 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final cqs0 e;
    public final tv11 f;
    public final int g;

    public uv11(String str, String str2, Integer num, String str3, cqs0 cqs0Var, tv11 tv11Var, int i, int i2) {
        num = (i2 & 4) != 0 ? null : num;
        str3 = (i2 & 8) != 0 ? null : str3;
        cqs0Var = (i2 & 16) != 0 ? mqo1.u() : cqs0Var;
        tv11Var = (i2 & 32) != 0 ? null : tv11Var;
        i = (i2 & 64) != 0 ? 0 : i;
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = cqs0Var;
        this.f = tv11Var;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv11)) {
            return false;
        }
        uv11 uv11Var = (uv11) obj;
        return u890.j(this.a, uv11Var.a) && u890.j(this.b, uv11Var.b) && u890.j(this.c, uv11Var.c) && u890.j(this.d, uv11Var.d) && this.e.equals(uv11Var.e) && u890.j(this.f, uv11Var.f) && this.g == uv11Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        tv11 tv11Var = this.f;
        return kaa0.f(this.g, (iHashCode2 + (tv11Var != null ? tv11Var.hashCode() : 0)) * 31, 31);
    }
}
