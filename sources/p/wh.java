package p;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wh extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh(Object obj, Object obj2, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public static final z5o0 a(ven0 ven0Var) {
        return (z5o0) ven0Var.getValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        long jE;
        dgm0 wfm0Var;
        String str;
        String str2;
        p410 p410Var;
        Integer num;
        boolean z;
        iu30 iu30Var;
        b0k b0kVar;
        boolean z2;
        boolean z3;
        byte b = this.a;
        byte b2 = 13;
        nim0 nim0Var = nim0.a;
        boolean z4 = true;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new vh((wpw) obj6, (Context) obj2, (ViewGroup) obj3, (d75) obj, (iu30) obj4, (wf) obj5);
            case 1:
                mmr0 mmr0Var = (mmr0) obj2;
                x340 x340Var = (b0k) obj3;
                ((Number) obj4).intValue();
                c380 c380Var = (c380) mmr0Var.a;
                l90 l90Var = (l90) mmr0Var.b;
                xtb0 xtb0Var = (xtb0) obj6;
                i25 i25Var = xtb0Var.e;
                if (k90.a[((pay) ((wa5) obj).a.a().d.getValue()).ordinal()] == 1) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(1114729187);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(196896005);
                    Object objT = x340Var3.T();
                    if (objT == fkj0.X) {
                        objT = new xtb0(((err0) i25Var.b).s(), ((err0) i25Var.c).s());
                        x340Var3.s0(objT);
                    }
                    xtb0Var = (xtb0) objT;
                    x340Var3.r(false);
                }
                m0p1.d(c380Var, l90Var, xtb0Var, (vzq0) obj5, null, x340Var, 0, 16);
                return rih1Var;
            case 2:
                ((qu1) obj6).b.J(((nu1) obj5).a, (vzq0) obj2, (b0k) obj3, Integer.valueOf(((Number) obj4).intValue() & 112));
                return rih1Var;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var4 = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                int i = (iIntValue & 6) == 0 ? iIntValue | (x340Var4.h(zBooleanValue) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= x340Var4.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(i & 1, (i & 147) != 146)) {
                    q01 q01Var = ((ow1) obj5).n;
                    n8b1 n8b1Var = upo.l;
                    int i2 = i << 3;
                    w8p1.e((upo) obj6, zBooleanValue, iu30Var2, q01Var, x340Var5, 8 | (i2 & 112) | (i2 & 896));
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                ((Boolean) obj2).getClass();
                ((Number) obj4).intValue();
                g7m1 g7m1Var = (g7m1) obj5;
                oe6 oe6Var = (oe6) obj6;
                x340 x340Var6 = (b0k) obj3;
                x340Var6.i0(1695521360);
                Object objT2 = x340Var6.T();
                m4c m4cVar = fkj0.X;
                if (objT2 == m4cVar) {
                    objT2 = mno1.a(-2, 0, 6);
                    x340Var6.s0(objT2);
                }
                jfe jfeVar = (jfe) objT2;
                boolean zI = x340Var6.i(jfeVar);
                Object objT3 = x340Var6.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new zw11(jfeVar, (byte) 16);
                    x340Var6.s0(objT3);
                }
                qxd0.i(rih1Var, (iu30) objT3, x340Var6);
                ven0 ven0VarS = v8r.s(jfeVar, x340Var6);
                Integer numValueOf = Integer.valueOf(iIntValue2);
                boolean zI2 = x340Var6.i(oe6Var) | x340Var6.i(g7m1Var) | x340Var6.g(ven0VarS);
                Object objT4 = x340Var6.T();
                if (zI2 || objT4 == m4cVar) {
                    vs0 vs0Var = new vs0((Object) oe6Var, (Object) g7m1Var, (Object) ven0VarS, (lnm) null, (byte) 4);
                    x340Var6.s0(vs0Var);
                    objT4 = vs0Var;
                }
                qxd0.t(numValueOf, x340Var6, (vu30) objT4);
                x340Var6.r(false);
                return jfeVar;
            case 5:
                ((Number) obj3).intValue();
                String str3 = (String) obj5;
                return new mnl0(new sqk0(new fjl0((r6h1) obj4, (byte) 17), ((n6r0) obj6).path(), str3), str3);
            case 6:
                txj txjVar = (txj) obj6;
                String str4 = (String) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var7 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? (x340Var7.g(str4) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= x340Var7.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i3 & 1, (i3 & 147) != 146)) {
                    txjVar.a(48, apo.r(-211940816, new jxj((cxc0) obj5, txjVar, str4, iIntValue3), x340Var8), x340Var8, anm1.N("list_ux_platform_section_with_description: ".concat(str4), nim0Var));
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                b0k b0kVar2 = (b0k) obj3;
                ((Number) obj4).intValue();
                err0 err0Var = (hdn0) obj6;
                int iS = err0Var.s();
                uwr uwrVar = cbx.a;
                jhc1.d(iS, dug.f(u291.f(nim0Var, 1.0f), cbx.a(b0kVar2).a.c, d4o1.a), cbx.a(b0kVar2).a.a.a(), 0, (xu30) null, apo.r(1692209648, new jjk((lkk) obj5, err0Var, (byte) 1), b0kVar2), b0kVar2, 196608, 24);
                return rih1Var;
            case 8:
                return new as0(((rsw) obj6).a((Context) obj2, (ViewGroup) obj3, ((d75) obj).c, (iu30) obj4), (iu30) obj5, (byte) 9);
            case 9:
                ((Number) obj).intValue();
                String str5 = (String) obj2;
                x340 x340Var9 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= x340Var9.g(str5) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    otw.c((tyq) obj6, new uv11(str5, (String) obj5, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 10:
                int iIntValue6 = ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                pm10 pm10Var = (pm10) obj6;
                c380 c380Var2 = pm10Var.c;
                rn10 rn10Var = (rn10) c380Var2.get(iIntValue6);
                h0y h0yVar = (h0y) obj5;
                x340 x340Var11 = (b0k) obj3;
                Object objT5 = x340Var11.T();
                m4c m4cVar2 = fkj0.X;
                if (objT5 == m4cVar2) {
                    hvb1 hvb1Var = new hvb1((t7y) ((mjv) h0yVar.b).b);
                    x340Var11.s0(hvb1Var);
                    objT5 = hvb1Var;
                }
                hvb1 hvb1Var2 = (hvb1) objT5;
                uwr uwrVar2 = cbx.a;
                long jQ = cbx.a(x340Var11).a.c;
                String str6 = rn10Var.f;
                String str7 = rn10Var.a;
                amh0 amh0Var = rn10Var.c;
                boolean zG = x340Var11.g(str6);
                Object objT6 = x340Var11.T();
                if (zG || objT6 == m4cVar2) {
                    try {
                        jQ = rjo1.q(rn10Var.f);
                    } catch (IllegalArgumentException e) {
                        n57.g(rn10Var.toString(), e);
                    }
                    long j = jQ;
                    objT6 = p7h.M(new u7h[]{new u7h(jQ), new u7h(u7h.b(j, 0.9f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))});
                    x340Var11.s0(objT6);
                    break;
                }
                List list = (List) objT6;
                boolean zG2 = x340Var11.g(rn10Var);
                Object objT7 = x340Var11.T();
                if (zG2 || objT7 == m4cVar2) {
                    Map map = tm10.a;
                    hux huxVar = (hux) tm10.a.get(rn10Var.i);
                    String str8 = rn10Var.b;
                    String str9 = rn10Var.d;
                    String str10 = rn10Var.h;
                    if (str10.length() > 0) {
                        jE = rjo1.q(str10);
                    } else {
                        n57.e("Failed to parse tint value: ".concat(str7));
                        jE = z4p1.e(Color.parseColor("#1ED760"));
                    }
                    long j2 = jE;
                    ur20 ur20Var = rn10Var.e;
                    objT7 = new db30(str8, huxVar, str7, str9, j2, ur20Var != null ? new cb30(ur20Var.a, ur20Var.b) : null, rn10Var.j);
                    x340Var11.s0(objT7);
                }
                db30 db30Var = (db30) objT7;
                boolean zG3 = x340Var11.g(amh0Var);
                Object objT8 = x340Var11.T();
                if (zG3 || objT8 == m4cVar2) {
                    if (amh0Var instanceof zlh0) {
                        wfm0Var = new dgm0(((zlh0) amh0Var).a);
                    } else {
                        if (!(amh0Var instanceof ylh0)) {
                            eg.o();
                            return null;
                        }
                        ylh0 ylh0Var = (ylh0) amh0Var;
                        wfm0Var = new wfm0(ylh0Var.a, new dgm0(ylh0Var.b.a));
                    }
                    objT8 = wfm0Var;
                    x340Var11.s0(objT8);
                }
                mhm0 mhm0Var = (mhm0) objT8;
                if (c380Var2.size() > 1) {
                    x340Var11.i0(-1260838580);
                    str = db30Var.a + " " + cwl1.o0(x340Var11, 2131962931) + " " + (iIntValue6 + 1);
                    x340Var11.r(false);
                } else {
                    x340Var11.i0(-1260734141);
                    x340Var11.r(false);
                    str = db30Var.a;
                }
                fvb1 fvb1Var = new fvb1(pm10Var.a, iIntValue6, db30Var, mhm0Var, list, rn10Var.g);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean zG4 = x340Var11.g(str);
                Object objT9 = x340Var11.T();
                if (zG4 || objT9 == m4cVar2) {
                    objT9 = new kq00(str, (byte) 14);
                    x340Var11.s0(objT9);
                }
                otw.c(hvb1Var2, fvb1Var, s161.b(qim0VarD, true, (iu30) objT9), (ipb1) null, x340Var11, 0, 8);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new b14((Context) obj2, (gu8) obj6, (kt91) obj5, (iu30) obj4);
            case grn1.d /* 12 */:
                int iIntValue7 = ((Number) obj3).intValue();
                fef0 fef0Var = ((a9h) obj5).a;
                eel0 eel0Var = new eel0(Integer.valueOf(iIntValue7), ((dof1) obj6).d, (r6h1) obj4);
                nw50 nw50Var = ((jw50) obj2).a;
                if (nw50Var instanceof kw50) {
                    return new ael0(eel0Var);
                }
                if (nw50Var instanceof lw50) {
                    return new bel0(eel0Var);
                }
                if (!(nw50Var instanceof mw50)) {
                    eg.o();
                    return null;
                }
                String str11 = fef0Var.d;
                def0 def0Var = (def0) o7h.s0(fef0Var.c);
                if (def0Var == null || (str2 = def0Var.a) == null) {
                    str2 = (String) o7h.q0(fef0Var.i);
                }
                return new del0(eel0Var, str11, str2);
            case 13:
                int iIntValue8 = ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                otw.c((tyq) ((df60) obj6).c.getValue(), ((ye60) obj5).c.get(iIntValue8), (qim0) null, (ipb1) null, (b0k) obj3, 0, 12);
                return rih1Var;
            case 14:
                Context context = (Context) obj2;
                ViewGroup viewGroup = (ViewGroup) obj3;
                iu30 iu30Var3 = (iu30) obj4;
                epq epqVar = (epq) obj6;
                switch (epqVar.a) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        wdm wdmVar = (wdm) epqVar.b.c;
                        gw70 gw70VarB = ((cbg1) wdmVar.b).b();
                        c8o.l(gw70VarB);
                        p410Var = new p410(context, viewGroup, gw70VarB, (wx70) ((jly0) wdmVar.f).get());
                        break;
                    default:
                        f0a f0aVar = (f0a) epqVar.b.c;
                        gw70 gw70VarB2 = ((cbg1) f0aVar.b).b();
                        c8o.l(gw70VarB2);
                        p410Var = new p410(context, viewGroup, gw70VarB2, (wx70) ((jly0) f0aVar.f).get());
                        break;
                }
                return new u3(p410Var, (u710) ((rt01) obj5).d, iu30Var3);
            case 15:
                int iIntValue9 = ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                bin.i((k990) ((c380) obj6).get(iIntValue9), (sip) obj5, u291.d(nim0Var, 1.0f), (b0k) obj3, 0);
                return rih1Var;
            case 16:
                ljd0 ljd0Var = (ljd0) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var12 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i4 = (iIntValue10 & 6) == 0 ? (x340Var12.g(ljd0Var) ? 4 : 2) | iIntValue10 : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i4 |= x340Var12.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(i4 & 1, (i4 & 147) != 146)) {
                    mod.b(oi7.a.a(((ufx) obj6).b), apo.r(-454569282, new mb90((djd0) obj5, ljd0Var, iu30Var4, (byte) 26), x340Var13), x340Var13, 56);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 17:
                int iIntValue11 = ((Number) obj2).intValue();
                int iIntValue12 = ((Number) obj4).intValue();
                gmd0 gmd0Var = (gmd0) obj6;
                dc81 dc81Var = (dc81) gmd0Var.a.d.get(iIntValue11);
                rv21 rv21Var = (rv21) gmd0Var.b.get(dc81Var.c);
                vu30 vu30Var = (vu30) obj5;
                x340 x340Var14 = (b0k) obj3;
                boolean zG5 = x340Var14.g(vu30Var) | ((((iIntValue12 & 112) ^ 48) > 32 && x340Var14.e(iIntValue11)) || (iIntValue12 & 48) == 32) | x340Var14.g(dc81Var);
                Object objT10 = x340Var14.T();
                if (zG5 || objT10 == fkj0.X) {
                    objT10 = new wv1(vu30Var, iIntValue11, dc81Var, b2);
                    x340Var14.s0(objT10);
                }
                s1p1.p(dc81Var, rv21Var, null, (Function0) objT10, x340Var14, 0);
                return rih1Var;
            case 18:
                int iIntValue13 = ((Number) obj4).intValue();
                eio1.n((List) obj, ((gwd0) obj6).d.a, (lb50) obj5, (qim0) obj2, (b0k) obj3, (iIntValue13 & 14) | ((iIntValue13 << 6) & 7168));
                return rih1Var;
            case 19:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                c9 c9Var = (c9) obj2;
                b0k b0kVar3 = (b0k) obj3;
                ((Number) obj4).intValue();
                m4c m4cVar3 = fkj0.X;
                kuw0 kuw0Var = c9Var.b() == 1 ? h36.b : i5x0.O0;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                xym xymVar = (xym) obj6;
                iu30 iu30Var5 = (iu30) obj5;
                jw31 jw31VarA = ew31.a(kuw0Var, een.N0, b0kVar3, 48);
                x340 x340Var15 = (x340) b0kVar3;
                Integer num2 = 0;
                int iHashCode = Long.hashCode(x340Var15.T);
                xos0 xos0VarM = x340Var15.m();
                qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
                hzj.A.getClass();
                x340 x340Var16 = (x340) b0kVar3;
                if (x340Var16.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                boolean z5 = x340Var16.S;
                n4k n4kVar = hmb0.t1;
                if (z5) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(jw31VarA, b0kVar3, lljVar4);
                nko1.H(xos0VarM, b0kVar3, lljVar3);
                i3a.l(iHashCode, b0kVar3, lljVar2, b0kVar3);
                nko1.H(qim0VarE, b0kVar3, lljVar);
                x340Var16.i0(-1820680169);
                boolean z6 = false;
                ListIterator listIterator = c9Var.listIterator(0);
                while (listIterator.hasNext()) {
                    wym wymVar = (wym) listIterator.next();
                    gfh0 gfh0VarC = t1c.c(een.d, z6);
                    ListIterator listIterator2 = listIterator;
                    int iHashCode2 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM2 = x340Var16.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar3, nim0Var);
                    hzj.A.getClass();
                    x340Var16.m0();
                    iu30 iu30Var6 = iu30Var5;
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(gfh0VarC, b0kVar3, lljVar4);
                    nko1.H(xos0VarM2, b0kVar3, lljVar3);
                    i3a.l(iHashCode2, b0kVar3, lljVar2, b0kVar3);
                    nko1.H(qim0VarE2, b0kVar3, lljVar);
                    if (wymVar instanceof qym) {
                        x340Var16.i0(855091825);
                        num = num2;
                        xymVar.a.invoke(b0kVar3, num);
                        z = false;
                        x340Var16.r(false);
                    } else {
                        num = num2;
                        z = false;
                        if (wymVar instanceof rym) {
                            x340Var16.i0(855094099);
                            xymVar.b.invoke(b0kVar3, num);
                            x340Var16.r(false);
                        } else if (wymVar instanceof sym) {
                            x340Var16.i0(855096501);
                            xymVar.c.invoke(b0kVar3, num);
                            x340Var16.r(false);
                        } else if (wymVar instanceof tym) {
                            x340Var16.i0(855098840);
                            xymVar.d.invoke(b0kVar3, num);
                            x340Var16.r(false);
                        } else if (wymVar instanceof vym) {
                            x340Var16.i0(855101470);
                            xymVar.e.invoke(b0kVar3, num);
                            x340Var16.r(false);
                        } else {
                            if (wymVar instanceof uym) {
                                x340Var16.i0(855103837);
                                u7n0.s((qim0) null, b0kVar3, 0);
                                x340Var16.r(false);
                            } else {
                                if (!(wymVar instanceof pym)) {
                                    throw p3d1.k(x340Var16, 855090990, false);
                                }
                                x340Var16.i0(738502810);
                                String strO0 = cwl1.o0(b0kVar3, 2131957825);
                                String strO1 = cwl1.o0(b0kVar3, 2131957826);
                                qim0 qim0VarN = anm1.N("#LyricsFullscreenContextMenuButtonTag", nim0Var);
                                boolean zG6 = x340Var16.g(strO0);
                                Object objT11 = x340Var16.T();
                                if (zG6 || objT11 == m4cVar3) {
                                    objT11 = new z9b0(strO0, (byte) 19);
                                    x340Var16.s0(objT11);
                                }
                                qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT11);
                                gpx gpxVar = gpx.c;
                                iu30Var = iu30Var6;
                                boolean zG7 = x340Var16.g(iu30Var);
                                Object objT12 = x340Var16.T();
                                if (zG7 || objT12 == m4cVar3) {
                                    objT12 = new uef0(iu30Var, (byte) 10);
                                    x340Var16.s0(objT12);
                                }
                                b0kVar = b0kVar3;
                                u7n0.c(gpxVar, new gbx(new y50(strO1), (Function0) objT12), qim0VarB, (Function0) null, b0kVar, gpx.d | 48);
                                z2 = false;
                                x340Var16.r(false);
                                z3 = true;
                            }
                            x340Var16.r(z3);
                            iu30Var5 = iu30Var;
                            num2 = num;
                            z6 = z2;
                            b0kVar3 = b0kVar;
                            listIterator = listIterator2;
                        }
                    }
                    z2 = z;
                    b0kVar = b0kVar3;
                    z3 = true;
                    iu30Var = iu30Var6;
                    x340Var16.r(z3);
                    iu30Var5 = iu30Var;
                    num2 = num;
                    z6 = z2;
                    b0kVar3 = b0kVar;
                    listIterator = listIterator2;
                }
                x340Var16.r(z6);
                x340Var16.r(true);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int iIntValue14 = ((Number) obj).intValue();
                int iIntValue15 = ((Number) obj4).intValue();
                ((j2i) obj6).c1((mey0) obj2, Integer.valueOf(iIntValue14), (kgi0) obj5, (b0k) obj3, Integer.valueOf(((iIntValue15 >> 3) & 14) | ((iIntValue15 << 3) & 112)));
                return rih1Var;
            case 21:
                ven0 ven0Var = (ven0) obj;
                vu30 vu30Var2 = (vu30) obj2;
                x340 x340Var17 = (b0k) obj3;
                ((Number) obj4).intValue();
                p8r0 p8r0Var = (p8r0) obj6;
                lmw lmwVar = p8r0Var.c;
                fx60 fx60Var = ((hx60) obj5).h;
                if (fx60Var == null) {
                    u890.C("data");
                    throw null;
                }
                lmwVar.b(fx60Var, (z5o0) ven0Var.getValue(), (qim0) null, apo.r(-1571026925, new k7f((byte) 25, vu30Var2, false), x340Var17), x340Var17, 3072);
                z5o0 z5o0Var = (z5o0) ven0Var.getValue();
                x340 x340Var18 = x340Var17;
                boolean zI3 = x340Var18.i(p8r0Var) | x340Var18.i(ven0Var);
                Object objT13 = x340Var18.T();
                if (zI3 || objT13 == fkj0.X) {
                    objT13 = new xw0(p8r0Var, ven0Var, (lnm) null, (byte) 8);
                    x340Var18.s0(objT13);
                }
                qxd0.t(z5o0Var, x340Var18, (vu30) objT13);
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                String str12 = ((bcb0) obj6).a;
                iu30 iu30Var7 = (iu30) obj5;
                x340 x340Var19 = (b0k) obj3;
                boolean zG8 = x340Var19.g(iu30Var7);
                Object objT14 = x340Var19.T();
                if (zG8 || objT14 == fkj0.X) {
                    objT14 = new dgq0(iu30Var7, (byte) 13);
                    x340Var19.s0(objT14);
                }
                rzn1.f(str12, new gbx(z50.c, (Function0) objT14), null, x340Var19, 0);
                rqo1.g(0, 1, x340Var19, null);
                return rih1Var;
            case 23:
                int iIntValue16 = ((Number) obj).intValue();
                vcl vclVar = (vcl) obj2;
                x340 x340Var20 = (b0k) obj3;
                int iIntValue17 = ((Number) obj4).intValue();
                String str13 = vclVar.a;
                if ((((iIntValue17 & 14) ^ 6) <= 4 || !x340Var20.e(iIntValue16)) && (iIntValue17 & 6) != 4) {
                    z4 = false;
                }
                x340 x340Var21 = x340Var20;
                Object objT15 = x340Var21.T();
                if (z4 || objT15 == fkj0.X) {
                    objT15 = new po60(iIntValue16, (byte) 19);
                    x340Var21.s0(objT15);
                }
                dgo1.c(str13, (iu30) objT15, apo.r(-1150054350, new tbs0((p40) obj6, vclVar, (iu30) obj5, (byte) 4), x340Var21), x340Var21, 384);
                return rih1Var;
            case 24:
                return new b14((Context) obj2, (ViewGroup) obj3, (iu30) obj4, (u63) obj6, (iu30) obj5);
            case 25:
                return new ipl0(Integer.valueOf(((Number) obj3).intValue()), ((n6r0) obj6).path(), ((lik1) obj5).a, (r6h1) obj4);
            case 26:
                iiw0 iiw0Var = (oiw0) obj2;
                x340 x340Var22 = (b0k) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                giw0 giw0Var = (giw0) obj6;
                if (iiw0Var instanceof iiw0) {
                    x340 x340Var23 = x340Var22;
                    x340Var23.i0(864090008);
                    fiw0.d(iiw0Var, giw0Var, x340Var23, (iIntValue18 >> 3) & 14);
                    x340Var23.r(false);
                } else if (iiw0Var instanceof miw0) {
                    x340 x340Var24 = x340Var22;
                    x340Var24.i0(864092206);
                    fiw0.g((miw0) iiw0Var, giw0Var, (Function0) obj5, x340Var24, (iIntValue18 >> 3) & 14);
                    x340Var24.r(false);
                } else if (iiw0Var instanceof niw0) {
                    x340 x340Var25 = x340Var22;
                    x340Var25.i0(864095561);
                    fiw0.f((niw0) iiw0Var, giw0Var, x340Var25, (iIntValue18 >> 3) & 14);
                    x340Var25.r(false);
                } else if (iiw0Var instanceof jiw0) {
                    x340 x340Var26 = x340Var22;
                    x340Var26.i0(864097948);
                    fiw0.b(giw0Var, x340Var26, 0);
                    x340Var26.r(false);
                } else if ((iiw0Var instanceof liw0) || (iiw0Var instanceof kiw0)) {
                    x340 x340Var27 = x340Var22;
                    x340Var27.i0(864101336);
                    fiw0.h(iiw0Var, giw0Var, x340Var27, (iIntValue18 >> 3) & 14);
                    x340Var27.r(false);
                } else {
                    if (!(iiw0Var instanceof hiw0)) {
                        throw p3d1.k(x340Var22, 864088732, false);
                    }
                    x340 x340Var28 = x340Var22;
                    x340Var28.i0(864103323);
                    fiw0.c((hiw0) iiw0Var, giw0Var, x340Var28, (iIntValue18 >> 3) & 14);
                    x340Var28.r(false);
                }
                return rih1Var;
            case 27:
                z6x0 z6x0Var = (z6x0) obj;
                iu30 iu30Var8 = (iu30) obj2;
                int iIntValue19 = ((Number) obj4).intValue();
                m3x0 m3x0Var = z6x0Var.a;
                x340 x340Var29 = (b0k) obj3;
                boolean zG9 = x340Var29.g(m3x0Var.a);
                x3x0 x3x0Var = (x3x0) obj5;
                Object objT16 = x340Var29.T();
                if (zG9 || objT16 == fkj0.X) {
                    ckq ckqVar = x3x0Var.p;
                    String str14 = m3x0Var.a;
                    qq qqVar = (qq) ckqVar.a.c;
                    lzn0 lzn0Var = (lzn0) ((n3x0) qqVar.b).n.get();
                    c8o.l(lzn0Var);
                    kt91 kt91Var = (kt91) ((n3x0) qqVar.b).k.get();
                    c8o.l(kt91Var);
                    objT16 = new v7x0(lzn0Var, kt91Var, str14);
                    x340Var29.s0(objT16);
                }
                c921.j(z6x0Var, iu30Var8, (sdx0) obj6, (v7x0) objT16, (o3x0) x3x0Var.o.get(), x3x0Var.q, x340Var29, (iIntValue19 & 126) | 4096);
                return rih1Var;
            case 28:
                return new vmx0((Context) obj2, (ViewGroup) obj3, (qfv) obj6, (kly0) obj5, (byte) 1);
            default:
                ((Number) obj4).intValue();
                ((iuj) ((kly0) ((pt) obj6).d).get()).a(new hvl1((String) obj2, 182, (String) null, (String) null, true, (String) obj5), (b0k) obj3, 0);
                return rih1Var;
        }
    }
}
