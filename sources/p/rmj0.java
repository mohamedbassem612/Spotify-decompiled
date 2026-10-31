package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rmj0 {
    public final kkj0 a;
    public final kkj0 b;
    public final kkj0 c;
    public final ArrayList d;
    public final kkj0 e;
    public final kkj0 f;
    public final kkj0 g;
    public final kkj0 h;
    public final jkj0 i;
    public final boolean j;
    public final kkj0 k;

    public rmj0(jkj0 jkj0Var, jkj0 jkj0Var2, jkj0 jkj0Var3, ArrayList arrayList, jkj0 jkj0Var4, jkj0 jkj0Var5, jkj0 jkj0Var6, jkj0 jkj0Var7, jkj0 jkj0Var8, boolean z, jkj0 jkj0Var9) {
        this.a = jkj0Var;
        this.b = jkj0Var2;
        this.c = jkj0Var3;
        this.d = arrayList;
        this.e = jkj0Var4;
        this.f = jkj0Var5;
        this.g = jkj0Var6;
        this.h = jkj0Var7;
        this.i = jkj0Var8;
        this.j = z;
        this.k = jkj0Var9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmj0)) {
            return false;
        }
        rmj0 rmj0Var = (rmj0) obj;
        return u890.j(this.a, rmj0Var.a) && u890.j(this.b, rmj0Var.b) && u890.j(this.c, rmj0Var.c) && this.d.equals(rmj0Var.d) && u890.j(this.e, rmj0Var.e) && u890.j(this.f, rmj0Var.f) && u890.j(this.g, rmj0Var.g) && u890.j(this.h, rmj0Var.h) && this.i.equals(rmj0Var.i) && this.j == rmj0Var.j && u890.j(this.k, rmj0Var.k);
    }

    public final int hashCode() {
        kkj0 kkj0Var = this.a;
        int iHashCode = (kkj0Var == null ? 0 : kkj0Var.hashCode()) * 31;
        kkj0 kkj0Var2 = this.b;
        int iHashCode2 = (iHashCode + (kkj0Var2 == null ? 0 : kkj0Var2.hashCode())) * 31;
        kkj0 kkj0Var3 = this.c;
        int iF = p3d1.f(this.d, (iHashCode2 + (kkj0Var3 == null ? 0 : kkj0Var3.hashCode())) * 31, 31);
        kkj0 kkj0Var4 = this.e;
        int iHashCode3 = (iF + (kkj0Var4 == null ? 0 : kkj0Var4.hashCode())) * 31;
        kkj0 kkj0Var5 = this.f;
        int iHashCode4 = (iHashCode3 + (kkj0Var5 == null ? 0 : kkj0Var5.hashCode())) * 31;
        kkj0 kkj0Var6 = this.g;
        int iHashCode5 = (iHashCode4 + (kkj0Var6 == null ? 0 : kkj0Var6.hashCode())) * 31;
        kkj0 kkj0Var7 = this.h;
        int iG = xcg1.g((this.i.hashCode() + ((iHashCode5 + (kkj0Var7 == null ? 0 : kkj0Var7.hashCode())) * 31)) * 31, 31, this.j);
        kkj0 kkj0Var8 = this.k;
        return iG + (kkj0Var8 != null ? kkj0Var8.hashCode() : 0);
    }
}
