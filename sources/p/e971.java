package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e971 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e971(List list, mxf0 mxf0Var, String str, yp71 yp71Var) {
        super(1);
        this.a = (byte) 24;
        this.e = list;
        this.c = mxf0Var;
        this.b = str;
        this.d = yp71Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0166  */
    /* JADX WARN: Code duplicated, block: B:32:0x016f  */
    /* JADX WARN: Code duplicated, block: B:37:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x019f  */
    public final Object invoke(Object obj) {
        zg81 zg81Var;
        wv31 wv31Var;
        boolean z;
        byte b = this.a;
        byte b2 = 7;
        byte b3 = 3;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                xh71.b(((f971) obj3).a, new wa71((String) obj5, (String) obj4, null, null, null, null, null, 124), (Bundle) null, tm71.b, (tv80) obj, (List) obj2, 2);
                return rih1Var;
            case 1:
                tv80 tv80Var = (tv80) obj;
                xh71 xh71Var = ((xf60) obj4).a;
                g771 g771Var = (g771) obj3;
                wa71 wa71Var = new wa71(g771Var.a, null, null, null, null, null, null, 126);
                Bundle bundleH = mno1.h(new mmr0[]{new mmr0("share.entity.name", g771Var.b), new mmr0("format.list.type", (String) obj5)});
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    bundleH.putString((String) entry.getKey(), (String) entry.getValue());
                }
                xh71.b(xh71Var, wa71Var, bundleH, tm71.b, tv80Var, (List) null, 16);
                return rih1Var;
            case 2:
                nk20 nk20Var = (nk20) obj;
                nk20Var.a((q3e) obj5, new i2n0(acc1.class, (byte) 1));
                nk20Var.a((a3l1) obj4, new i2n0(b3l1.class, (byte) 1));
                nk20Var.a((jl00) obj3, new i2n0(zf60.class, (byte) 1));
                nk20Var.a((h5a1) obj2, new i2n0(dgm1.class, (byte) 1));
                return rih1Var;
            case 3:
                rtb0 rtb0Var = (rtb0) obj;
                xx71 xx71Var = (xx71) obj4;
                ven0 ven0Var = (ven0) obj3;
                ze71 ze71Var = (ze71) obj2;
                for (Map.Entry entry2 : ((Map) obj5).entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    rtb0.f(rtb0Var, str, new j2i(1277528763, new pm6(str, b2), true), 2);
                    rtb0Var.e(list.size(), new rw11(list, (byte) 12), new rw11(list, (byte) 13), new j2i(2039820996, new oi1(list, xx71Var, ven0Var, ze71Var, (byte) 13), true));
                }
                if (xx71Var.h) {
                    rtb0.c(rtb0Var, (Object) null, ihj.c, 3);
                }
                return rih1Var;
            case 4:
                lsl lslVar = (lsl) obj;
                tw4 tw4Var = (tw4) obj3;
                m811 m811Var = (m811) obj4;
                lslVar.s1();
                float fX0 = lslVar.X0(1.0f);
                float fX1 = lslVar.X0(16.0f);
                o811 o811Var = (o811) obj5;
                if (!Size.c(lslVar.j(), o811Var.a) || fX1 != m811Var.a) {
                    o811Var.a = lslVar.j();
                    m811Var.a = fX1;
                    tw4Var.n();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L));
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fX1)) << 32) | (((long) Float.floatToRawIntBits(fX1)) & 4294967295L);
                    tw4Var.e(ila0.e(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), 1);
                }
                float fIntBitsToFloat3 = (((float) (((double) fX1) * 3.141592653589793d)) * 2.0f) + ((Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) + Float.intBitsToFloat((int) (lslVar.j() >> 32))) * 2.0f);
                float f = fIntBitsToFloat3 / 2.0f;
                DrawScope.j1(lslVar, tw4Var, new mic0(0, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), dz71.a, (List) null), 0.0f, new phc1(fX0, 0.0f, 0, 0, cgj1.t((((Number) ((o95) obj2).e()).floatValue() * fIntBitsToFloat3) - f, new float[]{fIntBitsToFloat3 / 10.0f, f}), 14), 52);
                return rih1Var;
            case 5:
                rtb0 rtb0Var2 = (rtb0) obj;
                c380 c380Var = (c380) obj5;
                ven0 ven0Var2 = (ven0) obj4;
                rtb0Var2.e(c380Var.size(), new rw11(c380Var, (byte) 14), new rw11(c380Var, (byte) 15), new j2i(2039820996, new d311(b3, ven0Var2, (vu30) obj3, c380Var), true));
                rtb0.c(rtb0Var2, (Object) null, new j2i(913837430, new pme0(ven0Var2, (Function0) obj2, (byte) 1), true), 3);
                return rih1Var;
            case 6:
                nqw nqwVar = (nqw) obj;
                wg81 wg81Var = (wg81) obj4;
                zg81 zg81Var2 = (zg81) obj5;
                if (zg81Var2.a.a() != 1) {
                    zg81Var = zg81Var2;
                    nqwVar.a(-1, new j2i(-705178647, new gh61((mih1) obj3, zg81Var2, wg81Var, (iu30) obj2, (byte) 7), true));
                } else {
                    zg81Var = zg81Var2;
                }
                List list2 = wg81Var.a;
                j2i j2iVar = new j2i(349562097, new rt11((Object) zg81Var, (Object) wg81Var, (byte) 23), true);
                for (Object obj6 : list2) {
                    nqwVar.a(Integer.valueOf(((ug81) obj6).a), new j2i(-66453204, new vvb(j2iVar, obj6, (byte) 3), true));
                }
                return rih1Var;
            case 7:
                double dDoubleValue = ((Number) obj).doubleValue();
                i79 i79Var = (i79) obj4;
                s69 s69Var = (s69) obj5;
                if (s69Var == null || i79Var == null) {
                    return null;
                }
                return (String) ((xu30) ((ven0) obj3).getValue()).invoke(((iu30) ((ven0) obj2).getValue()).invoke(Double.valueOf(dDoubleValue)), s69Var, i79Var);
            case 8:
                c380 c380Var2 = ((rba1) obj4).a;
                ((kex) obj).b(c380Var2.size(), new j2i(1658481532, new kj21((Object) c380Var2, obj3, obj5, obj2, (byte) 16), true), new nec0(c380Var2, (byte) 25));
                return rih1Var;
            case 9:
                ((qtr) obj).b(new nhi0((a0i1) obj5, (xu30) obj4, (xu30) obj3, (los) obj2, null, (byte) 2));
                return rih1Var;
            case 10:
                tv80 tv80Var2 = (tv80) obj;
                ua91 ua91Var = (ua91) obj3;
                if (((bp90) ((c9c0) ua91Var.c).e.a().getValue()).b) {
                    fn31.T(cto1.q((dg30) ua91Var.b), (o8n) null, 0, new qt61((byte) 4, (Object) ua91Var, (Object) tv80Var2, obj5, obj4, obj2, (lnm) null), 3);
                } else {
                    ((lzn0) ua91Var.e).a(sap1.s("inline_upsell:jam_upsell_not_in_jam", nik1.b2), tv80Var2, (Bundle) null);
                }
                return rih1Var;
            case 11:
                DrawScope drawScope = (DrawScope) obj;
                afx afxVar = (afx) obj5;
                tob1 tob1Var = (tob1) obj4;
                if (((Number) tob1Var.getValue()).floatValue() >= 1.0f) {
                    DrawScope.d0(drawScope, afxVar.a.a.c(), 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                } else {
                    Float fValueOf = Float.valueOf(0.0f);
                    u7h u7hVar = (u7h) ((tob1) obj3).getValue();
                    long j = u7hVar.a;
                    mmr0 mmr0Var = new mmr0(fValueOf, u7hVar);
                    Float fValueOf2 = Float.valueOf(1.0f);
                    u7h u7hVar2 = (u7h) ((tob1) obj2).getValue();
                    long j2 = u7hVar2.a;
                    DrawScope.S0(drawScope, v9c.p(new mmr0[]{mmr0Var, new mmr0(fValueOf2, u7hVar2)}, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) * 0.5f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 0.5f)) & 4294967295L), Math.max(Float.intBitsToFloat((int) (drawScope.j() >> 32)), Float.intBitsToFloat((int) (4294967295L & drawScope.j()))), 8), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                    if (((Number) tob1Var.getValue()).floatValue() > 0.0f) {
                        DrawScope.d0(drawScope, afxVar.a.a.c(), 0L, 0L, ((Number) tob1Var.getValue()).floatValue(), (phc1) null, (ColorFilter) null, 118);
                    }
                }
                return rih1Var;
            case 12:
                dhl dhlVar = (dhl) obj;
                u1p1.C(dhlVar, (((String) obj5) == null && ((vu30) obj4) == null) ? false : true);
                yf.p(dhlVar.e, ((ihl) obj3).g, 8.0f, 4);
                yf.p(dhlVar.g, ((ihl) obj2).e, 0.0f, 2);
                return rih1Var;
            case 13:
                kd31 kd31Var = (kd31) obj;
                tie1 tie1Var = (tie1) obj5;
                kd31Var.n(tie1Var.a * 15.0f);
                kd31Var.l((-tie1Var.b) * 15.0f);
                drr0 drr0Var = (drr0) obj4;
                kd31Var.q(drr0Var.s());
                kd31Var.r(drr0Var.s());
                ven0 ven0Var3 = (ven0) obj3;
                kd31Var.C(Float.intBitsToFloat((int) (((Offset) ven0Var3.getValue()).a >> 32)));
                drr0 drr0Var2 = (drr0) obj2;
                kd31Var.E(drr0Var2.s() + Float.intBitsToFloat((int) (((Offset) ven0Var3.getValue()).a & 4294967295L)));
                kd31Var.b(yoi1.o(1.0f - (drr0Var2.s() / (Float.intBitsToFloat((int) (kd31Var.R0 & 4294967295L)) * 1.5f)), 0.45f, 1.0f));
                kd31Var.e(kd31Var.T0.h() * 18.0f);
                kd31Var.i(1);
                return rih1Var;
            case 14:
                int iIntValue = ((Number) obj).intValue();
                err0 err0Var = (hdn0) obj3;
                if (iIntValue != err0Var.s() && ((ane1) obj5).i) {
                    sam1.b((qam1) obj4);
                }
                ((ven0) obj2).setValue(Boolean.FALSE);
                err0Var.t(iIntValue);
                return rih1Var;
            case 15:
                ven0 ven0Var4 = (ven0) obj2;
                Paint paint = (Paint) obj4;
                paint.setColor(z4p1.G(u7h.b(((u7h) ven0Var4.getValue()).a, u7h.c(((u7h) ven0Var4.getValue()).a) * ((Number) ((o95) obj5).e()).floatValue(), 0.0f, 0.0f, 0.0f, 14)));
                u84 u84VarP = ((DrawScope) obj).a1().p();
                Canvas canvas = v84.a;
                u84VarP.a.drawPath(((tw4) obj3).a, paint);
                return rih1Var;
            case 16:
                e261 e261Var = (e261) obj;
                t6f1 t6f1Var = ((c7f1) obj5).a;
                if (t6f1Var.c.length() > 0) {
                    b261.g(e261Var, t6f1Var.c, new uuc1((Function0) obj3, (byte) 12));
                }
                if (((Boolean) ((ven0) obj2).getValue()).booleanValue() && !((rk41) obj4).a) {
                    b261.t(e261Var, 0);
                }
                return rih1Var;
            case 17:
                int iIntValue2 = ((Number) obj).intValue();
                ven0 ven0Var5 = (ven0) obj2;
                iu30 iu30Var = (iu30) obj4;
                pt ptVar = (pt) ((z72) obj3).Z;
                p8f1 p8f1Var = (p8f1) obj5;
                q8f1 q8f1Var = (q8f1) o7h.t0(iIntValue2, p8f1Var.a.getItems());
                if (q8f1Var != null) {
                    String str2 = q8f1Var.d;
                    List list3 = q8f1Var.t;
                    if (list3.size() == 1) {
                        if (((m8f1) o7h.q0(list3)).e || !p8f1Var.c) {
                            iu30Var.invoke(new k8f1(iIntValue2, ((m8f1) list3.get(0)).d));
                        } else {
                            iu30Var.invoke(new j8f1(iIntValue2, str2));
                            ven0Var5.setValue(z72.j(q8f1Var));
                            ptVar.H();
                        }
                    } else if (list3.size() > 1) {
                        iu30Var.invoke(new j8f1(iIntValue2, str2));
                        ven0Var5.setValue(z72.j(q8f1Var));
                        ptVar.H();
                    }
                }
                return rih1Var;
            case 18:
                int iIntValue3 = ((Number) obj).intValue();
                pxg1 pxg1Var = acf1.a;
                ((ven0) obj2).setValue(Boolean.TRUE);
                if (((j7s) obj5).b) {
                    sam1.b((qam1) obj4);
                }
                ((iu30) obj3).invoke(Integer.valueOf(iIntValue3));
                return rih1Var;
            case 19:
                int iIntValue4 = ((Number) obj).intValue();
                ven0 ven0Var6 = (ven0) obj2;
                iu30 iu30Var2 = (iu30) obj4;
                pt ptVar2 = (pt) ((pt) obj3).i;
                yff1 yff1Var = (yff1) obj5;
                zff1 zff1Var = (zff1) o7h.t0(iIntValue4, yff1Var.a.getItems());
                if (zff1Var != null) {
                    String str3 = zff1Var.e;
                    List list4 = zff1Var.Y;
                    if (list4.size() == 1) {
                        if (((vff1) o7h.q0(list4)).e || !yff1Var.d) {
                            iu30Var2.invoke(new rff1(iIntValue4, ((vff1) list4.get(0)).d));
                        } else {
                            iu30Var2.invoke(new qff1(iIntValue4, str3));
                            ven0Var6.setValue(pt.I(zff1Var));
                            ptVar2.H();
                        }
                    } else if (list4.size() > 1) {
                        iu30Var2.invoke(new qff1(iIntValue4, str3));
                        ven0Var6.setValue(pt.I(zff1Var));
                        ptVar2.H();
                    }
                }
                return rih1Var;
            case 20:
                qv00 qv00Var = (qv00) obj;
                rsf1 rsf1Var = (rsf1) obj3;
                String str4 = (String) obj5;
                qv00Var.a(str4, hll.class, false);
                String str5 = (String) obj4;
                if (str5 != null) {
                    qv00Var.a(str5, dxc0.class, false);
                }
                if (rsf1Var.x.a) {
                    qv00Var.a(str4, qaa1.class, false);
                }
                if (((Boolean) obj2).booleanValue() && rsf1Var.M.b) {
                    qv00Var.a(str4, ixa1.class, false);
                    qv00Var.a(str4, ro7.class, false);
                }
                return rih1Var;
            case 21:
                abc0 abc0Var = (abc0) obj;
                ven0 ven0Var7 = (ven0) obj4;
                abc0Var.c = new nsf1(obj5, (Object) ven0Var7, obj3, obj2, (lnm) null, (byte) 2);
                abc0Var.a = new pad1(ven0Var7, (lnm) null, (byte) 2);
                return rih1Var;
            case 22:
                zau0 zau0Var = (zau0) obj3;
                ven0 ven0Var8 = (ven0) obj2;
                iuf1 iuf1Var = new iuf1((abu0) obj4, zau0Var, ven0Var8);
                ((iac0) obj5).getLifecycle().a(iuf1Var);
                return new e96((iac0) obj5, iuf1Var, (abu0) obj4, zau0Var, ven0Var8);
            case 23:
                yh90 yh90Var = (yh90) obj3;
                String str6 = yh90Var.a;
                ym ymVar = (ym) obj4;
                int iOrdinal = ((zwf1) obj).ordinal();
                if (iOrdinal == 0) {
                    wv31Var = (bw31) obj5;
                    nv31 nv31Var = wv31Var.h;
                    if (wv31Var.c) {
                        ymVar.invoke(new oc7(str6));
                    } else {
                        z = ((b2g1) obj2).U0;
                        if (!z && (nv31Var instanceof lv31)) {
                            ymVar.invoke(new sc7(yh90Var.a, yh90Var.f, yh90Var.h, yh90Var.t, yh90Var.g, yh90Var.Y));
                        } else if (z && (nv31Var instanceof mv31)) {
                            ymVar.invoke(new rc7(str6, yh90Var.f));
                        }
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2 && iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    wv31Var = (bw31) obj5;
                    nv31 nv31Var2 = wv31Var.h;
                    if (wv31Var.c) {
                        ymVar.invoke(new oc7(str6));
                    } else {
                        z = ((b2g1) obj2).U0;
                        if (!z) {
                            if (z) {
                                ymVar.invoke(new rc7(str6, yh90Var.f));
                            }
                        } else if (z) {
                            ymVar.invoke(new rc7(str6, yh90Var.f));
                        }
                    }
                } else {
                    ymVar.invoke(new nc7(yh90Var));
                }
                return rih1Var;
            case 24:
                rtb0 rtb0Var3 = (rtb0) obj;
                rtb0.c(rtb0Var3, (Object) null, hoj.a, 3);
                String str7 = (String) obj5;
                rtb0.c(rtb0Var3, (Object) null, new j2i(1385773675, new xw91((mxf0) obj4, str7, (byte) 28), true), 3);
                List list5 = (List) obj2;
                if (!list5.isEmpty()) {
                    rtb0.c(rtb0Var3, (Object) null, hoj.b, 3);
                    rtb0Var3.e(list5.size(), new vse1(list5, (byte) 6), new vse1(list5, (byte) 7), new j2i(2039820996, new d311((byte) 9, (yp71) obj3, str7, list5), true));
                }
                return rih1Var;
            case 25:
                return new ej31((wj31) obj5, o7h.O0(new nj31("skipSearch", ((Boolean) obj).booleanValue()), (List) obj2), Collections.singletonMap("onLocationReveal", new lyg1((wen0) obj4, (lnm) null, (byte) 1)), new dyg1((ayg1) obj3, (byte) 1), 2);
            case 26:
                ((igh1) obj3).a.a((String) obj5, (String) obj4, (mgh1) obj2);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new sj4((ven0) obj5, (ven0) obj4, (evh1) obj3, (ven0) obj2, (byte) 3);
            case 28:
                iu30 iu30Var3 = (iu30) obj3;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    yxb0 yxb0Var = (yxb0) obj4;
                    fn31.T((c9n) obj5, (q8n) yxb0Var.f, 0, new wba1(yxb0Var, (Context) obj2, uri, iu30Var3, null, (byte) 12), 2);
                } else {
                    iu30Var3.invoke(rwh1.a);
                }
                return rih1Var;
            default:
                eon0 eon0Var = (eon0) obj;
                n9i1 n9i1Var = (n9i1) obj5;
                w9i1 w9i1Var = (w9i1) obj4;
                lzn0 lzn0Var = (lzn0) obj3;
                gon0 gon0Var = (gon0) obj2;
                ton1.p(eon0Var, "topic_screen", new j2i(1215992976, new d9i1(n9i1Var, w9i1Var, lzn0Var, gon0Var), true));
                ton1.p(eon0Var, "send_screen", new j2i(2008876487, new d9i1(w9i1Var, n9i1Var, lzn0Var, gon0Var), true));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e971(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e971(Object obj, String str, String str2, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.b = str;
        this.c = str2;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e971(byte b, Object obj, Object obj2, Object obj3, String str) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = str;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e971(List list, wj31 wj31Var, wen0 wen0Var, ayg1 ayg1Var) {
        super(1);
        this.a = (byte) 25;
        this.e = list;
        this.b = wj31Var;
        this.c = wen0Var;
        this.d = ayg1Var;
    }
}
