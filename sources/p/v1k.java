package p;

import android.app.Activity;
import android.os.Looper;
import com.google.protobuf.Duration;
import com.spotify.agentstories.v1.GetStoriesRequest;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.microsoftcontinuity.events.proto.MicrosoftContinuityConnected;
import com.spotify.microsoftcontinuity.events.proto.MicrosoftContinuityError;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.usersnearby.events.proto.UsersNearbySessionCreationResult;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v1k implements Function {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    public v1k(d0r d0rVar, mr20 mr20Var) {
        this.a = (byte) 24;
        this.b = d0rVar;
        this.c = mr20Var;
        jd11 jd11Var = rc11.a;
        this.d = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 2, atm.Y, new j4r(atm.t), atm.Z), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, atm.N0, new j4r(atm.X), atm.O0), u2m.V0);
    }

    public static void k(v1k v1kVar, String str, tv80 tv80Var) {
        huj.b((lzn0) v1kVar.d, (Activity) v1kVar.b, (ryf) v1kVar.c, oxf.b, str, tv80Var);
    }

    public void A() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((dsk0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("choose_device", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void B() {
        fn31.T((llm) this.b, (o8n) null, 0, new zti((bpb1) this.c, (vzj) this.d, (lnm) null, (byte) 23), 3);
    }

    public void C(String str, y3o0 y3o0Var) {
        l4p1.u(cto1.q((iac0) this.d), new fu20(new ht20(new x010(new dkm((mr20) ((toj0) this.b).g, (byte) 1), (mr20) ((asn) this.c).c, new wwl(3, null, (byte) 1), (byte) 1), new cuk(this, str, null, (byte) 25)), new z2l(y3o0Var, str, null, (byte) 1), (byte) 1));
    }

    public void D(ixh0 ixh0Var) {
        J();
        q8l q8lVar = (q8l) ((y36) this.c).remove(ixh0Var);
        if (q8lVar == null) {
            return;
        }
        ((y36) this.b).remove(q8lVar.a);
        q8lVar.b.e();
        fzh0 fzh0Var = (fzh0) ((WeakReference) this.d).get();
        if (fzh0Var == null || fzh0Var.p()) {
            return;
        }
        zoi1.c0(fzh0Var.l, new o8l(fzh0Var, ixh0Var, (byte) 0));
    }

    public void E() {
        dma1 dma1Var = (dma1) this.c;
        bma1 bma1Var = wnm.a;
        long jG = dma1Var.g(bma1Var, 0L);
        yqg yqgVar = (yqg) this.d;
        if (yqgVar.b() - jG > 1209600000) {
            t2j0 t2j0Var = (t2j0) this.b;
            krj0 krj0VarN = MicrosoftContinuityConnected.n();
            krj0VarN.n();
            t2j0Var.a(krj0VarN.build());
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.c(bma1Var, yqgVar.b());
            hma1VarEdit.h();
        }
    }

    public void F(String str, Throwable th) {
        mrj0 mrj0VarN = MicrosoftContinuityError.n();
        mrj0VarN.q(str);
        mrj0VarN.n(String.valueOf(th.getMessage()));
        ((t2j0) this.b).a(mrj0VarN.build());
    }

    public Integer G(jh5 jh5Var) {
        Object next;
        Object next2;
        int iIntValue;
        int iIntValue2;
        HashMap map = (HashMap) this.b;
        zjd1 zjd1Var = jh5Var.a;
        Integer num = (Integer) map.get(zjd1Var);
        int iIntValue3 = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue3 != 0) {
            Iterator it = ((ArrayList) this.c).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((tka0) ((mmr0) next).a).m(zjd1Var));
            mmr0 mmr0Var = (mmr0) next;
            if (mmr0Var != null && (iIntValue2 = ((Number) mmr0Var.b).intValue()) < iIntValue3) {
                iIntValue3 = iIntValue2;
            }
            if (iIntValue3 != 0) {
                Iterator it2 = ((ArrayList) this.d).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    mmr0 mmr0Var2 = (mmr0) next2;
                    dmh1 dmh1Var = (dmh1) mmr0Var2.a;
                    if (((Number) mmr0Var2.b).intValue() < iIntValue3 && ob51.f(dmh1Var, jh5Var)) {
                        break;
                    }
                }
                mmr0 mmr0Var3 = (mmr0) next2;
                if (mmr0Var3 != null && (iIntValue = ((Number) mmr0Var3.b).intValue()) < iIntValue3) {
                    iIntValue3 = iIntValue;
                }
                if (iIntValue3 == Integer.MAX_VALUE) {
                    return null;
                }
                return Integer.valueOf(iIntValue3);
            }
        }
        return 0;
    }

    public void H(ixh0 ixh0Var, qa61 qa61Var, m8u0 m8u0Var) {
        J();
        q8l q8lVar = (q8l) ((y36) this.c).get(ixh0Var);
        if (q8lVar != null) {
            q8lVar.d = qa61Var;
            if (q8lVar.f != null) {
                q8lVar.f = m8u0Var;
            } else {
                q8lVar.e = m8u0Var;
            }
        }
    }

    public Object I(s731 s731Var, onm onmVar) {
        zhx0 zhx0Var;
        a931 a931Var = (a931) this.c;
        yhx0 yhx0VarN = ProgressPlaybackEsperanto.OnUpdateRequest.n();
        yhx0VarN.r(((n6r0) this.d).path());
        yhx0VarN.w("episode_card");
        yhx0VarN.q(s731Var.a);
        xuh1 xuh1Var = s731Var.d;
        vuh1 vuh1Var = vuh1.e;
        yhx0VarN.s(u890.j(xuh1Var, vuh1Var));
        ifv ifvVarQ = Duration.q();
        ifvVarQ.q(s731Var.c / 1000);
        yhx0VarN.t(ifvVarQ.build());
        ifv ifvVarQ2 = Duration.q();
        ifvVarQ2.q(s731Var.b / 1000);
        yhx0VarN.n(ifvVarQ2.build());
        if (u890.j(xuh1Var, vuh1.h)) {
            zhx0Var = zhx0.REASON_ACTIVATION_UNMUTE;
        } else if (u890.j(xuh1Var, vuh1.d)) {
            zhx0Var = zhx0.REASON_PLAYBACK_PERIODIC;
        } else if (u890.j(xuh1Var, vuh1Var)) {
            zhx0Var = zhx0.REASON_PLAYBACK_ENDED;
        } else if (u890.j(xuh1Var, vuh1.a)) {
            zhx0Var = zhx0.REASON_ACTIVATION_ADDED_TO_LIBRARY;
        } else if (u890.j(xuh1Var, vuh1.c)) {
            zhx0Var = zhx0.REASON_ACTIVATION_DOWNLOADED;
        } else if (u890.j(xuh1Var, vuh1.g)) {
            zhx0Var = zhx0.REASON_ACTIVATION_TIME_THRESHOLD_EXCEEDED;
        } else if (u890.j(xuh1Var, vuh1.f)) {
            zhx0Var = zhx0.REASON_ACTIVATION_SHARED;
        } else {
            zhx0Var = u890.j(xuh1Var, wuh1.a) ? zhx0.REASON_ACTIVATION_SEEK : zhx0.REASON_ACTIVATION_GENERIC;
        }
        yhx0VarN.v(zhx0Var);
        Object objA = a931Var.a(yhx0VarN.build(), onmVar);
        return objA == d9n.a ? objA : rih1.a;
    }

    public void J() {
        fzh0 fzh0Var = (fzh0) ((WeakReference) this.d).get();
        if (fzh0Var != null) {
            dm5.y(Looper.myLooper() == fzh0Var.l.getLooper());
        }
    }

    public synchronized mmr0 a() {
        svz0 svz0VarM;
        boolean zIsEmpty;
        Set set;
        sc50 sc50Var;
        svz0 svz0VarC = ((cj4) ((ne) this.b).d).c();
        svz0 svz0Var = svz0.d;
        svz0 svz0Var2 = svz0.d;
        Map map = svz0VarC.b;
        Map map2 = svz0Var2.b;
        if (map2.isEmpty() && map2.isEmpty()) {
            svz0VarM = svz0VarC;
        } else {
            svz0VarM = ulc.m(sc50.a(svz0VarC.a, o7h.l1(sqg0.O(sqg0.O(map, map2), map2).values()), 27));
        }
        this.c = svz0VarM;
        ((AtomicBoolean) this.d).set(true);
        zIsEmpty = ((Set) svz0VarC.c.getValue()).isEmpty();
        set = (Set) svz0VarC.c.getValue();
        sc50Var = svz0VarC.a;
        return new mmr0(svz0VarM, new tvz0(zIsEmpty, set, sc50Var.b, sc50Var.a));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    public Object apply(Object obj) {
        Boolean bool;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 10:
                Object obj3 = ((e331) obj).a;
                hu3 hu3Var = ((nzl) obj2).d;
                azl azlVar = (azl) this.c;
                xl81 xl81Var = azlVar.a;
                List list = (List) this.d;
                if (e331.a(obj3) != null) {
                    hu3Var.b(xl81Var.getUri(), ysq0.b);
                    return z6x.a;
                }
                hu3Var.b(xl81Var.getUri(), ysq0.c);
                ArrayList arrayListN0 = o7h.N0((List) obj3, list);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : arrayListN0) {
                    if (!azlVar.d.contains(((xl81) obj4).getUri())) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return rqt0.F(o6x.a, new ml1((sgm) obj2, (wgm) this.c, (kjm) obj, (iu30) this.d, (lnm) null)).toObservable();
            default:
                mmr0 mmr0Var = (mmr0) obj;
                String str = (String) this.c;
                inm inmVar = (inm) obj2;
                idu0 idu0Var = (idu0) mmr0Var.a;
                Boolean bool2 = null;
                if (((Boolean) mmr0Var.b).booleanValue()) {
                    y6b1 y6b1VarU = tto1.u(idu0Var.a);
                    boolean z = idu0Var.b;
                    fnm fnmVar = inmVar.d;
                    y6b1 y6b1VarU2 = tto1.u(str);
                    if (y6b1VarU2 != null && !tto1.i(fnmVar.b, y6b1VarU2)) {
                        tto1.i(fnmVar.c, y6b1VarU2);
                    }
                    if (y6b1VarU != null && y6b1VarU.j((y6b1) this.d) && !z) {
                        fnmVar.a(str, idu0Var.c);
                    }
                    y6b1 y6b1VarU3 = tto1.u(str);
                    if (y6b1VarU3 == null) {
                        bool = null;
                    } else if (tto1.i(fnmVar.b, y6b1VarU3)) {
                        bool = Boolean.TRUE;
                    } else if (tto1.i(fnmVar.c, y6b1VarU3)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        bool2 = bool;
                    }
                }
                return Observable.just(new gnm(bool2));
        }
    }

    public void b(Object obj, ixh0 ixh0Var, qa61 qa61Var, m8u0 m8u0Var) {
        y36 y36Var = (y36) this.c;
        J();
        ixh0 ixh0VarO = o(obj);
        if (ixh0VarO != null) {
            q8l q8lVar = (q8l) y36Var.get(ixh0VarO);
            q8lVar.getClass();
            q8lVar.d = qa61Var;
            q8lVar.e = m8u0Var;
            return;
        }
        ((y36) this.b).put(obj, ixh0Var);
        sqe1 sqe1VarI1 = sqe1.a;
        o3g1 o3g1VarU = o3g1.b;
        fzh0 fzh0Var = (fzh0) ((WeakReference) this.d).get();
        if (fzh0Var != null) {
            fzh0Var.C();
            ffu0 ffu0Var = fzh0Var.t;
            sqe1VarI1 = ffu0Var.i1();
            if (ffu0Var.Y(30)) {
                o3g1VarU = ffu0Var.U();
            }
        }
        y36Var.put(ixh0Var, new q8l(obj, new xen0(), qa61Var, m8u0Var, sqe1VarI1, o3g1VarU));
    }

    public void c(ixh0 ixh0Var, int i, p8l p8lVar) {
        J();
        q8l q8lVar = (q8l) ((y36) this.c).get(ixh0Var);
        if (q8lVar != null) {
            m8u0 m8u0Var = q8lVar.h;
            m8u0Var.getClass();
            l8u0 l8u0Var = new l8u0(m8u0Var);
            l8u0Var.a.c(i);
            q8lVar.h = l8u0Var.d();
            q8lVar.c.add(p8lVar);
        }
    }

    public synchronized void d() {
        ((cj4) ((l7m0) ((ne) this.b).c).b).a();
    }

    public ug3 e(qzh qzhVar) {
        return new ug3((Flowable) this.b, (d0r) this.c, (xrn0) this.d, qzhVar);
    }

    public dfm f(Flowable flowable, iu30 iu30Var, qzh qzhVar) {
        return new dfm((Flowable) this.b, flowable, (ugm) this.c, iu30Var, (Scheduler) this.d, qzhVar);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x018d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0199  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    public Serializable g(List list, onm onmVar) {
        lnm nwmVar;
        mmr0 mmr0Var;
        List list2;
        Map map;
        Map map2;
        ArrayList arrayList;
        w4i1 w4i1Var;
        w4i1 w4i1Var2;
        jwm jwmVarA;
        String str;
        w4i1 w4i1Var3;
        w4i1 w4i1Var4;
        List list3 = list;
        add addVar = (add) this.d;
        if (onmVar instanceof nwm) {
            nwmVar = (nwm) onmVar;
            int i = nwmVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nwmVar.f = i - Integer.MIN_VALUE;
            } else {
                nwmVar = new nwm(this, onmVar);
            }
        } else {
            nwmVar = new nwm(this, onmVar);
        }
        Object objA = nwmVar.d;
        int i2 = nwmVar.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            if (addVar.a()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list3) {
                    if (sqe.v(((jwm) obj).a)) {
                        arrayList2.add(obj);
                    } else {
                        arrayList3.add(obj);
                    }
                }
                mmr0Var = new mmr0(arrayList2, arrayList3);
            } else {
                mmr0Var = new mmr0(z6x.a, list3);
            }
            list2 = (List) mmr0Var.a;
            List<jwm> list4 = (List) mmr0Var.b;
            ArrayList<mmr0> arrayList4 = new ArrayList(q7h.U(list4, 10));
            for (jwm jwmVar : list4) {
                String str2 = jwmVar.a.a;
                w4i1 w4i1Var5 = jwmVar.d;
                arrayList4.add(new mmr0(str2, w4i1Var5 != null ? w4i1Var5.a : null));
            }
            ArrayList arrayList5 = new ArrayList();
            for (mmr0 mmr0Var2 : arrayList4) {
                r7h.W(f46.i0(new String[]{mmr0Var2.a, mmr0Var2.b}), arrayList5);
            }
            List listJ0 = o7h.j0(arrayList5);
            cex0 cex0Var = (cex0) ((b2p) this.b).get();
            nwmVar.a = list3;
            nwmVar.b = list2;
            nwmVar.f = 1;
            objA = cex0Var.a(listJ0, nwmVar);
            if (objA != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            List list5 = nwmVar.b;
            List list6 = nwmVar.a;
            hm5.M(objA);
            list2 = list5;
            list3 = list6;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map2 = nwmVar.c;
            List list7 = nwmVar.b;
            list3 = nwmVar.a;
            hm5.M(objA);
        }
        map = (Map) objA;
        List<jwm> list8 = list3;
        arrayList = new ArrayList(q7h.U(list8, 10));
        for (jwm jwmVar2 : list8) {
            if (addVar.a()) {
                w4i1Var3 = jwmVar2.a;
                if (sqe.v(w4i1Var3)) {
                    w4i1Var4 = (w4i1) map.get(w4i1Var3.a);
                    if (w4i1Var4 != null) {
                        w4i1Var3 = w4i1Var4;
                    }
                    jwmVarA = jwm.a(jwmVar2, w4i1Var3, (w4i1) null, 14);
                } else {
                    w4i1 w4i1Var6 = jwmVar2.a;
                    w4i1Var = jwmVar2.d;
                    w4i1Var2 = (w4i1) map2.get(w4i1Var6.a);
                    if (w4i1Var2 == null) {
                        n57.s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                        w4i1Var2 = jwmVar2.a;
                    }
                    if (w4i1Var != null || (str = w4i1Var.a) == null) {
                        w4i1Var = null;
                    } else {
                        w4i1 w4i1Var7 = (w4i1) map2.get(str);
                        if (w4i1Var7 == null) {
                            n57.s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                        } else {
                            w4i1Var = w4i1Var7;
                        }
                    }
                    jwmVarA = jwm.a(jwmVar2, w4i1Var2, w4i1Var, 6);
                }
            } else {
                w4i1 w4i1Var8 = jwmVar2.a;
                w4i1Var = jwmVar2.d;
                w4i1Var2 = (w4i1) map2.get(w4i1Var8.a);
                if (w4i1Var2 == null) {
                    n57.s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                    w4i1Var2 = jwmVar2.a;
                }
                if (w4i1Var != null) {
                    w4i1Var = null;
                } else {
                    w4i1Var = null;
                }
                jwmVarA = jwm.a(jwmVar2, w4i1Var2, w4i1Var, 6);
            }
            arrayList.add(jwmVarA);
        }
        return arrayList;
        Map map3 = (Map) objA;
        if (!list2.isEmpty()) {
            mu2 mu2Var = (mu2) ((b2p) this.c).get();
            List list9 = list2;
            ArrayList arrayList6 = new ArrayList(q7h.U(list9, 10));
            Iterator it = list9.iterator();
            while (it.hasNext()) {
                arrayList6.add(((jwm) it.next()).a.a);
            }
            nwmVar.a = list3;
            nwmVar.b = null;
            nwmVar.c = map3;
            nwmVar.f = 2;
            Object objA2 = mu2Var.a(arrayList6, nwmVar);
            if (objA2 != d9nVar) {
                objA = objA2;
                map2 = map3;
                map = (Map) objA;
            }
            return d9nVar;
        }
        map = b7x.a;
        map2 = map3;
        List<jwm> list10 = list3;
        arrayList = new ArrayList(q7h.U(list10, 10));
        while (r1.hasNext()) {
            if (addVar.a()) {
                w4i1Var3 = jwmVar2.a;
                if (sqe.v(w4i1Var3)) {
                    w4i1Var4 = (w4i1) map.get(w4i1Var3.a);
                    if (w4i1Var4 != null) {
                        w4i1Var3 = w4i1Var4;
                    }
                    jwmVarA = jwm.a(jwmVar2, w4i1Var3, (w4i1) null, 14);
                } else {
                    w4i1 w4i1Var9 = jwmVar2.a;
                    w4i1Var = jwmVar2.d;
                    w4i1Var2 = (w4i1) map2.get(w4i1Var9.a);
                    if (w4i1Var2 == null) {
                        n57.s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                        w4i1Var2 = jwmVar2.a;
                    }
                    if (w4i1Var != null) {
                        w4i1Var = null;
                    } else {
                        w4i1Var = null;
                    }
                    jwmVarA = jwm.a(jwmVar2, w4i1Var2, w4i1Var, 6);
                }
            } else {
                w4i1 w4i1Var10 = jwmVar2.a;
                w4i1Var = jwmVar2.d;
                w4i1Var2 = (w4i1) map2.get(w4i1Var10.a);
                if (w4i1Var2 == null) {
                    n57.s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                    w4i1Var2 = jwmVar2.a;
                }
                if (w4i1Var != null) {
                    w4i1Var = null;
                } else {
                    w4i1Var = null;
                }
                jwmVarA = jwm.a(jwmVar2, w4i1Var2, w4i1Var, 6);
            }
            arrayList.add(jwmVarA);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x013f  */
    /* JADX WARN: Code duplicated, block: B:57:0x015c A[PHI: r3
      0x015c: PHI (r3v6 p.w4i1) = (r3v4 p.w4i1), (r3v10 p.w4i1) binds: [B:59:0x0166, B:55:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0168  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable h(ArrayList arrayList, onm onmVar) {
        lnm owmVar;
        mmr0 mmr0Var;
        List list;
        List list2;
        Map map;
        Map map2;
        List list3;
        ArrayList arrayList2;
        w4i1 w4i1Var;
        add addVar = (add) this.d;
        if (onmVar instanceof owm) {
            owmVar = (owm) onmVar;
            int i = owmVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                owmVar.f = i - Integer.MIN_VALUE;
            } else {
                owmVar = new owm(this, onmVar);
            }
        } else {
            owmVar = new owm(this, onmVar);
        }
        Object obj = owmVar.d;
        int i2 = owmVar.f;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                list2 = owmVar.b;
                list = owmVar.a;
                hm5.M(obj);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map2 = owmVar.c;
                List list4 = owmVar.b;
                list3 = owmVar.a;
                hm5.M(obj);
            }
            map = (Map) obj;
            list = list3;
            List<w4i1> list5 = list;
            arrayList2 = new ArrayList(q7h.U(list5, 10));
            for (w4i1 w4i1Var2 : list5) {
                if (addVar.a() || !sqe.v(w4i1Var2)) {
                    w4i1Var = (w4i1) map2.get(w4i1Var2.a);
                    if (w4i1Var == null) {
                        n57.s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                    } else {
                        w4i1Var2 = w4i1Var;
                    }
                } else {
                    w4i1Var = (w4i1) map.get(w4i1Var2.a);
                    if (w4i1Var != null) {
                        w4i1Var2 = w4i1Var;
                    }
                }
                arrayList2.add(w4i1Var2);
            }
            return arrayList2;
        }
        hm5.M(obj);
        if (addVar.a()) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (sqe.v((w4i1) obj2)) {
                    arrayList3.add(obj2);
                } else {
                    arrayList4.add(obj2);
                }
            }
            mmr0Var = new mmr0(arrayList3, arrayList4);
        } else {
            mmr0Var = new mmr0(z6x.a, arrayList);
        }
        List list6 = (List) mmr0Var.a;
        List list7 = (List) mmr0Var.b;
        cex0 cex0Var = (cex0) ((b2p) this.b).get();
        List list8 = list7;
        ArrayList arrayList5 = new ArrayList(q7h.U(list8, 10));
        Iterator it = list8.iterator();
        while (it.hasNext()) {
            arrayList5.add(((w4i1) it.next()).a);
        }
        owmVar.a = arrayList;
        owmVar.b = list6;
        owmVar.f = 1;
        Object objA = cex0Var.a(arrayList5, owmVar);
        if (objA != d9nVar) {
            list = arrayList;
            list2 = list6;
            obj = objA;
        }
        return d9nVar;
        Map map3 = (Map) obj;
        if (!list2.isEmpty()) {
            mu2 mu2Var = (mu2) ((b2p) this.c).get();
            List list9 = list2;
            ArrayList arrayList6 = new ArrayList(q7h.U(list9, 10));
            Iterator it2 = list9.iterator();
            while (it2.hasNext()) {
                arrayList6.add(((w4i1) it2.next()).a);
            }
            owmVar.a = list;
            owmVar.b = null;
            owmVar.c = map3;
            owmVar.f = 2;
            Object objA2 = mu2Var.a(arrayList6, owmVar);
            if (objA2 != d9nVar) {
                obj = objA2;
                map2 = map3;
                list3 = list;
                map = (Map) obj;
                list = list3;
            }
            return d9nVar;
        }
        map = b7x.a;
        map2 = map3;
        List<w4i1> list10 = list;
        arrayList2 = new ArrayList(q7h.U(list10, 10));
        while (r1.hasNext()) {
            if (addVar.a()) {
                w4i1Var = (w4i1) map2.get(w4i1Var2.a);
                if (w4i1Var == null) {
                    n57.s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                } else {
                    w4i1Var2 = w4i1Var;
                }
            } else {
                w4i1Var = (w4i1) map2.get(w4i1Var2.a);
                if (w4i1Var == null) {
                    n57.s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                } else {
                    w4i1Var2 = w4i1Var;
                }
            }
            arrayList2.add(w4i1Var2);
        }
        return arrayList2;
    }

    public void i(q8l q8lVar) {
        n8d0 n8d0Var;
        fzh0 fzh0Var = (fzh0) ((WeakReference) this.d).get();
        if (fzh0Var == null) {
            return;
        }
        J();
        do {
            p8l p8lVar = (p8l) q8lVar.c.poll();
            if (p8lVar == null) {
                q8lVar.g = false;
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            fzh0Var.x = o(q8lVar.a);
            atomicReference.set(p8lVar.run());
            fzh0Var.x = null;
            n8d0Var = (n8d0) atomicReference.get();
        } while (n8d0Var.isDone());
        n8d0Var.b(new c45(this, fzh0Var, q8lVar, (byte) 6), l5u.a);
    }

    public void j(final ixh0 ixh0Var) {
        J();
        q8l q8lVar = (q8l) ((y36) this.c).get(ixh0Var);
        if (q8lVar == null) {
            return;
        }
        final m8u0 m8u0Var = q8lVar.h;
        q8lVar.h = m8u0.b;
        q8lVar.c.add(new p8l() { // from class: p.n8l
            @Override // p.p8l
            public final n8d0 run() {
                fzh0 fzh0Var = (fzh0) ((WeakReference) this.a.d).get();
                if (fzh0Var != null) {
                    fzh0Var.v(ixh0Var, m8u0Var);
                }
                return f280.b;
            }
        });
        if (q8lVar.g) {
            return;
        }
        q8lVar.g = true;
        i(q8lVar);
    }

    public synchronized svz0 l(String str) {
        svz0 svz0VarC;
        try {
            if (!((AtomicBoolean) this.d).get()) {
                utw0 utw0Var = ike1.a;
                utw0Var.y("RCS");
                utw0Var.v(str + " is accessing remote config before activated state.\n check here for more information http://go/rc-and-access-before-activation", new Object[0]);
            }
            svz0VarC = (svz0) this.c;
            if (svz0VarC == null) {
                svz0VarC = ((cj4) ((ne) this.b).d).c();
                svz0 svz0Var = svz0.d;
                svz0 svz0Var2 = svz0.d;
                Map map = svz0VarC.b;
                Map map2 = svz0Var2.b;
                if (!map2.isEmpty() || !map2.isEmpty()) {
                    svz0VarC = ulc.m(sc50.a(svz0VarC.a, o7h.l1(sqg0.O(sqg0.O(map, map2), map2).values()), 27));
                }
                this.c = svz0VarC;
            }
        } catch (Throwable th) {
            throw th;
        }
        return svz0VarC;
    }

    public b380 m() {
        J();
        return b380.p(((y36) this.b).values());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object n(Set set, onm onmVar) {
        amm ammVar;
        Set set2;
        if (onmVar instanceof amm) {
            ammVar = (amm) onmVar;
            int i = ammVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ammVar.d = i - Integer.MIN_VALUE;
            } else {
                ammVar = new amm(this, onmVar);
            }
        } else {
            ammVar = new amm(this, onmVar);
        }
        Object objM = ammVar.b;
        int i2 = ammVar.d;
        if (i2 == 0) {
            hm5.M(objM);
            awe aweVar = new awe(this, (lnm) null, (byte) 25);
            ammVar.a = set;
            ammVar.d = 1;
            objM = rc2.M(500L, aweVar, ammVar);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
            set2 = set;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set2 = ammVar.a;
            hm5.M(objM);
        }
        PlayerState playerState = (PlayerState) objM;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack == null || !(set2.contains(contextTrack.uri()) || set2.contains(l4o1.b0(contextTrack)))) {
            bhn0.A(set2, "No track matching the entityUris: ");
            return null;
        }
        ContextTrack contextTrack2 = (ContextTrack) playerState.track().b();
        spq0 spq0VarPosition = playerState.position(((yqg) this.c).b());
        contextTrack2.getClass();
        String strA0 = l4o1.a0(contextTrack2, "segment.position_as_of_timestamp");
        Long lValueOf = strA0 != null ? Long.valueOf(Long.parseLong(strA0)) : null;
        Long l = lValueOf != null ? new Long(lValueOf.longValue() - ((Number) playerState.positionAsOfTimestamp().e(new Long(0L))).longValue()) : null;
        String strL = l4o1.l(contextTrack2);
        String strF0 = l4o1.f0(contextTrack2);
        if (strF0 == null) {
            strF0 = "";
        }
        String strA1 = l4o1.a0(contextTrack2, "image_url");
        if (strA1 == null) {
            strA1 = "";
        }
        String strUri = contextTrack2.uri();
        Long l2 = l != null ? new Long(((Number) spq0VarPosition.e(new Long(0L))).longValue() + l.longValue()) : (Long) spq0VarPosition.b();
        l2.getClass();
        return new s2g1(strL, strF0, strA1, strUri, l2.longValue(), ((bhf0) this.d).a(contextTrack2), (String) playerState.playbackId().h());
    }

    public ixh0 o(Object obj) {
        J();
        return (ixh0) ((y36) this.b).get(obj);
    }

    public mr20 p(Set set) {
        if (set.isEmpty()) {
            return new huz(b7x.a, (byte) 10);
        }
        jn7 jn7Var = (jn7) this.b;
        p831 p831VarP = ResumptionProgressEsperanto.GetResumePointRequest.p();
        p831VarP.r(((n6r0) this.d).path());
        p831VarP.s("episode_card");
        p831VarP.n(set);
        return new i0h(new h5y0(jn7Var.callStream("spotify.resumption_progress_esperanto.proto.ResumptionProgress", "SubResumePoint", p831VarP.build()), (byte) 27), (byte) 7);
    }

    public xen0 q(ixh0 ixh0Var) {
        J();
        q8l q8lVar = (q8l) ((y36) this.c).get(ixh0Var);
        if (q8lVar != null) {
            return q8lVar.b;
        }
        return null;
    }

    public htl0 r() {
        r6h1 r6h1Var = r6h1.c;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new htl0(new ntl0(new qtl0(0, yon1.D4().c, (String) this.b, r6h1Var), (otl0) this.d), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object s(onm onmVar) {
        vqn vqnVar;
        String str;
        t2j0 t2j0Var = ((cof0) this.d).a;
        hni1 hni1Var = (hni1) this.c;
        if (onmVar instanceof vqn) {
            vqnVar = (vqn) onmVar;
            int i = vqnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vqnVar.d = i - Integer.MIN_VALUE;
            } else {
                vqnVar = new vqn(this, onmVar);
            }
        } else {
            vqnVar = new vqn(this, onmVar);
        }
        Object objI = vqnVar.b;
        int i2 = vqnVar.d;
        if (i2 == 0) {
            hm5.M(objI);
            if (hni1Var.a == 0) {
                throw null;
            }
            String str2 = hni1Var.b;
            xq81 xq81Var = (xq81) this.b;
            vqnVar.a = "wrapped-party";
            vqnVar.d = 1;
            objI = xq81Var.i("wrapped-party", str2, vqnVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
            str = "wrapped-party";
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = vqnVar.a;
            hm5.M(objI);
        }
        ern ernVar = (ern) objI;
        if (ernVar instanceof arn) {
            arn arnVar = (arn) ernVar;
            String str3 = arnVar.a;
            oni1 oni1VarN = UsersNearbySessionCreationResult.n();
            oni1VarN.r(str);
            oni1VarN.s(str3);
            t2j0Var.a(oni1VarN.build());
            return new rmi1(str3, arnVar.b, arnVar.c);
        }
        if (!(ernVar instanceof crn)) {
            eg.o();
            return null;
        }
        crn crnVar = (crn) ernVar;
        boolean z = crnVar instanceof drn;
        brn brnVar = brn.a;
        String str4 = "Unknown";
        if (z) {
            drn drnVar = (drn) crnVar;
            int i3 = drnVar.a;
            String str5 = drnVar.b;
            str4 = i3 + ":" + ((Object) (str5.length() != 0 ? str5 : "Unknown"));
        } else if (crnVar instanceof zqn) {
            String strR = rc11.a.b(((zqn) crnVar).a.getClass()).r();
            if (strR != null) {
                str4 = strR;
            }
        } else {
            if (!crnVar.equals(brnVar)) {
                eg.o();
                return null;
            }
            str4 = "EMPTY_SESSION_TOKEN";
        }
        String str6 = "client";
        if (z) {
            int i4 = ((drn) crnVar).a;
            if (500 <= i4 && i4 < 600) {
                str6 = "server";
            }
        } else if (!(crnVar instanceof zqn)) {
            if (!crnVar.equals(brnVar)) {
                eg.o();
                return null;
            }
            str6 = "server";
        }
        oni1 oni1VarN2 = UsersNearbySessionCreationResult.n();
        oni1VarN2.r(str);
        oni1VarN2.q(str4);
        oni1VarN2.n(str6);
        t2j0Var.a(oni1VarN2.build());
        return smi1.a;
    }

    public synchronized void t() {
        this.c = null;
    }

    public boolean u(ixh0 ixh0Var) {
        J();
        return ((y36) this.c).get(ixh0Var) != null;
    }

    public boolean v(ixh0 ixh0Var, int i) {
        J();
        q8l q8lVar = (q8l) ((y36) this.c).get(ixh0Var);
        fzh0 fzh0Var = (fzh0) ((WeakReference) this.d).get();
        if (q8lVar == null || !q8lVar.e.a(i) || fzh0Var == null) {
            return false;
        }
        fzh0Var.C();
        return fzh0Var.t.n0().a(i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b A[RETURN] */
    public boolean w(ixh0 ixh0Var, int i) {
        boolean z;
        J();
        q8l q8lVar = (q8l) ((y36) this.c).get(ixh0Var);
        if (q8lVar != null) {
            qa61 qa61Var = q8lVar.d;
            qa61Var.getClass();
            dm5.n(i != 0, "Use contains(Command) for custom command");
            Iterator it = qa61Var.a.iterator();
            while (it.hasNext()) {
                if (((pa61) it.next()).a == i) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean x(ixh0 ixh0Var, pa61 pa61Var) {
        J();
        q8l q8lVar = (q8l) ((y36) this.c).get(ixh0Var);
        if (q8lVar == null) {
            return false;
        }
        t380 t380Var = q8lVar.d.a;
        pa61Var.getClass();
        return t380Var.contains(pa61Var) || udh.l(pa61Var.b);
    }

    public jge y(String str, String str2, String str3, boolean z) {
        mqm mqmVar = new mqm(new jvm(str, str2, str3), new lqm(Collections.singletonList(ovm.a), Collections.singletonList(cvm.a), (qle1) null, 4));
        return hu20.e(d3p1.F((d0r) this.b, w3p1.o(new l4r(hvm.a, 1, atm.g, new j4r(new tsm(mqmVar, (byte) 1)), atm.h), atm.i), rih1.a), new np2((lnm) null, this, z));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(String str, onm onmVar) throws Exception {
        r6m r6mVar;
        Exception e;
        t45 t45Var;
        String str2;
        if (onmVar instanceof r6m) {
            r6mVar = (r6m) onmVar;
            int i = r6mVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r6mVar.d = i - Integer.MIN_VALUE;
            } else {
                r6mVar = new r6m(this, onmVar);
            }
        } else {
            r6mVar = new r6m(this, onmVar);
        }
        Object obj = r6mVar.b;
        d9n d9nVar = d9n.a;
        int i2 = r6mVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            t45 t45VarA = ((zle1) this.d).a("get_stories_request");
            t45VarA.h = "android-martini-dataloader-impl";
            t45VarA.b("entity_uri", str);
            t45.m(t45VarA, "get_stories_request", 4);
            try {
                mq40 mq40Var = (mq40) this.b;
                lq40 lq40VarN = GetStoriesRequest.n();
                lq40VarN.n(str);
                Single map = mq40Var.a((GetStoriesRequest) lq40VarN.build()).timeout(90000L, TimeUnit.MILLISECONDS).map(s321.T0);
                r6mVar.a = t45VarA;
                r6mVar.d = 1;
                Object objJ = fc11.j(map, r6mVar);
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                obj = objJ;
                t45Var = t45VarA;
            } catch (Exception e2) {
                e = e2;
                t45Var = t45VarA;
                if (e instanceof TimeoutException) {
                    str2 = "timeout";
                } else {
                    str2 = "unknown_error";
                }
                t45Var.g("get_stories_request");
                t45Var.a("load_outcome", str2);
                ((zle1) this.d).b(t45Var.e());
                throw e;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t45Var = r6mVar.a;
            try {
                hm5.M(obj);
            } catch (Exception e3) {
                e = e3;
                if (e instanceof TimeoutException) {
                    str2 = "timeout";
                } else {
                    str2 = "unknown_error";
                }
                t45Var.g("get_stories_request");
                t45Var.a("load_outcome", str2);
                ((zle1) this.d).b(t45Var.e());
                throw e;
            }
        }
        c380 c380Var = (c380) obj;
        t45Var.g("get_stories_request");
        t45Var.a("load_outcome", "success");
        ((zle1) this.d).b(t45Var.e());
        return c380Var;
    }

    public v1k(ne neVar) {
        this.a = (byte) 5;
        this.b = neVar;
        this.d = new AtomicBoolean(false);
    }

    public v1k(krj1 krj1Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = (byte) 27;
        this.b = krj1Var;
    }

    public v1k(i8h1 i8h1Var) {
        this.a = (byte) 6;
        this.b = i8h1Var;
        this.c = new dsk0((byte) 11);
        this.d = new dsk0((byte) 12);
    }

    public /* synthetic */ v1k(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public v1k(y48 y48Var) {
        this.a = (byte) 12;
        llm llmVarE = smo1.e(flo1.l(guo1.B(), igu.a));
        this.b = d5m.a;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.c = bpb1VarB;
        this.d = d5p1.h(bpb1VarB);
        fn31.T(llmVarE, (o8n) null, 0, new cuk(y48Var, this, null, (byte) 14), 3);
    }

    public v1k(fzh0 fzh0Var) {
        this.a = (byte) 7;
        this.b = new y36(0);
        this.c = new y36(0);
        this.d = new WeakReference(fzh0Var);
    }
}
