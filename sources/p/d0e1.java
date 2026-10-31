package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/d0e1;", "Lp/uim0;", "Lp/g0e1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class d0e1 extends uim0 {
    public final x9h X;
    public final m0e1 Y;
    public final iu30 Z;
    public final af5 a;
    public final lee1 b;
    public final f930 c;
    public final iu30 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final List i;
    public final iu30 t;

    public d0e1(af5 af5Var, lee1 lee1Var, f930 f930Var, iu30 iu30Var, int i, boolean z, int i2, int i3, List list, iu30 iu30Var2, x9h x9hVar, m0e1 m0e1Var, iu30 iu30Var3) {
        this.a = af5Var;
        this.b = lee1Var;
        this.c = f930Var;
        this.d = iu30Var;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.t = iu30Var2;
        this.X = x9hVar;
        this.Y = m0e1Var;
        this.Z = iu30Var3;
    }

    @Override // p.uim0
    public final pim0 a() {
        g0e1 g0e1Var = new g0e1();
        g0e1Var.O0 = this.a;
        g0e1Var.P0 = this.b;
        g0e1Var.Q0 = this.c;
        g0e1Var.R0 = this.d;
        g0e1Var.S0 = this.e;
        g0e1Var.T0 = this.f;
        g0e1Var.U0 = this.g;
        g0e1Var.V0 = this.h;
        g0e1Var.W0 = this.i;
        g0e1Var.X0 = this.t;
        g0e1Var.Y0 = this.X;
        g0e1Var.Z0 = this.Y;
        g0e1Var.a1 = this.Z;
        return g0e1Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        boolean z;
        g0e1 g0e1Var = (g0e1) pim0Var;
        x9h x9hVar = g0e1Var.Y0;
        x9h x9hVar2 = this.X;
        boolean zJ = u890.j(x9hVar2, x9hVar);
        g0e1Var.Y0 = x9hVar2;
        boolean z2 = false;
        boolean z3 = true;
        lee1 lee1Var = this.b;
        if (zJ) {
            lee1 lee1Var2 = g0e1Var.P0;
            if (lee1Var == lee1Var2) {
                lee1Var.getClass();
            } else if (!lee1Var.a.c(lee1Var2.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        String str = g0e1Var.O0.b;
        af5 af5Var = this.a;
        boolean zJ2 = u890.j(str, af5Var.b);
        boolean z4 = (zJ2 && u890.j(g0e1Var.O0.a, af5Var.a)) ? false : true;
        if (z4) {
            g0e1Var.O0 = af5Var;
        }
        if (!zJ2) {
            g0e1Var.e1 = null;
        }
        boolean z5 = !g0e1Var.P0.d(lee1Var);
        g0e1Var.P0 = lee1Var;
        List list = g0e1Var.W0;
        List list2 = this.i;
        if (!u890.j(list, list2)) {
            g0e1Var.W0 = list2;
            z5 = true;
        }
        int i = g0e1Var.V0;
        int i2 = this.h;
        if (i != i2) {
            g0e1Var.V0 = i2;
            z5 = true;
        }
        int i3 = g0e1Var.U0;
        int i4 = this.g;
        if (i3 != i4) {
            g0e1Var.U0 = i4;
            z5 = true;
        }
        boolean z6 = g0e1Var.T0;
        boolean z7 = this.f;
        if (z6 != z7) {
            g0e1Var.T0 = z7;
            z5 = true;
        }
        f930 f930Var = g0e1Var.Q0;
        f930 f930Var2 = this.c;
        if (!u890.j(f930Var, f930Var2)) {
            g0e1Var.Q0 = f930Var2;
            z5 = true;
        }
        int i5 = g0e1Var.S0;
        int i6 = this.e;
        if (i5 != i6) {
            g0e1Var.S0 = i6;
            z5 = true;
        }
        m0e1 m0e1Var = g0e1Var.Z0;
        m0e1 m0e1Var2 = this.Y;
        if (!u890.j(m0e1Var, m0e1Var2)) {
            g0e1Var.Z0 = m0e1Var2;
            z5 = true;
        }
        iu30 iu30Var = g0e1Var.R0;
        iu30 iu30Var2 = this.d;
        if (iu30Var != iu30Var2) {
            g0e1Var.R0 = iu30Var2;
            z2 = true;
        }
        iu30 iu30Var3 = g0e1Var.X0;
        iu30 iu30Var4 = this.t;
        if (iu30Var3 != iu30Var4) {
            g0e1Var.X0 = iu30Var4;
            z2 = true;
        }
        iu30 iu30Var5 = g0e1Var.a1;
        iu30 iu30Var6 = this.Z;
        if (iu30Var5 != iu30Var6) {
            g0e1Var.a1 = iu30Var6;
        } else {
            z3 = z2;
        }
        if (z4 || z5 || z3) {
            csm0 csm0VarH1 = g0e1Var.H1();
            af5 af5Var2 = g0e1Var.O0;
            lee1 lee1Var3 = g0e1Var.P0;
            f930 f930Var3 = g0e1Var.Q0;
            int i7 = g0e1Var.S0;
            boolean z8 = g0e1Var.T0;
            int i8 = g0e1Var.U0;
            int i9 = g0e1Var.V0;
            List list3 = g0e1Var.W0;
            m0e1 m0e1Var3 = g0e1Var.Z0;
            csm0VarH1.a = af5Var2;
            csm0VarH1.f(lee1Var3);
            csm0VarH1.b = f930Var3;
            csm0VarH1.c = i7;
            csm0VarH1.d = z8;
            csm0VarH1.e = i8;
            csm0VarH1.f = i9;
            csm0VarH1.g = list3;
            csm0VarH1.h = m0e1Var3;
            csm0VarH1.s = (csm0VarH1.s << 2) | 2;
            csm0VarH1.m = null;
            csm0VarH1.o = null;
            csm0VarH1.q = -1;
            csm0VarH1.f24p = -1;
            csm0VarH1.r = null;
        }
        if (g0e1Var.N0) {
            if (z4 || (z && g0e1Var.d1 != null)) {
                nko1.C(g0e1Var);
            }
            if (z4 || z5 || z3) {
                dio1.y(g0e1Var);
                ha71.x(g0e1Var);
            }
            if (z) {
                ha71.x(g0e1Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0e1)) {
            return false;
        }
        d0e1 d0e1Var = (d0e1) obj;
        return u890.j(this.X, d0e1Var.X) && u890.j(this.a, d0e1Var.a) && u890.j(this.b, d0e1Var.b) && u890.j(this.i, d0e1Var.i) && u890.j(this.c, d0e1Var.c) && this.d == d0e1Var.d && this.Z == d0e1Var.Z && this.e == d0e1Var.e && this.f == d0e1Var.f && this.g == d0e1Var.g && this.h == d0e1Var.h && this.t == d0e1Var.t;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + p3d1.h(this.b, this.a.hashCode() * 31, 31)) * 31;
        iu30 iu30Var = this.d;
        int iG = (((xcg1.g(kaa0.f(this.e, (iHashCode + (iu30Var != null ? iu30Var.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode2 = (iG + (list != null ? list.hashCode() : 0)) * 31;
        iu30 iu30Var2 = this.t;
        int iHashCode3 = (iHashCode2 + (iu30Var2 != null ? iu30Var2.hashCode() : 0)) * 961;
        x9h x9hVar = this.X;
        int iHashCode4 = (iHashCode3 + (x9hVar != null ? x9hVar.hashCode() : 0)) * 31;
        iu30 iu30Var3 = this.Z;
        return iHashCode4 + (iu30Var3 != null ? iu30Var3.hashCode() : 0);
    }
}
