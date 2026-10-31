package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mk2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ rk2 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk2(Function0 function0, rk2 rk2Var) {
        super(2);
        this.c = function0;
        this.b = rk2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        vu30 vu30Var;
        llj lljVar;
        x340 x340Var;
        vu30 vu30Var2;
        float f;
        float f2;
        x340 x340Var2;
        x340 x340Var3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z50 z50Var = z50.c;
        Function0 function0 = this.c;
        rk2 rk2Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var4 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    foo1.c(new gbx(z50Var, function0), ldx.c, null, null, null, null, null, null, null, null, apo.r(-551193386, new lk2(rk2Var, (byte) 0), x340Var5), x340Var5, 0, 48, 2044);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            default:
                x340 x340Var6 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var7 = x340Var6;
                boolean zY = x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                j06 j06Var = x340Var7.a;
                if (!zY) {
                    x340Var7.b0();
                    return rih1Var;
                }
                nim0 nim0Var = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                int i = rk2Var.d;
                String str = rk2Var.c;
                qim0 qim0VarF = dug.f(qim0VarD, z4p1.e(i), d4o1.a);
                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var7, 0);
                int iHashCode = Long.hashCode(x340Var7.T);
                xos0 xos0VarM = x340Var7.m();
                qim0 qim0VarE = zr7.E(x340Var7, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                boolean z2 = x340Var7.S;
                n4k n4kVar = hmb0.t1;
                if (z2) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                llj lljVar2 = y580.O0;
                nko1.H(mbhVarA, x340Var7, lljVar2);
                vu30 vu30Var3 = y580.N0;
                nko1.H(xos0VarM, x340Var7, vu30Var3);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var7, lljVar3);
                nko1.F(x340Var7);
                vu30 vu30Var4 = y580.Y;
                nko1.H(qim0VarE, x340Var7, vu30Var4);
                boolean z3 = rk2Var.t;
                int i2 = rk2Var.f;
                int i3 = rk2Var.e;
                if (str != null) {
                    x340Var7.i0(1319703075);
                    vu30Var2 = vu30Var3;
                    lljVar = lljVar3;
                    z = z3;
                    vu30Var = vu30Var4;
                    eso1.e(Uri.parse(str), isl.a, u291.h(u291.f(nim0Var, 1.0f), 240.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var7, 199728, 0, 3984);
                    x340Var = x340Var7;
                    x340Var.r(false);
                } else {
                    z = z3;
                    vu30Var = vu30Var4;
                    lljVar = lljVar3;
                    x340Var = x340Var7;
                    vu30Var2 = vu30Var3;
                    x340Var.i0(1320003868);
                    x340Var.r(false);
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 16.0f));
                if (i3 != 0) {
                    x340Var.i0(1320110074);
                    String strO0 = cwl1.o0(x340Var, i3);
                    lee1 lee1Var = cbx.d(x340Var).c;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    f2 = 0.0f;
                    x340 x340Var8 = x340Var;
                    f = 16.0f;
                    uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, nim0Var), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var8, 0, 0, 2040);
                    x340Var = x340Var8;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    x0d.s(nim0Var, 12.0f, x340Var, false);
                } else {
                    f = 16.0f;
                    f2 = 0.0f;
                    x340Var.i0(1320388764);
                    x340Var.r(false);
                }
                if (i2 != 0) {
                    x340Var.i0(1320437713);
                    String strO1 = cwl1.o0(x340Var, i2);
                    lee1 lee1Var2 = cbx.d(x340Var).g;
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    x340 x340Var9 = x340Var;
                    uwo1.e(strO1, uyn1.z(f, f2, 2, nim0Var), lee1Var2, 0L, null, null, 0, false, null, 0, null, x340Var9, 0, 0, 2040);
                    x340Var2 = x340Var9;
                    x340Var2.r(false);
                } else {
                    x340Var2 = x340Var;
                    x340Var2.i0(1320640732);
                    x340Var2.r(false);
                }
                kk0.s(1.0f, true, x340Var2);
                gra graVar = een.h;
                cvx cvxVar5 = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar2);
                nko1.H(xos0VarM2, x340Var2, vu30Var2);
                x0d.q(iHashCode2, x340Var2, lljVar, x340Var2);
                nko1.H(qim0VarE2, x340Var2, vu30Var);
                if (z) {
                    x340Var2.i0(-1053925636);
                    x340 x340Var10 = x340Var2;
                    xto1.e(null, 6, cbx.a(x340Var2).b.a, 0L, x340Var10, 48, 9);
                    x340Var3 = x340Var10;
                    x340Var3.r(false);
                } else {
                    x340Var3 = x340Var2;
                    x340Var3.i0(-1053766110);
                    x340Var3.r(false);
                }
                if (rk2Var.g != 0) {
                    x340Var3.i0(-1053704947);
                    x340 x340Var11 = x340Var3;
                    foo1.c(new gbx(z50Var, function0), new idx(), null, z ? new hax("Loading") : jax.a, null, null, null, null, null, null, apo.r(-151654609, new lk2(rk2Var, (byte) 1), x340Var3), x340Var11, 0, 48, 2028);
                    x340Var3 = x340Var11;
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1053315742);
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                x340Var3.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk2(rk2 rk2Var, Function0 function0) {
        super(2);
        this.b = rk2Var;
        this.c = function0;
    }
}
