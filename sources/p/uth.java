package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uth extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uth(Function0 function0, vu30 vu30Var, Function0 function1, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = vu30Var;
        this.d = function1;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object invoke(Object obj, Object obj2) {
        ?? r5;
        boolean z;
        ?? r6;
        boolean z2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h44 h44Var = h44.b;
        n4k n4kVar = hmb0.t1;
        Function0 function0 = this.d;
        vu30 vu30Var = this.c;
        Function0 function1 = this.b;
        b36 b36Var = h36.g;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarF = u291.f(uyn1.x(nim0Var, 6.0f), 1.0f);
                    fra fraVar = een.Z;
                    jw31 jw31VarA = ew31.a(b36Var, fraVar, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = bmh.X;
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarB = uyn1.B(s161.b(nim0Var, false, (iu30) objT), 12.0f, 0.0f, 16.0f, 0.0f, 10);
                    vq60 vq60Var = jw80.a;
                    r2p1.a(qim0VarB.then(tsj0.a), x340Var2, 0);
                    jw31 jw31VarA2 = ew31.a(new d36(6.0f, true, new um5(false)), fraVar, x340Var2, 0);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA2, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    if (function1 != null) {
                        x340Var2.i0(880951164);
                        z = x340Var2.k(ibj1.f) != h44Var;
                        r5 = 0;
                        x340Var2.r(false);
                    } else {
                        r5 = 0;
                        x340Var2.i0(1539683545);
                        x340Var2.r(false);
                        z = false;
                    }
                    if (z) {
                        x340Var2.i0(1539775124);
                        p9p1.h(function1, x340Var2, r5);
                        x340Var2.r((boolean) r5);
                    } else {
                        x340Var2.i0(1539841433);
                        x340Var2.r((boolean) r5);
                    }
                    if (vu30Var != null) {
                        c13.o(x340Var2, 1539880338, r5, vu30Var, x340Var2);
                        x340Var2.r((boolean) r5);
                    } else {
                        x340Var2.i0(1539927117);
                        ldx ldxVar = ldx.c;
                        f2p1.e(r5, function0, x340Var2, null);
                        x340Var2.r((boolean) r5);
                    }
                    x340Var2.r(true);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                boolean zY2 = x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                j06 j06Var2 = x340Var4.a;
                if (!zY2) {
                    x340Var4.b0();
                    return rih1Var;
                }
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var4).b;
                qim0 qim0VarF2 = u291.f(uyn1.x(nim0Var, 6.0f), 1.0f);
                fra fraVar2 = een.Z;
                jw31 jw31VarA3 = ew31.a(b36Var, fraVar2, x340Var4, 0);
                int iHashCode3 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM3 = x340Var4.m();
                qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarF2);
                hzj.A.getClass();
                if (j06Var2 == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(jw31VarA3, x340Var4, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM3, x340Var4, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var4, lljVar7);
                nko1.F(x340Var4);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE3, x340Var4, lljVar8);
                Object objT2 = x340Var4.T();
                if (objT2 == fkj0.X) {
                    objT2 = bmh.Z;
                    x340Var4.s0(objT2);
                }
                qim0 qim0VarB2 = uyn1.B(s161.b(nim0Var, false, (iu30) objT2), 12.0f, 0.0f, 16.0f, 0.0f, 10);
                vq60 vq60Var2 = jw80.a;
                r2p1.a(qim0VarB2.then(tsj0.a), x340Var4, 0);
                jw31 jw31VarA4 = ew31.a(new d36(6.0f, true, new um5(false)), fraVar2, x340Var4, 0);
                int iHashCode4 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM4 = x340Var4.m();
                qim0 qim0VarE4 = zr7.E(x340Var4, nim0Var);
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(jw31VarA4, x340Var4, lljVar5);
                nko1.H(xos0VarM4, x340Var4, lljVar6);
                x0d.q(iHashCode4, x340Var4, lljVar7, x340Var4);
                nko1.H(qim0VarE4, x340Var4, lljVar8);
                if (function1 != null) {
                    x340Var4.i0(1860689376);
                    z2 = x340Var4.k(ibj1.f) != h44Var;
                    r6 = 0;
                    x340Var4.r(false);
                } else {
                    r6 = 0;
                    x340Var4.i0(1846797045);
                    x340Var4.r(false);
                    z2 = false;
                }
                if (z2) {
                    x340Var4.i0(1846888624);
                    s9p1.i(function1, x340Var4, r6);
                    x340Var4.r((boolean) r6);
                } else {
                    x340Var4.i0(1846954933);
                    x340Var4.r((boolean) r6);
                }
                if (vu30Var != null) {
                    c13.o(x340Var4, 1846993838, r6, vu30Var, x340Var4);
                    x340Var4.r((boolean) r6);
                } else {
                    x340Var4.i0(1847040617);
                    ldx ldxVar2 = ldx.c;
                    f2p1.e(r6, function0, x340Var4, null);
                    x340Var4.r((boolean) r6);
                }
                x340Var4.r(true);
                x340Var4.r(true);
                return rih1Var;
        }
    }
}
