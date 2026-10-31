package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class blj0 {
    public final int a;
    public final vjj0 b;
    public final vjj0 c;
    public final vjj0 d;
    public final vjj0 e;
    public final vjj0 f;
    public final klj0 g;
    public final vjj0 h;
    public final vjj0 i;

    public blj0(int i, vjj0 vjj0Var, vjj0 vjj0Var2, vjj0 vjj0Var3, vjj0 vjj0Var4, vjj0 vjj0Var5, klj0 klj0Var, vjj0 vjj0Var6, vjj0 vjj0Var7, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        vjj0Var2 = (i2 & 4) != 0 ? null : vjj0Var2;
        vjj0Var3 = (i2 & 8) != 0 ? null : vjj0Var3;
        vjj0Var4 = (i2 & 16) != 0 ? null : vjj0Var4;
        vjj0Var5 = (i2 & 32) != 0 ? null : vjj0Var5;
        klj0Var = (i2 & 64) != 0 ? null : klj0Var;
        vjj0Var6 = (i2 & 128) != 0 ? null : vjj0Var6;
        vjj0Var7 = (i2 & 256) != 0 ? null : vjj0Var7;
        this.a = i;
        this.b = vjj0Var;
        this.c = vjj0Var2;
        this.d = vjj0Var3;
        this.e = vjj0Var4;
        this.f = vjj0Var5;
        this.g = klj0Var;
        this.h = vjj0Var6;
        this.i = vjj0Var7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof blj0) {
            blj0 blj0Var = (blj0) obj;
            if (this.a == blj0Var.a && this.b == blj0Var.b && u890.j(this.c, blj0Var.c) && u890.j(this.d, blj0Var.d) && u890.j(this.e, blj0Var.e) && u890.j(this.f, blj0Var.f) && u890.j(this.g, blj0Var.g) && u890.j(this.h, blj0Var.h) && u890.j(this.i, blj0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        vjj0 vjj0Var = this.c;
        int iHashCode2 = (iHashCode + (vjj0Var == null ? 0 : vjj0Var.hashCode())) * 31;
        vjj0 vjj0Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (vjj0Var2 == null ? 0 : vjj0Var2.hashCode())) * 31;
        vjj0 vjj0Var3 = this.e;
        int iHashCode4 = (iHashCode3 + (vjj0Var3 == null ? 0 : vjj0Var3.hashCode())) * 31;
        vjj0 vjj0Var4 = this.f;
        int iHashCode5 = (iHashCode4 + (vjj0Var4 == null ? 0 : vjj0Var4.hashCode())) * 31;
        klj0 klj0Var = this.g;
        int iHashCode6 = (iHashCode5 + (klj0Var == null ? 0 : klj0Var.hashCode())) * 31;
        vjj0 vjj0Var5 = this.h;
        int iHashCode7 = (iHashCode6 + (vjj0Var5 == null ? 0 : vjj0Var5.hashCode())) * 31;
        vjj0 vjj0Var6 = this.i;
        return iHashCode7 + (vjj0Var6 != null ? vjj0Var6.hashCode() : 0);
    }
}
