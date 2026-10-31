package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yk90 {
    public final xk90 a;
    public final xk90 b;
    public final xk90 c;
    public final xk90 d;
    public final xk90 e;
    public final xk90 f;
    public final xk90 g;
    public final xk90 h;
    public final xk90 i;
    public final xk90 j;
    public final xk90 k;
    public final ArrayList l;
    public final float m;

    public yk90(xk90 xk90Var, xk90 xk90Var2, xk90 xk90Var3, xk90 xk90Var4, xk90 xk90Var5, xk90 xk90Var6, xk90 xk90Var7, xk90 xk90Var8, xk90 xk90Var9, xk90 xk90Var10, xk90 xk90Var11, ArrayList arrayList, float f) {
        this.a = xk90Var;
        this.b = xk90Var2;
        this.c = xk90Var3;
        this.d = xk90Var4;
        this.e = xk90Var5;
        this.f = xk90Var6;
        this.g = xk90Var7;
        this.h = xk90Var8;
        this.i = xk90Var9;
        this.j = xk90Var10;
        this.k = xk90Var11;
        this.l = arrayList;
        this.m = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yk90) {
            yk90 yk90Var = (yk90) obj;
            if (u890.j(this.a, yk90Var.a) && u890.j(this.b, yk90Var.b) && this.c == yk90Var.c && u890.j(this.d, yk90Var.d) && u890.j(this.e, yk90Var.e) && u890.j(this.f, yk90Var.f) && u890.j(this.g, yk90Var.g) && u890.j(this.h, yk90Var.h) && u890.j(this.i, yk90Var.i) && u890.j(this.j, yk90Var.j) && u890.j(this.k, yk90Var.k) && this.l.equals(yk90Var.l) && Float.compare(this.m, yk90Var.m) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        xk90 xk90Var = this.a;
        int iHashCode = (xk90Var == null ? 0 : xk90Var.hashCode()) * 31;
        xk90 xk90Var2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (xk90Var2 == null ? 0 : xk90Var2.hashCode())) * 31)) * 31;
        xk90 xk90Var3 = this.d;
        int iHashCode3 = (iHashCode2 + (xk90Var3 == null ? 0 : xk90Var3.hashCode())) * 31;
        xk90 xk90Var4 = this.e;
        int iHashCode4 = (iHashCode3 + (xk90Var4 == null ? 0 : xk90Var4.hashCode())) * 31;
        xk90 xk90Var5 = this.f;
        int iHashCode5 = (iHashCode4 + (xk90Var5 == null ? 0 : xk90Var5.hashCode())) * 31;
        xk90 xk90Var6 = this.g;
        int iHashCode6 = (iHashCode5 + (xk90Var6 == null ? 0 : xk90Var6.hashCode())) * 31;
        xk90 xk90Var7 = this.h;
        int iHashCode7 = (iHashCode6 + (xk90Var7 == null ? 0 : xk90Var7.hashCode())) * 31;
        xk90 xk90Var8 = this.i;
        int iHashCode8 = (iHashCode7 + (xk90Var8 == null ? 0 : xk90Var8.hashCode())) * 31;
        xk90 xk90Var9 = this.j;
        int iHashCode9 = (iHashCode8 + (xk90Var9 == null ? 0 : xk90Var9.hashCode())) * 31;
        xk90 xk90Var10 = this.k;
        return Float.hashCode(this.m) + p3d1.f(this.l, (iHashCode9 + (xk90Var10 != null ? xk90Var10.hashCode() : 0)) * 31, 31);
    }
}
