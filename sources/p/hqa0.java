package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hqa0 extends hab0 implements vu30 {
    public final /* synthetic */ lz20 N0;
    public final /* synthetic */ ven0 O0;
    public final /* synthetic */ kvp P0;
    public final /* synthetic */ w9u0 Q0;
    public final /* synthetic */ mpa1 R0;
    public final /* synthetic */ g38 S0;
    public final /* synthetic */ ven0 T0;
    public final /* synthetic */ c9n U0;
    public final /* synthetic */ ven0 V0;
    public final /* synthetic */ ven0 W0;
    public final /* synthetic */ Long X;
    public final /* synthetic */ ven0 X0;
    public final /* synthetic */ hfp Y;
    public final /* synthetic */ ven0 Y0;
    public final /* synthetic */ ven0 Z;
    public final /* synthetic */ ven0 Z0;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ bs91 d;
    public final /* synthetic */ xta0 e;
    public final /* synthetic */ vra0 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ g9m t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hqa0(Function0 function0, ven0 ven0Var, bs91 bs91Var, xta0 xta0Var, vra0 vra0Var, iu30 iu30Var, long j, boolean z, g9m g9mVar, Long l, hfp hfpVar, ven0 ven0Var2, lz20 lz20Var, ven0 ven0Var3, kvp kvpVar, w9u0 w9u0Var, mpa1 mpa1Var, g38 g38Var, ven0 ven0Var4, c9n c9nVar, ven0 ven0Var5, ven0 ven0Var6, ven0 ven0Var7, ven0 ven0Var8, ven0 ven0Var9, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = ven0Var;
        this.d = bs91Var;
        this.e = xta0Var;
        this.f = vra0Var;
        this.g = iu30Var;
        this.h = j;
        this.i = z;
        this.t = g9mVar;
        this.X = l;
        this.Y = hfpVar;
        this.Z = ven0Var2;
        this.N0 = lz20Var;
        this.O0 = ven0Var3;
        this.P0 = kvpVar;
        this.Q0 = w9u0Var;
        this.R0 = mpa1Var;
        this.S0 = g38Var;
        this.T0 = ven0Var4;
        this.U0 = c9nVar;
        this.V0 = ven0Var5;
        this.W0 = ven0Var6;
        this.X0 = ven0Var7;
        this.Y0 = ven0Var8;
        this.Z0 = ven0Var9;
    }

    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        lz20 lz20Var;
        tob1 tob1Var;
        k6a1 k6a1Var;
        ven0 ven0Var;
        Object objB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                Object obj3 = fkj0.X;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                k6a1 k6a1Var2 = (k6a1) x340Var2.k(t4k.q);
                boolean zI = x340Var2.i(k6a1Var2);
                Function0 function1 = this.b;
                boolean zG = zI | x340Var2.g(function1);
                Object objT = x340Var2.T();
                if (zG || objT == obj3) {
                    objT = new onv(k6a1Var2, function1, (byte) 2);
                    x340Var2.s0(objT);
                }
                Function0 function2 = (Function0) objT;
                WeakHashMap weakHashMap = osl1.x;
                int i = lhc.g(x340Var2).t.e().d;
                int i2 = lhc.g(x340Var2).s.e().d;
                Object objT2 = x340Var2.T();
                if (objT2 == obj3) {
                    objT2 = new dua0();
                    x340Var2.s0(objT2);
                }
                dua0 dua0Var = (dua0) objT2;
                ven0 ven0Var2 = this.c;
                krm0 krm0Var = (krm0) ven0Var2.getValue();
                Integer numValueOf = Integer.valueOf(i);
                Integer numValueOf2 = Integer.valueOf(i2);
                boolean zI2 = x340Var2.i(dua0Var) | x340Var2.i(ven0Var2) | x340Var2.e(i) | x340Var2.e(i2) | x340Var2.g(function2);
                Object objT3 = x340Var2.T();
                if (zI2 || objT3 == obj3) {
                    function0 = function2;
                    objT3 = new fqa0(dua0Var, i, i2, function0, this.c, null);
                    x340Var2.s0(objT3);
                } else {
                    function0 = function2;
                }
                qxd0.r(krm0Var, numValueOf, numValueOf2, (vu30) objT3, x340Var2);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarY = too1.y(u291.d(nim0Var, 1.0f), new mih1(lhc.g(x340Var2).c, lhc.g(x340Var2).e));
                Object objT4 = x340Var2.T();
                if (objT4 == obj3) {
                    objT4 = ktd.n(x340Var2);
                }
                Function0 function3 = function0;
                qim0 qim0VarV = bin.v(qim0VarY, (idn0) objT4, null, false, null, null, function3, 28);
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarV);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                boolean z = x340Var2.S;
                n4k n4kVar = hmb0.t1;
                if (z) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf3, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                cr31 cr31VarD = er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12);
                qim0 qim0VarF = u291.f(h2c.a.a(nim0Var, een.X), 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                cvx cvxVar3 = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                j2i j2iVar = jui.a;
                bs91 bs91Var = this.d;
                sok.k(bs91Var, qim0VarB, j2iVar, x340Var2, 384, 0);
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                xta0 xta0Var = this.e;
                qim0 qim0VarQ = i1p1.q(dug.f(zr7.i(qim0VarF3, new h6a0(function3, xta0Var, (byte) 2)), cbx.a(x340Var2).a.a.a(), cr31VarD), cr31VarD);
                Object objT5 = x340Var2.T();
                if (objT5 == obj3) {
                    objT5 = ktd.n(x340Var2);
                }
                idn0 idn0Var = (idn0) objT5;
                Object objT6 = x340Var2.T();
                if (objT6 == obj3) {
                    objT6 = lx70.a1;
                    x340Var2.s0(objT6);
                }
                qim0 qim0VarN = anm1.N("KeyboardAccessory.Panel", bin.v(qim0VarQ, idn0Var, null, false, null, null, (Function0) objT6, 28));
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarN);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC2, x340Var2, lljVar);
                nko1.H(xos0VarM3, x340Var2, lljVar2);
                x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar4);
                long jA = cbx.a(x340Var2).a.a.a();
                mta mtaVar = cbx.b(x340Var2).d;
                ven0 ven0Var3 = this.O0;
                enk1 enk1Var = new enk1(jA, (umk1) null, ((Boolean) ven0Var3.getValue()).booleanValue(), 26);
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                cvx cvxVar4 = cbx.b(x340Var2).b;
                cvx cvxVar5 = cbx.b(x340Var2).b;
                cvx cvxVar6 = cbx.b(x340Var2).b;
                cvx cvxVar7 = cbx.b(x340Var2).b;
                qim0 qim0VarA = uyn1.A(qim0VarF4, 12.0f, 4.0f, 12.0f, 12.0f);
                boolean zH = x340Var2.h(((Boolean) ven0Var3.getValue()).booleanValue());
                Object objT7 = x340Var2.T();
                g9m g9mVar = this.t;
                tob1 tob1Var2 = this.c;
                ven0 ven0Var4 = this.Z;
                lz20 lz20Var2 = this.N0;
                if (zH || objT7 == obj3) {
                    ty60 ty60VarA = this.R0.a(this.S0);
                    ven0 ven0Var5 = this.T0;
                    c9n c9nVar = this.U0;
                    wj3 wj3Var = new wj3(g9mVar, ven0Var5, c9nVar, bs91Var, this.V0, lz20Var2, tob1Var2, k6a1Var2, xta0Var, this.W0, this.X0, ven0Var3, this.Y0, ven0Var4, this.Z0, (byte) 15);
                    lz20Var = lz20Var2;
                    tob1Var = tob1Var2;
                    k6a1Var = k6a1Var2;
                    ven0Var = ven0Var4;
                    objB = kvp.b(this.P0, this.Q0, ty60VarA, wj3Var, new xs3(ven0Var, ven0Var5, (byte) 9), new i030(tob1Var, (byte) 29), new gqa0(c9nVar, bs91Var, (byte) 0), enk1Var, qim0VarA, (bp9) null, new c470(tob1Var, (byte) 4), 1792);
                    x340Var2.s0(objB);
                } else {
                    objB = objT7;
                    tob1Var = tob1Var2;
                    ven0Var = ven0Var4;
                    lz20Var = lz20Var2;
                    k6a1Var = k6a1Var2;
                }
                orm0 orm0Var = (orm0) objB;
                vra0 vra0Var = this.f;
                c380 c380Var = vra0Var.c;
                String str = vra0Var.g;
                c380 c380Var2 = vra0Var.k;
                lpu lpuVar = vra0Var.l;
                iu30 iu30Var = this.g;
                boolean zG2 = x340Var2.g(iu30Var);
                Object objT8 = x340Var2.T();
                if (zG2 || objT8 == obj3) {
                    objT8 = new bv70(iu30Var, (byte) 25);
                    x340Var2.s0(objT8);
                }
                iu30 iu30Var2 = (iu30) objT8;
                boolean zG3 = x340Var2.g(iu30Var);
                Object objT9 = x340Var2.T();
                if (zG3 || objT9 == obj3) {
                    objT9 = new ux90(iu30Var, (byte) 25);
                    x340Var2.s0(objT9);
                }
                Function0 function4 = (Function0) objT9;
                boolean zG4 = x340Var2.g(iu30Var);
                Object objT10 = x340Var2.T();
                if (zG4 || objT10 == obj3) {
                    objT10 = new ux90(iu30Var, (byte) 26);
                    x340Var2.s0(objT10);
                }
                Function0 function5 = (Function0) objT10;
                boolean zI3 = x340Var2.i(k6a1Var) | x340Var2.g(iu30Var);
                Object objT11 = x340Var2.T();
                if (zI3 || objT11 == obj3) {
                    objT11 = new x680(k6a1Var, iu30Var, (byte) 17);
                    x340Var2.s0(objT11);
                }
                Function0 function6 = (Function0) objT11;
                boolean zG5 = x340Var2.g(iu30Var);
                Object objT12 = x340Var2.T();
                if (zG5 || objT12 == obj3) {
                    objT12 = new bv70(iu30Var, (byte) 26);
                    x340Var2.s0(objT12);
                }
                ltn1.n(c380Var, iu30Var2, this.h, null, this.i, str, g9mVar, function4, this.X, function5, function6, c380Var2, lpuVar, (iu30) objT12, this.Y, apo.r(105160041, new gs90(orm0Var, (byte) 9), x340Var2), x340Var2, 0);
                krm0 krm0Var2 = (krm0) tob1Var.getValue();
                boolean zI4 = x340Var2.i(tob1Var) | x340Var2.i(ven0Var) | x340Var2.i(lz20Var) | x340Var2.i(k6a1Var);
                Object objT13 = x340Var2.T();
                if (zI4 || objT13 == obj3) {
                    sr1 sr1Var = new sr1(lz20Var, k6a1Var, tob1Var, ven0Var, (lnm) null, (byte) 25);
                    x340Var2.s0(sr1Var);
                    objT13 = sr1Var;
                }
                qxd0.t(krm0Var2, x340Var2, (vu30) objT13);
                x340Var2.r(true);
                x340Var2.r(true);
                x340Var2.r(true);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    i3u i3uVar = new i3u(228, true, true, false, false);
                    Function0 function7 = this.b;
                    anm1.a(function7, i3uVar, apo.r(-1218087591, new hqa0(function7, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0, this.X0, this.Y0, this.Z0, (byte) 0), x340Var4), x340Var4, 384, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
