package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fy81 {
    public static final k960 a = new k960(0.82f, 0.82f);

    public static final void a(k37 k37Var, float f, qim0 qim0Var, float f2, b0k b0kVar, int i, int i2) {
        int i3;
        float f3;
        float f4;
        boolean z;
        boolean z2 = k37Var.b;
        String str = k37Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-569171808);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(k37Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f3 = f2;
                int i4 = x340Var.d(f3) ? 2048 : 1024;
                i3 |= i4;
            } else {
                f3 = f2;
            }
            i3 |= i4;
        } else {
            f3 = f2;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                i3 &= -7169;
                f3 = 48.0f;
            }
            float f5 = f3;
            x340Var.s();
            float f6 = 0.82f * f;
            qim0 qim0VarR = u291.r(qim0Var, f6);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
            hzj.A.getClass();
            zvx zvxVar = null;
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (str.length() == 0) {
                x340Var.i0(1983284068);
                z1a1.c(k37Var.c, f6, (qim0) null, k37Var.b, f5, x340Var, (i3 << 3) & 57344, 4);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(1983487583);
                Uri uri = Uri.parse(str);
                if (z2) {
                    x340Var.i0(1983657431);
                } else {
                    x340Var.i0(756726477);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar = cbx.b(x340Var).f;
                    cua cuaVar2 = cbx.b(x340Var).f;
                    zvxVar = new zvx();
                }
                x340Var.r(false);
                zvx zvxVar2 = zvxVar;
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                qim0 qim0VarQ = nim0.a;
                qim0 qim0VarR2 = u291.r(qim0VarQ, f6);
                if (z2) {
                    qim0VarQ = i1p1.q(qim0VarQ, er31.a);
                }
                z = true;
                eso1.e(uri, isl.a, qim0VarR2.then(qim0VarQ), (p3v) null, zvxVar2, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 3120, 0, 4032);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(z);
            f4 = f5;
        } else {
            x340Var.b0();
            f4 = f3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vc60(k37Var, f, qim0Var, f4, i, i2, (byte) 1);
        }
    }
}
