package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jj50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj50(yl80 yl80Var, yxb0 yxb0Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 20;
        this.b = yl80Var;
        this.c = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:257:0x0a7d  */
    /* JADX WARN: Type inference failed for: r8v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Object obj3;
        boolean z;
        Object obj4;
        Object obj5;
        String str;
        int length;
        ?? r8;
        x340 x340Var;
        int length2;
        int length3;
        j06 j06Var;
        int i;
        cqs0 cqs0VarT;
        qim0 qim0Var;
        qim0 qim0Var2;
        boolean z2;
        float f;
        cqs0 cqs0Var;
        Object obj6;
        Object obj7;
        lee1 lee1VarA;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = null;
        rih1 rih1Var2 = rih1.a;
        Object obj8 = this.c;
        Object obj9 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vj50 vj50Var = (vj50) obj;
                tqw tqwVar = (tqw) obj2;
                Iterator it = ((c380) ((tob1) obj9).getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (u890.j(((eji0) next).a, vj50Var.a)) {
                            obj3 = next;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                eji0 eji0Var = (eji0) obj3;
                if (eji0Var != null) {
                    ((vu30) obj8).invoke(eji0Var, tqwVar);
                }
                return rih1Var2;
            case 1:
                x340 x340Var2 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                zv31 zv31Var = (zv31) obj8;
                Object obj10 = zv31Var.j;
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xpw xpwVar = (xpw) ((wp50) obj9).c.get();
                    op50 op50Var = (op50) obj10;
                    String str2 = op50Var.a;
                    String str3 = zv31Var.b.a;
                    Double d = op50Var.e;
                    Float fValueOf = Float.valueOf((float) ((d != null ? d.doubleValue() : 0.0d) * 100.0d));
                    op50 op50Var2 = (op50) obj10;
                    if (op50Var2.e == null) {
                        z = false;
                    } else {
                        Integer num = op50Var2.f;
                        if ((num != null ? num.intValue() : 0) > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    j6p1.c(new gd80(new stk1(str2, str3, "group-device-volume-slider", (ots) null, str2, fValueOf, !z, 56), xpwVar), x340Var3, 0);
                } else {
                    x340Var3.b0();
                }
                return rih1Var2;
            case 2:
                x340 x340Var4 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarX = bin.x(dug.f(nim0Var, cbx.a(x340Var5).a.c, er31.b(32.0f)), false, null, null, null, (Function0) obj9, 15);
                    ku50 ku50Var = (ku50) obj8;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var5.T);
                    xos0 xos0VarM = x340Var5.m();
                    qim0 qim0VarE = zr7.E(x340Var5, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var5.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var5.m0();
                    if (x340Var5.S) {
                        x340Var5.l(n4kVar);
                    } else {
                        x340Var5.v0();
                    }
                    nko1.H(gfh0VarC, x340Var5, y580.O0);
                    nko1.H(xos0VarM, x340Var5, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                    nko1.F(x340Var5);
                    nko1.H(qim0VarE, x340Var5, y580.Y);
                    uwo1.e(ku50Var.b, uyn1.y(nim0Var, 16.0f, 7.0f), cbx.d(x340Var5).j, cbx.a(x340Var5).b.a, null, null, 0, false, null, 0, null, x340Var5, 48, 0, 2032);
                    x340Var5.r(true);
                } else {
                    x340Var5.b0();
                }
                return rih1Var2;
            case 3:
                ((Number) obj2).intValue();
                u2o1.b((gd80) obj9, (qim0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 4:
                x340 x340Var6 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarR = u291.r(nim0Var, 32.0f);
                    uwr uwrVar2 = cbx.a;
                    w0h1.a((hux) obj9, (jsl) obj8, uyn1.x(dug.f(qim0VarR, ((vex) zex.a.e).c, d4o1.a), 8.0f), 0L, 0L, false, x340Var7, 8, 56);
                } else {
                    x340Var7.b0();
                }
                return rih1Var2;
            case 5:
                ((Number) obj2).intValue();
                ((pbq) obj9).h(czo1.p(7), (j2i) obj8, (b0k) obj);
                return rih1Var2;
            case 6:
                x340 x340Var8 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                k460 k460Var = (k460) obj9;
                x340 x340Var9 = x340Var8;
                boolean zY = x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                j06 j06Var2 = x340Var9.a;
                if (!zY) {
                    x340Var9.b0();
                    return rih1Var2;
                }
                boolean z3 = k460Var.d;
                String str4 = k460Var.b;
                String str5 = k460Var.a;
                int iMax = Math.max(1, str5.length()) * 20;
                int iMax2 = Math.max(1, str4.length()) * 20;
                Object objT = x340Var9.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    obj4 = objT;
                    hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                    x340Var9.s0(hrr0VarQ);
                    obj4 = hrr0VarQ;
                }
                obj4 = objT;
                ven0 ven0Var = (ven0) obj4;
                Object objT2 = x340Var9.T();
                Object obj11 = objT2;
                if (objT2 == m4cVar) {
                    hrr0 hrr0VarQ2 = v8r.q(Boolean.FALSE);
                    x340Var9.s0(hrr0VarQ2);
                    obj11 = hrr0VarQ2;
                }
                ven0 ven0Var2 = (ven0) obj11;
                Object objT3 = x340Var9.T();
                if (objT3 == m4cVar) {
                    vk1 vk1Var = new vk1(ven0Var, (lnm) null, (byte) 11);
                    x340Var9.s0(vk1Var);
                    obj5 = vk1Var;
                } else {
                    obj5 = objT3;
                }
                qxd0.t(rih1Var2, x340Var9, (vu30) obj5);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    length = str5.length();
                    str = str5;
                } else {
                    str = str5;
                    length = 0;
                }
                int length4 = ((Boolean) ven0Var2.getValue()).booleanValue() ? str4.length() : 0;
                if (z3 != 0) {
                    x340Var9.i0(-1081108120);
                    String str6 = str;
                    pxg1 pxg1VarO0 = irn1.o0(iMax, 0, mlv.d, 2);
                    Object objT4 = x340Var9.T();
                    if (objT4 == m4cVar) {
                        obj6 = objT4;
                        i030 i030Var = new i030(ven0Var2, (byte) 13);
                        x340Var9.s0(i030Var);
                        obj6 = i030Var;
                    }
                    obj6 = objT4;
                    iu30 iu30Var = (iu30) obj6;
                    str = str6;
                    x340Var = x340Var9;
                    length2 = ((Number) z95.c(length, pxg1VarO0, (String) null, iu30Var, x340Var9, 3072, 4).getValue()).intValue();
                    r8 = 0;
                    x340Var.r(false);
                } else {
                    r8 = 0;
                    x340Var = x340Var9;
                    x340Var.i0(1627702451);
                    x340Var.r(false);
                    length2 = str.length();
                }
                if (z3 != 0) {
                    x340Var.i0(-1080760703);
                    length3 = ((Number) z95.c(length4, irn1.o0(iMax2, r8, mlv.d, 2), (String) null, (iu30) null, x340Var, 0, 12).getValue()).intValue();
                    x340Var.r((boolean) r8);
                } else {
                    x340Var.i0(1627711987);
                    x340Var.r((boolean) r8);
                    length3 = str4.length();
                }
                boolean zY0 = ihc1.y0(k460Var.c);
                boolean z4 = !zY0;
                uwr uwrVar3 = cbx.a;
                long j = cbx.d(x340Var).j.a.b;
                if (zY0) {
                    j06Var = j06Var2;
                    i = 0;
                    x340Var.i0(-1079730542);
                    x340Var.r(false);
                    cqs0VarT = dqs0.e;
                } else {
                    x340Var.i0(-1080343009);
                    j06Var = j06Var2;
                    cqs0VarT = mqo1.t(new mmr0("subtitle_icon", new gh80(new d6t0(7, j, j), apo.r(-203609922, new gv6((Object) k460Var, cbx.a(x340Var).b.b, (byte) 6), x340Var))));
                    i = 0;
                    x340Var.r(false);
                }
                Function0 function0 = (Function0) obj8;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, i);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw 0;
                }
                x340Var.m0();
                cqs0 cqs0Var2 = cqs0VarT;
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var, lljVar4);
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 48);
                int i2 = length2;
                String str7 = str;
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0Var3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE3, lljVar4, 1.0f, true);
                gra graVar = een.d;
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int i3 = length3;
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, wnb0VarQ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                if (z3 != 0) {
                    x340Var.i0(358415342);
                    qim0Var = qim0Var3;
                    uwo1.e(k460Var.a, uyn1.B(d9y0.k(qim0Var3, 0.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).e, 0L, new a0e1(5), null, 0, false, new cjc0(2), 0, null, x340Var, 48, 0, 1768);
                    x340Var.r(false);
                } else {
                    qim0Var = qim0Var3;
                    x340Var.i0(358679989);
                    x340Var.r(false);
                }
                uwo1.e(ihc1.c1(i2, str7), uyn1.B(qim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).e, 0L, new a0e1(5), null, 0, false, new cjc0(2), 0, null, x340Var, 48, 0, 1768);
                x340Var.r(true);
                if (function0 != null) {
                    x340Var.i0(808710368);
                    op71.g(x340Var, u291.r(qim0Var, 4.0f));
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0Var4 = qim0Var;
                    qim0 qim0VarB = uyn1.B(qim0Var4, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    qim0Var2 = qim0Var4;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    rwq0.e("chevron-right", bin.x(u291.r(qim0VarB, 16.0f), false, "Navigate", new pm31(0), null, function0, 9), new jsl("Navigate"), cbx.a(x340Var).b.b, x340Var, 6, 0);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    qim0Var2 = qim0Var;
                    z2 = false;
                    x340Var.i0(809462831);
                    x340Var.r(false);
                }
                x340Var.r(true);
                gfh0 gfh0VarC3 = t1c.c(graVar, z2);
                int iHashCode5 = Long.hashCode(x340Var.T);
                xos0 xos0VarM5 = x340Var.m();
                qim0 qim0VarE5 = zr7.E(x340Var, qim0Var2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar);
                nko1.H(xos0VarM5, x340Var, lljVar2);
                x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE5, x340Var, lljVar4);
                if (z3) {
                    x340Var.i0(-1636939787);
                    f = 8.0f;
                    cqs0Var = cqs0Var2;
                    uwo1.f(who1.n(str4, z4), uyn1.B(d9y0.k(qim0Var2, 0.0f), 0.0f, 2.0f, 0.0f, 8.0f, 5), cbx.d(x340Var).j, null, new a0e1(5), null, 0, false, null, 0, null, cqs0Var, x340Var, 48, 0, 2024);
                    x340Var.r(false);
                } else {
                    f = 8.0f;
                    cqs0Var = cqs0Var2;
                    x340Var.i0(-1636626191);
                    x340Var.r(false);
                }
                uwo1.d(who1.n(ihc1.c1(i3, str4), z4), cbx.a(x340Var).b.b, uyn1.B(qim0Var2, 0.0f, 2.0f, 0.0f, f, 5), cbx.d(x340Var).j, new a0e1(5), null, 0, false, null, 0, null, cqs0Var, x340Var, 384, 0, 2016);
                x340Var.r(true);
                x340Var.r(true);
                return rih1Var2;
            case 7:
                ((Number) obj2).intValue();
                blo1.a((o960) obj9, (qim0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 8:
                ((Number) obj2).intValue();
                zmo1.g((mb60) obj9, (hjp) obj8, (b0k) obj, czo1.p(9));
                return rih1Var2;
            case 9:
                ((Number) obj2).intValue();
                kno1.f((ga60) obj9, (qim0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 10:
                x340 x340Var10 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    w2g0.c(i1p1.q(d7e.r(0.5625f, nim0Var, false), (cr31) obj9), (tl3) null, apo.r(-374235521, new uc60((hd60) obj8, false ? (byte) 1 : (byte) 0), x340Var11), x340Var11, 3072, 6);
                } else {
                    x340Var11.b0();
                }
                return rih1Var2;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                ioo1.t((ya60) obj9, (qim0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case grn1.d /* 12 */:
                x340 x340Var12 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                mf60 mf60Var = (mf60) obj9;
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nf60 nf60Var = (nf60) obj8;
                    rpo1.c(mf60Var.a.g((djc0) null, x340Var13, 1), mf60Var.b, nf60Var.b, mf60Var.c, nf60Var.c, nf60Var.a, null, x340Var13, 4104);
                } else {
                    x340Var13.b0();
                }
                return rih1Var2;
            case 13:
                float fFloatValue = ((Number) obj2).floatValue();
                ((hav0) obj).a();
                fn31.T((c9n) obj9, (o8n) null, 0, new mz2((sfx0) obj8, fFloatValue, (lnm) null, (byte) 3), 3);
                return rih1Var2;
            case 14:
                x340 x340Var14 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj8;
                x340 x340Var15 = x340Var14;
                if (!x340Var15.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var15.b0();
                } else if (((sv60) obj9).a) {
                    x340Var15.i0(-1904188432);
                    boolean zG = x340Var15.g(iu30Var2);
                    Object objT5 = x340Var15.T();
                    if (zG || objT5 == fkj0.X) {
                        obj7 = objT5;
                        u460 u460Var = new u460(iu30Var2, (byte) 10);
                        x340Var15.s0(u460Var);
                        obj7 = u460Var;
                    }
                    obj7 = objT5;
                    sto1.e(0, (Function0) obj7, x340Var15, null);
                    x340Var15.r(false);
                } else {
                    x340Var15.i0(-1904090410);
                    x340Var15.r(false);
                }
                return rih1Var2;
            case 15:
                long j2 = ((Offset) obj).a;
                drr0 drr0Var = (drr0) obj9;
                drr0Var.t(yoi1.o(drr0Var.s() * ((Number) obj2).floatValue(), 1.0f, 3.0f));
                ven0 ven0Var3 = (ven0) obj8;
                kaa0.j(drr0Var.s() == 1.0f ? 0L : Offset.g(((Offset) ven0Var3.getValue()).a, j2), ven0Var3);
                return rih1Var2;
            case 16:
                ((Number) obj2).intValue();
                ((wmy) obj9).a((qim0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 17:
                ((Number) obj2).intValue();
                i3p1.d((zs00) obj9, (qim0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 18:
                ((Number) obj2).intValue();
                ((cx0) obj9).g((String) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 19:
                ((Number) obj2).intValue();
                f5p1.c((la90) obj9, (Function0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var16 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ahs ahsVar = new ahs((iu30) obj8, (byte) 4);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var17).b;
                    cvx cvxVar3 = cbx.b(x340Var17).b;
                    cvx cvxVar4 = cbx.b(x340Var17).b;
                    w8p1.h((yl80) obj9, ahsVar, uyn1.B(nim0.a, 12.0f, 16.0f, 16.0f, 0.0f, 8), x340Var17, 0);
                } else {
                    x340Var17.b0();
                }
                return rih1Var2;
            case 21:
                ((vu30) ((ven0) obj8).getValue()).invoke((iys0) obj9, (tv80) obj2);
                return rih1Var2;
            case 22:
                ((Number) obj2).intValue();
                ((st60) obj9).d((Function0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 23:
                x340 x340Var18 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean z5 = ((o990) obj9).c instanceof l990;
                    ilz0 ilz0Var = ((klz0) obj8).b;
                    uwo1.e(z5 ? ilz0Var.a.b : ilz0Var.a.a, null, null, 0L, null, null, 0, false, null, 0, null, x340Var19, 0, 0, 2046);
                } else {
                    x340Var19.b0();
                }
                return rih1Var2;
            case 24:
                x340 x340Var20 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    String str8 = ((m5r0) obj9).e;
                    if (((ma90) obj8).b) {
                        x340Var21.i0(922930960);
                        uwr uwrVar5 = cbx.a;
                        lee1VarA = lee1.a(cbx.d(x340Var21).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, yah.a, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167);
                        x340Var21.r(false);
                    } else {
                        x340Var21.i0(923030005);
                        uwr uwrVar6 = cbx.a;
                        lee1VarA = cbx.d(x340Var21).h;
                        x340Var21.r(false);
                    }
                    uwo1.e(str8, null, lee1VarA, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var21, 0, 0, 2026);
                } else {
                    x340Var21.b0();
                }
                return rih1Var2;
            case 25:
                x340 x340Var22 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    vu30 vu30Var = ((rk90) obj9).b;
                    if (vu30Var == null) {
                        x340Var23.i0(629498869);
                        x340Var23.r(false);
                    } else {
                        x340Var23.i0(990137740);
                        vu30Var.invoke(x340Var23, 0);
                        x340Var23.r(false);
                        rih1Var = rih1Var2;
                    }
                    if (rih1Var == null) {
                        x340Var23.i0(990138136);
                        ((xk90) obj8).c.invoke(x340Var23, 0);
                    } else {
                        x340Var23.i0(990136865);
                    }
                    x340Var23.r(false);
                } else {
                    x340Var23.b0();
                }
                return rih1Var2;
            case 26:
                x340 x340Var24 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    exd0.e((xp90) obj9, (iu30) obj8, (qim0) null, x340Var25, 8);
                } else {
                    x340Var25.b0();
                }
                return rih1Var2;
            case 27:
                ((Number) obj2).intValue();
                qxd0.n((tu8) obj9, (qim0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 28:
                ((Number) obj2).intValue();
                qxd0.o((tu8) obj9, (kly0) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
            default:
                ((Number) obj2).intValue();
                rqg0.h((wr90) obj9, (iu30) obj8, (b0k) obj, czo1.p(1));
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj50(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj50(k460 k460Var, Function0 function0) {
        super(2);
        this.a = (byte) 6;
        this.b = k460Var;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj50(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
