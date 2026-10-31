package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rz2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz2(float f, j2i j2iVar) {
        super(2);
        this.a = (byte) 9;
        this.b = f;
        this.c = j2iVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String strN0;
        byte b = this.a;
        Object obj3 = null;
        nim0 nim0Var = nim0.a;
        float f = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                tz2.b((h72) obj4, f, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                tfg tfgVar = (tfg) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var2, 2131963226);
                    String strO1 = cwl1.o0(x340Var2, 2131960754);
                    boolean zI = x340Var2.i(tfgVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new lwe(tfgVar, (byte) 15);
                        x340Var2.s0(objT);
                    }
                    myo1.d(strO0, strO1, (Function0) objT, anm1.N("clear_button", u291.x(0.0f, f, 1, nim0Var)), (max) null, x340Var2, 0, 16);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ynv ynvVar = (ynv) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fq7.g(ynvVar.getState().a, (qim0) null, xa4.q(), xa4.r(), (String) null, apo.r(1042385655, new ye6(ynvVar, f, (byte) 2), x340Var4), x340Var4, 196608, 18);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str = ((xag0) obj4).b;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, d9y0.k(nim0Var, f), cbx.d(x340Var6).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2040);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str2 = ((hdg0) obj4).c;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str2, d9y0.k(nim0Var, f), cbx.d(x340Var8).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2040);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                int iIntValue5 = ((Number) obj2).intValue();
                ven0 ven0Var = (ven0) obj4;
                h8k1 h8k1Var = (h8k1) o7h.t0(iIntValue5, ((rnc0) ven0Var.getValue()).b);
                Object obj5 = h8k1Var != null ? h8k1Var.a : null;
                if (iIntValue5 > 0) {
                    h8k1 h8k1Var2 = (h8k1) o7h.t0(iIntValue5 - 1, ((rnc0) ven0Var.getValue()).b);
                    if (h8k1Var2 != null) {
                        obj3 = h8k1Var2.a;
                    }
                }
                float f2 = ((obj5 instanceof n5h0) && ((n5h0) obj5).e && !(obj3 instanceof x5h0)) ? f : 0.0f;
                float f3 = ((obj5 instanceof t5h0) || (obj5 instanceof y5h0) || (obj5 instanceof l5h0)) ? 0.0f : 16.0f;
                return uyn1.B(nim0.a, f3, f2, f3, 0.0f, 8);
            case 6:
                ((Number) obj2).intValue();
                ((ufh0) obj4).d(f, czo1.p(519), (b0k) obj);
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fli0 fli0Var = (fli0) obj4;
                    dx dxVar = fli0Var.e;
                    String str3 = fli0Var.b;
                    if (dxVar instanceof ax) {
                        x340Var10.i0(-491049995);
                        strN0 = cwl1.n0(2131958492, new Object[]{str3}, x340Var10);
                        x340Var10.r(false);
                    } else if (dxVar instanceof bx) {
                        x340Var10.i0(-491046312);
                        strN0 = cwl1.n0(2131958493, new Object[]{str3}, x340Var10);
                        x340Var10.r(false);
                    } else {
                        if (!(dxVar instanceof cx)) {
                            throw p3d1.k(x340Var10, -491051916, false);
                        }
                        x340Var10.i0(-491042403);
                        strN0 = cwl1.n0(2131958494, new Object[]{str3}, x340Var10);
                        x340Var10.r(false);
                    }
                    String str4 = strN0;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str4, d9y0.k(nim0Var, f), cbx.d(x340Var10).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2040);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                c1q0.c((hux) obj4, f, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var12).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                    j2i j2iVar = (j2i) obj4;
                    jw31 jw31VarA = ew31.a(new d36(f, true, new um5(false)), een.Z, x340Var12, 0);
                    int iHashCode = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM = x340Var12.m();
                    qim0 qim0VarE = zr7.E(x340Var12, qim0VarZ);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(hmb0.t1);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(jw31VarA, x340Var12, y580.O0);
                    nko1.H(xos0VarM, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE, x340Var12, y580.Y);
                    j2iVar.invoke(pw31.a, x340Var12, 6);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    String str5 = ((hh11) obj4).b;
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(str5, d9y0.k(nim0Var, f), cbx.d(x340Var14).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2040);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                gwa1.a((Float) obj4, f, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                rje1.f((uqe1) obj4, f, (b0k) obj, czo1.p(9));
                return rih1Var;
            default:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    pok1.i((Function0) obj4, this.b, null, pok1.b, false, x340Var16, 3072, 20);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz2(Object obj, float f, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz2(Object obj, float f, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = f;
    }
}
