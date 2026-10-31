package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/gee1;", "Lp/uim0;", "Lp/jee1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class gee1 extends uim0 {
    public final String a;
    public final lee1 b;
    public final f930 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final x9h h;

    public gee1(String str, lee1 lee1Var, f930 f930Var, int i, boolean z, int i2, int i3, x9h x9hVar) {
        this.a = str;
        this.b = lee1Var;
        this.c = f930Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = x9hVar;
    }

    public final pim0 a() {
        jee1 jee1Var = new jee1();
        jee1Var.O0 = this.a;
        jee1Var.P0 = this.b;
        jee1Var.Q0 = this.c;
        jee1Var.R0 = this.d;
        jee1Var.S0 = this.e;
        jee1Var.T0 = this.f;
        jee1Var.U0 = this.g;
        jee1Var.V0 = this.h;
        return jee1Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    public final void b(pim0 pim0Var) {
        boolean z;
        jee1 jee1Var = (jee1) pim0Var;
        x9h x9hVar = jee1Var.V0;
        x9h x9hVar2 = this.h;
        boolean zJ = u890.j(x9hVar2, x9hVar);
        jee1Var.V0 = x9hVar2;
        boolean z2 = false;
        boolean z3 = true;
        lee1 lee1Var = this.b;
        if (zJ) {
            lee1 lee1Var2 = jee1Var.P0;
            if (lee1Var == lee1Var2) {
                lee1Var.getClass();
            } else if (!lee1Var.a.c(lee1Var2.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        String str = jee1Var.O0;
        String str2 = this.a;
        if (!u890.j(str, str2)) {
            jee1Var.O0 = str2;
            jee1Var.Z0 = null;
            z2 = true;
        }
        boolean z4 = !jee1Var.P0.d(lee1Var);
        jee1Var.P0 = lee1Var;
        int i = jee1Var.U0;
        int i2 = this.g;
        if (i != i2) {
            jee1Var.U0 = i2;
            z4 = true;
        }
        int i3 = jee1Var.T0;
        int i4 = this.f;
        if (i3 != i4) {
            jee1Var.T0 = i4;
            z4 = true;
        }
        boolean z5 = jee1Var.S0;
        boolean z6 = this.e;
        if (z5 != z6) {
            jee1Var.S0 = z6;
            z4 = true;
        }
        f930 f930Var = jee1Var.Q0;
        f930 f930Var2 = this.c;
        if (!u890.j(f930Var, f930Var2)) {
            jee1Var.Q0 = f930Var2;
            z4 = true;
        }
        int i5 = jee1Var.R0;
        int i6 = this.d;
        if (i5 == i6) {
            z3 = z4;
        } else {
            jee1Var.R0 = i6;
        }
        if (z2 || z3) {
            xor0 xor0VarH1 = jee1Var.H1();
            String str3 = jee1Var.O0;
            lee1 lee1Var3 = jee1Var.P0;
            f930 f930Var3 = jee1Var.Q0;
            int i7 = jee1Var.R0;
            boolean z7 = jee1Var.S0;
            int i8 = jee1Var.T0;
            int i9 = jee1Var.U0;
            xor0VarH1.a = str3;
            xor0VarH1.b = lee1Var3;
            xor0VarH1.c = f930Var3;
            xor0VarH1.d = i7;
            xor0VarH1.e = z7;
            xor0VarH1.f = i8;
            xor0VarH1.g = i9;
            xor0VarH1.s = (xor0VarH1.s << 2) | 2;
            xor0VarH1.c();
        }
        if (((pim0) jee1Var).N0) {
            if (z2 || (z && jee1Var.Y0 != null)) {
                nko1.C(jee1Var);
            }
            if (z2 || z3) {
                dio1.y(jee1Var);
                ha71.x(jee1Var);
            }
            if (z) {
                ha71.x(jee1Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gee1)) {
            return false;
        }
        gee1 gee1Var = (gee1) obj;
        return u890.j(this.h, gee1Var.h) && u890.j(this.a, gee1Var.a) && u890.j(this.b, gee1Var.b) && u890.j(this.c, gee1Var.c) && this.d == gee1Var.d && this.e == gee1Var.e && this.f == gee1Var.f && this.g == gee1Var.g;
    }

    public final int hashCode() {
        int iG = (((xcg1.g(kaa0.f(this.d, (this.c.hashCode() + p3d1.h(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
        x9h x9hVar = this.h;
        return iG + (x9hVar != null ? x9hVar.hashCode() : 0);
    }
}
