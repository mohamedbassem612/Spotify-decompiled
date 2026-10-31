package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aim implements Function0 {
    public final mgo0 X;
    public final g371 Y;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final yh10 d;
    public final boolean e;
    public final iu30 f;
    public final boolean g;
    public final iu30 h;
    public final boolean i;
    public final boolean t;

    public aim(boolean z, boolean z2, boolean z3, yh10 yh10Var, boolean z4, iu30 iu30Var, boolean z5, iu30 iu30Var2, boolean z6, boolean z7, mgo0 mgo0Var, g371 g371Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = yh10Var;
        this.e = z4;
        this.f = iu30Var;
        this.g = z5;
        this.h = iu30Var2;
        this.i = z6;
        this.t = z7;
        this.X = mgo0Var;
        this.Y = g371Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aim)) {
            return false;
        }
        aim aimVar = (aim) obj;
        return this.a == aimVar.a && this.b == aimVar.b && this.c == aimVar.c && u890.j(this.d, aimVar.d) && this.e == aimVar.e && u890.j(this.f, aimVar.f) && this.g == aimVar.g && u890.j(this.h, aimVar.h) && this.i == aimVar.i && this.t == aimVar.t && u890.j(this.X, aimVar.X) && this.Y.equals(aimVar.Y);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        yh10 yh10Var = this.d;
        int iG2 = xcg1.g((iG + (yh10Var == null ? 0 : yh10Var.hashCode())) * 31, 31, this.e);
        iu30 iu30Var = this.f;
        int iG3 = xcg1.g((iG2 + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31, 31, this.g);
        iu30 iu30Var2 = this.h;
        int iG4 = xcg1.g(xcg1.g((iG3 + (iu30Var2 == null ? 0 : iu30Var2.hashCode())) * 31, 31, this.i), 31, this.t);
        mgo0 mgo0Var = this.X;
        return this.Y.a.hashCode() + ((iG4 + (mgo0Var != null ? mgo0Var.hashCode() : 0)) * 31);
    }

    public final Object invoke() {
        boolean z = this.a;
        return new tgm((String) null, this.b, this.i, z, !z, false, false, this.d, false, false, z ? 2 : 3, false, this.c, true, this.e, false, this.f, false, false, this.Y, (c821) null, this.g, (String) null, this.h, (p860) null, this.X, this.t, false, -1766443311, 1);
    }
}
