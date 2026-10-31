package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ziu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final diu f;
    public final int g;

    public ziu(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, diu diuVar, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = diuVar;
        this.g = i;
    }

    public static ziu a(ziu ziuVar, boolean z, boolean z2, boolean z3, boolean z4, diu diuVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = ziuVar.a;
        }
        boolean z5 = z;
        boolean z6 = ziuVar.b;
        if ((i2 & 4) != 0) {
            z2 = ziuVar.c;
        }
        boolean z7 = z2;
        if ((i2 & 8) != 0) {
            z3 = ziuVar.d;
        }
        boolean z8 = z3;
        if ((i2 & 16) != 0) {
            z4 = ziuVar.e;
        }
        boolean z9 = z4;
        if ((i2 & 32) != 0) {
            diuVar = ziuVar.f;
        }
        diu diuVar2 = diuVar;
        if ((i2 & 64) != 0) {
            i = ziuVar.g;
        }
        return new ziu(z5, z6, z7, z8, z9, diuVar2, i);
    }

    public final kp0 b(Function0 function0, boolean z, boolean z2) {
        cs10 cs10Var = new cs10(z2);
        diu diuVar = this.f;
        return new kp0(cs10Var, ila0.r(diuVar.e), diuVar.c.a, diuVar.a, diuVar.f, diuVar.b, diuVar.g.getValue(), diuVar.h, diuVar.i, z, new xet(function0, (byte) 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziu)) {
            return false;
        }
        ziu ziuVar = (ziu) obj;
        return this.a == ziuVar.a && this.b == ziuVar.b && this.c == ziuVar.c && this.d == ziuVar.d && this.e == ziuVar.e && this.f.equals(ziuVar.f) && this.g == ziuVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ((this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }
}
