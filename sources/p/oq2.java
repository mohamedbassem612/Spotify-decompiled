package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class oq2 {
    public static final cr31 a = er31.a(50);

    public static final void a(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        int i2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-403043730);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0VarQ = i1p1.q(qim0Var, a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
            hzj.A.getClass();
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
            Integer numValueOf = Integer.valueOf(((i3 >> 6) & 112) | 6);
            h2c h2cVar = h2c.a;
            j2iVar.invoke(h2cVar, x340Var, numValueOf);
            if (z) {
                x340Var.i0(-1396702331);
                b(h2cVar.b(nim0.a), x340Var, (i3 >> 3) & 112);
                x340Var.r(false);
            } else {
                x340Var.i0(-1396620646);
                x340Var.r(false);
            }
            x340Var.r(true);
            z3 = true;
        } else {
            x340Var.b0();
            z3 = z2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kq2(qim0Var, z, z3, j2iVar, i);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-40807132);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(true) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Float fValueOf = Float.valueOf(0.0f);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new c6(2, (lnm) null);
                x340Var.s0(objT);
            }
            ven0 ven0VarP = yto.p(fValueOf, true, (vu30) objT, x340Var, i3 | 6);
            boolean zI = x340Var.i(ven0VarP);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new lq2(ven0VarP, (byte) 0);
                x340Var.s0(objT2);
            }
            j0o1.b(i2 & 14, x340Var, (iu30) objT2, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2(qim0Var, i, (byte) 0);
        }
    }

    public static final void c(DrawScope drawScope, pq2 pq2Var, float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f + pq2Var.a)) << 32) | (((long) Float.floatToRawIntBits(f2 + pq2Var.b)) & 4294967295L);
        float f3 = pq2Var.c;
        if (f3 < 1.0f) {
            f3 = 1.0f;
        }
        float f4 = pq2Var.d;
        float f5 = f4 < 1.0f ? 1.0f : f4;
        qoz0 qoz0Var = new qoz0(f5, jFloatToRawIntBits, p7h.M(new u7h[]{new u7h(u7h.b(pq2Var.e, 0.15f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(pq2Var.e, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), (List) null);
        cab cabVarA1 = drawScope.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            ((dg8) cabVarA1.b).t(f3 / f5, 1.0f, jFloatToRawIntBits);
            DrawScope.o(drawScope, qoz0Var, f5, jFloatToRawIntBits, 0.0f, (phc1) null, 120);
        } finally {
            i3a.n(cabVarA1, jU);
        }
    }
}
