package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fqq0 {
    public final as3 a;
    public final dia1 b;
    public final jf20 c;
    public final mml d;
    public final Boolean e;
    public final fab0 f;
    public final a3t0 g;
    public final Boolean h;
    public final Boolean i;

    public /* synthetic */ fqq0(as3 as3Var, dia1 dia1Var, jf20 jf20Var, mml mmlVar, Boolean bool, fab0 fab0Var, a3t0 a3t0Var, Boolean bool2, Boolean bool3, int i) {
        this((i & 1) != 0 ? null : as3Var, (i & 2) != 0 ? null : dia1Var, (i & 4) != 0 ? null : jf20Var, (i & 8) != 0 ? null : mmlVar, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : fab0Var, (i & 64) != 0 ? null : a3t0Var, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3);
    }

    public static fqq0 a(fqq0 fqq0Var, as3 as3Var, a3t0 a3t0Var, Boolean bool, int i) {
        if ((i & 1) != 0) {
            as3Var = fqq0Var.a;
        }
        as3 as3Var2 = as3Var;
        dia1 dia1Var = fqq0Var.b;
        jf20 jf20Var = fqq0Var.c;
        mml mmlVar = fqq0Var.d;
        Boolean bool2 = fqq0Var.e;
        fab0 fab0Var = fqq0Var.f;
        if ((i & 64) != 0) {
            a3t0Var = fqq0Var.g;
        }
        a3t0 a3t0Var2 = a3t0Var;
        if ((i & 128) != 0) {
            bool = fqq0Var.h;
        }
        return new fqq0(as3Var2, dia1Var, jf20Var, mmlVar, bool2, fab0Var, a3t0Var2, bool, fqq0Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqq0)) {
            return false;
        }
        fqq0 fqq0Var = (fqq0) obj;
        return this.a == fqq0Var.a && this.b == fqq0Var.b && u890.j(this.c, fqq0Var.c) && u890.j(this.d, fqq0Var.d) && u890.j(this.e, fqq0Var.e) && u890.j(this.f, fqq0Var.f) && this.g == fqq0Var.g && u890.j(this.h, fqq0Var.h) && u890.j(this.i, fqq0Var.i);
    }

    public final int hashCode() {
        as3 as3Var = this.a;
        int iHashCode = (as3Var == null ? 0 : as3Var.hashCode()) * 31;
        dia1 dia1Var = this.b;
        int iHashCode2 = (iHashCode + (dia1Var == null ? 0 : dia1Var.hashCode())) * 31;
        jf20 jf20Var = this.c;
        int iHashCode3 = (iHashCode2 + (jf20Var == null ? 0 : jf20Var.hashCode())) * 31;
        mml mmlVar = this.d;
        int iHashCode4 = (iHashCode3 + (mmlVar == null ? 0 : mmlVar.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        fab0 fab0Var = this.f;
        int iHashCode6 = (iHashCode5 + (fab0Var == null ? 0 : fab0Var.hashCode())) * 31;
        a3t0 a3t0Var = this.g;
        int iHashCode7 = (iHashCode6 + (a3t0Var == null ? 0 : a3t0Var.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        return iHashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public fqq0(as3 as3Var, dia1 dia1Var, jf20 jf20Var, mml mmlVar, Boolean bool, fab0 fab0Var, a3t0 a3t0Var, Boolean bool2, Boolean bool3) {
        this.a = as3Var;
        this.b = dia1Var;
        this.c = jf20Var;
        this.d = mmlVar;
        this.e = bool;
        this.f = fab0Var;
        this.g = a3t0Var;
        this.h = bool2;
        this.i = bool3;
    }
}
