package p;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e9f1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9f1(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        af5 af5VarP;
        boolean z;
        Object obj4;
        Object obj5;
        rah1 rah1Var;
        Object obj6;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarE = nim0.a;
        rih1 rih1Var = rih1.a;
        tv80 s8d1Var = null;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = ((y8f1) obj7).c;
                qim0 qim0VarF = u291.f(qim0VarE, 1.0f);
                uwr uwrVar = cbx.a;
                uwo1.e(str, qim0VarF, cbx.d(b0kVar).k, cbx.a(b0kVar).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1696);
                return rih1Var;
            case 1:
                bpb1 bpb1Var = ((cgf1) ((kls0) obj7).c).a;
                bpb1Var.m((Object) null, Boolean.valueOf(!((Boolean) bpb1Var.getValue()).booleanValue()));
                return rih1Var;
            case 2:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                wkf1 wkf1Var = (wkf1) obj7;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                i3a.l(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                x340Var3.i0(418101114);
                ye5 ye5Var = new ye5();
                x340Var3.i0(418102470);
                int i = 0;
                for (Object obj8 : wkf1Var.a) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    xkf1 xkf1Var = (xkf1) obj8;
                    x340Var3.i0(277764162);
                    x340Var3.r(false);
                    if (wkf1Var.c) {
                        x340Var3.i0(277804152);
                        uwr uwrVar2 = cbx.a;
                        int iO = ye5Var.o(new zma1(cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                        try {
                            ye5Var.g(xkf1Var.b);
                            ye5Var.g(" ");
                            ye5Var.k(iO);
                            x340Var3.r(false);
                        } catch (Throwable th) {
                            ye5Var.k(iO);
                            throw th;
                        }
                    } else {
                        x340Var3.i0(277967522);
                        x340Var3.r(false);
                    }
                    uwr uwrVar3 = cbx.a;
                    int iO2 = ye5Var.o(new zma1(cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        ye5Var.g(xkf1Var.a);
                        ye5Var.g(" • ");
                        ye5Var.k(iO2);
                        lljVar3 = lljVar3;
                        i = i2;
                    } catch (Throwable th2) {
                        ye5Var.k(iO2);
                        throw th2;
                    }
                }
                llj lljVar5 = lljVar3;
                x340Var3.r(false);
                af5 af5VarP2 = ye5Var.p();
                x340Var3.r(false);
                x340Var3.i0(76863497);
                x340Var3.r(false);
                qim0 qim0VarF2 = u291.f(qim0VarE, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF2);
                hzj.A.getClass();
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar5);
                i3a.l(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar);
                cjc0 cjc0Var = new cjc0(4);
                String str2 = wkf1Var.b;
                if (str2 == null) {
                    x340Var3.i0(583763090);
                    x340Var3.r(false);
                    af5VarP = null;
                } else {
                    x340Var3.i0(583763091);
                    x340Var3.i0(-396810323);
                    ye5 ye5Var2 = new ye5();
                    x340Var3.i0(1649020219);
                    uwr uwrVar4 = cbx.a;
                    long j = cbx.a(x340Var).b.b;
                    x340Var3.r(false);
                    int iO3 = ye5Var2.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        ye5Var2.g(" • " + str2);
                        ye5Var2.k(iO3);
                        af5VarP = ye5Var2.p();
                        x340Var3.r(false);
                        x340Var3.r(false);
                    } catch (Throwable th3) {
                        ye5Var2.k(iO3);
                        throw th3;
                    }
                }
                if (af5VarP == null) {
                    StringBuilder sb = new StringBuilder(16);
                    ArrayList arrayListM = xvj1.m();
                    new ArrayList();
                    sb.append("");
                    String string = sb.toString();
                    ArrayList arrayList = new ArrayList(arrayListM.size());
                    int size = arrayListM.size();
                    for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
                    }
                    z = true;
                    af5VarP = new af5(string, arrayList);
                } else {
                    z = true;
                }
                qxd0.d(cjc0Var, af5VarP2, af5VarP, (qim0) null, x340Var, 0);
                x340Var3.r(z);
                x340Var3.r(z);
                return rih1Var;
            case 3:
                xkk1 xkk1Var = (xkk1) obj;
                jo70 jo70Var = (jo70) obj2;
                eid eidVar = (eid) obj3;
                String strQ = gxo1.q(xkk1Var);
                String str3 = jo70Var.a;
                String strA = m0p1.A(jo70Var);
                int iP = gxo1.p(xkk1Var, (q37) null);
                if (eidVar != null) {
                    String string2 = ((bx5) obj7).a.getString(2131953445);
                    String str4 = eidVar.b;
                    if (str4.length() != 0) {
                        int iC = l1d.C(eidVar.d);
                        if (iC == 0) {
                            s8d1Var = new s8d1(Uri.parse(str4), string2);
                        } else if (iC == 1 || iC == 2 || iC == 3) {
                            s8d1Var = new v8d1(Uri.parse(str4), string2);
                        }
                    }
                }
                return new pmy(strQ, str3, strA, iP, s8d1Var);
            case 4:
                String str5 = (String) obj;
                x340 x340Var4 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var4.g(str5) ? 4 : 2;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean z2 = (iIntValue & 14) == 4;
                    tva1 tva1Var = (tva1) obj7;
                    Object objT = x340Var5.T();
                    if (z2 || objT == fkj0.X) {
                        obj4 = objT;
                        idm idmVarA = ycm.a((ycm) tva1Var.f);
                        x340Var5.s0(idmVarA);
                        obj4 = idmVarA;
                    }
                    obj4 = objT;
                    idm idmVar = (idm) obj4;
                    uwr uwrVar5 = cbx.a;
                    mta mtaVar = cbx.b(x340Var5).d;
                    qim0 qim0VarN = anm1.N("collection_preview_track_action_more:".concat(str5), u291.r(qim0VarE, 48.0f));
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var5.T);
                    xos0 xos0VarM3 = x340Var5.m();
                    qim0 qim0VarE4 = zr7.E(x340Var5, qim0VarN);
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
                    nko1.H(gfh0VarC2, x340Var5, y580.O0);
                    nko1.H(xos0VarM3, x340Var5, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var5, y580.R0);
                    nko1.F(x340Var5);
                    nko1.H(qim0VarE4, x340Var5, y580.Y);
                    otw.c(idmVar, new wcm(str5, (String) null, (String) null, (ucm) null, (Function0) null, (Function0) null, false, (String) null, (String) null, 1022), (qim0) null, (ipb1) null, x340Var5, 0, 12);
                    x340Var5.r(true);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj3).intValue();
                uwo1.e(((cyf1) ((lc7) obj7).i).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                return rih1Var;
            case 6:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    cev0.c(((jyf1) obj7).k, x340Var7, 0);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 7:
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                jqd0 jqd0Var = (jqd0) obj7;
                hma1 hma1VarEdit = ((dma1) jqd0Var.c).edit();
                hma1VarEdit.a(e6g1.a, zBooleanValue);
                hma1VarEdit.h();
                ((bpb1) jqd0Var.d).m((Object) null, bool);
                return new it61(bool);
            case 8:
                hwa0 hwa0Var = (hwa0) ((ecd1) obj7).c;
                hwa0Var.a.h(hwa0Var.a(((vkg1) obj).a));
                return rih1Var;
            case 9:
                wkg1 wkg1Var = (wkg1) obj;
                tqw tqwVar = (tqw) obj3;
                if (!((gki0) obj2).equals(gki0.a)) {
                    eg.o();
                    return null;
                }
                hwa0 hwa0Var2 = ((xkg1) obj7).a;
                String str6 = wkg1Var.a;
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                String strA2 = hwa0Var2.a(str6);
                lzn0 lzn0Var = hwa0Var2.a;
                if (tv80VarY != null) {
                    lzn0Var.a(strA2, tv80VarY, (Bundle) null);
                    return rih1Var;
                }
                lzn0Var.h(strA2);
                return rih1Var;
            case 10:
                spg1 spg1Var = (spg1) obj2;
                if (!spg1Var.equals(rpg1.a) && !spg1Var.equals(qpg1.a)) {
                    eg.o();
                    return null;
                }
                yg01 yg01Var = (yg01) obj7;
                yg01Var.c.j(yg01Var.b);
                return rih1Var;
            case 11:
                i971 i971Var = (i971) obj;
                x340 x340Var8 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                ewg1 ewg1Var = (ewg1) obj7;
                w4i1 w4i1Var = i971Var.d;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? x340Var8.g(i971Var) : x340Var8.i(i971Var) ? 4 : 2;
                }
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean zG = x340Var9.g(w4i1Var.a);
                    Object objT2 = x340Var9.T();
                    if (zG || objT2 == fkj0.X) {
                        obj5 = objT2;
                        String strJ = pcf.j(w4i1Var.a);
                        x340Var9.s0(strJ);
                        obj5 = strJ;
                    }
                    obj5 = objT2;
                    hqn1.j(mqo1.A(i971Var.a), ewg1Var.c, ewg1Var.d, (String) obj5, (qim0) null, x340Var9, 0);
                    k1p1.c(ewg1Var.e, x340Var9, 0);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 12:
                kzg1 kzg1Var = (kzg1) obj2;
                tqw tqwVar2 = (tqw) obj3;
                String str7 = ((lzg1) obj).d;
                if (kzg1Var != kzg1.a) {
                    eg.o();
                    return null;
                }
                if (ihc1.y0(str7) || tqwVar2 == null) {
                    return rih1Var;
                }
                ((ozg1) obj7).b.a(str7, n3o1.y(tqwVar2), (Bundle) null);
                return rih1Var;
            case 13:
                jah1 jah1Var = (jah1) obj;
                if (!((iah1) obj2).equals(iah1.a)) {
                    eg.o();
                    return null;
                }
                if (!jah1Var.c) {
                    return rih1Var;
                }
                up0.a(((kah1) obj7).a, jah1Var.a, jah1Var.d.a, (String) null, jah1Var.e, 4);
                return rih1Var;
            case 14:
                yah1 yah1Var = (yah1) obj;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                rah1 rah1Var2 = (rah1) obj7;
                wah1 wah1Var = rah1Var2.a;
                x340 x340Var10 = (b0k) obj2;
                boolean zI = x340Var10.i(rah1Var2);
                Object objT3 = x340Var10.T();
                Object obj9 = objT3;
                if (zI || objT3 == m4cVar) {
                    vxg1 vxg1Var = new vxg1(rah1Var2, (lnm) null);
                    x340Var10.s0(vxg1Var);
                    obj9 = vxg1Var;
                }
                ven0 ven0VarQ = yto.q((Object) null, x340Var10, (vu30) obj9);
                Object objT4 = x340Var10.T();
                if (objT4 == m4cVar) {
                    rah1Var = rah1Var2;
                    obh1 obh1Var = new obh1(yah1Var, wah1Var.a, rah1Var2.k, new sjf1(0, rah1Var2, rah1.class, "onUpdateSucceeded", "onUpdateSucceeded()V", 0, (byte) 1), rah1Var.m);
                    x340Var10.s0(obh1Var);
                    objT4 = obh1Var;
                } else {
                    rah1Var = rah1Var2;
                }
                obh1 obh1Var2 = (obh1) objT4;
                Object objT5 = x340Var10.T();
                Object obj10 = objT5;
                if (objT5 == m4cVar) {
                    c9n c9nVarM = qxd0.M(o6x.a, x340Var10);
                    x340Var10.s0(c9nVarM);
                    obj10 = c9nVarM;
                }
                c9n c9nVar = (c9n) obj10;
                boolean zI2 = x340Var10.i(rah1Var) | x340Var10.i(obh1Var2);
                Object objT6 = x340Var10.T();
                Object obj11 = objT6;
                if (zI2 || objT6 == m4cVar) {
                    k6g1 k6g1Var = new k6g1(rah1Var, obh1Var2, (lnm) null, (byte) 11);
                    x340Var10.s0(k6g1Var);
                    obj11 = k6g1Var;
                }
                qxd0.t(rih1Var, x340Var10, (vu30) obj11);
                Object objT7 = x340Var10.T();
                Object obj12 = objT7;
                if (objT7 == m4cVar) {
                    avk avkVar = (avk) rah1Var.n.get();
                    x340Var10.s0(avkVar);
                    obj12 = avkVar;
                }
                avk avkVar2 = (avk) obj12;
                rxe1 rxe1VarN = d4o1.n((String) obh1Var2.f.getValue(), rah1Var.e, x340Var10, 0);
                Object objT8 = x340Var10.T();
                if (objT8 == m4cVar) {
                    pah1 pah1Var = new pah1(rah1Var, new Handler(Looper.getMainLooper()));
                    x340Var10.s0(pah1Var);
                    objT8 = pah1Var;
                }
                pah1 pah1Var2 = (pah1) objT8;
                String str8 = wah1Var.a;
                List list = (List) obh1Var2.e.getValue();
                List list2 = (List) ven0VarQ.getValue();
                Set set = (Set) obh1Var2.h.getValue();
                Set setB = obh1Var2.b();
                boolean zBooleanValue2 = ((Boolean) obh1Var2.g.getValue()).booleanValue();
                xj61 xj61VarC = obh1Var2.c();
                tsq tsqVar = rah1Var.g;
                tsq tsqVar2 = rah1Var.h;
                boolean zI3 = x340Var10.i(rah1Var) | x340Var10.i(pah1Var2);
                Object objT9 = x340Var10.T();
                Object obj13 = objT9;
                if (zI3 || objT9 == m4cVar) {
                    mah1 mah1Var = new mah1(rah1Var, pah1Var2, (byte) 0);
                    x340Var10.s0(mah1Var);
                    obj13 = mah1Var;
                }
                Function0 function0 = (Function0) obj13;
                boolean zI4 = x340Var10.i(c9nVar) | x340Var10.i(obh1Var2);
                Object objT10 = x340Var10.T();
                Object obj14 = objT10;
                if (zI4 || objT10 == m4cVar) {
                    oah1 oah1Var = new oah1(c9nVar, obh1Var2, (byte) 0);
                    x340Var10.s0(oah1Var);
                    obj14 = oah1Var;
                }
                iu30 iu30Var = (iu30) obj14;
                boolean zI5 = x340Var10.i(c9nVar) | x340Var10.i(obh1Var2);
                Object objT11 = x340Var10.T();
                Object obj15 = objT11;
                if (zI5 || objT11 == m4cVar) {
                    oah1 oah1Var2 = new oah1(c9nVar, obh1Var2, (byte) 1);
                    x340Var10.s0(oah1Var2);
                    obj15 = oah1Var2;
                }
                avkVar2.getClass();
                uah1.g(str8, rxe1VarN, list, list2, set, setB, zBooleanValue2, xj61VarC, tsqVar, tsqVar2, function0, iu30Var, (iu30) obj15, pah1Var2, avkVar2, (qim0) null, x340Var10, 0);
                return rih1Var;
            case 15:
                tbh1 tbh1Var = (tbh1) obj;
                sbh1 sbh1Var = (sbh1) obj2;
                up0 up0Var = ((ubh1) obj7).a;
                lbh1 lbh1Var = tbh1Var.b;
                String str9 = tbh1Var.a;
                boolean z3 = tbh1Var.d;
                if (sbh1Var.equals(qbh1.a)) {
                    if (!z3) {
                        return rih1Var;
                    }
                    up0.a(up0Var, str9, lbh1Var.b, lbh1Var.a, tbh1Var.j, 8);
                    return rih1Var;
                }
                if (sbh1Var.equals(rbh1.a)) {
                    if (!z3) {
                        return rih1Var;
                    }
                    if (tbh1Var.c) {
                        up0.a(up0Var, str9, lbh1Var.b, lbh1Var.a, tbh1Var.j, 8);
                        return rih1Var;
                    }
                    tbh1Var.i.invoke();
                    return rih1Var;
                }
                if (!sbh1Var.equals(pbh1.a)) {
                    eg.o();
                    return null;
                }
                if (!z3 || tbh1Var.g) {
                    return rih1Var;
                }
                tbh1Var.h.invoke();
                return rih1Var;
            case 16:
                if (((pgh1) obj2) instanceof pgh1) {
                    ((qgh1) obj7).a.invoke(dbt0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 17:
                a470 a470Var = (a470) obj;
                x340 x340Var11 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                xgh1 xgh1Var = (xgh1) obj7;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? x340Var11.g(a470Var) : x340Var11.i(a470Var) ? 4 : 2;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    xgh1Var.a().a(new yxe1(new ehc1(a470Var.a.a)));
                    boolean zA = ((ti4) xgh1Var.h.b).a();
                    if (xgh1Var.b.a) {
                        qim0VarE = d1u.E(1.0f, u7h.g, qim0VarE, d4o1.a);
                    }
                    boolean zI6 = x340Var12.i(xgh1Var);
                    Object objT12 = x340Var12.T();
                    if (zI6 || objT12 == fkj0.X) {
                        obj6 = objT12;
                        dch1 dch1Var = new dch1(xgh1Var, (byte) 6);
                        x340Var12.s0(dch1Var);
                        obj6 = dch1Var;
                    }
                    obj6 = objT12;
                    qgo1.d(a470Var, zA, qim0VarE, (Function0) obj6, xgh1Var.d, x340Var12, iIntValue4 & 14);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 18:
                gkh1 gkh1Var = (gkh1) obj;
                fkh1 fkh1Var = (fkh1) obj2;
                tqw tqwVar3 = (tqw) obj3;
                qhm qhmVar = (qhm) obj7;
                boolean z4 = qhmVar.b;
                njm njmVar = (njm) qhmVar.d;
                if (z4) {
                    return rih1Var;
                }
                tv80 tv80VarY2 = tqwVar3 != null ? n3o1.y(tqwVar3) : null;
                if (fkh1Var.equals(ekh1.a)) {
                    qhmVar.b = true;
                    njmVar.b((tv80) null);
                    njmVar.a(gkh1Var.a, tv80VarY2, gkh1Var.b);
                    return rih1Var;
                }
                if (!fkh1Var.equals(dkh1.a)) {
                    eg.o();
                    return null;
                }
                qhmVar.b = true;
                njmVar.b(tv80VarY2);
                return rih1Var;
            case 19:
                if (vmh1.a[((umh1) obj2).ordinal()] == 1) {
                    ((wmh1) obj7).b.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 20:
                tqw tqwVar4 = (tqw) obj3;
                lb50 lb50Var = ((bnh1) obj7).a;
                zmh1 zmh1Var = ((cnh1) obj).a;
                int iOrdinal = ((anh1) obj2).ordinal();
                if (iOrdinal == 0) {
                    lb50Var.invoke(new wyd0(zmh1Var.a, tqwVar4 != null ? n3o1.y(tqwVar4) : null));
                    return rih1Var;
                }
                if (iOrdinal == 1) {
                    lb50Var.invoke(new xyd0(zmh1Var.a, tqwVar4 != null ? n3o1.y(tqwVar4) : null, zmh1Var.e));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 21:
                tqw tqwVar5 = (tqw) obj3;
                ((gnh1) obj7).a.invoke(new wyd0(((hnh1) obj).a.a, tqwVar5 != null ? n3o1.y(tqwVar5) : null));
                return rih1Var;
            case 22:
                tyh1 tyh1Var = (tyh1) obj;
                tqw tqwVar6 = (tqw) obj3;
                lzn0 lzn0Var2 = (lzn0) ((suh1) obj7).d;
                int iOrdinal2 = ((syh1) obj2).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        lzn0Var2.e();
                    }
                } else if (tqwVar6 != null) {
                    lzn0Var2.a(tyh1Var.a.g, n3o1.y(tqwVar6), (Bundle) null);
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                s1i1 s1i1Var = (s1i1) obj7;
                czb czbVar = ((r1i1) obj).h;
                if (czbVar != null) {
                    s1i1Var.c(czbVar, null, b0kVar2, 0);
                    return rih1Var;
                }
                u890.C("content");
                throw null;
            case 24:
                ((lzn0) ((e27) obj7).b).a(nik1.z0.a, cvl1.d((tqw) obj3), (Bundle) null);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                dei1 dei1Var = (dei1) obj7;
                Context context = dei1Var.a;
                String str10 = ((cei1) obj).a;
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
                ClipData clipDataNewPlainText = ClipData.newPlainText(null, str10);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(clipDataNewPlainText);
                }
                kt91 kt91Var = dei1Var.b;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958342});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131958342, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 26:
                nbh nbhVar = (nbh) obj;
                x340 x340Var13 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                coi1 coi1Var = (coi1) obj7;
                if (coi1Var instanceof aoi1) {
                    x340 x340Var14 = x340Var13;
                    x340Var14.i0(-686730641);
                    wro1.o(nbhVar, cwl1.o0(x340Var14, 2131963660), cwl1.o0(x340Var14, 2131963659), x340Var14, iIntValue5 & 14);
                    x340Var14.r(false);
                } else if (coi1Var instanceof boi1) {
                    x340 x340Var15 = x340Var13;
                    x340Var15.i0(-686722531);
                    wro1.o(nbhVar, cwl1.o0(x340Var15, 2131963647), (String) null, x340Var15, (iIntValue5 & 14) | 384);
                    x340Var15.r(false);
                } else if (coi1Var instanceof zni1) {
                    x340 x340Var16 = x340Var13;
                    x340Var16.i0(-686715809);
                    wro1.o(nbhVar, cwl1.o0(x340Var16, 2131963656), cwl1.o0(x340Var16, 2131963655), x340Var16, iIntValue5 & 14);
                    x340Var16.r(false);
                } else if (coi1Var instanceof xni1) {
                    x340 x340Var17 = x340Var13;
                    x340Var17.i0(-686707074);
                    wro1.f(nbhVar, cwl1.o0(x340Var17, 2131963639), cwl1.o0(x340Var17, 2131963638), x340Var17, iIntValue5 & 14);
                    x340Var17.r(false);
                } else {
                    if (!(coi1Var instanceof yni1)) {
                        throw p3d1.k(x340Var13, -686732373, false);
                    }
                    x340 x340Var18 = x340Var13;
                    x340Var18.i0(-686697756);
                    wro1.f(nbhVar, cwl1.o0(x340Var18, 2131963653), cwl1.o0(x340Var18, 2131963652), x340Var18, iIntValue5 & 14);
                    x340Var18.r(false);
                }
                return rih1Var;
            case 27:
                zxi1 zxi1Var = (zxi1) obj;
                tqw tqwVar7 = (tqw) obj3;
                if (!((yxi1) obj2).equals(yxi1.a)) {
                    eg.o();
                    return null;
                }
                String str11 = zxi1Var.c;
                if (str11 == null) {
                    return rih1Var;
                }
                ((f330) obj7).b.a(str11, cvl1.d(tqwVar7), (Bundle) null);
                return rih1Var;
            case 28:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str12 = ((zxi1) obj7).b;
                uwr uwrVar6 = cbx.a;
                uwo1.e(str12, (qim0) null, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                return rih1Var;
            default:
                hyi1 hyi1Var = (hyi1) obj;
                eyi1 eyi1Var = (gyi1) obj2;
                Context context2 = ((b7u) obj7).b;
                String str13 = hyi1Var.b;
                String str14 = hyi1Var.a;
                if (eyi1Var instanceof eyi1) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(eyi1Var.a));
                        intent.addFlags(268435456);
                        context2.startActivity(intent);
                        break;
                    } catch (ActivityNotFoundException | SecurityException unused) {
                    }
                } else {
                    String strE = hyi1Var.c;
                    if (strE == null) {
                        strE = b7u.e(str14, str13, hyi1Var.d);
                    }
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(strE));
                    intent2.addFlags(268435456);
                    intent2.setPackage("com.google.android.apps.maps");
                    if (intent2.resolveActivity(context2.getPackageManager()) != null) {
                        context2.startActivity(intent2);
                    } else {
                        intent2.setPackage(null);
                        if (intent2.resolveActivity(context2.getPackageManager()) != null) {
                            context2.startActivity(intent2);
                        } else {
                            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(l1d.m("https://www.google.com/maps/search/?api=1&query=", Uri.encode(str14 + ", " + str13))));
                            intent3.addFlags(268435456);
                            context2.startActivity(intent3);
                        }
                    }
                }
                return rih1Var;
        }
    }
}
