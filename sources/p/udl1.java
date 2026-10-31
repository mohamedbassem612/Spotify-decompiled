package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class udl1 {
    public final uia a;
    public final int b;
    public final float c;
    public final jel1 d;
    public final int e;
    public final lel1 f;
    public final jti0 g;
    public final int h;
    public final zge1 i;
    public final float j;
    public final float k;
    public final List l;
    public final float m;

    public udl1(uia uiaVar, int i, float f, jel1 jel1Var, int i2, lel1 lel1Var, jti0 jti0Var, int i3, zge1 zge1Var, float f2, float f3, List list, float f4) {
        this.a = uiaVar;
        this.b = i;
        this.c = f;
        this.d = jel1Var;
        this.e = i2;
        this.f = lel1Var;
        this.g = jti0Var;
        this.h = i3;
        this.i = zge1Var;
        this.j = f2;
        this.k = f3;
        this.l = list;
        this.m = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof udl1) {
            udl1 udl1Var = (udl1) obj;
            if (u890.j(this.a, udl1Var.a) && this.b == udl1Var.b && Float.compare(this.c, udl1Var.c) == 0 && u890.j(this.d, udl1Var.d) && this.e == udl1Var.e && u890.j(this.f, udl1Var.f) && this.g == udl1Var.g && this.h == udl1Var.h && u890.j(this.i, udl1Var.i) && Float.compare(this.j, udl1Var.j) == 0 && Float.compare(this.k, udl1Var.k) == 0 && u890.j(this.l, udl1Var.l) && Float.compare(this.m, udl1Var.m) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        uia uiaVar = this.a;
        int iF = x0d.f(kaa0.f(this.b, (uiaVar == null ? 0 : uiaVar.hashCode()) * 31, 31), 31, this.c);
        jel1 jel1Var = this.d;
        int iK = ab80.k(this.h, (this.g.hashCode() + ((this.f.hashCode() + kaa0.f(this.e, (iF + (jel1Var == null ? 0 : jel1Var.hashCode())) * 31, 31)) * 31)) * 31, 31);
        zge1 zge1Var = this.i;
        return Float.hashCode(this.m) + f4i1.b(x0d.f(x0d.f((iK + (zge1Var != null ? zge1Var.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31, this.l);
    }
}
