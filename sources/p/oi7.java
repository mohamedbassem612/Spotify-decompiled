package p;

import android.net.Uri;
import androidx.compose.ui.geometry.Size;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class oi7 {
    public static final kiv a = mod.t(df.i);

    public static final ni7 a(Uri uri, gw70 gw70Var, xb10 xb10Var, yqi1 yqi1Var, jmr0 jmr0Var, jmr0 jmr0Var2, boolean z, boolean z2, j6m j6mVar, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, long j, b0k b0kVar, int i, int i2, int i3) {
        gw70 gw70Var2;
        Size size;
        boolean z3;
        m4c m4cVar = fkj0.X;
        if ((i3 & 2) != 0) {
            gw70Var2 = (gw70) ((x340) b0kVar).k(a);
        } else {
            gw70Var2 = gw70Var;
        }
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == m4cVar) {
            objT = qxd0.M(o6x.a, x340Var);
            x340Var.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        xb10 xb10Var2 = (i3 & 8) != 0 ? null : xb10Var;
        yqi1 yqi1Var2 = (i3 & 16) != 0 ? null : yqi1Var;
        jmr0 jmr0Var3 = (i3 & 32) != 0 ? null : jmr0Var;
        jmr0 jmr0Var4 = (i3 & 64) != 0 ? null : jmr0Var2;
        boolean z4 = (i3 & 256) != 0 ? false : z;
        boolean z5 = (i3 & 512) != 0 ? false : z2;
        boolean z6 = (i3 & 1024) == 0;
        j6m j6mVar2 = (i3 & 2048) != 0 ? mif1.Q0 : j6mVar;
        iu30 iu30Var4 = (i3 & 4096) != 0 ? null : iu30Var;
        j6m j6mVar3 = j6mVar2;
        iu30 iu30Var5 = (i3 & 8192) != 0 ? null : iu30Var2;
        iu30 iu30Var6 = (i3 & 16384) != 0 ? null : iu30Var3;
        jmr0 jmr0Var5 = jmr0Var3;
        jmr0 jmr0Var6 = jmr0Var4;
        long j2 = (i3 & 32768) != 0 ? 9205357640488583168L : j;
        fns fnsVar = igu.a;
        iu30 iu30Var7 = iu30Var6;
        s3v s3vVar = new s3v(j2);
        if (j2 == 9205357640488583168L) {
            s3vVar = null;
        }
        if (s3vVar == null) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-1581104043);
            x340Var2.r(false);
            size = null;
        } else {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(-1581104042);
            long jK1 = ((wat) x340Var3.k(t4k.h)).k1(s3vVar.a);
            x340Var3.r(false);
            size = new Size(jK1);
        }
        of01 of01VarF = op71.F(b0kVar);
        boolean z7 = (((i & 14) ^ 6) > 4 && ((x340) b0kVar).g(uri)) || (i & 6) == 4;
        x340 x340Var4 = (x340) b0kVar;
        Object objT2 = x340Var4.T();
        if (z7 || objT2 == m4cVar) {
            ixg ixgVarB = gw70Var2.b(uri);
            vy70 vy70Var = ixgVarB.b;
            if (z4 || xb10Var2 != null) {
                ixgVarB.g = false;
            }
            if (z6) {
                AtomicLong atomicLong = ixg.j;
                tq30 tq30Var = new tq30();
                jc10 jc10Var = dz70.a;
                vy70Var.b().a(dz70.a, tq30Var);
            }
            if (size != null) {
                long j3 = size.a;
                z3 = true;
                ixgVarB.p(jch0.U(Float.intBitsToFloat((int) (j3 >> 32))), jch0.U(Float.intBitsToFloat((int) (j3 & 4294967295L))), 1);
            } else {
                z3 = true;
            }
            if (z5) {
                ixgVarB.e();
            } else if (size == null) {
                vy70Var.n = of01VarF;
            }
            objT2 = oqn1.n(ixgVarB, ixgVarB.a());
            x340Var4.s0(objT2);
        } else {
            fnsVar = fnsVar;
            m4cVar = m4cVar;
            z3 = true;
        }
        mmr0 mmr0Var = (mmr0) objT2;
        ixg ixgVar = (ixg) mmr0Var.a;
        zy70 zy70Var = (zy70) mmr0Var.b;
        rf01 rf01Var = ixgVar.a;
        boolean z8 = ((((i2 & 896) ^ 384) <= 256 || !x340Var4.g(iu30Var4)) && (i2 & 384) != 256) ? false : z3;
        if ((((i & 7168) ^ 3072) <= 2048 || !x340Var4.g(xb10Var2)) && (i & 3072) != 2048) {
            z3 = false;
        }
        fns fnsVar2 = fnsVar;
        boolean zI = z8 | z3 | x340Var4.i(c9nVar) | x340Var4.i(yqi1Var2) | x340Var4.i(fnsVar2);
        Object objT3 = x340Var4.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new uh0(iu30Var4, xb10Var2, c9nVar, yqi1Var2, fnsVar2, (byte) 10);
            x340Var4.s0(objT3);
        }
        return rqo1.t(zy70Var, rf01Var, jmr0Var5, jmr0Var6, iu30Var7, (iu30) objT3, iu30Var5, j6mVar3, x340Var4);
    }
}
