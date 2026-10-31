package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g2j1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2j1(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Integer numValueOf;
        String strK;
        ak90 xj90Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z = true;
        String strN0 = null;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                e2j1 e2j1Var = (e2j1) obj2;
                h2j1 h2j1Var = (h2j1) obj4;
                if (e2j1Var instanceof c2j1) {
                    h2j1Var.a.invoke();
                } else {
                    if (!(e2j1Var instanceof d2j1)) {
                        eg.o();
                        return null;
                    }
                    h2j1Var.b.invoke();
                }
                return rih1Var;
            case 1:
                ((f2o0) obj4).b.invoke();
                return rih1Var;
            case 2:
                w2j1 w2j1Var = (w2j1) obj2;
                y2j1 y2j1Var = (y2j1) obj4;
                if (w2j1Var instanceof v2j1) {
                    y2j1Var.c.invoke(((v2j1) w2j1Var).a);
                } else {
                    if (!(w2j1Var instanceof u2j1)) {
                        eg.o();
                        return null;
                    }
                    y2j1Var.b.invoke();
                }
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qn30 qn30Var = (qn30) obj4;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                jmr0 jmr0VarN = i3o1.n(2131233091, x340Var, 0);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                cwl1.f(jmr0VarN, (String) null, u291.r(nim0Var, 16.0f), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, x340Var, 56, 120);
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.v(nim0Var, 4.0f));
                uwo1.e(cwl1.n0(2131956147, new Object[]{qn30Var.a}, x340Var), (qim0) null, cbx.d(x340Var).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
                x340Var3.r(true);
                return rih1Var;
            case 4:
                t4j1 t4j1Var = (t4j1) obj2;
                vbe1 vbe1Var = (vbe1) obj4;
                z710 z710Var = (z710) vbe1Var.e;
                if (t4j1Var.equals(r4j1.a)) {
                    Uri uri = (Uri) ((idd1) vbe1Var.g).getValue();
                    Activity activity = (Activity) vbe1Var.c;
                    Intent intent = new Intent("android.intent.action.VIEW", uri);
                    if (intent.resolveActivity(activity.getPackageManager()) != null) {
                        activity.startActivity(intent);
                    } else {
                        z710.d(z710Var, (String) ((idd1) vbe1Var.f).getValue(), false, 6);
                    }
                } else if (t4j1Var.equals(q4j1.a)) {
                    z710.d(z710Var, "https://support.spotify.com/article/updating-spotify/", false, 6);
                } else {
                    if (!t4j1Var.equals(s4j1.a)) {
                        eg.o();
                        return null;
                    }
                    z710.d(z710Var, "https://open.spotify.com", true, 4);
                }
                return rih1Var;
            case 5:
                qim0 qim0VarR = (qim0) obj;
                ((Number) obj3).intValue();
                o6j1 o6j1Var = (o6j1) obj4;
                x340 x340Var4 = (b0k) obj2;
                x340Var4.i0(-2049597925);
                uwr uwrVar2 = cbx.a;
                cua cuaVar = cbx.b(x340Var4).f;
                try {
                    qim0VarR = exd0.r(qim0VarR, new ymg1(o6j1Var, (byte) 27));
                    break;
                } catch (Throwable th) {
                    Logger.e(th, "Failed to set background of the card " + o6j1Var, new Object[0]);
                }
                x340Var4.r(false);
                return qim0VarR;
            case 6:
                ((Number) obj3).intValue();
                qej1.i(((zej1) obj4).g, (b0k) obj2, 0);
                return rih1Var;
            case 7:
                vej1 vej1Var = (vej1) obj2;
                jb3 jb3Var = (jb3) obj4;
                lik1 lik1Var = (lik1) jb3Var.g;
                wej1 wej1Var = (wej1) jb3Var.f;
                if (vej1Var instanceof sej1) {
                    sej1 sej1Var = (sej1) vej1Var;
                    wej1Var.j(sej1Var.a, sej1Var.b, sej1Var.c);
                } else if (vej1Var instanceof tej1) {
                    Set setS0 = f46.S0(new blc0[]{blc0.Pg, blc0.ld});
                    Set set = s4b1.f;
                    tej1 tej1Var = (tej1) vej1Var;
                    String str = tej1Var.a;
                    boolean zContains = setS0.contains(uic.x(str).c);
                    String str2 = tej1Var.a;
                    if (zContains) {
                        blc0 blc0Var = uic.x(lik1Var.a).c;
                        mfm mfmVarA = ((i4q) jb3Var.e).a(lik1Var);
                        Observable observableA = a6z.a((a6z) jb3Var.d, str2, (String) null, (Map) null, lik1Var, new r6z((String) null, true, false, blc0Var != blc0.fh, false, false, false, false, false, true, true, false, false, false, false, true, (ugo0) null, (c821) null, false, false, false, false, (ok51) null, false, (String) null, false, (p860) null, 1073641525), (cee) null, 38);
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        mfm.b(mfmVarA, observableA, yon1.Y0(), (bjm) null, (tv80) null, 20);
                    } else {
                        boolean z2 = tej1Var.b;
                        boolean z3 = tej1Var.c;
                        ((ssf1) jb3Var.c).a(new dmf1(str2, lik1Var, lik1Var.a, new vsf1((String) null, (String) null, false, (String) null, true, false, false, false, false, uic.x(lik1Var.a).c != blc0.u1, (String) null, false, true, false, false, false, (ugo0) null, (ok51) null, true, z3 ? new g371(Collections.singletonList(gan0.a)) : new g371(), false, false, false, false, false, false, z2, false, (p860) null, (String) null, false, z3, -543335633, 31), Collections.singletonMap("is_music_video", "true")));
                    }
                    wej1Var.a(str);
                } else {
                    if (!(vej1Var instanceof uej1)) {
                        eg.o();
                        return null;
                    }
                    uej1 uej1Var = (uej1) vej1Var;
                    wej1Var.i(uej1Var.a, uej1Var.b);
                }
                return rih1Var;
            case 8:
                kij1 kij1Var = (kij1) obj2;
                if (kij1Var instanceof kij1) {
                    ((mij1) obj4).a.invoke(Boolean.valueOf(kij1Var.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 9:
                nli0 nli0Var = (nli0) obj2;
                if (nli0Var instanceof nli0) {
                    ((yjf0) obj4).invoke(Boolean.valueOf(nli0Var.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 10:
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                t1r t1rVar = (t1r) ((zrj1) obj4).c;
                hma1 hma1VarEdit = t1rVar.a.edit();
                bma1 bma1Var = t1r.i;
                hma1VarEdit.a(bma1Var, zBooleanValue);
                hma1VarEdit.g();
                t1rVar.e.accept(Boolean.valueOf(t1rVar.a.h(bma1Var, zBooleanValue)));
                return new it61(bool);
            case 11:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                bwj1 bwj1Var = (bwj1) obj4;
                jw31 jw31VarA2 = ew31.a(new d36(4.0f, true, new g21(een.P0, (byte) 29)), een.N0, x340Var5, 0);
                x340 x340Var6 = x340Var5;
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                qim0 qim0VarE2 = zr7.E(x340Var5, nim0Var);
                hzj.A.getClass();
                x340 x340Var7 = x340Var5;
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                nko1.H(jw31VarA2, x340Var5, y580.O0);
                nko1.H(xos0VarM2, x340Var5, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var5, y580.R0);
                nko1.F(x340Var5);
                nko1.H(qim0VarE2, x340Var5, y580.Y);
                eox eoxVar = eox.c;
                uwr uwrVar3 = cbx.a;
                long j = cbx.a(x340Var5).b.a;
                zov0 zov0Var2 = cbx.b(x340Var5).g;
                w0h1.a(eoxVar, isl.a, u291.r(nim0Var, 12.0f), j, 0L, false, x340Var5, eox.d | 48, 48);
                int iOrdinal = bwj1Var.ordinal();
                if (iOrdinal == 0) {
                    i = 2131954787;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2131954783;
                }
                uwo1.e(cwl1.o0(x340Var5, i), anm1.N("video_quality_info_text", nim0Var), cbx.d(x340Var5).j, cbx.a(x340Var5).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2032);
                x340Var7.r(true);
                return rih1Var;
            case 12:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                hwj1 hwj1Var = (hwj1) obj4;
                yvj1 yvj1Var = hwj1Var.b;
                String strO0 = cwl1.o0(x340Var8, yvj1Var.b());
                if (!hwj1Var.a) {
                    numValueOf = 2131963780;
                } else if (yvj1Var instanceof wvj1) {
                    uvj1 uvj1Var = hwj1Var.c;
                    numValueOf = uvj1Var != null ? Integer.valueOf(uvj1Var.b) : null;
                } else {
                    if (!(yvj1Var instanceof yvj1)) {
                        eg.o();
                        return null;
                    }
                    numValueOf = Integer.valueOf(yvj1Var.a.b);
                }
                if (numValueOf == null) {
                    x340 x340Var9 = x340Var8;
                    x340Var9.i0(16583439);
                    x340Var9.r(false);
                    strK = null;
                } else {
                    x340 x340Var10 = x340Var8;
                    strK = kk0.k(x340Var10, 16583440, numValueOf, x340Var10, false);
                }
                if (strK == null) {
                    x340 x340Var11 = x340Var8;
                    x340Var11.i0(16686917);
                    x340Var11.r(false);
                } else {
                    x340 x340Var12 = x340Var8;
                    x340Var12.i0(16686918);
                    strN0 = cwl1.n0(2131963779, new Object[]{strO0, strK}, x340Var12);
                    x340Var12.r(false);
                }
                String str3 = strN0 == null ? strO0 : strN0;
                uwr uwrVar4 = cbx.a;
                uwo1.e(str3, anm1.N("video_quality_selection_entry_point_row_subtitle", nim0Var), cbx.d(x340Var8).j, cbx.a(x340Var8).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2032);
                return rih1Var;
            case 13:
                xwj1 xwj1Var = (xwj1) obj2;
                zwj1 zwj1Var = ((bxj1) obj).a;
                if (zwj1Var instanceof zwj1) {
                    h5a1 h5a1Var = (h5a1) ((c0a) obj4).e;
                    zwj1 zwj1Var2 = zwj1Var;
                    int i2 = zwj1Var2.b;
                    zuc0 zuc0Var = zwj1Var2.g;
                    bk90 bk90Var = ((cqj1) h5a1Var.b).a;
                    int iOrdinal2 = xwj1Var.ordinal();
                    if (iOrdinal2 == 0) {
                        xj90Var = new xj90(i2, zuc0Var);
                    } else {
                        if (iOrdinal2 != 1) {
                            eg.o();
                            return null;
                        }
                        xj90Var = new zj90(i2, zuc0Var);
                    }
                    bk90Var.a(xj90Var);
                }
                return rih1Var;
            case 14:
                lzj1 lzj1Var = (lzj1) obj;
                wzj1 wzj1Var = ((pzj1) obj4).b;
                int i3 = lzj1Var.d;
                String str4 = lzj1Var.a;
                boolean z4 = lzj1Var.c;
                y6h1 y6h1Var = wzj1Var.a.b;
                b7x b7xVar = b7x.a;
                if (z4) {
                    Integer numValueOf2 = Integer.valueOf(i3);
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("video_row", (String) null, numValueOf2, str4, (String) null));
                    x6h1VarC.j = true;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("deselect_entity_in_list", 1, Collections.singletonMap("entity_to_be_deselected", str4)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                Integer numValueOf3 = Integer.valueOf(i3);
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("video_row", (String) null, numValueOf3, str4, (String) null));
                x6h1VarC2.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", str4)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 15:
                a1r0.j(((uk51) obj4).b, nik1.s1.a, (String) null, (Bundle) null, false, 14);
                return rih1Var;
            case 16:
                ((Number) obj3).intValue();
                c1k1 c1k1Var = (c1k1) obj4;
                x340 x340Var13 = (b0k) obj2;
                boolean zI = x340Var13.i(c1k1Var);
                Object objT = x340Var13.T();
                if (zI || objT == fkj0.X) {
                    objT = new dch1(c1k1Var, (byte) 26);
                    x340Var13.s0(objT);
                }
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar5 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var13).b;
                ulo1.d(0, (Function0) objT, x340Var13, uyn1.z(12.0f, 0.0f, 2, qim0VarF));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((sve) obj4).b.h("spotify:internal:regular-member-sub-account-details:video-settings:".concat(((i1k1) obj).a));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                tqw tqwVar = (tqw) obj3;
                k1k1 k1k1Var = (k1k1) obj4;
                String strE = k1k1.e((j1k1) obj);
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                lzn0 lzn0Var = k1k1Var.a;
                if (tv80VarY != null) {
                    lzn0Var.a(strE, tv80VarY, (Bundle) null);
                } else {
                    lzn0Var.h(strE);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                m6p1.f(((b6k1) obj4).a, (b0k) obj2, 0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                km61 km61Var = (km61) obj;
                tv80 tv80Var = (tv80) obj3;
                hce1 hce1Var = (hce1) obj4;
                if (!((Boolean) obj2).booleanValue()) {
                    fn31.T(smo1.e(flo1.l(op71.f(), (q8n) hce1Var.e)), (o8n) null, 0, new vxg1(hce1Var, km61Var, tv80Var, (lnm) null, (byte) 22), 3);
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                bge0 bge0Var = (bge0) obj;
                a77 a77Var = (a77) obj2;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                djq djqVar = (djq) obj4;
                switch (djqVar.a) {
                    case 0:
                        return new lv41(new r75(false, (luk) ((daq) ((ojq) djqVar.b.d).b).L1.get()), bge0Var, a77Var, atomicBoolean);
                    default:
                        return new lv41(new r75(false, (luk) ((daq) ((ojq) djqVar.b.d).b).L1.get()), bge0Var, a77Var, atomicBoolean);
                }
            case 22:
                List list = (List) obj;
                x340 x340Var14 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var14.g(list) ? 4 : 2;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Object[] objArr = {list};
                    df41 df41Var = new df41(new s6(list, (byte) 3), ah1.X0);
                    boolean z5 = (iIntValue & 14) == 4;
                    Object objT2 = x340Var15.T();
                    if (z5 || objT2 == fkj0.X) {
                        objT2 = new a1e(list, (byte) 4);
                        x340Var15.s0(objT2);
                    }
                    px2 px2Var = (px2) k5p1.u(objArr, df41Var, (Function0) objT2, x340Var15, 0);
                    irn1.u((qim0) null, apo.r(1292537871, new gmk1(px2Var, (byte) 1), x340Var15), (vu30) null, (erl1) null, apo.r(-1680958967, new sgi1((hmk1) obj4, px2Var, (byte) 10), x340Var15), x340Var15, 24624, 13);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var16 = (b0k) obj2;
                ((Number) obj3).intValue();
                qyk1 qyk1Var = (qyk1) obj4;
                jm5.f(qyk1Var.a, qyk1Var.i, (qim0) null, false, x340Var16, 0, 12);
                if (qyk1Var.f == 3) {
                    x340 x340Var17 = x340Var16;
                    x340Var17.i0(-1429930868);
                    rc2.m(qyk1Var.g, x340Var17, 0);
                    x340Var17.r(false);
                } else {
                    x340 x340Var18 = x340Var16;
                    x340Var18.i0(-1429854174);
                    rc2.l(qyk1Var.b, x340Var18, 0);
                    x340Var18.r(false);
                }
                rqo1.g(0, 0, x340Var16, u291.f(nim0Var, 1.0f));
                lgo1.j(48, qyk1Var.c, nrj.a, x340Var16, u291.f(nim0Var, 1.0f));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((vdl1) obj4).c.c((g2c) obj, (b0k) obj2, ((Number) obj3).intValue() & 14);
                return rih1Var;
            case 25:
                wto wtoVar = (wto) obj;
                d0r d0rVar = (d0r) obj2;
                hwl1 hwl1Var = (hwl1) obj4;
                String str5 = wtoVar.a;
                rvl1 rvl1Var = (rvl1) wtoVar.e;
                xj20 xj20Var = xj20.e;
                flj0 flj0Var = new flj0(new clj0(1), 1);
                zrj1 zrj1Var = hwl1Var.f;
                return new mlj0(new llj0(xj20Var, (iqy) null, (Function0) null, new blj0(0, new vjj0(new en6(d0rVar, (byte) 5)), new vjj0(new lvl1(zrj1Var, d0rVar, (byte) 1)), new vjj0(new lvl1(zrj1Var, d0rVar, (byte) 0)), null, null, null, null, null, 497), (hlj0) null, (vjj0) null, (vjj0) null, (String) null, flj0Var, (jlj0) null, kx50.a, 28638), (vjj0) null, (up11) null, new l3j1(str5, rvl1Var, hwl1Var, d0rVar, (byte) 8), hwl1Var.e.a, 1, false, (xe01) null, 3870);
            case 26:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                tnm1 tnm1Var = (tnm1) obj4;
                String str6 = tnm1Var.b;
                String str7 = tnm1Var.c;
                long jQ = bro1.q(tnm1Var.d);
                String str8 = tnm1Var.a;
                uwr uwrVar6 = cbx.a;
                cua cuaVar2 = cbx.b(b0kVar).f;
                k1p1.a(str6, str7, 3, (qim0) null, jQ, false, new m1a(str8, er31.b(4.0f)), b0kVar, 2097536, 40);
                return rih1Var;
            case 27:
                ((Number) obj3).intValue();
                rnm1 rnm1Var = (rnm1) obj4;
                k1p1.a(rnm1Var.a, rnm1Var.b, 4, (qim0) null, bro1.q(rnm1Var.c), true, (m1a) null, (b0k) obj2, 196992, 72);
                return rih1Var;
            case 28:
                ((Number) obj3).intValue();
                snm1 snm1Var = (snm1) obj4;
                k1p1.a(snm1Var.a, snm1Var.b, 1, (qim0) null, bro1.q(snm1Var.c), false, (m1a) null, (b0k) obj2, 384, 104);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                unm1 unm1Var = (unm1) obj4;
                k1p1.a(unm1Var.a, unm1Var.b, 1, (qim0) null, bro1.q(unm1Var.c), false, (m1a) null, (b0k) obj2, 384, 104);
                return rih1Var;
        }
    }
}
