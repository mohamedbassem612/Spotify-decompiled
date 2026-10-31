package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dxj1 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dxj1(Object obj, Object obj2, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        String strB;
        int i2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                bxj1 bxj1Var = (bxj1) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 48) == 0) {
                    i = ((iIntValue & 64) == 0 ? x340Var.g(bxj1Var) : x340Var.i(bxj1Var) ? 32 : 16) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 384) == 0) {
                    i |= x340Var.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
                    zwj1 zwj1Var = bxj1Var.a;
                    ltf1 ltf1Var = (ltf1) ((c0a) obj6).d;
                    yk90 yk90Var = (yk90) obj7;
                    if (zwj1Var instanceof zwj1) {
                        x340Var2.i0(493678443);
                        zwj1 zwj1Var2 = zwj1Var;
                        xk90 xk90Var = yk90Var.i;
                        hwq hwqVar = bxj1Var.b;
                        x340Var2.i0(318161936);
                        xu30 xu30Var = null;
                        if (xk90Var != null && (strB = xk90Var.b(hwqVar, true, x340Var2, 48)) != null) {
                            boolean zG = x340Var2.g(strB) | x340Var2.g(hwqVar);
                            Object objT = x340Var2.T();
                            if (zG || objT == fkj0.X) {
                                objT = new j2i(12821107, new lp7(new tk90(xk90Var, strB, hwqVar), hwqVar, (byte) 2), true);
                                x340Var2.s0(objT);
                            }
                            xu30Var = (xu30) objT;
                        }
                        x340Var2.r(false);
                        ltf1Var.d(zwj1Var2, iu30Var, xu30Var, x340Var2, (i >> 3) & 112);
                        x340Var2.r(false);
                    } else {
                        if (!zwj1Var.equals(axj1.a)) {
                            throw p3d1.k(x340Var2, 493676698, false);
                        }
                        x340Var2.i0(493684688);
                        ltf1Var.e(x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                c7m1 c7m1Var = (c7m1) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                lk31 lk31Var = (lk31) obj7;
                mbm1 mbm1Var = (mbm1) obj6;
                if ((iIntValue2 & 48) == 0) {
                    i2 = iIntValue2 | (x340Var3.g(c7m1Var) ? 32 : 16);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= x340Var3.i(iu30Var2) ? 256 : 128;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    Object objT2 = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    if (objT2 == m4cVar) {
                        objT2 = new Object();
                        x340Var4.s0(objT2);
                    }
                    boolean zI = x340Var4.i(mbm1Var) | x340Var4.i(objT2);
                    Object objT3 = x340Var4.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new f2m1(mbm1Var, objT2, (byte) 4);
                        x340Var4.s0(objT3);
                    }
                    qxd0.i(objT2, (iu30) objT3, x340Var4);
                    wsk wskVar = s6m1.a;
                    if (c7m1Var.a.length() == 0 || c7m1Var.b.length() == 0 || c7m1Var.l.length() == 0) {
                        x340Var4.i0(-323872308);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-325710701);
                        j2i j2iVarR = apo.r(2064319938, new u6m1(c7m1Var, lk31Var, (byte) 0), x340Var4);
                        j2i j2iVarR2 = apo.r(2142441027, new u6m1(c7m1Var, lk31Var, (byte) 1), x340Var4);
                        j2i j2iVarR3 = apo.r(-2074405180, new u6m1(c7m1Var, lk31Var, (byte) 2), x340Var4);
                        j2i j2iVarR4 = apo.r(-1996284091, new u6m1(c7m1Var, lk31Var, (byte) 3), x340Var4);
                        int i3 = i2 & 896;
                        boolean z = i3 == 256;
                        Object objT4 = x340Var4.T();
                        if (z || objT4 == m4cVar) {
                            objT4 = new wel1(iu30Var2, (byte) 10);
                            x340Var4.s0(objT4);
                        }
                        Function0 function0 = (Function0) objT4;
                        boolean zI2 = x340Var4.i(mbm1Var) | x340Var4.i(objT2) | (i3 == 256);
                        Object objT5 = x340Var4.T();
                        if (zI2 || objT5 == m4cVar) {
                            objT5 = new jyi1(mbm1Var, objT2, iu30Var2, false, (byte) 17);
                            x340Var4.s0(objT5);
                        }
                        dem1.o(c7m1Var, j2iVarR, j2iVarR2, j2iVarR3, j2iVarR4, function0, jzn1.w(nim0.a, (iu30) objT5, x340Var4), x340Var4, ((i2 >> 3) & 14) | 28080);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
