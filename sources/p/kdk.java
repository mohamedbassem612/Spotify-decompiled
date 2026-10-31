package p;

import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.TimeoutCancellationException;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionShowDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionTrackDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kdk extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdk(oev0 oev0Var, p811 p811Var, boolean z, p811 p811Var2, n811 n811Var, p811 p811Var3, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 3;
        this.d = oev0Var;
        this.g = p811Var;
        this.b = z;
        this.e = p811Var2;
        this.f = n811Var;
        this.h = p811Var3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                kdk kdkVar = new kdk((tdk) obj7, (l811) obj6, (p811) obj5, (udk) obj4, (lnm) obj3, (byte) 0);
                kdkVar.c = (vr20) obj;
                kdkVar.d = obj2;
                return kdkVar.invokeSuspend(rih1Var);
            case 1:
                kdk kdkVar2 = new kdk((su01) obj7, (poj0) obj6, (Map) obj5, (m9m) obj4, (lnm) obj3);
                kdkVar2.c = (vr20) obj;
                kdkVar2.d = (Throwable) obj2;
                return kdkVar2.invokeSuspend(rih1Var);
            case 2:
                kdk kdkVar3 = new kdk((hut0) obj7, (Set) obj6, (Set) obj5, (Set) obj4, (lnm) obj3, (byte) 2);
                kdkVar3.c = (vr20) obj;
                kdkVar3.d = obj2;
                return kdkVar3.invokeSuspend(rih1Var);
            case 3:
                kdk kdkVar4 = new kdk((oev0) this.d, (p811) obj5, this.b, (p811) obj7, (n811) obj6, (p811) obj4, (lnm) obj3);
                kdkVar4.c = (uev0) obj;
                return kdkVar4.invokeSuspend(rih1Var);
            default:
                kdk kdkVar5 = new kdk((hre1) obj7, (ArrayList) obj6, (String) obj5, (on0) obj4, (lnm) obj3, (byte) 4);
                kdkVar5.c = (vr20) obj;
                kdkVar5.d = obj2;
                return kdkVar5.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0440  */
    /* JADX WARN: Code duplicated, block: B:165:0x044e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0453  */
    /* JADX WARN: Code duplicated, block: B:170:0x047b  */
    /* JADX WARN: Code duplicated, block: B:172:0x048a  */
    /* JADX WARN: Code duplicated, block: B:178:0x049f  */
    /* JADX WARN: Code duplicated, block: B:181:0x04ad A[LOOP:4: B:179:0x04a7->B:181:0x04ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:193:0x0507  */
    /* JADX WARN: Code duplicated, block: B:195:0x0516  */
    /* JADX WARN: Code duplicated, block: B:197:0x0530  */
    /* JADX WARN: Code duplicated, block: B:198:0x0532  */
    /* JADX WARN: Code duplicated, block: B:201:0x053b  */
    /* JADX WARN: Code duplicated, block: B:205:0x055e  */
    /* JADX WARN: Code duplicated, block: B:208:0x0563  */
    /* JADX WARN: Code duplicated, block: B:210:0x0567  */
    /* JADX WARN: Code duplicated, block: B:211:0x0569  */
    /* JADX WARN: Code duplicated, block: B:222:0x0493 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x04cc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        String strConcat;
        ima1 ima1Var;
        String strF;
        String strConcat2;
        ArrayList arrayList;
        rih1 rih1Var;
        Iterator it;
        k5d k5dVar;
        hma1 hma1VarEdit;
        Iterator it2;
        String str;
        xe01 huzVar;
        Object objCollect;
        k5d k5dVar2;
        ConcurrentHashMap concurrentHashMap;
        Object obj2;
        bpb1 bpb1VarB;
        Object objPutIfAbsent;
        String str2;
        boolean z;
        qa2 qa2Var;
        Object value;
        Object value2;
        w6w huzVar2;
        byte b = this.a;
        rih1 rih1Var2 = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        List list = null;
        switch (b) {
            case 0:
                String str3 = ((udk) obj3).a;
                p811 p811Var = (p811) obj4;
                l811 l811Var = (l811) obj5;
                tdk tdkVar = (tdk) obj6;
                ic9 ic9Var = tdkVar.R0;
                vr20 vr20Var = (vr20) this.c;
                Object obj7 = this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    edk edkVar = (edk) obj7;
                    d7d d7dVar = edkVar.f;
                    yqg yqgVar = tdkVar.f;
                    if (d7dVar instanceof z6d) {
                        int iC = l1d.C(brl.x(d7dVar, yqgVar));
                        if (iC == 0) {
                            str2 = "announce";
                        } else if (iC == 1) {
                            str2 = "sale";
                        } else if (iC == 2) {
                            str2 = "aftersale";
                        } else {
                            eg.o();
                        }
                        strConcat = "reserved.".concat(str2);
                        if (l811Var.a || !u890.j(strConcat, p811Var.a)) {
                            ima1Var = (dma1) ic9Var.b;
                            strF = f4i1.f("live-events-campaign-collapsed:", str3, "|");
                            if (strConcat != null) {
                                strConcat2 = strF.concat(strConcat);
                            } else {
                                strConcat2 = null;
                            }
                            Set setP1 = o7h.p1(ima1Var.o().getAll().keySet());
                            arrayList = new ArrayList();
                            for (Object obj8 : setP1) {
                                rih1 rih1Var3 = rih1Var2;
                                str = (String) obj8;
                                if (!nhc1.Y(str, strF, false) && !str.equals(strConcat2)) {
                                    arrayList.add(obj8);
                                }
                                rih1Var2 = rih1Var3;
                            }
                            rih1Var = rih1Var2;
                            if (!arrayList.isEmpty()) {
                                hma1VarEdit = ima1Var.edit();
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    hma1VarEdit.f(bma1.b.n((String) it2.next()));
                                }
                                hma1VarEdit.g();
                            }
                            it = ((ConcurrentHashMap) ic9Var.c).entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                k5dVar = (k5d) entry.getKey();
                                bpb1 bpb1Var = (wen0) entry.getValue();
                                if (!u890.j(k5dVar.a, str3) && !u890.j(k5dVar.b, strConcat)) {
                                    bpb1Var.m((Object) null, Boolean.FALSE);
                                    it.remove();
                                }
                            }
                            p811Var.a = strConcat;
                            l811Var.a = true;
                        } else {
                            rih1Var = rih1Var2;
                        }
                        if (strConcat != null) {
                            k5dVar2 = new k5d(str3, strConcat);
                            concurrentHashMap = (ConcurrentHashMap) ic9Var.c;
                            obj2 = concurrentHashMap.get(k5dVar2);
                            if (obj2 == null) {
                                bpb1VarB = gio1.b(Boolean.valueOf(((dma1) ic9Var.b).h(ic9.o(k5dVar2), false)));
                                objPutIfAbsent = concurrentHashMap.putIfAbsent(k5dVar2, bpb1VarB);
                                if (objPutIfAbsent == null) {
                                    obj2 = bpb1VarB;
                                } else {
                                    obj2 = objPutIfAbsent;
                                }
                            }
                            huzVar = d5p1.h((wen0) obj2);
                        } else {
                            huzVar = new huz(Boolean.FALSE, (byte) 10);
                        }
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        u4p1.S(vr20Var);
                        objCollect = huzVar.collect(new h50((byte) 23, edkVar, strConcat, vr20Var), this);
                        if (objCollect != d9nVar) {
                            objCollect = rih1Var;
                        }
                        if (objCollect != d9nVar) {
                            objCollect = rih1Var;
                        }
                        return objCollect == d9nVar ? d9nVar : rih1Var;
                    }
                    if (d7dVar instanceof w6d) {
                        strConcat = "fcfs";
                    } else if (d7dVar instanceof b7d) {
                        strConcat = "waitlistable";
                    } else if (d7dVar instanceof c7d) {
                        strConcat = "waitlisted";
                    } else if (d7dVar instanceof y6d) {
                        strConcat = "purchased";
                    } else if (d7dVar == null || (d7dVar instanceof x6d) || d7dVar.equals(a7d.a)) {
                        strConcat = null;
                    } else {
                        eg.o();
                    }
                    if (l811Var.a) {
                        ima1Var = (dma1) ic9Var.b;
                        strF = f4i1.f("live-events-campaign-collapsed:", str3, "|");
                        if (strConcat != null) {
                            strConcat2 = strF.concat(strConcat);
                        } else {
                            strConcat2 = null;
                        }
                        Set setP2 = o7h.p1(ima1Var.o().getAll().keySet());
                        arrayList = new ArrayList();
                        while (r16.hasNext()) {
                            rih1 rih1Var4 = rih1Var2;
                            str = (String) obj8;
                            if (!nhc1.Y(str, strF, false)) {
                            }
                            rih1Var2 = rih1Var4;
                        }
                        rih1Var = rih1Var2;
                        if (!arrayList.isEmpty()) {
                            hma1VarEdit = ima1Var.edit();
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                hma1VarEdit.f(bma1.b.n((String) it2.next()));
                            }
                            hma1VarEdit.g();
                        }
                        it = ((ConcurrentHashMap) ic9Var.c).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            k5dVar = (k5d) entry2.getKey();
                            bpb1 bpb1Var2 = (wen0) entry2.getValue();
                            if (!u890.j(k5dVar.a, str3)) {
                            }
                        }
                        p811Var.a = strConcat;
                        l811Var.a = true;
                    } else {
                        ima1Var = (dma1) ic9Var.b;
                        strF = f4i1.f("live-events-campaign-collapsed:", str3, "|");
                        if (strConcat != null) {
                            strConcat2 = strF.concat(strConcat);
                        } else {
                            strConcat2 = null;
                        }
                        Set setP3 = o7h.p1(ima1Var.o().getAll().keySet());
                        arrayList = new ArrayList();
                        while (r16.hasNext()) {
                            rih1 rih1Var5 = rih1Var2;
                            str = (String) obj8;
                            if (!nhc1.Y(str, strF, false)) {
                            }
                            rih1Var2 = rih1Var5;
                        }
                        rih1Var = rih1Var2;
                        if (!arrayList.isEmpty()) {
                            hma1VarEdit = ima1Var.edit();
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                hma1VarEdit.f(bma1.b.n((String) it2.next()));
                            }
                            hma1VarEdit.g();
                        }
                        it = ((ConcurrentHashMap) ic9Var.c).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it.next();
                            k5dVar = (k5d) entry3.getKey();
                            bpb1 bpb1Var3 = (wen0) entry3.getValue();
                            if (!u890.j(k5dVar.a, str3)) {
                            }
                        }
                        p811Var.a = strConcat;
                        l811Var.a = true;
                    }
                    if (strConcat != null) {
                        k5dVar2 = new k5d(str3, strConcat);
                        concurrentHashMap = (ConcurrentHashMap) ic9Var.c;
                        obj2 = concurrentHashMap.get(k5dVar2);
                        if (obj2 == null) {
                            bpb1VarB = gio1.b(Boolean.valueOf(((dma1) ic9Var.b).h(ic9.o(k5dVar2), false)));
                            objPutIfAbsent = concurrentHashMap.putIfAbsent(k5dVar2, bpb1VarB);
                            if (objPutIfAbsent == null) {
                                obj2 = bpb1VarB;
                            } else {
                                obj2 = objPutIfAbsent;
                            }
                        }
                        huzVar = d5p1.h((wen0) obj2);
                    } else {
                        huzVar = new huz(Boolean.FALSE, (byte) 10);
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    u4p1.S(vr20Var);
                    objCollect = huzVar.collect(new h50((byte) 23, edkVar, strConcat, vr20Var), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                    }
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                poj0 poj0Var = (poj0) obj5;
                vr20 vr20Var2 = (vr20) this.c;
                Throwable th = (Throwable) this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((su01) obj6).f("network_fetch_parents");
                if (th instanceof TimeoutCancellationException) {
                    poj0Var.D(2, "Parent decoration timed out: " + th.getMessage());
                    z = true;
                } else {
                    z = true;
                    poj0Var.D(1, "Failed to fetch parent decorations: " + th.getMessage());
                }
                bbr bbrVar = new bbr(poj0Var.B((Map) obj4, (m9m) obj3));
                this.c = null;
                this.d = null;
                this.b = z;
                return vr20Var2.emit(bbrVar, this) == d9nVar ? d9nVar : rih1Var2;
            case 2:
                hut0 hut0Var = (hut0) obj6;
                vr20 vr20Var3 = (vr20) this.c;
                Object obj9 = this.d;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Set set = (Set) obj5;
                r5h r5hVar = hut0Var.a;
                e3h e3hVarP = CollectionDecorateRequest.p();
                k7h k7hVarN = CollectionTrackDecorationPolicy.n();
                k7hVarN.r(ArtistDecorationPolicy.newBuilder().setLink(true));
                k7hVarN.v(TrackPlayedStateDecorationPolicy.newBuilder().setPlayabilityRestriction(true));
                e3hVarP.x(k7hVarN);
                c7h c7hVarN = CollectionShowDecorationPolicy.n();
                ShowPlayedStateDecorationPolicy.Builder builderNewBuilder = ShowPlayedStateDecorationPolicy.newBuilder();
                builderNewBuilder.setPlayabilityRestriction(true);
                c7hVarN.r(builderNewBuilder);
                e3hVarP.v(c7hVarN);
                e3hVarP.n(set);
                jge jgeVarE = hu20.e(rqt0.u(new uop0(yoi1.g(r5hVar.e(e3hVarP.build())), (byte) 12)), new c6e0((lnm) null, hut0Var, set, (byte) 9));
                ezc ezcVarG = yoi1.g(hut0Var.c.a.a("obfuscate-restricted-tracks", "0").map(y580.c1).onErrorReturn(uh21.e1));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj10 : (Set) obj4) {
                    if (new y6b1((String) obj10, false).c == v6b1.t) {
                        arrayList2.add(obj10);
                    }
                }
                Set set2 = (Set) obj3;
                evz evzVarR = h5p1.r(jgeVarE, ezcVarG, arrayList2.isEmpty() ? new huz(w7x.a, (byte) 10) : hu20.c(new ht20(hut0Var.d.c(), new pk50(2, (lnm) null, (byte) 18)), new f3t0(hut0Var, arrayList2, (lnm) null, (byte) 8)), set2.isEmpty() ? new huz(b7x.a, (byte) 10) : new m9r0(new uop0(yoi1.g(hut0Var.e.b(new oi("playback-trait-playability-provider", false, new lu2(set2, (byte) 4)))), (byte) 13), set2, (byte) 9), new k1(hut0Var, (lnm) null, (byte) 24));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var3, evzVarR, this) == d9nVar ? d9nVar : rih1Var2;
            case 3:
                boolean z5 = this.b;
                p811 p811Var2 = (p811) obj3;
                p811 p811Var3 = (p811) obj6;
                n811 n811Var = (n811) obj5;
                uev0 uev0Var = (uev0) this.c;
                hm5.M(obj);
                oev0 oev0Var = (oev0) this.d;
                boolean z6 = uev0Var instanceof pev0;
                oev0Var.c = z6;
                xmu0 xmu0Var = oev0Var.a;
                String str4 = ((aev0) ((xe01) ((yqu0) xmu0Var.c).b).a.getValue()).b;
                p811 p811Var4 = (p811) obj4;
                if (!u890.j(str4, p811Var4.a) && z5) {
                    p811Var3.a = null;
                    n811Var.a = oev0.c(z5, p811Var2);
                }
                if (uev0Var instanceof qev0) {
                    bev0 bev0Var = ((qev0) uev0Var).a;
                    if (u890.j(bev0Var.e.a, str4)) {
                        oev0Var.d = null;
                        yqu0 yqu0Var = (yqu0) xmu0Var.c;
                        List list2 = bev0Var.b;
                        bpb1 bpb1Var4 = (bpb1) yqu0Var.c;
                        do {
                            value2 = bpb1Var4.getValue();
                        } while (!bpb1Var4.k(value2, aev0.a((aev0) value2, o7h.l1(list2), null, 2)));
                        if (oev0Var.b()) {
                            p811Var3.a = null;
                            n811Var.a = oev0.c(z5, p811Var2);
                        } else {
                            p811Var3.a = bev0Var;
                            p811Var2.a = new Integer(bev0Var.a.size());
                            n811Var.a = 0;
                        }
                    }
                } else if (uev0Var instanceof sev0) {
                    sev0 sev0Var = (sev0) uev0Var;
                    if (u890.j(sev0Var.a, str4)) {
                        oev0Var.d = null;
                        yqu0 yqu0Var2 = (yqu0) xmu0Var.c;
                        List list3 = sev0Var.b;
                        bpb1 bpb1Var5 = (bpb1) yqu0Var2.c;
                        do {
                            value = bpb1Var5.getValue();
                        } while (!bpb1Var5.k(value, aev0.a((aev0) value, o7h.l1(list3), null, 2)));
                        if (oev0Var.b()) {
                            p811Var3.a = null;
                            n811Var.a = oev0.c(z5, p811Var2);
                        }
                    }
                } else if (z6) {
                    n811Var.a = 0;
                    if (oev0Var.c && oev0Var.b != 0 && (qa2Var = oev0Var.d) != null) {
                        oev0Var.d = null;
                        qa2Var.invoke();
                    }
                } else if (u890.j(uev0Var, tev0.a)) {
                    n811Var.a = 0;
                    oev0Var.d = null;
                } else {
                    if (!u890.j(uev0Var, rev0.a)) {
                        eg.o();
                        return null;
                    }
                    bev0 bev0Var2 = (bev0) p811Var3.a;
                    if (!u890.j(bev0Var2 != null ? bev0Var2.e.a : null, str4) || p811Var3.a == null) {
                        n811Var.a = oev0.c(z5, p811Var2);
                    }
                }
                aev0 aev0Var = (aev0) ((xe01) ((yqu0) xmu0Var.c).b).a.getValue();
                p811Var4.a = aev0Var.b;
                ydv0 ydv0VarG = xmu0Var.g(aev0Var);
                String str5 = aev0Var.b;
                int i = n811Var.a;
                bev0 bev0Var3 = (bev0) p811Var3.a;
                if (bev0Var3 != null) {
                    if (!u890.j(bev0Var3.e.a, str5)) {
                        bev0Var3 = null;
                    }
                    if (bev0Var3 != null) {
                        list = bev0Var3.a;
                    }
                }
                if (list == null) {
                    list = z6x.a;
                }
                return new lev0(ydv0VarG, list, str5, i);
            default:
                vr20 vr20Var4 = (vr20) this.c;
                Object obj11 = this.d;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str6 = (String) obj11;
                if (str6.length() > 0) {
                    ArrayList arrayList3 = (ArrayList) obj5;
                    ln0 ln0VarO = AdDetectionOuterClass.SubscribeCanonicalToUserTimestampRequest.o();
                    ln0VarO.q((String) obj4);
                    ln0VarO.n(arrayList3);
                    ln0VarO.r(str6);
                    ln0VarO.s((on0) obj3);
                    AdDetectionOuterClass.SubscribeCanonicalToUserTimestampRequest subscribeCanonicalToUserTimestampRequestBuild = ln0VarO.build();
                    gn0 gn0Var = ((hre1) obj6).a;
                    subscribeCanonicalToUserTimestampRequestBuild.getClass();
                    huzVar2 = new w6w(yoi1.g(gn0Var.callStream("spotify.ad_detection.impl.ad_detection_proto.AdDetection", "SubscribeCanonicalToUserTimestamp", subscribeCanonicalToUserTimestampRequestBuild).map(q9w.d)), arrayList3, (byte) 1);
                } else {
                    huzVar2 = new huz(new yqe1(kn0.d, null, false), (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var4, huzVar2, this) == d9nVar ? d9nVar : rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kdk(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdk(su01 su01Var, poj0 poj0Var, Map map, m9m m9mVar, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 1;
        this.e = su01Var;
        this.f = poj0Var;
        this.g = map;
        this.h = m9mVar;
    }
}
