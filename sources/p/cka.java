package p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cka extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cka(ldo ldoVar, o1b o1bVar) {
        super(2);
        this.a = (byte) 5;
        this.b = o1bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        fg91 fg91VarA;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        String strA = "";
        String string = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwo1.e(((dka) obj3).b.c, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2046);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ska skaVar = ((ala) obj3).a;
                    i9p1.l(skaVar.d, skaVar.e, skaVar.f, (qim0) null, (chz0) null, false, (iu30) null, x340Var4, 584, 120);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                i9p1.f((vhd0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lqa lqaVar = (lqa) obj3;
                    pap1.e(lqaVar.Z, lqaVar.Y, lqaVar.e, lqaVar.t, lqaVar.f, lqaVar.N0, (qim0) null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else if (((k1b) obj3).a) {
                    x340Var8.i0(1365587891);
                    anx anxVar = anx.c;
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var8).c.f;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                    zov0 zov0Var = cbx.b(x340Var8).g;
                    w0h1.a(anxVar, isl.a, u291.r(qim0VarB, 12.0f), j, 0L, false, x340Var8, anx.d | 48, 48);
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(1365943771);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 5:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    xjf1 xjf1Var = ((o1b) obj3).a;
                    if (xjf1Var == null) {
                        fg91VarA = fg91.b;
                    } else {
                        List<rjf1> list = xjf1Var.f;
                        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                        for (rjf1 rjf1Var : list) {
                            String str = rjf1Var.a;
                            String str2 = rjf1Var.c;
                            String str3 = str2 == null ? "" : str2;
                            String str4 = rjf1Var.b;
                            arrayList.add(new phx(8, 0L, str3, str, str4 == null ? "" : str4));
                        }
                        fg91VarA = mqo1.A(arrayList);
                    }
                    fc11.a(fg91VarA, (qim0) null, hcx.a, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var10, 392, 506);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                y2b y2bVar = (y2b) obj3;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tbr0 tbr0VarC = ((cir0) x340Var12.k(k2r0.a)).c();
                    String strO0 = cwl1.o0(x340Var12, 2131952747);
                    boolean zI = x340Var12.i(y2bVar) | x340Var12.g(strO0);
                    Object objT = x340Var12.T();
                    if (zI || objT == m4cVar) {
                        objT = new bh(y2bVar, strO0, (lnm) null);
                        x340Var12.s0(objT);
                    }
                    ven0 ven0VarQ = yto.q(duc1.a, x340Var12, (vu30) objT);
                    String str5 = y2bVar.b.b;
                    euc1 euc1Var = (euc1) ven0VarQ.getValue();
                    it8 it8Var = y2bVar.e;
                    boolean zI2 = x340Var12.i(tbr0VarC) | x340Var12.i(y2bVar);
                    Object objT2 = x340Var12.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new hj8(tbr0VarC, y2bVar, (byte) 14);
                        x340Var12.s0(objT2);
                    }
                    vu30 vu30Var = (vu30) objT2;
                    boolean zI3 = x340Var12.i(y2bVar) | x340Var12.i(tbr0VarC);
                    Object objT3 = x340Var12.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new rqa(y2bVar, tbr0VarC, (byte) 2);
                        x340Var12.s0(objT3);
                    }
                    w2b.b(str5, euc1Var, it8Var, vu30Var, (Function0) objT3, (qim0) null, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 7:
                t3b t3bVar = (t3b) obj3;
                fn31.T(t3bVar.i, (o8n) null, 0, new sxa(t3bVar, (String) obj, new fzx0((String) obj2), null, (byte) 2), 3);
                return rih1Var;
            case 8:
                CharSequence charSequence = (CharSequence) obj2;
                m0d m0dVar = (m0d) obj3;
                String str6 = m0dVar != null ? m0dVar.b : null;
                String string2 = ihc1.e1(charSequence.toString()).toString();
                StringBuilder sb = new StringBuilder();
                int length = string2.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = string2.charAt(i);
                    if ('0' <= cCharAt && cCharAt < ':') {
                        sb.append(cCharAt);
                    }
                }
                String string3 = sb.toString();
                if (str6 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    int length2 = str6.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char cCharAt2 = str6.charAt(i2);
                        if ('0' <= cCharAt2 && cCharAt2 < ':') {
                            sb2.append(cCharAt2);
                        }
                    }
                    string = sb2.toString();
                }
                strA = string != null ? string : "";
                if (strA.length() == 0) {
                    return string3;
                }
                if (nhc1.Y(string2, "+", false) && nhc1.Y(string3, strA, false)) {
                    return ihc1.H0(string3, strA);
                }
                if (nhc1.Y(string2, "+", false) && nhc1.Y(strA, string3, false)) {
                    return "+".concat(string3);
                }
                return (nhc1.Y(string2, "00", false) && nhc1.Y(ihc1.H0(string3, "00"), strA, false)) ? ihc1.H0(ihc1.H0(string3, "00"), strA) : string3;
            case 9:
                rlb rlbVar = (rlb) obj;
                i1r i1rVar = (k1r) obj2;
                if (!(i1rVar instanceof i1r)) {
                    return nlb.a;
                }
                mlb mlbVar = (mlb) i1rVar.a;
                ahr ahrVar = (ahr) ((qlb) obj3).e;
                zc8 zc8Var = mlbVar.a;
                long j2 = zc8Var.e / 1000;
                int i3 = zc8Var.j;
                if (rlbVar.b && j2 > 0) {
                    strA = ahrVar.a(j2);
                }
                String str7 = ahrVar.c.c.format(Long.valueOf(zc8Var.f * 1000));
                zoy0 zoy0Var = mlbVar.b;
                return new olb(i3, strA, str7, zoy0Var != null ? zoy0Var.a : z6x.a);
            case 10:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                ywb ywbVar = (ywb) obj3;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tbr0 tbr0VarC2 = ((cir0) x340Var14.k(k2r0.a)).c();
                    los losVar = ywbVar.c;
                    boolean zI4 = x340Var14.i(tbr0VarC2);
                    Object objT4 = x340Var14.T();
                    if (zI4 || objT4 == m4cVar2) {
                        objT4 = new xwb(tbr0VarC2, (byte) 0);
                        x340Var14.s0(objT4);
                    }
                    losVar.c((iu30) objT4);
                    swb swbVar = ywbVar.b.a;
                    boolean zI5 = x340Var14.i(tbr0VarC2);
                    Object objT5 = x340Var14.T();
                    if (zI5 || objT5 == m4cVar2) {
                        objT5 = new xwb(tbr0VarC2, (byte) 1);
                        x340Var14.s0(objT5);
                    }
                    x760.b(swbVar, (qim0) null, (iu30) objT5, x340Var14, 8);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                x340 x340Var16 = x340Var15;
                boolean zY = x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    View view = (View) x340Var16.k(AndroidCompositionLocals_androidKt.f);
                    boolean zG = x340Var16.g(view);
                    Object objT6 = x340Var16.T();
                    if (zG || objT6 == m4cVar3) {
                        objT6 = new h9c(view);
                        x340Var16.s0(objT6);
                    }
                    h9c h9cVar = (h9c) objT6;
                    g9c g9cVar = (g9c) obj3;
                    boolean zI6 = x340Var16.i(h9cVar);
                    Object objT7 = x340Var16.T();
                    if (zI6 || objT7 == m4cVar3) {
                        objT7 = new u6c(h9cVar, (byte) 0);
                        x340Var16.s0(objT7);
                    }
                    qim0 qim0VarQ = d9y0.q(nim0Var, (iu30) objT7);
                    boolean zI7 = x340Var16.i(h9cVar);
                    Object objT8 = x340Var16.T();
                    if (zI7 || objT8 == m4cVar3) {
                        objT8 = new u6c(h9cVar, (byte) 1);
                        x340Var16.s0(objT8);
                    }
                    otw.c(g9cVar, rih1Var2, y9g1.t(qim0VarQ, (iu30) objT8), (ipb1) null, x340Var16, 56, 8);
                } else {
                    x340Var16.b0();
                }
                return rih1Var2;
            case 12:
                kr61 kr61Var = ((v8c) obj3).d;
                t4m0 t4m0Var = kr61Var.b;
                t4m0Var.getClass();
                x6h1 x6h1VarC = t4m0Var.a.c();
                x6h1VarC.i.add(new a7h1("browse_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((i8h1) kr61Var.a.get()).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:genre:podcasts-page")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rp61.a;
            case 13:
                Intent intent = (Intent) obj;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                lzn0 lzn0Var = ((e9c) obj3).a;
                String stringExtra = intent.getStringExtra("query");
                lzn0Var.g(extras, (stringExtra == null || stringExtra.length() <= 0) ? "spotify:search" : "spotify:search:".concat(d1o1.i(stringExtra)));
                return rih1Var;
            case 14:
                ioj0 ioj0Var = (ioj0) obj2;
                String str8 = ((q6j1) obj).a.d;
                goj0 goj0VarC = ioj0Var.c(yo60.class, str8 != null ? str8 : "");
                goj0 goj0Var = goj0VarC instanceof goj0 ? goj0VarC : null;
                yo60 yo60Var = goj0Var != null ? (yo60) goj0Var.a : null;
                hwt hwtVar = (hwt) ((dch1) obj3).invoke();
                if (u890.j(yo60Var != null ? kno1.A(yo60Var, hwtVar) : null, m8i0.a)) {
                    return c97.w(yo60Var, hwtVar);
                }
                return null;
            case 15:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ((mdc) obj3).b.i((qim0) null, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                scx scxVar = (scx) obj3;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zI8 = x340Var20.i(scxVar);
                    Object objT9 = x340Var20.T();
                    if (zI8 || objT9 == fkj0.X) {
                        objT9 = new rqc(scxVar, (byte) 1);
                        x340Var20.s0(objT9);
                    }
                    foo1.c(new gbx(z50.c, (Function0) objT9), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, kai.d, x340Var20, 0, 48, 2044);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b6d b6dVar = (b6d) obj3;
                kly0 kly0Var = b6dVar.b;
                lo60 lo60Var = b6dVar.a;
                gw70 gw70Var = b6dVar.c;
                nwt nwtVar = b6dVar.d;
                int i4 = b6dVar.f.b;
                hj31 hj31Var = b6dVar.g;
                b3s b3sVar = b3s.c;
                return new jpg0(new aso(f6o1.A(new a6d(kly0Var, nwtVar, (zob1) obj, gw70Var, lo60Var, i4, hj31Var, (iac0) obj2, b6dVar.h, b6dVar.i, b6dVar.j, b6dVar.k), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new rs7(b6dVar, (byte) 19)), jpc.U0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                mgd mgdVar = (mgd) obj3;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    Observable observableA = ((xvo) mgdVar.d.b).a(true);
                    Boolean bool = Boolean.FALSE;
                    ven0 ven0VarG = rwq.g(yoi1.g(observableA.onErrorReturnItem(bool)), bool, (o8n) null, x340Var22, 48, 2);
                    ldo ldoVar = mgdVar.b;
                    ngd ngdVar = mgdVar.c.a;
                    ve10 ve10Var = ngdVar.a;
                    String str9 = ve10Var.a;
                    String str10 = ve10Var.b;
                    String str11 = ve10Var.c;
                    phx phxVar = new phx(8, 0L, str11 == null ? "" : str11, str9, str10);
                    ve10 ve10Var2 = ngdVar.b;
                    String str12 = ve10Var2.a;
                    String str13 = ve10Var2.b;
                    String str14 = ve10Var2.c;
                    otw.c(ldoVar, new jgd(phxVar, new phx(8, 0L, str14 == null ? "" : str14, str12, str13), ngdVar.c, ngdVar.d, ngdVar.e, ((Boolean) ven0VarG.getValue()).booleanValue()), (qim0) null, (ipb1) null, x340Var22, 64, 12);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    String str15 = (String) ((qlb) obj3).f;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str15, (qim0) null, cbx.d(x340Var24).k, cbx.a(x340Var24).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var24, 0, 0, 2034);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                imd imdVar = (imd) obj3;
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ykd ykdVar = new ykd(imdVar.c.a);
                    yqg yqgVar = imdVar.d;
                    xid xidVar = imdVar.e;
                    los losVar2 = imdVar.f;
                    bf4 bf4Var = imdVar.g;
                    boolean zI9 = x340Var26.i(imdVar);
                    Object objT10 = x340Var26.T();
                    if (zI9 || objT10 == fkj0.X) {
                        objT10 = new ptb(imdVar, (byte) 16);
                        x340Var26.s0(objT10);
                    }
                    k1o1.a(ykdVar, yqgVar, (Function0) objT10, xidVar, losVar2, bf4Var, (qim0) null, x340Var26, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (qtw) obj3;
            case 22:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    eqr0.b(0, 2, ((i6e) obj3).b, x340Var28, (qim0) null);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    String str16 = ((h6e) obj3).a;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str16, (qim0) null, cbx.d(x340Var30).k, cbx.a(x340Var30).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var30, 0, 0, 2034);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    uwo1.e(((sb81) obj3).b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var32, 0, 0, 2046);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 25:
                g3h1 g3h1Var = new g3h1(new dsk0((String) ((fta) obj3).b, (byte) 14));
                k3h1 k3h1Var = new k3h1(((oke) obj).b);
                wch wchVar = q6x.b;
                if (!g3h1Var.equals(wchVar) || !k3h1Var.equals(wchVar)) {
                    if (g3h1Var.equals(wchVar)) {
                        return k3h1Var;
                    }
                    if (k3h1Var.equals(wchVar)) {
                        return g3h1Var;
                    }
                    wchVar = new wch(g3h1Var, k3h1Var);
                }
                return wchVar;
            case 26:
                ale aleVar = (ale) obj2;
                String str17 = (String) ((ele) obj3).b.a.getAndSet(null);
                return str17 != null ? First.c(aleVar, Collections.singleton(new yke(str17))) : First.b(aleVar);
            case 27:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                boolean zY2 = x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2);
                rih1 rih1Var3 = rih1.a;
                if (!zY2) {
                    x340Var34.b0();
                    return rih1Var3;
                }
                tbr0 tbr0VarC3 = ((cir0) x340Var34.k(k2r0.a)).c();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                use useVar = (use) obj3;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var34.T);
                xos0 xos0VarM = x340Var34.m();
                qim0 qim0VarE = zr7.E(x340Var34, qim0VarF);
                hzj.A.getClass();
                if (x340Var34.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var34.m0();
                if (x340Var34.S) {
                    x340Var34.l(hmb0.t1);
                } else {
                    x340Var34.v0();
                }
                nko1.H(gfh0VarC, x340Var34, y580.O0);
                nko1.H(xos0VarM, x340Var34, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var34, y580.R0);
                nko1.F(x340Var34);
                nko1.H(qim0VarE, x340Var34, y580.Y);
                Object objT11 = x340Var34.T();
                if (objT11 == fkj0.X) {
                    s4p s4pVar = useVar.b;
                    xwb xwbVar = new xwb(tbr0VarC3, (byte) 2);
                    wj3 wj3Var = (wj3) s4pVar.a.c;
                    d0r d0rVar = (d0r) ((jly0) wj3Var.e).get();
                    jly0 jly0Var = (jly0) wj3Var.f;
                    t1m t1mVar = (t1m) wj3Var.d;
                    String str18 = (String) jly0Var.get();
                    q8n q8nVarE = t1mVar.e();
                    c8o.l(q8nVarE);
                    q8n q8nVarG = t1mVar.g();
                    c8o.l(q8nVarG);
                    k3m k3mVar = new k3m(d0rVar, str18, q8nVarE, q8nVarG, xwbVar, (t4p) ((jly0) wj3Var.X).get(), new cx0((byte) 26), new nu((byte) 15), (u4p) ((jly0) wj3Var.O0).get(), new nu((byte) 13), new cx0((byte) 6));
                    x340Var34.s0(k3mVar);
                    objT11 = k3mVar;
                }
                k3m k3mVar2 = (k3m) objT11;
                otw.c(k3mVar2, rih1Var3, (qim0) null, wpb1.C("ContentPickerSearchElement", k3mVar2, rih1Var3, x340Var34, 390, 8), x340Var34, 48, 4);
                x340Var34.r(true);
                return rih1Var3;
            case 28:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                ewe eweVar = (ewe) obj3;
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    tbr0 tbr0VarC4 = ((cir0) x340Var36.k(k2r0.a)).c();
                    Object objT12 = x340Var36.T();
                    m4c m4cVar4 = fkj0.X;
                    if (objT12 == m4cVar4) {
                        objT12 = qxd0.M(o6x.a, x340Var36);
                        x340Var36.s0(objT12);
                    }
                    c9n c9nVar = (c9n) objT12;
                    Object objT13 = x340Var36.T();
                    if (objT13 == m4cVar4) {
                        objT13 = v8r.q(Boolean.FALSE);
                        x340Var36.s0(objT13);
                    }
                    ven0 ven0Var = (ven0) objT13;
                    Object[] objArr = new Object[0];
                    Object objT14 = x340Var36.T();
                    if (objT14 == m4cVar4) {
                        objT14 = xrc.X0;
                        x340Var36.s0(objT14);
                    }
                    ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) objT14, x340Var36, 48);
                    boolean zI10 = x340Var36.i(eweVar);
                    Object objT15 = x340Var36.T();
                    if (zI10 || objT15 == m4cVar4) {
                        objT15 = new hzb(eweVar, (lnm) null, (byte) 6);
                        x340Var36.s0(objT15);
                    }
                    qxd0.t(rih1Var, x340Var36, (vu30) objT15);
                    boolean zI11 = x340Var36.i(ven0Var2) | x340Var36.i(eweVar);
                    Object objT16 = x340Var36.T();
                    if (zI11 || objT16 == m4cVar4) {
                        objT16 = new ztb(eweVar, ven0Var2, (byte) 28);
                        x340Var36.s0(objT16);
                    }
                    qxd0.i(rih1Var, (iu30) objT16, x340Var36);
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    boolean zI12 = x340Var36.i(ven0Var2) | x340Var36.i(ven0Var) | x340Var36.i(eweVar) | x340Var36.i(c9nVar) | x340Var36.i(tbr0VarC4);
                    Object objT17 = x340Var36.T();
                    if (zI12 || objT17 == m4cVar4) {
                        vt1 vt1Var = new vt1(eweVar, c9nVar, ven0Var2, ven0Var, tbr0VarC4);
                        x340Var36.s0(vt1Var);
                        objT17 = vt1Var;
                    }
                    Function0 function0 = (Function0) objT17;
                    boolean zI13 = x340Var36.i(eweVar);
                    Object objT18 = x340Var36.T();
                    if (zI13 || objT18 == m4cVar4) {
                        objT18 = new dwe(eweVar, (byte) 0);
                        x340Var36.s0(objT18);
                    }
                    iu30 iu30Var = (iu30) objT18;
                    boolean zI14 = x340Var36.i(eweVar);
                    Object objT19 = x340Var36.T();
                    if (zI14 || objT19 == m4cVar4) {
                        objT19 = new dwe(eweVar, (byte) 1);
                        x340Var36.s0(objT19);
                    }
                    rpo1.b(function0, iu30Var, (iu30) objT19, (qim0) null, zBooleanValue, x340Var36, 0);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            default:
                return axo1.p((u3f) obj2, (whf) obj, new qka(1, (s0f) obj3, s0f.class, "disclaimerRow", "disclaimerRow(Lcom/spotify/liveroom/listeningpartychat/ChatPartyPhase;)Lcom/spotify/liveroom/listeningpartychat/ChatRowUiState;", 0, (byte) 21));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cka(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cka(vhd0 vhd0Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = vhd0Var;
    }
}
