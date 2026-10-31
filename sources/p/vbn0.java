package p;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.unit.TextUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vbn0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbn0(bjk1 bjk1Var, qim0 qim0Var, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 18;
        jsq0 jsq0Var = jsq0.b;
        ksq0 ksq0Var = ksq0.b;
        this.b = bjk1Var;
        this.c = qim0Var;
        this.d = j2iVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    otw.c((idm) obj5, new wcm(((rbn0) obj4).a, (String) null, (String) null, tcm.a, (Function0) null, (Function0) null, false, ((pbn0) obj3).a, (String) null, 886), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                hon1.c((hnn0) obj5, (kd41) obj4, (j2i) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((f2o0) obj5).h((c2o0) obj4, (iu30) obj3, null, b0kVar2, 0);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 3:
                b0k b0kVar3 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                b0k b0kVar4 = (x340) b0kVar3;
                if (b0kVar4.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ((o3o0) obj5).g((l3o0) obj4, (iu30) obj3, null, b0kVar4, 0);
                } else {
                    b0kVar4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    o3o0 o3o0Var = (o3o0) obj3;
                    Object objT = x340Var4.T();
                    if (objT == fkj0.X) {
                        objT = o3o0Var.b;
                        x340Var4.s0(objT);
                    }
                    j0o1.k((v3o0) obj5, (vtp) objT, (iu30) obj4, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                d1o1.f((r1q0) obj5, (Function0) obj4, (j2i) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ggo1.i((eeo0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var5 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                tbr0 tbr0Var = (tbr0) obj3;
                pgo0 pgo0Var = (pgo0) obj5;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    rgo0 rgo0Var = pgo0Var.b;
                    String str = rgo0Var.c;
                    String str2 = rgo0Var.f;
                    v730 v730Var = (v730) obj4;
                    int i = v730Var.a;
                    int i2 = v730Var.b;
                    int i3 = v730Var.c;
                    boolean zI = x340Var6.i(pgo0Var) | x340Var6.i(tbr0Var);
                    Object objT2 = x340Var6.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new ogo0(pgo0Var, tbr0Var, (byte) 0);
                        x340Var6.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zI2 = x340Var6.i(pgo0Var) | x340Var6.i(tbr0Var);
                    Object objT3 = x340Var6.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new ogo0(pgo0Var, tbr0Var, (byte) 1);
                        x340Var6.s0(objT3);
                    }
                    zgo1.h(str, str2, i, i2, i3, function0, (Function0) objT3, (qim0) null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                iho1.i((xho0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var7 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                oso0 oso0Var = (oso0) obj4;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    uwy0 uwy0Var = (uwy0) obj5;
                    String str3 = oso0Var.I1.a;
                    i8h1 i8h1Var = (i8h1) obj3;
                    boolean zI3 = x340Var8.i(oso0Var);
                    Object objT4 = x340Var8.T();
                    if (zI3 || objT4 == m4cVar2) {
                        objT4 = new mso0(oso0Var, (byte) 0);
                        x340Var8.s0(objT4);
                    }
                    Function0 function1 = (Function0) objT4;
                    boolean zI4 = x340Var8.i(oso0Var);
                    Object objT5 = x340Var8.T();
                    if (zI4 || objT5 == m4cVar2) {
                        objT5 = new mso0(oso0Var, (byte) 1);
                        x340Var8.s0(objT5);
                    }
                    Function0 function2 = (Function0) objT5;
                    boolean zI5 = x340Var8.i(oso0Var);
                    Object objT6 = x340Var8.T();
                    if (zI5 || objT6 == m4cVar2) {
                        objT6 = new mso0(oso0Var, (byte) 2);
                        x340Var8.s0(objT6);
                    }
                    blo1.e(uwy0Var, str3, i8h1Var, function1, function2, (Function0) objT6, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 10:
                b0k b0kVar5 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                Object obj6 = fkj0.X;
                b7p0 b7p0Var = (b7p0) obj3;
                b0k b0kVar6 = (x340) b0kVar5;
                if (b0kVar6.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    u6p0 u6p0Var = ((w6p0) obj5).a;
                    if (u6p0Var instanceof u6p0) {
                        b0kVar6.i0(-1713090885);
                        Object objT7 = b0kVar6.T();
                        if (objT7 == obj6) {
                            objT7 = (sq00) b7p0Var.d.get();
                            b0kVar6.s0(objT7);
                        }
                        Boolean bool = (Boolean) obj4;
                        bool.getClass();
                        ((sq00) objT7).a(bool.booleanValue(), u6p0Var, b0kVar6, 0);
                        b0kVar6.r(false);
                    } else {
                        if (!(u6p0Var instanceof t6p0)) {
                            throw p3d1.k(b0kVar6, -1713093767, false);
                        }
                        b0kVar6.i0(-1713087798);
                        Object objT8 = b0kVar6.T();
                        if (objT8 == obj6) {
                            objT8 = (jzg) b7p0Var.e.get();
                            b0kVar6.s0(objT8);
                        }
                        ((jzg) objT8).a((t6p0) u6p0Var, (qim0) null, b0kVar6, 0);
                        b0kVar6.r(false);
                    }
                } else {
                    b0kVar6.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                g9p1.i((rnc0) obj5, (xtb0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                i9p1.k((los) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                hap1.b((gmp0) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((foe) obj5).e((String) obj4, (zkt0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                yah0.h((yaq0) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                rwq0.k((rhq0) obj5, (qim0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                x340 x340Var9 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    o4p1.g(((Context) obj5).getString(2131959287), (gt40) null, kee1.a((kee1) obj4, (z9h) obj3, (TextUnit) null, (ka30) null, (zzd1) null, 126), 1, x340Var10, 3072, 2);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                jsq0 jsq0Var = jsq0.b;
                ksq0 ksq0Var = ksq0.b;
                op71.c((bjk1) obj5, (qim0) obj4, (j2i) obj3, (b0k) obj, czo1.p(1600513));
                return rih1Var;
            case 19:
                x340 x340Var11 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    rce0.a(cwl1.B(((nhr0) obj5).g()), apo.r(145793757, new jyo0((View) obj4, (cxb) obj3, (byte) 14), x340Var12), x340Var12, 48);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var13 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    air0 air0Var = ((hcr0) obj5).P1;
                    nhr0 nhr0Var = air0Var != null ? air0Var.t.Y : null;
                    if (nhr0Var != null) {
                        x340Var14.i0(1060609398);
                        k2r0.a(nhr0Var, apo.r(869828974, new vbn0((Object) nhr0Var, obj4, obj3, (byte) 19), x340Var14), x340Var14, 48);
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(1061079327);
                        x340Var14.r(false);
                    }
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((ahi0) obj5).g((g5r0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                zho1.p((String) obj5, (Uri) obj4, (String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                zho1.z((tho1) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                x340 x340Var15 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                bmg1 bmg1Var = (bmg1) obj5;
                x340 x340Var16 = x340Var15;
                if (!x340Var16.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x340Var16.b0();
                } else if (p7h.M(new jmg1[]{fmg1.a, hmg1.a}).contains(bmg1Var.h)) {
                    x340Var16.i0(1882373264);
                    x340Var16.r(false);
                } else {
                    x340Var16.i0(1881982137);
                    j2i j2iVar = z5j.a;
                    j2i j2iVarR = apo.r(1381783709, new zvr0((iu30) obj4, bmg1Var, (dlg1) obj3), x340Var16);
                    long j = u7h.j;
                    uwr uwrVar = cbx.a;
                    ti5.a(j2iVar, (qim0) null, (vu30) null, j2iVarR, 0.0f, (erl1) null, kkn.l(j, cbx.a(x340Var16).b.a, j, x340Var16, 18), x340Var16, 3078, 182);
                    x340Var16.r(false);
                }
                return rih1Var;
            case 25:
                x340 x340Var17 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                xk xkVar = (xk) obj4;
                hxa0 hxa0Var = (hxa0) obj5;
                x340 x340Var18 = x340Var17;
                if (!x340Var18.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x340Var18.b0();
                } else if (hxa0Var.c instanceof xxa0) {
                    x340Var18.i0(359913943);
                    int i4 = hxa0Var.e;
                    int i5 = hxa0Var.f;
                    boolean zI6 = x340Var18.i(xkVar);
                    Object objT9 = x340Var18.T();
                    if (zI6 || objT9 == fkj0.X) {
                        objT9 = new rwr0(xkVar, (byte) 0);
                        x340Var18.s0(objT9);
                    }
                    eko1.m(i4, i5, (qim0) null, (sgr0) null, 0L, (Function0) null, (Function0) objT9, x340Var18, 0, 60);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(360087729);
                    uwr uwrVar2 = cbx.a;
                    bzn1.e((qim0) null, (vu30) null, false, apo.r(-1255555917, new swr0(hxa0Var, (byte) 0), x340Var18), new qgr0(((vex) zex.a.e).c), (ngr0) null, ezn1.n((es41) obj3, new tr80(0, 1, 1), x340Var18, 24576), (Function0) null, x340Var18, 2100224, 167);
                    x340Var18.r(false);
                }
                return rih1Var;
            case 26:
                x340 x340Var19 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                xk xkVar2 = (xk) obj3;
                m4c m4cVar3 = fkj0.X;
                qwr0 qwr0Var = (qwr0) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    hxa0 hxa0Var2 = (hxa0) obj5;
                    int i6 = hxa0Var2.e;
                    int i7 = hxa0Var2.f;
                    boolean zI7 = x340Var20.i(qwr0Var);
                    Object objT10 = x340Var20.T();
                    if (zI7 || objT10 == m4cVar3) {
                        objT10 = new pwr0(qwr0Var, (byte) 1);
                        x340Var20.s0(objT10);
                    }
                    Function0 function3 = (Function0) objT10;
                    boolean zI8 = x340Var20.i(xkVar2);
                    Object objT11 = x340Var20.T();
                    if (zI8 || objT11 == m4cVar3) {
                        objT11 = new rwr0(xkVar2, (byte) 1);
                        x340Var20.s0(objT11);
                    }
                    eko1.m(i6, i7, (qim0) null, (sgr0) null, 0L, function3, (Function0) objT11, x340Var20, 0, 28);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ((ywr0) obj5).f((xwr0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                ((cxr0) obj5).g((bxr0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                kno1.l((j7s0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vbn0(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vbn0(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
