package p;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.pending_events.esperanto.proto.ReplacePendingEventRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yih0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yih0(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a9  */
    public final Object invoke(Object obj, Object obj2) {
        iu30 iu30Var;
        iu30 iu30Var2;
        List listL1;
        Set setP1;
        ufs0 ufs0Var;
        aqj0 aqj0VarD;
        kak0 kak0VarA;
        kak0 kak0VarA2;
        a7k0 a7k0VarB;
        s5k0 s5k0Var;
        boolean z;
        boolean zJ;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                ((vu30) ((up41) this.b).b).invoke((pih0) obj, (String) obj2);
                return rih1.a;
            case 1:
                lxh0 lxh0Var = (lxh0) obj;
                String str = (String) obj2;
                int iOrdinal = ((y0i0) this.b).ordinal();
                if (iOrdinal == 0) {
                    return lxh0Var.l(str, y0i0.a);
                }
                if (iOrdinal == 1) {
                    return lxh0Var.l(str, y0i0.b);
                }
                if (iOrdinal == 2) {
                    return lxh0Var.l(str, y0i0.c);
                }
                eg.o();
                return null;
            case 2:
                return ((Context) ((pbq) this.b).f).getString(2131959398, (String) obj, (String) obj2);
            case 3:
                pzw pzwVar = (pzw) this.b;
                return too1.w((mey0) obj, (t810) obj2, (yqg) pzwVar.h, (fza) pzwVar.i, (hvp0) pzwVar.t, (ytp0) pzwVar.X, (ebi0) pzwVar.d);
            case 4:
                Integer numValueOf = Integer.valueOf(((Number) obj).intValue());
                mey0 mey0Var = ((cbi0) this.b).c;
                return new wql0(numValueOf, mey0Var.b, mey0Var.d, (r6h1) obj2);
            case 5:
                kbi0 kbi0Var = (kbi0) obj2;
                t810 t810Var = kbi0Var.a;
                sbi0 sbi0Var = kbi0Var.b;
                obi0 obi0Var = (obi0) this.b;
                return too1.x((mey0) obj, sbi0Var.a, sbi0Var.b, sbi0Var.c, (prl) null, sbi0Var.d, t810Var, obi0Var.c, obi0Var.d, obi0Var.e, obi0Var.t);
            case 6:
                Integer numValueOf2 = Integer.valueOf(((Number) obj).intValue());
                mey0 mey0Var2 = ((dbi0) this.b).c;
                return new wql0(numValueOf2, mey0Var2.a, mey0Var2.d, (r6h1) obj2);
            case 7:
                return upo1.H((ndi0) obj, (sdi0) obj2, ((wdi0) this.b).f);
            case 8:
                xdi0 xdi0Var = (xdi0) this.b;
                nfp nfpVar = xdi0Var.a;
                idm idmVarA = ycm.a(xdi0Var.b);
                wgp wgpVar = (wgp) nfpVar.a.c;
                gw70 gw70VarK = wgpVar.a.k();
                c8o.l(gw70VarK);
                lo60 lo60VarU = wgpVar.u();
                iuj iujVar = (iuj) wgpVar.a0.get();
                vgm vgmVarD = wgpVar.a.d();
                c8o.l(vgmVarD);
                nwt nwtVar = (nwt) wgpVar.c0.get();
                luk lukVarB = wgpVar.a.b();
                c8o.l(lukVarB);
                vun vunVar = new vun(new vd4(true, lukVarB), (byte) 28);
                fns fnsVar = igu.a;
                c8o.m(fnsVar);
                return new jpg0(f6o1.A(new wdi0(gw70VarK, lo60VarU, iujVar, vgmVarD, nwtVar, vunVar, fnsVar, idmVarA), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), k8b0.X);
            case 9:
                ((Number) obj2).intValue();
                wpo1.c((hdi0) this.b, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 10:
                String str2 = (String) obj2;
                pbq pbqVar = (pbq) this.b;
                ((hs00) pbqVar.X).a(str2).subscribe();
                ((c7s) pbqVar.c).a(str2, new dvg0(pbqVar, str2, (byte) 7));
                return rih1.a;
            case 11:
                hgi0 hgi0Var = (hgi0) obj;
                rgi0 rgi0Var = (rgi0) this.b;
                AtomicBoolean atomicBoolean = rgi0Var.O0;
                String str3 = hgi0Var.a;
                igi0 igi0VarS = zqo1.s(hgi0Var, (egi0) obj2);
                boolean zIsEmpty = igi0VarS.b.isEmpty();
                if (zIsEmpty && !atomicBoolean.getAndSet(true)) {
                    iu30 iu30Var3 = rgi0Var.t;
                    if (iu30Var3 != null) {
                        iu30Var3.invoke(str3);
                    }
                } else if (!zIsEmpty && atomicBoolean.getAndSet(false) && (iu30Var = rgi0Var.X) != null) {
                    iu30Var.invoke(str3);
                }
                return igi0VarS;
            case 12:
                hgi0 hgi0Var2 = (hgi0) obj;
                ahi0 ahi0Var = (ahi0) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) ahi0Var.U0;
                String str4 = hgi0Var2.a;
                igi0 igi0VarS2 = zqo1.s(hgi0Var2, (egi0) obj2);
                boolean zIsEmpty2 = igi0VarS2.b.isEmpty();
                if (zIsEmpty2 && !atomicBoolean2.getAndSet(true)) {
                    iu30 iu30Var4 = (iu30) ahi0Var.O0;
                    if (iu30Var4 != null) {
                        iu30Var4.invoke(str4);
                    }
                } else if (!zIsEmpty2 && atomicBoolean2.getAndSet(false) && (iu30Var2 = (iu30) ahi0Var.P0) != null) {
                    iu30Var2.invoke(str4);
                }
                return igi0VarS2;
            case 13:
                Integer numValueOf3 = Integer.valueOf(((Number) obj).intValue());
                mhi0 mhi0Var = (mhi0) this.b;
                return new wql0(numValueOf3, mhi0Var.b().b, mhi0Var.b().d, (r6h1) obj2);
            case 14:
                zsk zskVar = (zsk) obj;
                String str5 = zskVar.c;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = zskVar.d;
                String str7 = str6 != null ? str6 : "";
                if (ihc1.y0(str5)) {
                    n57.e("Minimum birthday has not been set.");
                }
                if (ihc1.y0(str7)) {
                    n57.e("Maximum birthday has not been set.");
                }
                return new bmi0(((dmi0) this.b).e.a, str5, str7, gfk1.a);
            case 15:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                pni0 pni0Var = (pni0) this.b;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yrp yrpVar = pni0Var.c;
                    boolean zI = x340Var2.i(pni0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new z8i0(pni0Var, (byte) 9);
                        x340Var2.s0(objT);
                    }
                    g1i g1iVar = (g1i) yrpVar.a.c;
                    et90 et90Var = new et90((Function0) objT, (zrp) ((jly0) g1iVar.d).get(), (asp) ((jly0) g1iVar.e).get());
                    sni0 sni0Var = pni0Var.d;
                    otw.c(et90Var, new oni0(sni0Var.a, sni0Var.b), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            case 16:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwo1.e(((l921) this.b).b, u291.f(nim0.a, 1.0f), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2044);
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                o9p o9pVar = (o9p) ((ur6) this.b).b;
                o9pVar.getClass();
                u9p u9pVar = (u9p) o9pVar.a.c;
                lzn0 lzn0Var = (lzn0) u9pVar.G.get();
                xfx xfxVarD = ((i1o) u9pVar.C).d();
                c8o.l(xfxVarD);
                return new jpg0(new rui0(lzn0Var, xfxVarD, (zob1) obj), fii0.b1);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwo1.e(cwl1.n0(2131958764, new Object[]{((aaj0) this.b).a}, x340Var6), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2046);
                } else {
                    x340Var6.b0();
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                rmj0 rmj0Var = (rmj0) obj;
                mmj0 mmj0Var = (mmj0) obj2;
                return new smj0(((dx0) this.b).h(rmj0Var, (rmj0Var.j && mmj0Var.a) ? false : true, mmj0Var.b instanceof fy50, mmj0Var.d, mmj0Var.e, mmj0Var.c));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                i1r i1rVar = (k1r) obj2;
                vu30 vu30Var = (vu30) ((bs0) this.b).e;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                return vu30Var.invoke(i1rVar2 != null ? i1rVar2.a : null, obj);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                double dDoubleValue = ((Number) obj2).doubleValue();
                List list = (List) ((LinkedHashMap) this.b).get((String) obj);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((mqj0) it.next()).i(dDoubleValue);
                    }
                }
                return rih1.a;
            case 22:
                Set set = (Set) obj;
                Set set2 = (Set) obj2;
                zpj0 zpj0Var = (zpj0) this.b;
                long jLongValue = ((Number) zpj0Var.a.invoke()).longValue();
                long jLongValue2 = ((Number) zpj0Var.b.invoke()).longValue();
                synchronized (zpj0Var.m) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        zpj0Var.g(new fpj0(set, set2), jLongValue);
                        for (mqj0 mqj0Var : zpj0Var.e.values()) {
                            if (set.contains(mqj0Var.a.b) && (aqj0VarD = mqj0Var.d(2, jLongValue, jLongValue2)) != null) {
                                arrayList.add(aqj0VarD);
                            }
                        }
                        Iterator it2 = zpj0Var.f.values().iterator();
                        while (it2.hasNext()) {
                            for (mqj0 mqj0Var2 : ((Map) it2.next()).values()) {
                                if (set2.contains(mqj0Var2.a.b)) {
                                    mqj0Var2.b(jLongValue);
                                }
                            }
                        }
                        listL1 = o7h.l1(arrayList);
                        setP1 = o7h.p1(linkedHashSet);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                List<aqj0> list2 = listL1;
                Set set3 = setP1;
                if (!list2.isEmpty()) {
                    khp0 khp0Var = zpj0Var.c;
                    for (aqj0 aqj0Var : list2) {
                        if (aqj0Var.n) {
                            myq0 myq0Var = khp0Var.y;
                            if (myq0Var != null && (ufs0Var = (ufs0) ((ConcurrentHashMap) myq0Var.c).remove(aqj0Var.c)) != null) {
                                phc byteString = aqo1.w(aqj0Var).toByteString();
                                lf21 lf21VarN = ReplacePendingEventRequest.n();
                                lf21VarN.r(ufs0Var.a);
                                lf21VarN.s(ufs0Var.b);
                                lf21VarN.q("OopsMetricEvent");
                                lf21VarN.n(byteString);
                                ReplacePendingEventRequest replacePendingEventRequestBuild = lf21VarN.build();
                                vfs0 vfs0Var = (vfs0) myq0Var.b;
                                replacePendingEventRequestBuild.getClass();
                                vfs0Var.a(replacePendingEventRequestBuild).subscribe(new w090(myq0Var, ufs0Var, (byte) 28), zzc0.d1);
                            }
                        } else {
                            khp0Var.a.b(eth.Y(aqj0Var));
                        }
                    }
                }
                if (!set3.isEmpty()) {
                    zpj0Var.k(set3);
                }
                return rih1.a;
            case 23:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    uwo1.e(((ttj0) this.b).b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2046);
                } else {
                    x340Var8.b0();
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                v8k0 v8k0Var = (v8k0) obj;
                Bundle bundle = (Bundle) obj2;
                if (bundle == null) {
                    kak0VarA = (kak0) ((idd1) v8k0Var.e.N0).getValue();
                } else {
                    kak0VarA = (kak0) jhc1.t(bundle, "mobius_model_key", kak0.class);
                    if (kak0VarA == null) {
                        kak0VarA = null;
                    } else if (!(kak0VarA.e instanceof odm0)) {
                        kak0VarA = kak0.a(kak0VarA, ndm0.a, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575);
                    }
                    if (kak0VarA == null) {
                        kak0VarA = (kak0) ((idd1) v8k0Var.e.N0).getValue();
                    }
                }
                kak0 kak0Var = kak0VarA;
                oyj0 oyj0Var = ((qyj0) this.b).d;
                oyj0Var.getClass();
                lyj0 lyj0Var = kak0Var.v1;
                a7k0 a7k0VarF = o2p1.f(kak0Var);
                kyj0 kyj0Var = oyj0Var.b;
                a7k0 a7k0VarB2 = kyj0Var.b();
                nyj0 nyj0Var = new nyj0(kak0Var.T0, kak0Var.U0);
                if (a7k0VarB2 == null || !u890.j(lyj0Var.a, kyj0Var.b)) {
                    kak0VarA2 = kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, oyj0Var.T(a7k0VarF), 0L, (Integer) null, (Integer) null, -1, 1015807);
                } else {
                    nyj0 nyj0Var2 = oyj0Var.c;
                    if (nyj0Var2 != null && !nyj0Var2.equals(nyj0Var)) {
                        z2 = true;
                    }
                    ilk0 ilk0Var = a7k0VarF.b;
                    if (lyj0Var.equals(kyj0Var.c()) && (a7k0VarB = kyj0Var.b()) != null) {
                        ilk0 ilk0Var2 = a7k0VarB.b;
                        ntf1 ntf1Var = ilk0Var2.a;
                        ntf1 ntf1Var2 = ilk0Var.a;
                        if (ntf1Var.equals(ntf1Var2)) {
                            if (ilk0Var.b > ilk0Var2.b) {
                                kyj0Var.f.put(ntf1Var2, ilk0Var);
                                jyj0 jyj0Var = kyj0Var.h;
                                if (jyj0Var != null) {
                                    a7k0 a7k0Var = jyj0Var.b;
                                    if (a7k0Var.b.a.equals(ntf1Var2)) {
                                        jyj0Var = new jyj0(a7k0.a(jyj0Var.a, ilk0Var), a7k0.a(a7k0Var, ilk0Var));
                                    }
                                } else {
                                    jyj0Var = null;
                                }
                                kyj0Var.h = jyj0Var;
                            }
                            wj60 wj60Var = kyj0Var.g;
                            kyj0Var.g = wj60Var != null ? wj60.a(wj60Var, a7k0VarF.a, (ntf1) null, 5) : null;
                        } else if (z2) {
                            kyj0Var.e(ntf1Var, a7k0VarF);
                        } else {
                            roo rooVar = roo.a;
                            if (kyj0Var.a == 0) {
                                kyj0Var.c();
                            } else {
                                kyj0Var.a();
                                kyj0Var.g(a7k0VarB, a7k0VarF, rooVar);
                            }
                        }
                    }
                    a7k0 a7k0VarB3 = kyj0Var.b();
                    kak0VarA2 = a7k0VarB3 != null ? kak0.a(o2p1.p(kak0Var, a7k0VarB3), (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, kyj0Var.c(), 0L, (Integer) null, (Integer) null, -1, 1015807) : kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, oyj0Var.T(a7k0VarF), 0L, (Integer) null, (Integer) null, -1, 1015807);
                }
                oyj0Var.c = nyj0Var;
                return kak0VarA2;
            case 25:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ((r4k0) this.b).g((qim0) null, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1.a;
            case 26:
                Bundle bundle2 = (Bundle) obj2;
                wsc0 wsc0Var = ((t5k0) obj).a;
                String str8 = ((v5k0) this.b).a.b;
                if (bundle2 != null && (s5k0Var = (s5k0) jhc1.t(bundle2, "mobius_model_key", s5k0.class)) != null) {
                    return s5k0Var;
                }
                List<zuc0> list3 = wsc0Var.e;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                for (zuc0 zuc0Var : list3) {
                    arrayList2.add(new fy00(1, zuc0Var.a, zuc0Var.c, false, (String) null));
                }
                return new s5k0(arrayList2, str8, ztb1.a);
            case 27:
                c8k0 c8k0Var = (c8k0) obj;
                h8k0 h8k0Var = (h8k0) obj2;
                t8k0 t8k0Var = (t8k0) this.b;
                if (!(c8k0Var instanceof c8k0)) {
                    eg.o();
                    return null;
                }
                a8k0 a8k0Var = c8k0Var.b;
                String str9 = c8k0Var.c;
                boolean z3 = h8k0Var.a;
                boolean z4 = h8k0Var.b;
                String str10 = h8k0Var.c;
                rxj0 rxj0Var = t8k0Var.e;
                kkg1 kkg1Var = t8k0Var.d;
                if (rxj0Var.H) {
                    String str11 = (String) a8k0Var.d.get("automix.backend_auto_transition");
                    if (str11 != null) {
                        kkg1Var.getClass();
                        lhg1 lhg1VarA = kkg1.a(str11);
                        zJ = u890.j(lhg1VarA != null ? Boolean.valueOf(kkg1.d(c8k0Var.a.a, a8k0Var.a, lhg1VarA)) : null, Boolean.TRUE);
                    } else {
                        zJ = false;
                    }
                    z = zJ;
                }
                return new d8k0(c8k0Var, str9, z3, z4, str10, z, 8);
            case 28:
                ((Number) obj2).intValue();
                g2p1.s((aak0) this.b, (b0k) obj, czo1.p(1));
                return rih1.a;
            default:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((pek0) this.b).j((qim0) null, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yih0(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
