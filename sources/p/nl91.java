package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nl91 {
    public final int a;
    public final String b;
    public final if81 c;
    public final if81 d;
    public final if81 e;
    public final if81 f;
    public final if81 g;
    public final int h;
    public final if81 i;
    public final if81 j;
    public final int k;
    public final Set l;
    public final boolean m;
    public final int n;
    public final int o;

    public nl91(int i, String str, if81 if81Var, if81 if81Var2, if81 if81Var3, if81 if81Var4, if81 if81Var5, int i2, if81 if81Var6, if81 if81Var7, int i3, Set set, boolean z, int i4, int i5) {
        this.a = i;
        this.b = str;
        this.c = if81Var;
        this.d = if81Var2;
        this.e = if81Var3;
        this.f = if81Var4;
        this.g = if81Var5;
        this.h = i2;
        this.i = if81Var6;
        this.j = if81Var7;
        this.k = i3;
        this.l = set;
        this.m = z;
        this.n = i4;
        this.o = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl91)) {
            return false;
        }
        nl91 nl91Var = (nl91) obj;
        return this.a == nl91Var.a && u890.j(this.b, nl91Var.b) && this.c == nl91Var.c && this.d == nl91Var.d && this.e == nl91Var.e && this.f == nl91Var.f && this.g == nl91Var.g && this.h == nl91Var.h && this.i == nl91Var.i && this.j == nl91Var.j && this.k == nl91Var.k && this.l.equals(nl91Var.l) && this.m == nl91Var.m && this.n == nl91Var.n && this.o == nl91Var.o;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31)) * 31;
        if81 if81Var = this.f;
        int iHashCode2 = (iHashCode + (if81Var == null ? 0 : if81Var.hashCode())) * 31;
        if81 if81Var2 = this.g;
        int iHashCode3 = (iHashCode2 + (if81Var2 == null ? 0 : if81Var2.hashCode())) * 31;
        int i = this.h;
        int iC = (iHashCode3 + (i == 0 ? 0 : l1d.C(i))) * 31;
        if81 if81Var3 = this.i;
        int iHashCode4 = (iC + (if81Var3 == null ? 0 : if81Var3.hashCode())) * 31;
        if81 if81Var4 = this.j;
        int iHashCode5 = (iHashCode4 + (if81Var4 == null ? 0 : if81Var4.hashCode())) * 31;
        int i2 = this.k;
        int iK = ab80.k(this.n, xcg1.g(gvg.c((iHashCode5 + (i2 == 0 ? 0 : l1d.C(i2))) * 31, 31, this.l), 31, this.m), 31);
        int i3 = this.o;
        return iK + (i3 != 0 ? l1d.C(i3) : 0);
    }
}
