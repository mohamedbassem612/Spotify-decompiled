package p;

import android.content.res.Resources;
import android.view.Choreographer;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.adsinternal.adscommon.events.proto.AdError;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.recents.recentsdatasourceimpl.events.proto.RecentsDecorationErrorEvent;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l0x0 implements j2u, Function, Function3, j06 {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;
    public Object d;

    public l0x0(xrc0 xrc0Var, iyc0 iyc0Var) {
        this.a = (byte) 9;
        this.b = xrc0Var;
        this.c = iyc0Var;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.N();
        sku0VarP.d0();
        sku0VarP.R();
        sku0VarP.G();
        hru0VarS.w(sku0VarP.build());
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.v();
        hru0VarS.u(iou0VarV.build());
        this.d = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, qrc0.a, hqz0.a, (prc0) null, 0, (List) null, 462);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(String str, String str2, onm onmVar) {
        ady0 ady0Var;
        if (onmVar instanceof ady0) {
            ady0Var = (ady0) onmVar;
            int i = ady0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ady0Var.c = i - Integer.MIN_VALUE;
            } else {
                ady0Var = new ady0(this, onmVar);
            }
        } else {
            ady0Var = new ady0(this, onmVar);
        }
        Object objA = ady0Var.a;
        int i2 = ady0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            iyc0 iyc0Var = (iyc0) this.c;
            ayc0 ayc0Var = new ayc0("generate", null, phc.i(str2), false, null, 26);
            ady0Var.c = 1;
            objA = iyc0.a(iyc0Var, str, ayc0Var, ady0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        ((py21) objA).d();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(onm onmVar) {
        wsy0 wsy0Var;
        if (onmVar instanceof wsy0) {
            wsy0Var = (wsy0) onmVar;
            int i = wsy0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wsy0Var.c = i - Integer.MIN_VALUE;
            } else {
                wsy0Var = new wsy0(this, onmVar);
            }
        } else {
            wsy0Var = new wsy0(this, onmVar);
        }
        Object obj = wsy0Var.a;
        int i2 = wsy0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            CompletableOnErrorComplete completableOnErrorCompleteO = ((Completable) ((x631) this.c).invoke("android-puffin-onboarding")).o(Functions.h);
            wsy0Var.c = 1;
            Object objI = fc11.i(completableOnErrorCompleteO, wsy0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        ((a1r0) this.b).g();
        return rih1.a;
    }

    public void C() {
        b0x0 b0x0Var = (b0x0) this.b;
        SingleSubject singleSubject = (SingleSubject) b0x0Var.a.remove(((m0x0) this.c).f);
        if (singleSubject != null) {
            singleSubject.onSuccess(wzw0.c);
        }
        ((lzn0) this.d).e();
    }

    public void Y(wzw0 wzw0Var) {
        b0x0 b0x0Var = (b0x0) this.b;
        SingleSubject singleSubject = (SingleSubject) b0x0Var.a.remove(((m0x0) this.c).f);
        if (singleSubject != null) {
            singleSubject.onSuccess(wzw0Var);
        }
        ((lzn0) this.d).e();
    }

    public Object a() {
        return this.d;
    }

    public Object apply(Object obj) {
        eww0 eww0Var;
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 1:
                s1x0 s1x0Var = (s1x0) obj;
                return ((do70) this.b).h(s1x0Var.g).observeOn((Scheduler) obj2).map(new yqu0((gdx0) this.d, s1x0Var, (byte) 17)).doOnError(xfs0.c1).onErrorReturn(e2x0.b).toObservable();
            case 2:
                j4x0 j4x0Var = (j4x0) obj;
                return rqt0.F((q8n) this.b, new glu0(obj2, (Object) j4x0Var, this.d, (lnm) null, (byte) 14)).doOnError(new lyw0(j4x0Var, (byte) 1)).onErrorReturnItem(new x5x0((Boolean) null, j4x0Var.e, j4x0Var.f, j4x0Var.g, (String) null)).toObservable();
            case 3:
                j8x0 j8x0Var = (j8x0) this.b;
                List list = (List) obj;
                int iS = zno1.s(q7h.U(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : list) {
                    linkedHashMap.put(((eww0) obj3).a, obj3);
                }
                List<obx0> list2 = j8x0Var.b;
                Map map = (Map) obj2;
                tzr0 tzr0Var = (tzr0) this.d;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (obx0 obx0VarH : list2) {
                    if (!(obx0VarH instanceof zbx0)) {
                        if (!(obx0VarH instanceof obx0)) {
                            eg.o();
                            return null;
                        }
                        obx0 obx0Var = obx0VarH;
                        String str = (String) map.get(obx0Var.b);
                        if (str != null && (eww0Var = (eww0) linkedHashMap.get(str)) != null) {
                            obx0VarH = tzr0Var.h(obx0Var, eww0Var);
                        }
                    }
                    arrayList.add(obx0VarH);
                }
                return j8x0.a(j8x0Var, 0, arrayList, (String) null, false, false, 0, 0, 125);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                mmr0 mmr0Var = (mmr0) obj;
                return new CompletableFromAction(new wcz0((tig0) mmr0Var.a, (kdy0) this.b, (adz0) obj2, (ou80) this.d, ((Boolean) mmr0Var.b).booleanValue()));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((ifz0) this.b).h((String) this.d, (List) obj, ((nfz0) obj2).a.h(nfz0.c, false));
            default:
                if (((Boolean) obj).booleanValue()) {
                    return CompletableEmpty.a;
                }
                gx01 gx01Var = (gx01) this.b;
                return j2h1.D(gx01Var.k, new glu0((Object) gx01Var, obj2, this.d, (lnm) null, (byte) 29));
        }
    }

    public void b(int i, int i2, int i3) {
        edn0 edn0Var = (edn0) this.b;
        edn0Var.a(3);
        edn0Var.a(i);
        edn0Var.a(i2);
        edn0Var.a(i3);
    }

    public void c(int i, int i2) {
        edn0 edn0Var = (edn0) this.b;
        edn0Var.a(2);
        edn0Var.a(i);
        edn0Var.a(i2);
    }

    public void clear() {
        ((edn0) this.b).a(4);
    }

    public void d(Object obj, vu30 vu30Var) {
        ((edn0) this.b).a(7);
        wdn0 wdn0Var = (wdn0) this.c;
        wdn0Var.b(vu30Var);
        wdn0Var.b(obj);
    }

    public void e(int i, Object obj) {
        edn0 edn0Var = (edn0) this.b;
        edn0Var.a(6);
        edn0Var.a(i);
        ((wdn0) this.c).b(obj);
    }

    public void g(int i, Object obj) {
        edn0 edn0Var = (edn0) this.b;
        edn0Var.a(5);
        edn0Var.a(i);
        ((wdn0) this.c).b(obj);
    }

    public void h(Object obj) {
        ((edn0) this.b).a(1);
        ((wdn0) this.c).b(obj);
    }

    public void i() {
        ((edn0) this.b).a(8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object j(fm01 fm01Var, onm onmVar) {
        jm01 jm01Var;
        gm01 gm01Var = (gm01) this.b;
        if (onmVar instanceof jm01) {
            jm01Var = (jm01) onmVar;
            int i = jm01Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jm01Var.d = i - Integer.MIN_VALUE;
            } else {
                jm01Var = new jm01(this, onmVar);
            }
        } else {
            jm01Var = new jm01(this, onmVar);
        }
        Object obj = jm01Var.b;
        int i2 = jm01Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            jm01Var.a = fm01Var;
            jm01Var.d = 1;
            Object objZ = qyo1.z(jm01Var, new ldz0(1, (byte) 9), gm01Var.a, false, true);
            if (objZ != d9nVar) {
                objZ = rih1Var;
            }
            if (objZ != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fm01Var = jm01Var.a;
        hm5.M(obj);
        hm01 hm01Var = new hm01(((yqg) this.d).b(), fm01Var.a, fm01Var.b);
        jm01Var.a = null;
        jm01Var.d = 2;
        Object objZ2 = qyo1.z(jm01Var, new j3y0((Object) gm01Var, (Object) hm01Var, (byte) 26), gm01Var.a, false, true);
        if (objZ2 != d9nVar) {
            objZ2 = rih1Var;
        }
        return objZ2 == d9nVar ? d9nVar : rih1Var;
    }

    public void k() {
        LinearLayoutManager layoutManager = ((RecyclerView) this.b).getLayoutManager();
        tr80 tr80Var = new tr80(layoutManager.c1(), layoutManager.g1(), 1);
        if (tr80Var.equals((tr80) this.d)) {
            return;
        }
        ((tak1) this.c).invoke(tr80Var);
        this.d = tr80Var;
    }

    public void l() {
        ((edn0) this.b).a(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable m(onm onmVar) {
        km01 km01Var;
        if (onmVar instanceof km01) {
            km01Var = (km01) onmVar;
            int i = km01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                km01Var.c = i - Integer.MIN_VALUE;
            } else {
                km01Var = new km01(this, onmVar);
            }
        } else {
            km01Var = new km01(this, onmVar);
        }
        Object objZ = km01Var.a;
        int i2 = km01Var.c;
        if (i2 == 0) {
            hm5.M(objZ);
            gm01 gm01Var = (gm01) this.b;
            km01Var.c = 1;
            objZ = qyo1.z(km01Var, new ldz0(1, (byte) 10), gm01Var.a, true, false);
            d9n d9nVar = d9n.a;
            if (objZ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objZ);
        }
        Iterable<hm01> iterable = (Iterable) objZ;
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        for (hm01 hm01Var : iterable) {
            arrayList.add(new fm01(hm01Var.a, hm01Var.b));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    public Object n(Object obj, Object obj2, Object obj3) {
        int i;
        w7x w7xVarSingleton;
        w7x w7xVar;
        boolean z;
        ebz0 ebz0Var = (ebz0) obj;
        ebz0 ebz0Var2 = (ebz0) obj2;
        ebz0 ebz0Var3 = (ebz0) obj3;
        yaz0 yaz0Var = (yaz0) this.b;
        Map map = (Map) this.c;
        if (y7y0.L(map)) {
            i = 1;
        } else {
            i = yaz0Var.f(map) ? 2 : 3;
        }
        boolean z2 = y7y0.L(map) || (yaz0Var.f(map) && ((Boolean) this.d).booleanValue());
        Set set = abz0.a;
        xj61 xj61VarL = ujo1.l(!yaz0Var.f(map), yaz0Var.f(map) ? false : ebz0Var2.a);
        w7x w7xVar2 = abz0.a;
        boolean z3 = ebz0Var3.a;
        if (z2) {
            if (ebz0Var.a) {
                w7xVar = w7xVar2;
            } else {
                w7xVarSingleton = Collections.singleton(abz0.d);
            }
            if (y7y0.G(map) || !y7y0.z(map) || y7y0.E(map)) {
                z = false;
            } else {
                z = true;
            }
            return new bbz0(z2, i, xj61VarL, xj61VarL, xj61VarL, w7xVar2, w7xVar2, z3, w7xVar2, w7xVar, false, z, (t380) null, 8196);
        }
        w7xVarSingleton = abz0.b;
        w7xVar = w7xVarSingleton;
        if (y7y0.G(map)) {
            z = false;
        } else {
            z = false;
        }
        return new bbz0(z2, i, xj61VarL, xj61VarL, xj61VarL, w7xVar2, w7xVar2, z3, w7xVar2, w7xVar, false, z, (t380) null, 8196);
    }

    public void o(l10 l10Var) {
        ti tiVar;
        kzp0 kzp0Var = (kzp0) this.c;
        fln0 fln0Var = (fln0) this.b;
        if (l10Var instanceof z00) {
            z00 z00Var = (z00) l10Var;
            boolean z = z00Var.a;
            jln0 jln0Var = (jln0) this.d;
            if (!z) {
                jln0Var.e.clear();
                return;
            }
            eln0 eln0Var = z00Var.b;
            String str = eln0Var.a;
            List list = z00Var.c;
            if (jln0Var.e.add(str)) {
                fln0 fln0Var2 = jln0Var.a;
                fln0Var2.getClass();
                if (!men1.m(eln0Var)) {
                    fln0Var2.a(eln0Var, co0.Z, "");
                }
                if (list.isEmpty()) {
                    ae5 ae5Var = jln0Var.d;
                    String str2 = eln0Var.c;
                    String str3 = eln0Var.f;
                    wn0 wn0VarN = AdError.n();
                    wn0VarN.n(str);
                    wn0VarN.r("AdDataMissing");
                    wn0VarN.q("Error: NativeAdsLogger could not post tracking data as it was missing");
                    wn0VarN.s(str2);
                    wn0VarN.w(str3);
                    AdError adError = (AdError) wn0VarN.build();
                    t2j0 t2j0Var = ae5Var.a;
                    adError.getClass();
                    t2j0Var.a(adError);
                }
                iln0 iln0Var = jln0Var.c;
                if (iln0Var.a.contains(str)) {
                    return;
                }
                iln0Var.a.add(str);
                jln0Var.b.a(list);
                return;
            }
            return;
        }
        if (l10Var instanceof qy) {
            qy qyVar = (qy) l10Var;
            kzp0Var.a(qyVar.b);
            eln0 eln0Var2 = qyVar.a;
            fln0Var.getClass();
            if (men1.m(eln0Var2)) {
                return;
            }
            fln0Var.a(eln0Var2, co0.d, "card");
            return;
        }
        if (l10Var instanceof d00) {
            d00 d00Var = (d00) l10Var;
            c00 c00Var = d00Var.c;
            List list2 = d00Var.b;
            if (c00Var instanceof a00) {
                kzp0Var.a(list2);
                tiVar = lln0.b;
            } else if (c00Var instanceof zz) {
                tiVar = kln0.b;
            } else if (!(c00Var instanceof b00)) {
                eg.o();
                return;
            } else {
                kzp0Var.a(list2);
                tiVar = mln0.b;
            }
            eln0 eln0Var3 = d00Var.a;
            fln0Var.getClass();
            if (men1.m(eln0Var3)) {
                return;
            }
            fln0Var.a(eln0Var3, co0.d, tiVar.a);
            return;
        }
        if (l10Var instanceof g00) {
            g00 g00Var = (g00) l10Var;
            kzp0Var.a(g00Var.b.a);
            eln0 eln0Var4 = g00Var.a;
            fln0Var.getClass();
            if (men1.m(eln0Var4)) {
                return;
            }
            fln0Var.a(eln0Var4, co0.d, "mute");
            return;
        }
        if (l10Var instanceof uz) {
            uz uzVar = (uz) l10Var;
            kzp0Var.a(uzVar.b);
            eln0 eln0Var5 = uzVar.a;
            fln0Var.getClass();
            if (men1.m(eln0Var5)) {
                return;
            }
            fln0Var.a(eln0Var5, co0.d, "mute");
            return;
        }
        if (l10Var instanceof xy) {
            eln0 eln0Var6 = ((xy) l10Var).a;
            fln0Var.getClass();
            if (men1.m(eln0Var6)) {
                return;
            }
            fln0Var.a(eln0Var6, co0.d, "play");
            return;
        }
        if (l10Var instanceof cz) {
            cz czVar = (cz) l10Var;
            bz bzVar = czVar.c;
            eln0 eln0Var7 = czVar.a;
            if (bzVar.equals(zy.a)) {
                fln0Var.getClass();
                if (!men1.m(eln0Var7)) {
                    fln0Var.a(eln0Var7, co0.d, "heart");
                }
                kzp0Var.a(czVar.b);
                return;
            }
            if (!bzVar.equals(az.a)) {
                eg.o();
                return;
            }
            fln0Var.getClass();
            if (men1.m(eln0Var7)) {
                return;
            }
            fln0Var.a(eln0Var7, co0.d, "heart");
            return;
        }
        if (l10Var instanceof wy) {
            eln0 eln0Var8 = ((wy) l10Var).a;
            fln0Var.getClass();
            if (men1.m(eln0Var8)) {
                return;
            }
            fln0Var.a(eln0Var8, co0.d, "three_dots");
            return;
        }
        if (!(l10Var instanceof e00)) {
            eg.o();
            return;
        }
        e00 e00Var = (e00) l10Var;
        if (e00Var.c) {
            return;
        }
        eln0 eln0Var9 = e00Var.a;
        fln0Var.getClass();
        if (!men1.m(eln0Var9)) {
            fln0Var.a(eln0Var9, co0.d, "presave");
        }
        kzp0Var.a(e00Var.b);
    }

    public tv80 p(String str, String str2) {
        i8h1 i8h1Var = (i8h1) this.b;
        url0 url0Var = (url0) this.d;
        url0Var.getClass();
        x6h1 x6h1VarC = url0Var.a.c();
        x6h1VarC.i.add(new a7h1("push_message_quick_action", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        mmr0 mmr0Var = new mmr0("playlist", "");
        if (str2 == null) {
            str2 = "";
        }
        return i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("item_to_be_added", str2)})), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void q(String str, String str2) {
        i8h1 i8h1Var = (i8h1) this.b;
        url0 url0Var = (url0) this.d;
        url0Var.getClass();
        x6h1 x6h1VarC = url0Var.a.c();
        x6h1VarC.i.add(new a7h1("push_message_quick_action", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str2 == null) {
            str2 = "";
        }
        i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 r(String str, String str2, boolean z) {
        rrl0 rrl0Var = (rrl0) this.c;
        i8h1 i8h1Var = (i8h1) this.b;
        b7x b7xVar = b7x.a;
        if (z) {
            url0 url0Var = (url0) this.d;
            url0Var.getClass();
            x6h1 x6h1VarC = url0Var.a.c();
            x6h1VarC.i.add(new a7h1("push_message_quick_action", str, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        Set set = s4b1.f;
        if (uic.x(str2).c == blc0.o6) {
            rrl0Var.getClass();
            x6h1 x6h1VarC2 = rrl0Var.a.c();
            x6h1VarC2.i.add(new a7h1("push_notification", str, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        rrl0Var.getClass();
        x6h1 x6h1VarC3 = rrl0Var.a.c();
        x6h1VarC3.i.add(new a7h1("push_notification", str, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 s(String str, String str2) {
        i8h1 i8h1Var = (i8h1) this.b;
        rrl0 rrl0Var = (rrl0) this.c;
        rrl0Var.getClass();
        x6h1 x6h1VarC = rrl0Var.a.c();
        x6h1VarC.i.add(new a7h1("push_notification", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str2 == null) {
            str2 = "";
        }
        return i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void t(String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        rrl0 rrl0Var = (rrl0) this.c;
        rrl0Var.getClass();
        x6h1 x6h1VarC = rrl0Var.a.c();
        x6h1VarC.i.add(new a7h1("push_notification", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("send_email_verification", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void u() {
        ((edn0) this.b).a(9);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    public void v(int i) {
        tr80 tr80VarQ;
        tr80 tr80Var = (tr80) this.d;
        int i2 = ((rr80) tr80Var).a;
        if (i > ((rr80) tr80Var).b || i2 > i) {
            uqz0 uqz0Var = (uqz0) this.b;
            int i3 = uqz0Var.d;
            tqz0 tqz0Var = uqz0Var.g;
            short s = tqz0Var.a;
            tr80 tr80Var2 = uqz0Var.h;
            int i4 = ((rr80) tr80Var2).a;
            if (i > ((rr80) tr80Var2).b || i4 > i) {
                tr80VarQ = null;
            } else {
                int size = i - uqz0Var.e.size();
                tr80 tr80Var3 = uqz0Var.c;
                int i5 = ((rr80) tr80Var3).a;
                int i6 = ((rr80) tr80Var3).b;
                if (size > i6 || i5 > size) {
                    int i7 = s / 2;
                    int i8 = size - i7;
                    if (i8 < 0) {
                        tr80VarQ = yoi1.Q(0, s);
                    } else {
                        int i9 = size + i7;
                        tr80VarQ = i9 >= i3 ? yoi1.Q(i3 - s, i3) : yoi1.Q(i8, i9);
                    }
                } else {
                    tr80 tr80Var4 = uqz0Var.i;
                    int i10 = ((rr80) tr80Var4).a;
                    if (size > ((rr80) tr80Var4).b || i10 > size) {
                        int iAbs = Math.abs(size - i6);
                        int iAbs2 = Math.abs(size - i5);
                        int i11 = tqz0Var.c;
                        if (iAbs < iAbs2) {
                            int iMax = Math.max((i6 - i11) + 1, 0);
                            tr80VarQ = new tr80(iMax, Math.min((s + iMax) - 1, i3 - 1), 1);
                        } else {
                            int iMin = Math.min((i5 + i11) - 1, i3 - 1);
                            tr80VarQ = new tr80(Math.max((iMin - s) + 1, 0), iMin, 1);
                        }
                    } else {
                        tr80VarQ = null;
                    }
                }
            }
            if (tr80VarQ == null || tr80VarQ.equals((tr80) this.d)) {
                return;
            }
            ((bkl) this.c).accept(tr80VarQ);
            this.d = tr80VarQ;
        }
    }

    public void w(j06 j06Var, h72 h72Var) {
        Exception exc;
        Exception exc2;
        int i;
        edn0 edn0Var = (edn0) this.b;
        int i2 = edn0Var.b;
        wdn0 wdn0Var = (wdn0) this.c;
        wdn0 wdn0Var2 = new wdn0();
        j06Var.getClass();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                try {
                    switch (edn0Var.c(i3)) {
                        case 0:
                            j06Var.l();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            j06Var.h(wdn0Var.g(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            j06Var.c(edn0Var.c(i5), edn0Var.c(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    j06Var.b(edn0Var.c(i5), edn0Var.c(i8), edn0Var.c(i9));
                                } catch (Exception e) {
                                    exc = e;
                                    i3 = i9;
                                    throw new ewj(wdn0Var, wdn0Var2, edn0Var, i3 - 1, exc);
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i8;
                            }
                            break;
                        case 4:
                            j06Var.clear();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            j06Var.g(edn0Var.c(i5), wdn0Var.g(i4));
                            i4 = i;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                j06Var.e(edn0Var.c(i5), wdn0Var.g(i4));
                                i4 = i;
                            } catch (Exception e3) {
                                exc2 = e3;
                                exc = exc2;
                                throw new ewj(wdn0Var, wdn0Var2, edn0Var, i3 - 1, exc);
                            }
                            break;
                        case 7:
                            int i10 = i4 + 1;
                            Object objG = wdn0Var.g(i4);
                            w0h1.o(2, objG);
                            i4 += 2;
                            j06Var.d(wdn0Var.g(i10), (vu30) objG);
                            i3 = i5;
                            break;
                        case 8:
                            Object objA = j06Var.a();
                            if (objA instanceof wvj) {
                                wvj wvjVar = (wvj) objA;
                                if (((bfn0) h72Var.g).k(wvjVar)) {
                                    wvjVar.b();
                                }
                            }
                            wdn0Var2.b(objA);
                            j06Var.i();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Throwable th) {
                    j06Var.f();
                    throw th;
                }
            } catch (Exception e4) {
                exc2 = e4;
                i3 = i5;
                exc = exc2;
                throw new ewj(wdn0Var, wdn0Var2, edn0Var, i3 - 1, exc);
            }
        }
        if (i4 != wdn0Var.b) {
            g0k.a("Applier operation size mismatch");
        }
        wdn0Var.e();
        edn0Var.b = 0;
        j06Var.f();
    }

    public EventSource x(yy01 yy01Var) {
        ObservableSource observableSourceFlatMap = ((yau0) this.b).a.flatMap(as10.Y0);
        n980 n980Var = (n980) ((jl00) this.d).b;
        ObservableSource observable = n980Var.a.flatMap(new hl00((Object) n980Var, (byte) 15)).map(c710.g).onErrorReturnItem(new c011(false)).toObservable();
        ytp0 ytp0Var = (ytp0) this.c;
        return RxEventSources.a(new ObservableSource[]{observableSourceFlatMap, observable, ytp0Var.l().distinctUntilChanged().map(bjx0.e), ytp0Var.l().switchMap(new rpv0(ytp0Var, (byte) 14))});
    }

    public void y(String str) {
        Logger.d(str, new Object[0]);
        t2j0 t2j0Var = (t2j0) this.c;
        wr01 wr01VarN = RecentsDecorationErrorEvent.n();
        wr01VarN.q(str);
        wr01VarN.r("reactions_decorator");
        wr01VarN.n("data_fetch_error");
        t2j0Var.a(wr01VarN.build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(String str, onm onmVar) {
        zcy0 zcy0Var;
        if (onmVar instanceof zcy0) {
            zcy0Var = (zcy0) onmVar;
            int i = zcy0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zcy0Var.c = i - Integer.MIN_VALUE;
            } else {
                zcy0Var = new zcy0(this, onmVar);
            }
        } else {
            zcy0Var = new zcy0(this, onmVar);
        }
        Object objA = zcy0Var.a;
        int i2 = zcy0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            iyc0 iyc0Var = (iyc0) this.c;
            ayc0 ayc0Var = new ayc0("clear", null, null, false, null, 30);
            zcy0Var.c = 1;
            objA = iyc0.a(iyc0Var, str, ayc0Var, zcy0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        ((py21) objA).d();
        return rih1.a;
    }

    public void G() {
    }

    public l0x0(RecyclerView recyclerView, tak1 tak1Var) {
        this.a = (byte) 29;
        this.b = recyclerView;
        this.c = tak1Var;
        this.d = tr80.d;
    }

    public l0x0(Resources resources, kt91 kt91Var) {
        this.a = (byte) 16;
        this.b = kt91Var;
        this.c = resources;
        this.d = new PublishSubject();
    }

    public l0x0(ProgressBar progressBar) {
        this.a = (byte) 5;
        this.c = Choreographer.getInstance();
        this.b = progressBar;
    }

    public l0x0(uqz0 uqz0Var, bkl bklVar) {
        this.a = (byte) 21;
        this.b = uqz0Var;
        this.c = bklVar;
        this.d = tr80.d;
    }

    public /* synthetic */ l0x0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public l0x0(pix0 pix0Var, roc0 roc0Var, n6r0 n6r0Var) {
        this.a = (byte) 6;
        this.c = gio1.b(new whx0(b7x.a));
        this.d = pix0.a(pix0Var, rqt0.u(new j5b0(new any(roc0Var.c(), (byte) 18), (byte) 18)), n6r0Var);
    }

    public l0x0(lzn0 lzn0Var, a1r0 a1r0Var, gw70 gw70Var) {
        this.a = (byte) 27;
        this.d = lzn0Var;
        this.b = a1r0Var;
        this.c = gw70Var;
    }

    public l0x0(Object obj) {
        this.a = (byte) 28;
        this.b = new edn0();
        this.c = new wdn0();
        this.d = obj;
    }
}
