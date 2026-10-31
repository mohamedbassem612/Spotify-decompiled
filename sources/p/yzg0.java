package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yzg0 implements k0h0 {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final tv80 f;

    public yzg0(String str, String str2, Long l, String str3, String str4, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = str4;
        this.f = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzg0)) {
            return false;
        }
        yzg0 yzg0Var = (yzg0) obj;
        return u890.j(this.a, yzg0Var.a) && u890.j(this.b, yzg0Var.b) && u890.j(this.c, yzg0Var.c) && u890.j(this.d, yzg0Var.d) && this.e.equals(yzg0Var.e) && u890.j(this.f, yzg0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        int iD = cy30.d((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        tv80 tv80Var = this.f;
        return iD + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
