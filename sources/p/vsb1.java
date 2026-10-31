package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vsb1 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vsb1(maa maaVar, byte b) {
        super(5);
        this.a = b;
        this.b = maaVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g9d1 g9d1Var = (g9d1) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        h9d1 h9d1Var = this.b;
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(g9d1Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            qim0 qim0VarD = u291.D(nim0.a, (era) null, 3);
            boolean zI = x340Var2.i(h9d1Var) | ((iIntValue & 112) == 32);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new ccb1(g9d1Var, h9d1Var, (byte) 20);
                x340Var2.s0(objT);
            }
            ujo1.e(qim0VarD, (xtb0) null, (vzq0) null, (c36) null, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 6, 510);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        spd1 spd1Var = (spd1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        x340 x340Var2 = x340Var;
        boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var2.i(spd1Var);
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            objT = new k7a1(iu30Var, spd1Var, (byte) 23);
            x340Var2.s0(objT);
        }
        g0p1.p(spd1Var, (Function0) objT, (ycm) this.b.e, (qim0) null, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        yup0 yup0Var = this.b;
        Object[] objArr = new Object[0];
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = orc1.P0;
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
        List listM = p7h.M(new gyd1[]{new gyd1(2131954102, 2131954094, ((Boolean) ((List) ven0Var.getValue()).get(0)).booleanValue()), new gyd1(2131954104, 2131954096, ((Boolean) ((List) ven0Var.getValue()).get(1)).booleanValue()), new gyd1(2131954103, 2131954095, ((Boolean) ((List) ven0Var.getValue()).get(2)).booleanValue())});
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        c380 c380VarA = mqo1.A(listM);
        boolean zI = x340Var.i(ven0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new xd2(ven0Var, (byte) 21);
            x340Var.s0(objT2);
        }
        vu30 vu30Var = (vu30) objT2;
        int i = (iIntValue & 896) ^ 384;
        boolean zI2 = ((i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(yup0Var);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            objT3 = new k7a1(iu30Var, yup0Var, (byte) 28);
            x340Var.s0(objT3);
        }
        Function0 function0 = (Function0) objT3;
        boolean zI3 = x340Var.i(context) | ((i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256);
        Object objT4 = x340Var.T();
        if (zI3 || objT4 == m4cVar) {
            objT4 = new nyd1(iu30Var, context);
            x340Var.s0(objT4);
        }
        b2p1.q(c380VarA, vu30Var, function0, (iu30) objT4, (qim0) null, x340Var, 0);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u0e1 u0e1Var = (u0e1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        v0e1 v0e1Var = this.b;
        x340 x340Var2 = x340Var;
        boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var2.i(v0e1Var);
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            objT = new k7a1(iu30Var, v0e1Var, (byte) 29);
            x340Var2.s0(objT);
        }
        cpn1.b(196608, 30, (Function0) objT, apo.r(749460092, new sdb1(u0e1Var, iu30Var, (byte) 21), x340Var2), x340Var2, (qim0) null, false, false);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        yqg yqgVar = (yqg) this.b.c;
        sbe1 sbe1Var = ((tbe1) obj2).d;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new b1c1(iu30Var, (byte) 7);
            x340Var2.s0(objT);
        }
        g6p1.d(yqgVar, sbe1Var, (iu30) objT, (qim0) null, x340Var2, 0);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ufe1 ufe1Var = (ufe1) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        a4f0 a4f0Var = this.b;
        qim0 qim0VarL = bmq0.L(nim0.a, k1o1.q(x340Var), (g6o0) null);
        xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
        boolean z = (((iIntValue & 112) ^ 48) > 32 && x340Var.g(ufe1Var)) || (iIntValue & 48) == 32;
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(a4f0Var) | z;
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            objT = new cmd1(ufe1Var, a4f0Var, (byte) 8);
            x340Var2.s0(objT);
        }
        ujo1.d(qim0VarL, xtb0VarA, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 0, 508);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        bie1 bie1Var = (bie1) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= (iIntValue & 64) == 0 ? x340Var.g(bie1Var) : x340Var.i(bie1Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            mod.b(oi7.a.a(this.b.a), apo.r(458231814, new gsc1(bie1Var, (byte) 14), x340Var2), x340Var2, 56);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        kiv kivVar = bde0.a;
        cm0 cm0Var = this.b;
        mod.b(kivVar.a((yqg) cm0Var.b), apo.r(-636674044, new use1((tse1) obj2, cm0Var, (iu30) obj3, (byte) 1), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rte1 rte1Var = (rte1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        yqg yqgVar = this.b.a;
        int i = (iIntValue & 896) ^ 384;
        boolean z = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new pwc1(iu30Var, (byte) 18);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        boolean z2 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new pwc1(iu30Var, (byte) 19);
            x340Var2.s0(objT2);
        }
        rje1.h(rte1Var, function0, yqgVar, (qim0) null, false, (Function0) objT2, x340Var2, (iIntValue >> 3) & 14, 24);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        uue1 uue1Var = (uue1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        yqg yqgVar = this.b.a;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new pwc1(iu30Var, (byte) 26);
            x340Var2.s0(objT);
        }
        rje1.k(uue1Var, (Function0) objT, yqgVar, (qim0) null, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:267:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:279:0x0ae5  */
    /* JADX WARN: Code duplicated, block: B:291:0x0b0c  */
    /* JADX WARN: Code duplicated, block: B:303:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:315:0x0b5c  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String str;
        boolean z;
        x340 x340Var;
        boolean z2;
        Object objT;
        boolean z3;
        Object objT2;
        boolean z4;
        Object objT3;
        boolean z5;
        Object objT4;
        boolean z6;
        Object objT5;
        jxc1 jxc1Var;
        tob1 tob1Var;
        Object m0c0Var;
        int i;
        int i2;
        Object obj6;
        b0k b0kVar;
        long jA;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z7 = true;
        rih1 rih1Var = rih1.a;
        t2f1 t2f1Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(248651897, new sdb1((usb1) obj2, (sdv0) t2f1Var, (byte) 1), b0kVar2), b0kVar2, 3078, 6);
                return rih1Var;
            case 1:
                fvb1 fvb1Var = (fvb1) obj2;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? x340Var2.g(fvb1Var) : x340Var2.i(fvb1Var) ? 32 : 16;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
                    ((hvb1) t2f1Var).e(fvb1Var, x340Var3, (iIntValue >> 3) & 14);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 2:
                ewb1 ewb1Var = (ewb1) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                lwb1 lwb1Var = (lwb1) t2f1Var;
                Boolean boolValueOf = Boolean.valueOf(ewb1Var.i);
                boolean z8 = (((iIntValue2 & 112) ^ 48) > 32 && x340Var4.i(ewb1Var)) || (iIntValue2 & 48) == 32;
                x340 x340Var5 = x340Var4;
                boolean zI = x340Var5.i(lwb1Var) | z8;
                Object objT6 = x340Var5.T();
                if (zI || objT6 == fkj0.X) {
                    objT6 = new kwb1(ewb1Var, lwb1Var, (lnm) null, (byte) 0);
                    x340Var5.s0(objT6);
                }
                qxd0.t(boolValueOf, x340Var5, (vu30) objT6);
                mod.b(oi7.a.a(lwb1Var.b), apo.r(-1675900467, new sdb1(ewb1Var, iu30Var, (byte) 2), x340Var5), x340Var5, 56);
                return rih1Var;
            case 3:
                xwb1 xwb1Var = (xwb1) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                int iIntValue3 = ((Number) obj5).intValue();
                cxb1 cxb1Var = (cxb1) t2f1Var;
                x340 x340Var6 = (b0k) obj4;
                Object objT7 = x340Var6.T();
                m4c m4cVar = fkj0.X;
                if (objT7 == m4cVar) {
                    objT7 = cxb1Var.c.a(cxb1Var.d);
                    x340Var6.s0(objT7);
                }
                tyq tyqVar = (tyq) objT7;
                boolean z9 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var6.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                Object objT8 = x340Var6.T();
                if (z9 || objT8 == m4cVar) {
                    objT8 = new et61(iu30Var2, (byte) 28);
                    x340Var6.s0(objT8);
                }
                f6o1.g(xwb1Var, tyqVar, (iu30) objT8, (qim0) null, x340Var6, (iIntValue3 >> 3) & 14);
                return rih1Var;
            case 4:
                mxb1 mxb1Var = (mxb1) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                pxb1 pxb1Var = (pxb1) t2f1Var;
                boolean z10 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var7.g(iu30Var3)) || (iIntValue4 & 384) == 256;
                x340 x340Var8 = x340Var7;
                boolean zI2 = x340Var8.i(pxb1Var) | z10;
                Object objT9 = x340Var8.T();
                if (zI2 || objT9 == fkj0.X) {
                    objT9 = new k7a1(iu30Var3, pxb1Var, (byte) 14);
                    x340Var8.s0(objT9);
                }
                cpn1.b(221184, 14, (Function0) objT9, apo.r(1783383307, new sdb1(mxb1Var, iu30Var3, (byte) 5), x340Var8), x340Var8, (qim0) null, false, false);
                return rih1Var;
            case 5:
                p2c1 p2c1Var = (p2c1) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                int i3 = ((q2c1) t2f1Var).a;
                s2c1 s2c1Var = p2c1Var.a;
                boolean z11 = s2c1Var.f;
                boolean z12 = s2c1Var.g;
                String str2 = s2c1Var.a;
                long jC = xxq0.c(s2c1Var.b);
                String str3 = s2c1Var.d;
                c380 c380Var = s2c1Var.e;
                String str4 = s2c1Var.n;
                int i4 = s2c1Var.c;
                boolean z13 = !p2c1Var.d;
                boolean z14 = !p2c1Var.e;
                boolean z15 = s2c1Var.h;
                qim0 qim0VarN = anm1.N(str2, uyn1.z(16.0f, 0.0f, 2, nim0Var));
                String str5 = s2c1Var.k;
                String str6 = s2c1Var.j;
                boolean z16 = s2c1Var.m;
                c380 c380Var2 = s2c1Var.l;
                int i5 = (iIntValue5 & 896) ^ 384;
                if (i5 <= 256 || !x340Var9.g(iu30Var4)) {
                    str = str6;
                    if ((iIntValue5 & 384) != 256) {
                        z = false;
                    }
                    x340Var = x340Var9;
                    z2 = z;
                    objT = x340Var.T();
                    if (z2 || objT == m4cVar2) {
                        objT = new pba1(iu30Var4, (byte) 19);
                        x340Var.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    z3 = (i5 <= 256 && x340Var.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                    objT2 = x340Var.T();
                    if (z3 || objT2 == m4cVar2) {
                        objT2 = new pba1(iu30Var4, (byte) 20);
                        x340Var.s0(objT2);
                    }
                    Function0 function1 = (Function0) objT2;
                    z4 = (i5 <= 256 && x340Var.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                    objT3 = x340Var.T();
                    if (z4 || objT3 == m4cVar2) {
                        objT3 = new pba1(iu30Var4, (byte) 21);
                        x340Var.s0(objT3);
                    }
                    Function0 function2 = (Function0) objT3;
                    z5 = (i5 <= 256 && x340Var.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                    objT4 = x340Var.T();
                    if (z5 || objT4 == m4cVar2) {
                        objT4 = new pba1(iu30Var4, (byte) 22);
                        x340Var.s0(objT4);
                    }
                    Function0 function3 = (Function0) objT4;
                    z6 = (i5 <= 256 && x340Var.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                    objT5 = x340Var.T();
                    if (z6 || objT5 == m4cVar2) {
                        objT5 = new pba1(iu30Var4, (byte) 23);
                        x340Var.s0(objT5);
                    }
                    vgo1.o(str2, str3, function0, qim0VarN, str4, i4, z13, z14, jC, i3, (String) null, z11, z12, z15, c380Var, str5, str, str3, z16, c380Var2, function1, function2, function3, (Function0) objT5, x340Var, 0);
                    return rih1Var;
                }
                str = str6;
                z = true;
                x340Var = x340Var9;
                z2 = z;
                objT = x340Var.T();
                if (z2) {
                    objT = new pba1(iu30Var4, (byte) 19);
                    x340Var.s0(objT);
                } else {
                    objT = new pba1(iu30Var4, (byte) 19);
                    x340Var.s0(objT);
                }
                Function0 function4 = (Function0) objT;
                if (i5 <= 256) {
                }
                objT2 = x340Var.T();
                if (z3) {
                    objT2 = new pba1(iu30Var4, (byte) 20);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new pba1(iu30Var4, (byte) 20);
                    x340Var.s0(objT2);
                }
                Function0 function5 = (Function0) objT2;
                if (i5 <= 256) {
                }
                objT3 = x340Var.T();
                if (z4) {
                    objT3 = new pba1(iu30Var4, (byte) 21);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new pba1(iu30Var4, (byte) 21);
                    x340Var.s0(objT3);
                }
                Function0 function6 = (Function0) objT3;
                if (i5 <= 256) {
                }
                objT4 = x340Var.T();
                if (z5) {
                    objT4 = new pba1(iu30Var4, (byte) 22);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new pba1(iu30Var4, (byte) 22);
                    x340Var.s0(objT4);
                }
                Function0 function7 = (Function0) objT4;
                if (i5 <= 256) {
                }
                objT5 = x340Var.T();
                if (z6) {
                    objT5 = new pba1(iu30Var4, (byte) 23);
                    x340Var.s0(objT5);
                } else {
                    objT5 = new pba1(iu30Var4, (byte) 23);
                    x340Var.s0(objT5);
                }
                vgo1.o(str2, str3, function4, qim0VarN, str4, i4, z13, z14, jC, i3, (String) null, z11, z12, z15, c380Var, str5, str, str3, z16, c380Var2, function5, function6, function7, (Function0) objT5, x340Var, 0);
                return rih1Var;
            case 6:
                z3c1 z3c1Var = (z3c1) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                a4c1 a4c1Var = (a4c1) t2f1Var;
                ict0 ict0Var = a4c1Var.c;
                x340 x340Var10 = (b0k) obj4;
                boolean zG = x340Var10.g(ict0Var);
                Object objT10 = x340Var10.T();
                if (zG || objT10 == m4cVar3) {
                    poq poqVar = a4c1Var.a;
                    ict0 ict0Var2 = new ict0(iu30Var5, (byte) 13);
                    poqVar.getClass();
                    n6c1 n6c1Var = new n6c1(ict0Var2);
                    x340Var10.s0(n6c1Var);
                    objT10 = n6c1Var;
                }
                n6c1 n6c1Var2 = (n6c1) objT10;
                boolean zG2 = x340Var10.g(ict0Var);
                Object objT11 = x340Var10.T();
                if (zG2 || objT11 == m4cVar3) {
                    qoq qoqVar = a4c1Var.b;
                    ict0 ict0Var3 = new ict0(iu30Var5, (byte) 12);
                    wj3 wj3Var = (wj3) qoqVar.a.c;
                    pa31 pa31Var = (pa31) wj3Var.b;
                    pa31 pa31Var2 = (pa31) wj3Var.b;
                    q8n q8nVar = (q8n) pa31Var.g.get();
                    c8o.l(q8nVar);
                    va31 va31Var = (va31) ((jly0) wj3Var.h).get();
                    kj31 kj31Var = (kj31) pa31Var2.d.get();
                    c8o.l(kj31Var);
                    pe peVar = (pe) pa31Var2.l.get();
                    c8o.l(peVar);
                    objT11 = new ol31(q8nVar, va31Var, kj31Var, pwo1.v(peVar, (tjs0) ((jly0) wj3Var.t).get()), ict0Var3);
                    x340Var10.s0(objT11);
                }
                gho1.j(mqo1.A(z3c1Var.a), z3c1Var.b, z3c1Var.c.a, apo.r(2068120748, new juy0(n6c1Var2, (ol31) objT11, (byte) 8), x340Var10), (qim0) null, x340Var10, 1572864);
                return rih1Var;
            case 7:
                j4c1 j4c1Var = (j4c1) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                ArrayList arrayList = j4c1Var.a;
                k4c1 k4c1Var = (k4c1) t2f1Var;
                zvj zvjVar = k4c1Var.e;
                x340 x340Var11 = (b0k) obj4;
                boolean zG3 = x340Var11.g(zvjVar);
                Object objT12 = x340Var11.T();
                if (zG3 || objT12 == m4cVar4) {
                    roq roqVar = k4c1Var.b;
                    ict0 ict0Var4 = new ict0(iu30Var6, (byte) 14);
                    roqVar.getClass();
                    y731 y731Var = new y731(ict0Var4);
                    x340Var11.s0(y731Var);
                    objT12 = y731Var;
                }
                y731 y731Var2 = (y731) objT12;
                boolean zG4 = x340Var11.g(zvjVar);
                Object objT13 = x340Var11.T();
                if (zG4 || objT13 == m4cVar4) {
                    soq soqVar = k4c1Var.c;
                    ict0 ict0Var5 = new ict0(iu30Var6, (byte) 15);
                    wj3 wj3Var2 = (wj3) soqVar.a.c;
                    pa31 pa31Var3 = (pa31) wj3Var2.b;
                    pa31 pa31Var4 = (pa31) wj3Var2.b;
                    q8n q8nVar2 = (q8n) pa31Var3.g.get();
                    c8o.l(q8nVar2);
                    va31 va31Var2 = (va31) ((jly0) wj3Var2.h).get();
                    kj31 kj31Var2 = (kj31) pa31Var4.d.get();
                    c8o.l(kj31Var2);
                    pe peVar2 = (pe) pa31Var4.l.get();
                    c8o.l(peVar2);
                    objT13 = new bl31(q8nVar2, va31Var2, kj31Var2, pwo1.v(peVar2, (tjs0) ((jly0) wj3Var2.t).get()), ict0Var5);
                    x340Var11.s0(objT13);
                }
                bl31 bl31Var = (bl31) objT13;
                boolean zG5 = x340Var11.g(zvjVar);
                Object objT14 = x340Var11.T();
                if (zG5 || objT14 == m4cVar4) {
                    ooq ooqVar = k4c1Var.a;
                    ict0 ict0Var6 = new ict0(iu30Var6, (byte) 16);
                    wj3 wj3Var3 = (wj3) ooqVar.a.c;
                    a4c1 a4c1Var2 = new a4c1((poq) ((jly0) wj3Var3.g).get(), (qoq) ((jly0) wj3Var3.X).get(), ict0Var6);
                    x340Var11.s0(a4c1Var2);
                    objT14 = a4c1Var2;
                }
                a4c1 a4c1Var3 = (a4c1) objT14;
                boolean zG6 = x340Var11.g(zvjVar);
                Object objT15 = x340Var11.T();
                if (zG6 || objT15 == m4cVar4) {
                    toq toqVar = k4c1Var.d;
                    ict0 ict0Var7 = new ict0(iu30Var6, (byte) 17);
                    toqVar.getClass();
                    bzc1 bzc1Var = new bzc1(ict0Var7);
                    x340Var11.s0(bzc1Var);
                    objT15 = bzc1Var;
                }
                bzc1 bzc1Var2 = (bzc1) objT15;
                y5c1 y5c1Var = (y5c1) o7h.s0(arrayList);
                t5c1 t5c1Var = y5c1Var != null ? y5c1Var.g : null;
                s5c1 s5c1Var = t5c1Var instanceof s5c1 ? (s5c1) t5c1Var : null;
                if (s5c1Var == null) {
                    x340Var11.i0(1689651117);
                    x340Var11.r(false);
                    jxc1Var = null;
                } else {
                    x340Var11.i0(1689651118);
                    wat watVar = (wat) x340Var11.k(t4k.h);
                    x340Var11.i0(1439980303);
                    float fM0 = watVar.M0((int) (((crl1) x340Var11.k(t4k.u)).a() & 4294967295L));
                    x340Var11.r(false);
                    float f = (fM0 * 61.5f) / 100.0f;
                    long jK = tto1.k((0.58f * f) - 32.0f, f - 32.0f);
                    long jI0 = (((long) watVar.i0(s3v.b(jK))) << 32) | (((long) watVar.i0(s3v.a(jK))) & 4294967295L);
                    jxc1 jxc1Var2 = s5c1Var.a;
                    x340Var11.i0(-1698869307);
                    jq70 jq70Var = jxc1Var2.Y;
                    wp70 wp70Var = jq70Var instanceof wp70 ? (wp70) jq70Var : null;
                    if (Build.VERSION.SDK_INT < 29 && wp70Var != null && ((int) (jI0 >> 32)) > 0 && ((int) (4294967295L & jI0)) > 0) {
                        gw70 gw70Var = (gw70) x340Var11.k(oi7.a);
                        boolean zG7 = x340Var11.g(jxc1Var2) | x340Var11.g(gw70Var) | x340Var11.f(jI0);
                        Object objT16 = x340Var11.T();
                        if (zG7 || objT16 == m4cVar4) {
                            objT16 = v8r.q((Object) null);
                            x340Var11.s0(objT16);
                        }
                        tob1 tob1Var2 = (ven0) objT16;
                        yr80 yr80Var = new yr80(jI0);
                        boolean zI3 = x340Var11.i(tob1Var2) | x340Var11.g(jxc1Var2) | x340Var11.g(wp70Var) | x340Var11.i(gw70Var) | x340Var11.f(jI0);
                        jxc1Var2 = jxc1Var2;
                        Object objT17 = x340Var11.T();
                        if (zI3 || objT17 == m4cVar4) {
                            tob1Var = tob1Var2;
                            m0c0Var = new m0c0(jxc1Var2, wp70Var, gw70Var, jI0, tob1Var, null);
                            x340Var11.s0(m0c0Var);
                        } else {
                            m0c0Var = objT17;
                            tob1Var = tob1Var2;
                        }
                        qxd0.r(jxc1Var2, gw70Var, yr80Var, (vu30) m0c0Var, x340Var11);
                        jxc1 jxc1Var3 = (jxc1) tob1Var.getValue();
                        if (jxc1Var3 != null) {
                            jxc1Var2 = jxc1Var3;
                        }
                    }
                    x340Var11.r(false);
                    jxc1Var = jxc1Var2;
                    x340Var11.r(false);
                }
                iho1.k(mqo1.A(arrayList), apo.r(137375987, new rl6(y731Var2, j4c1Var, bl31Var, bzc1Var2, jxc1Var, (byte) 8), x340Var11), apo.r(-1315378346, new t20(a4c1Var3, j4c1Var, (byte) 28), x340Var11), (qim0) null, x340Var11, 27648);
                return rih1Var;
            case 8:
                ((jd6) t2f1Var).i((ijc1) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 9:
                sjc1 sjc1Var = (sjc1) obj2;
                b0k b0kVar3 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                wls0 wls0Var = sjc1Var.b;
                sdv0 sdv0Var = (sdv0) t2f1Var;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
                x340 x340Var12 = (x340) b0kVar3;
                int iHashCode = Long.hashCode(x340Var12.T);
                xos0 xos0VarM = x340Var12.m();
                qim0 qim0VarE = zr7.E(b0kVar3, nim0Var);
                hzj.A.getClass();
                x340 x340Var13 = (x340) b0kVar3;
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(jw31VarA, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                boolean z17 = (((iIntValue6 & 112) ^ 48) > 32 && x340Var13.g(sjc1Var)) || (iIntValue6 & 48) == 32;
                Object objT18 = x340Var13.T();
                rjc1 rjc1Var = rjc1.a;
                rjc1 rjc1Var2 = rjc1.b;
                rjc1 rjc1Var3 = rjc1.c;
                if (z17 || objT18 == fkj0.X) {
                    int iOrdinal = wls0Var.ordinal();
                    i = 1;
                    if (iOrdinal != 1) {
                        i2 = 2;
                        obj6 = iOrdinal != 2 ? rjc1Var2 : rjc1Var3;
                    } else {
                        i2 = 2;
                        obj6 = rjc1Var;
                    }
                    x340Var13.s0(obj6);
                } else {
                    obj6 = objT18;
                    i = 1;
                    i2 = 2;
                }
                rjc1 rjc1Var4 = (rjc1) obj6;
                int iOrdinal2 = rjc1Var4.ordinal();
                if (iOrdinal2 == 0) {
                    b0kVar = b0kVar3;
                    x340Var13.i0(543763089);
                    x340Var13.r(false);
                } else if (iOrdinal2 == i) {
                    b0kVar = b0kVar3;
                    x340Var13.i0(294636548);
                    sdv0Var.e(orx.c, "StsKungsholmenMetadataIcon_" + rjc1Var4, false, b0kVar, orx.d, 4);
                    x340Var13.r(false);
                } else {
                    if (iOrdinal2 != i2) {
                        throw p3d1.k(x340Var13, 294634281, false);
                    }
                    x340Var13.i0(294639605);
                    b0kVar = b0kVar3;
                    sdv0Var.e(pox.c, "StsKungsholmenMetadataIcon_" + rjc1Var4, true, b0kVar, pox.d | 384, 0);
                    x340Var13.r(false);
                }
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar).j;
                long j = cbx.a(b0kVar).b.b;
                Context context = (Context) x340Var13.k(AndroidCompositionLocals_androidKt.b);
                ArrayList arrayList2 = new ArrayList();
                int iOrdinal3 = wls0Var.ordinal();
                if (iOrdinal3 != 1) {
                    rjc1Var = iOrdinal3 != 2 ? rjc1Var2 : rjc1Var3;
                }
                if (rjc1Var == rjc1Var3) {
                    arrayList2.add(context.getString(2131962973));
                }
                Resources resources = context.getResources();
                int i6 = sjc1Var.a;
                arrayList2.add(resources.getQuantityString(2131820933, i6, Integer.valueOf(i6)));
                if (sdv0Var.b) {
                    Collections.reverse(arrayList2);
                }
                uwo1.e(o7h.y0(arrayList2, " • ", (String) null, (String) null, (iu30) null, 62), anm1.N("StsKungsholmenMetadataText", nim0Var), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2032);
                x340Var13.r(true);
                return rih1Var;
            case 10:
                bsc1 bsc1Var = (bsc1) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                int iIntValue7 = ((Number) obj5).intValue();
                x340 x340Var14 = (b0k) obj4;
                wat watVar2 = (wat) x340Var14.k(t4k.h);
                Object objT19 = x340Var14.T();
                m4c m4cVar5 = fkj0.X;
                if (objT19 == m4cVar5) {
                    objT19 = bb00.h(0, x340Var14);
                }
                err0 err0Var = (hdn0) objT19;
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarO = td6.o(lhc.g(x340Var14).g, 32, nim0Var);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarB = uyn1.B(qim0VarO, 0.0f, 0.0f, 0.0f, cbx.b(x340Var14).b.b, 7);
                rwj rwjVar = (rwj) t2f1Var;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM2 = x340Var14.m();
                qim0 qim0VarE2 = zr7.E(x340Var14, qim0VarB);
                hzj.A.getClass();
                if (x340Var14.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(n4kVar);
                } else {
                    x340Var14.v0();
                }
                nko1.H(gfh0VarC, x340Var14, y580.O0);
                nko1.H(xos0VarM2, x340Var14, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var14, y580.R0);
                nko1.F(x340Var14);
                nko1.H(qim0VarE2, x340Var14, y580.Y);
                zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, watVar2.M0(err0Var.s()), 7);
                boolean zI4 = ((((iIntValue7 & 896) ^ 384) > 256 && x340Var14.g(iu30Var7)) || (iIntValue7 & 384) == 256) | ((((iIntValue7 & 112) ^ 48) > 32 && x340Var14.g(bsc1Var)) || (iIntValue7 & 48) == 32) | x340Var14.i(rwjVar);
                Object objT20 = x340Var14.T();
                if (zI4 || objT20 == m4cVar5) {
                    objT20 = new ny51(bsc1Var, iu30Var7, rwjVar, (byte) 28);
                    x340Var14.s0(objT20);
                }
                s3o1.d((qim0) null, (xtb0) null, zzq0VarJ, (g36) null, (nl3) null, (iq20) null, false, (h3h1) null, (iu30) objT20, x340Var14, 0, 507);
                qim0 qim0VarA = h2c.a.a(nim0Var, een.X);
                cvx cvxVar = cbx.b(x340Var14).b;
                qim0 qim0VarF = u291.f(uyn1.z(16.0f, 0.0f, 2, qim0VarA), 1.0f);
                boolean zI5 = x340Var14.i(err0Var);
                Object objT21 = x340Var14.T();
                if (zI5 || objT21 == m4cVar5) {
                    objT21 = new myg0(err0Var, (byte) 29);
                    x340Var14.s0(objT21);
                }
                ozn1.c(lrn1.u(qim0VarF, (iu30) objT21), x340Var14, 0);
                x340Var14.r(true);
                return rih1Var;
            case 11:
                msc1 msc1Var = (msc1) obj2;
                x340 x340Var15 = (b0k) obj4;
                ((Number) obj5).intValue();
                tva1 tva1Var = (tva1) t2f1Var;
                qim0 qim0VarN2 = anm1.N("success_page", nim0Var);
                u7h u7hVar = msc1Var.b;
                if (u7hVar == null) {
                    x340 x340Var16 = x340Var15;
                    x340Var16.i0(648424786);
                    uwr uwrVar3 = cbx.a;
                    jA = cbx.a(x340Var16).a.a.a();
                    x340Var16.r(false);
                } else {
                    x340 x340Var17 = x340Var15;
                    x340Var17.i0(648422616);
                    x340Var17.r(false);
                    jA = u7hVar.a;
                }
                rqo1.a(jA, apo.r(2001361115, new psc1(tva1Var, msc1Var, (byte) 0), x340Var15), apo.r(-582955334, new psc1(tva1Var, msc1Var, (byte) 1), x340Var15), qim0VarN2, apo.r(-1456620936, new psc1(tva1Var, msc1Var, (byte) 2), x340Var15), x340Var15, 25008);
                return rih1Var;
            case 12:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                c380 c380Var3 = ((cwc1) obj2).a;
                irp irpVar = (irp) ((yup0) t2f1Var).c;
                if ((((iIntValue8 & 896) ^ 384) <= 256 || !x340Var18.g(iu30Var8)) && (iIntValue8 & 384) != 256) {
                    z7 = false;
                }
                x340 x340Var19 = x340Var18;
                Object objT22 = x340Var19.T();
                if (z7 || objT22 == fkj0.X) {
                    objT22 = new iuy0(iu30Var8, (byte) 20);
                    x340Var19.s0(objT22);
                }
                tro1.k(c380Var3, irpVar, (vu30) objT22, (qim0) null, x340Var19, 0);
                return rih1Var;
            case 13:
                ywc1 ywc1Var = (ywc1) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                int iIntValue9 = ((Number) obj5).intValue();
                axc1 axc1Var = (axc1) t2f1Var;
                x340 x340Var20 = (b0k) obj4;
                Object objT23 = x340Var20.T();
                m4c m4cVar6 = fkj0.X;
                if (objT23 == m4cVar6) {
                    objT23 = v8r.q(z6x.a);
                    x340Var20.s0(objT23);
                }
                ven0 ven0Var = (ven0) objT23;
                gab gabVar = ywc1Var.b;
                boolean zI6 = x340Var20.i(ven0Var) | x340Var20.i(ywc1Var);
                Object objT24 = x340Var20.T();
                if (zI6 || objT24 == m4cVar6) {
                    objT24 = new p651(ywc1Var, ven0Var, (lnm) null);
                    x340Var20.s0(objT24);
                }
                qxd0.t(gabVar, x340Var20, (vu30) objT24);
                float f2 = zjy.j(320.0f, new p3v(((Configuration) x340Var20.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.65f)).a;
                if (((List) ven0Var.getValue()).isEmpty()) {
                    x340Var20.i0(641908219);
                    x340Var20.r(false);
                } else {
                    x340Var20.i0(641137497);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var20).b;
                    cvx cvxVar3 = cbx.b(x340Var20).b;
                    zzq0 zzq0VarJ2 = uyn1.j(16.0f, 0.0f, 16.0f, 0.0f, 10);
                    cvx cvxVar4 = cbx.b(x340Var20).b;
                    d36 d36Var = new d36(12.0f, true, new um5(false));
                    boolean zI7 = x340Var20.i(ven0Var) | x340Var20.i(axc1Var) | x340Var20.d(f2);
                    if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var20.g(iu30Var9)) && (iIntValue9 & 384) != 256) {
                        z7 = false;
                    }
                    boolean z18 = zI7 | z7;
                    Object objT25 = x340Var20.T();
                    if (z18 || objT25 == m4cVar6) {
                        objT25 = new yv40((Object) ven0Var, (Object) axc1Var, f2, (Object) iu30Var9, (byte) 3);
                        x340Var20.s0(objT25);
                    }
                    ujo1.e((qim0) null, (xtb0) null, zzq0VarJ2, d36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT25, x340Var20, 0, 491);
                    x340Var20.r(false);
                }
                return rih1Var;
            case 14:
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(1428723988, new sdb1((rxc1) obj2, (txc1) t2f1Var, (byte) 9), b0kVar4), b0kVar4, 3078, 6);
                return rih1Var;
            case 15:
                g7d1 g7d1Var = (g7d1) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                c6d1 c6d1Var = ((j6d1) t2f1Var).a;
                e6d1 e6d1Var = c6d1Var.a;
                f6d1 f6d1Var = c6d1Var.b;
                int i7 = g7d1Var.d;
                boolean z19 = (((iIntValue10 & 896) ^ 384) > 256 && x340Var21.g(iu30Var10)) || (iIntValue10 & 384) == 256;
                x340 x340Var22 = x340Var21;
                Object objT26 = x340Var22.T();
                if (z19 || objT26 == fkj0.X) {
                    objT26 = new b1c1(iu30Var10, (byte) 1);
                    x340Var22.s0(objT26);
                }
                rwo1.i(g7d1Var, e6d1Var, f6d1Var, i7, (qim0) null, (iu30) objT26, x340Var22, (iIntValue10 >> 3) & 14);
                return rih1Var;
            case 16:
                return a(obj, obj2, obj3, obj4, obj5);
            case 17:
                k9d1 k9d1Var = (k9d1) obj2;
                b0k b0kVar5 = (b0k) obj4;
                ((Number) obj5).intValue();
                d7e.k(k9d1Var.c, (vu30) null, (vu30) null, apo.r(-691436806, new nu31(k9d1Var, (smp0) t2f1Var, (iu30) obj3, (byte) 28), b0kVar5), b0kVar5, 3072, 6);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                b0k b0kVar6 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((tr21) t2f1Var).b), apo.r(1288641791, new gsc1((lpd1) obj2, (byte) 4), b0kVar6), b0kVar6, 56);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return d(obj, obj2, obj3, obj4, obj5);
            case 20:
                return e(obj, obj2, obj3, obj4, obj5);
            case 21:
                return f(obj, obj2, obj3, obj4, obj5);
            case 22:
                return g(obj, obj2, obj3, obj4, obj5);
            case 23:
                return h(obj, obj2, obj3, obj4, obj5);
            case 24:
                return i(obj, obj2, obj3, obj4, obj5);
            case 25:
                ije1 ije1Var = (ije1) t2f1Var;
                rje1.e((gje1) obj2, (iu30) obj3, ije1Var.a, (qim0) null, ije1Var.b, false, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126, 40);
                return rih1Var;
            case 26:
                return j(obj, obj2, obj3, obj4, obj5);
            case 27:
                return k(obj, obj2, obj3, obj4, obj5);
            case 28:
                return m(obj, obj2, obj3, obj4, obj5);
            default:
                b0k b0kVar7 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(-1081745496, new juc1(t2f1Var, (p2f1) obj2, (iu30) obj3, (byte) 12), b0kVar7), b0kVar7, 3078, 6);
                return rih1Var;
        }
    }
}
