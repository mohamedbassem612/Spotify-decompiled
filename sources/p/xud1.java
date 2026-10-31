package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xud1 {
    public final xsq a;
    public final d0r b;
    public final kly0 c;
    public final w35 d;
    public final gw10 e;
    public final i8h1 f;

    public xud1(xsq xsqVar, d0r d0rVar, tsq tsqVar, w35 w35Var, gw10 gw10Var, i8h1 i8h1Var) {
        this.a = xsqVar;
        this.b = d0rVar;
        this.c = tsqVar;
        this.d = w35Var;
        this.e = gw10Var;
        this.f = i8h1Var;
    }

    public final void a(sud1 sud1Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2041844074);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(sud1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(nim0.a) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gw10 gw10Var = this.e;
            if (((ew10) rwq.h(gw10Var.f, x340Var, 0).getValue()) == null) {
                x340Var.i0(1045305043);
                x340Var.r(false);
            } else {
                x340Var.i0(1045305044);
                boolean zI = x340Var.i(this);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new wud1(this, (byte) 0);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean zI2 = x340Var.i(this);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new wud1(this, (byte) 1);
                    x340Var.s0(objT2);
                }
                xto.b(function0, (Function0) objT2, x340Var, 0);
                x340Var.r(false);
            }
            ven0 ven0VarH = rwq.h(gw10Var.b, x340Var, 0);
            az20 az20Var = (az20) x340Var.k(t4k.i);
            boolean z2 = ((uv10) ven0VarH.getValue()) instanceof sv10;
            boolean zI3 = x340Var.i(az20Var);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new st61(az20Var, (byte) 1);
                x340Var.s0(objT3);
            }
            q3p1.b(0, 0, (Function0) objT3, x340Var, z2);
            gfx.b(5, apo.r(-1653300981, new ofi0(az20Var, sud1Var, this, z, iu30Var), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0(this, sud1Var, z, iu30Var, i);
        }
    }

    public final void b(sud1 sud1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-347376112);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(sud1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            int i5 = i3 << 3;
            a(sud1Var, this.d.d(), iu30Var, x340Var, (i5 & 57344) | i4 | (i5 & 896) | (i5 & 7168));
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, this, sud1Var, iu30Var, qim0Var2, (byte) 9);
        }
    }
}
