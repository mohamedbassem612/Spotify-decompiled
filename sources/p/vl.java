package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cv30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 8;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.b = function3;
        this.h = function4;
        this.c = z;
        this.d = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.h;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.b;
        Object obj6 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(3457);
                zxo1.b((String) obj3, (af5) obj4, (cqs0) obj6, (qim0) obj5, this.c, this.d, (iu30) j2iVar, (b0k) obj, iP);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1573249);
                i9p1.a((tu1) obj3, (Function0) obj4, (j2i) obj6, (qim0) obj5, this.c, this.d, j2iVar, (b0k) obj, iP2);
                return rih1Var;
            case 2:
                h72 h72Var = (h72) obj4;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (this.c) {
                    x340Var2.i0(2127664706);
                    h72Var.f((ds9) obj6, (String) obj3, (duk0) obj5, x340Var2, 8);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(2127750824);
                    h72Var.h((ds9) obj6, this.d, (Function0) j2iVar, x340Var2, 8);
                    x340Var2.r(false);
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1572865);
                voo1.b((s0f) obj3, (whf) obj4, (Function0) obj6, (qim0) obj5, this.c, this.d, (vu30) j2iVar, (b0k) obj, iP3);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                boolean z = this.d;
                int iP4 = czo1.p(1);
                buo1.q((String) obj3, (String) obj4, this.c, (iu30) j2iVar, (qim0) obj5, (Function0) obj6, z, (b0k) obj, iP4);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(1);
                xd20.b((yc20) obj3, this.c, this.d, (c9) obj4, (zc20) obj6, (iu30) j2iVar, (qim0) obj5, (b0k) obj, iP5);
                return rih1Var;
            case 6:
                iu30 iu30Var = (iu30) j2iVar;
                sv60 sv60Var = (sv60) obj6;
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tob1 tob1Var = (tob1) obj3;
                    j2i j2iVarR = apo.r(-1484582004, new jj50((Object) sv60Var, (Object) iu30Var, (byte) 14), x340Var4);
                    xv60 xv60Var = (xv60) obj4;
                    iu30 iu30Var2 = xv60Var.e;
                    boolean z2 = this.c;
                    ggo1.s(tob1Var, j2iVarR, null, 0.0f, 0L, z2 ? iu30Var2 : null, apo.r(-2112482971, new hpy((d6o0) obj5, xv60Var, sv60Var, this.d, z2, iu30Var), x340Var4), x340Var4, 1572912, 28);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(1);
                u7n0.h((c9) obj3, this.c, this.d, (iu30) j2iVar, (r9u0) obj4, (xym) obj6, (qim0) obj5, (b0k) obj, iP6);
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                eko1.j((Function0) obj3, (Function0) obj4, (Function0) obj6, (Function0) obj5, (Function0) j2iVar, this.c, this.d, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(3121);
                yoo1.j((hob1) obj3, (j2i) obj4, (qim0) obj5, (vu30) obj6, this.c, this.d, (Function0) j2iVar, (b0k) obj, iP7);
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                int iP8 = czo1.p(1);
                fqo1.s((lfi0) obj3, this.c, this.d, (qim0) obj5, (Function0) obj4, (Function0) obj6, (vu30) j2iVar, (b0k) obj, iP8);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj5;
                int iP9 = czo1.p(1);
                ot11.f((hh5) obj3, this.c, this.d, (Integer) obj4, (iu30) j2iVar, (zja1) obj6, qim0Var, (b0k) obj, iP9);
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                int iP10 = czo1.p(1);
                j541.e((u3z0) obj4, this.c, this.d, (String) obj3, (mlq) obj6, (Function0) j2iVar, (qim0) obj5, (b0k) obj, iP10);
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                int iP11 = czo1.p(199681);
                bpo1.k(this.c, this.d, (String) obj3, (iu30) j2iVar, (u201) obj4, (iu30) obj6, (c380) obj5, (b0k) obj, iP11);
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                boolean zY = x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2);
                j06 j06Var = x340Var6.a;
                if (!zY) {
                    x340Var6.b0();
                    return rih1Var;
                }
                qim0 qim0Var2 = (qim0) obj5;
                uwr uwrVar = cbx.a;
                qim0 qim0VarB = uyn1.B(qim0Var2, 0.0f, cbx.b(x340Var6).b.d, 0.0f, 0.0f, 13);
                Function0 function0 = (Function0) obj4;
                String str = (String) obj3;
                String str2 = (String) obj6;
                j2i j2iVar2 = j2iVar;
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var6.T);
                xos0 xos0VarM = x340Var6.m();
                qim0 qim0VarE = zr7.E(x340Var6, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                boolean z3 = x340Var6.S;
                n4k n4kVar = hmb0.t1;
                if (z3) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var6, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var6, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var6, lljVar3);
                nko1.F(x340Var6);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var6, lljVar4);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var6, 0);
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE2 = zr7.E(x340Var6, nim0Var);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA, x340Var6, lljVar);
                nko1.H(xos0VarM2, x340Var6, lljVar2);
                x0d.q(iHashCode2, x340Var6, lljVar3, x340Var6);
                nko1.H(qim0VarE2, x340Var6, lljVar4);
                two1.l(0, str, str2, function0, x340Var6, null, this.c);
                cvx cvxVar = cbx.b(x340Var6).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                if (this.d) {
                    qim0VarZ = kx40.h(1.0f, qim0VarZ, true);
                }
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM3 = x340Var6.m();
                qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarZ);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC2, x340Var6, lljVar);
                nko1.H(xos0VarM3, x340Var6, lljVar2);
                x0d.q(iHashCode3, x340Var6, lljVar3, x340Var6);
                nko1.H(qim0VarE3, x340Var6, lljVar4);
                k4s0.i(0, j2iVar2, x340Var6, true, true);
                x340Var6.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(String str, String str2, boolean z, iu30 iu30Var, qim0 qim0Var, Function0 function0, boolean z2, int i) {
        super(2);
        this.a = (byte) 4;
        this.e = str;
        this.f = str2;
        this.c = z;
        this.h = iu30Var;
        this.b = qim0Var;
        this.g = function0;
        this.d = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vl(Object obj, Object obj2, Object obj3, qim0 qim0Var, boolean z, boolean z2, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.b = qim0Var;
        this.c = z;
        this.d = z2;
        this.h = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(c9 c9Var, boolean z, boolean z2, iu30 iu30Var, r9u0 r9u0Var, xym xymVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 7;
        this.e = c9Var;
        this.c = z;
        this.d = z2;
        this.h = iu30Var;
        this.f = r9u0Var;
        this.g = xymVar;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(hh5 hh5Var, boolean z, boolean z2, Integer num, iu30 iu30Var, zja1 zja1Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 11;
        this.e = hh5Var;
        this.c = z;
        this.d = z2;
        this.f = num;
        this.h = iu30Var;
        this.g = zja1Var;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(yc20 yc20Var, boolean z, boolean z2, c9 c9Var, zc20 zc20Var, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 5;
        this.e = yc20Var;
        this.c = z;
        this.d = z2;
        this.f = c9Var;
        this.g = zc20Var;
        this.h = iu30Var;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(lfi0 lfi0Var, boolean z, boolean z2, qim0 qim0Var, Function0 function0, Function0 function1, vu30 vu30Var, int i) {
        super(2);
        this.a = (byte) 10;
        this.e = lfi0Var;
        this.c = z;
        this.d = z2;
        this.b = qim0Var;
        this.f = function0;
        this.g = function1;
        this.h = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(qim0 qim0Var, Function0 function0, String str, String str2, boolean z, boolean z2, j2i j2iVar) {
        super(2);
        this.a = (byte) 14;
        this.b = qim0Var;
        this.f = function0;
        this.e = str;
        this.g = str2;
        this.c = z;
        this.d = z2;
        this.h = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(u3z0 u3z0Var, boolean z, boolean z2, String str, mlq mlqVar, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 12;
        this.f = u3z0Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.g = mlqVar;
        this.h = function0;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(hob1 hob1Var, j2i j2iVar, qim0 qim0Var, vu30 vu30Var, boolean z, boolean z2, Function0 function0, int i) {
        super(2);
        this.a = (byte) 9;
        this.e = hob1Var;
        this.f = j2iVar;
        this.b = qim0Var;
        this.g = vu30Var;
        this.c = z;
        this.d = z2;
        this.h = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(tob1 tob1Var, xv60 xv60Var, sv60 sv60Var, iu30 iu30Var, boolean z, d6o0 d6o0Var, boolean z2) {
        super(2);
        this.a = (byte) 6;
        this.e = tob1Var;
        this.f = xv60Var;
        this.g = sv60Var;
        this.h = iu30Var;
        this.c = z;
        this.b = d6o0Var;
        this.d = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(boolean z, h72 h72Var, ds9 ds9Var, String str, duk0 duk0Var, boolean z2, Function0 function0) {
        super(2);
        this.a = (byte) 2;
        this.c = z;
        this.f = h72Var;
        this.g = ds9Var;
        this.e = str;
        this.b = duk0Var;
        this.d = z2;
        this.h = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(boolean z, boolean z2, String str, iu30 iu30Var, u201 u201Var, iu30 iu30Var2, c380 c380Var, int i) {
        super(2);
        this.a = (byte) 13;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.h = iu30Var;
        this.f = u201Var;
        this.g = iu30Var2;
        this.b = c380Var;
    }
}
