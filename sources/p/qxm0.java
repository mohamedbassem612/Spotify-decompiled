package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qxm0 {
    public final int a;
    public final Integer b;
    public final String c;
    public final Integer d;
    public final b2i e;
    public final mr20 f;
    public final wxm0 g;

    public qxm0(int i, Integer num, Integer num2, b2i b2iVar, mr20 mr20Var, wxm0 wxm0Var, int i2) {
        num = (i2 & 2) != 0 ? null : num;
        String str = (i2 & 4) != 0 ? null : "Unavailable option 1";
        num2 = (i2 & 8) != 0 ? null : num2;
        b2iVar = (i2 & 32) != 0 ? null : b2iVar;
        mr20Var = (i2 & 64) != 0 ? new huz(iax.a, (byte) 10) : mr20Var;
        wxm0Var = (i2 & 512) != 0 ? null : wxm0Var;
        this.a = i;
        this.b = num;
        this.c = str;
        this.d = num2;
        this.e = b2iVar;
        this.f = mr20Var;
        this.g = wxm0Var;
        ero1.s(new Object[]{num, str}, fsm0.d);
        ero1.r(new Object[]{num2, null, b2iVar}, fsm0.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxm0)) {
            return false;
        }
        qxm0 qxm0Var = (qxm0) obj;
        return this.a == qxm0Var.a && u890.j(this.b, qxm0Var.b) && u890.j(this.c, qxm0Var.c) && u890.j(this.d, qxm0Var.d) && u890.j(this.e, qxm0Var.e) && this.f.equals(qxm0Var.f) && u890.j(this.g, qxm0Var.g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 961;
        b2i b2iVar = this.e;
        int iHashCode5 = (this.f.hashCode() + ((iHashCode4 + (b2iVar == null ? 0 : b2iVar.hashCode())) * 31)) * 29791;
        wxm0 wxm0Var = this.g;
        return iHashCode5 + (wxm0Var != null ? wxm0Var.hashCode() : 0);
    }
}
