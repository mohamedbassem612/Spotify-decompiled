package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class upk1 implements h0r0 {
    public final yuj a;
    public final iqk1 b;
    public final pqk1 c;
    public final Function0 d;
    public final qpj1 e;
    public final los f;
    public final cbr0 g;

    public upk1(Resources resources, yuj yujVar, iqk1 iqk1Var, pqk1 pqk1Var, Function0 function0, qpj1 qpj1Var, los losVar) {
        this.a = yujVar;
        this.b = iqk1Var;
        this.c = pqk1Var;
        this.d = function0;
        this.e = qpj1Var;
        this.f = losVar;
        dbr0 t1r0Var = new t1r0(true);
        dbr0 stm0Var = new stm0();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{t1r0Var, stm0Var, new bn70(yon1.l0(), nik1.r6, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.66f)), ixb.a, (Integer) null, 2, (mxb) null, losVar, false, false, false, (nsm0) null, 4052)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        m6e0 m6e0VarG = f4p1.g(this.b);
        n7e0 n7e0Var = new n7e0(new spk1(this), olj1.b1, u9x0.W0);
        return yuj.b(this.a, m6e0VarG, apo.j(1143491881, new zyf1(this, (byte) 24), true), n7e0Var);
    }

    public final void c(zau0 zau0Var, gfu0 gfu0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        Object mxj1Var;
        m4c m4cVar;
        Long l;
        Long lValueOf;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1150913373);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(zau0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(gfu0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(this) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            tob1 tob1VarB = qxy0.B(zau0Var, x340Var2);
            ven0 ven0VarJ = xto.j(zau0Var.b, x340Var2);
            Object objT = x340Var2.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = xto.t((Object) null);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            r091 r091Var = (r091) tob1VarB.getValue();
            Long lValueOf2 = gfu0Var != null ? Long.valueOf(gfu0Var.a()) : null;
            int i3 = i2 & 112;
            boolean zI = x340Var2.i(tob1VarB) | (i3 == 32) | x340Var2.i(ven0Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar2) {
                m4cVar = m4cVar2;
                l = lValueOf2;
                lValueOf = null;
                mxj1Var = new mxj1(gfu0Var, tob1VarB, ven0Var, (lnm) null, (byte) 1);
                x340Var2.s0(mxj1Var);
            } else {
                m4cVar = m4cVar2;
                mxj1Var = objT2;
                l = lValueOf2;
                lValueOf = null;
            }
            qxd0.s(r091Var, l, (vu30) mxj1Var, x340Var2);
            Boolean bool = (Boolean) ven0VarJ.getValue();
            bool.booleanValue();
            r091 r091Var2 = (r091) tob1VarB.getValue();
            if (gfu0Var != null) {
                lValueOf = Long.valueOf(gfu0Var.a());
            }
            boolean zI2 = x340Var2.i(ven0VarJ) | x340Var2.i(tob1VarB) | (i3 == 32) | x340Var2.i(this) | ((i2 & 896) == 256);
            Object objT3 = x340Var2.T();
            if (zI2 || objT3 == m4cVar) {
                x340Var = x340Var2;
                rxa rxaVar = new rxa((byte) 3, gfu0Var, ven0VarJ, tob1VarB, this, iu30Var, (lnm) null);
                x340Var.s0(rxaVar);
                objT3 = rxaVar;
            } else {
                x340Var = x340Var2;
            }
            qxd0.r(bool, r091Var2, lValueOf, (vu30) objT3, x340Var);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, zau0Var, gfu0Var, iu30Var, (byte) 29);
        }
    }
}
