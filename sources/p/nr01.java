package p;

import com.spotify.recents.recentsdatasourceimpl.GroupMetadata;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nr01 extends a8d1 implements xu30 {
    public mr20 X;
    public int Y;
    public vr20 a;
    public byte b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vr01 e;
    public final /* synthetic */ su01 f;
    public final /* synthetic */ m9m g;
    public wsc0 h;
    public mr20 i;
    public s1g t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr01(lnm lnmVar, vr01 vr01Var, su01 su01Var, m9m m9mVar) {
        super(3, lnmVar);
        this.e = vr01Var;
        this.f = su01Var;
        this.g = m9mVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        nr01 nr01Var = new nr01((lnm) obj3, this.e, this.f, this.g);
        nr01Var.c = (vr20) obj;
        nr01Var.d = obj2;
        return nr01Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:102:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:104:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:109:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:114:0x0517  */
    /* JADX WARN: Code duplicated, block: B:118:0x0529  */
    /* JADX WARN: Code duplicated, block: B:123:0x0540  */
    /* JADX WARN: Code duplicated, block: B:124:0x054e  */
    /* JADX WARN: Code duplicated, block: B:132:0x04de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0167  */
    /* JADX WARN: Code duplicated, block: B:54:0x0181  */
    /* JADX WARN: Code duplicated, block: B:56:0x018f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0357  */
    /* JADX WARN: Code duplicated, block: B:76:0x0365  */
    /* JADX WARN: Code duplicated, block: B:79:0x037a  */
    /* JADX WARN: Code duplicated, block: B:85:0x03a2 A[LOOP:4: B:83:0x039c->B:85:0x03a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:89:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:93:0x0469  */
    /* JADX WARN: Code duplicated, block: B:95:0x0479  */
    /* JADX WARN: Code duplicated, block: B:99:0x04bc  */
    public final Object invokeSuspend(Object obj) {
        Object objB;
        wsc0 wsc0Var;
        int i;
        vr20 vr20Var;
        su01 su01Var;
        byte b;
        mr20 mr20VarM;
        lnm lnmVar;
        char c;
        mr20 mr20Var;
        char c2;
        Object objC;
        d9n d9nVar;
        mr20 mr20Var2;
        s1g s1gVar;
        boolean z;
        vr20 arrayList;
        vr20 vr20Var2;
        mmr0 mmr0Var;
        List<zuc0> list;
        vr20 vr20Var3;
        d9n d9nVar2;
        mr20 mr20VarQ;
        yt91 yt91Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        byte b2;
        huz huzVarM;
        vr20 vr20Var4;
        huz huzVarV;
        su01 su01Var2;
        vr01 vr01Var;
        huz huzVarV2;
        cik1 cik1Var;
        ArrayList arrayList4;
        ArrayList arrayList5;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList6;
        mr20 mr20Var3;
        huz huzVarR;
        evz evzVarR;
        GroupMetadata groupMetadataP;
        vr20 vr20VarD1;
        ixu0 ixu0Var = nyu0.e;
        vr20 vr20Var5 = z6x.a;
        LinkedHashMap linkedHashMap2 = b7x.a;
        su01 su01Var3 = this.f;
        vr01 vr01Var2 = this.e;
        vr20 vr20Var6 = this.c;
        Object obj2 = this.d;
        d9n d9nVar3 = d9n.a;
        byte b3 = this.b;
        if (b3 != 0) {
            if (b3 == 1) {
                int i2 = this.Y;
                wsc0 wsc0Var2 = this.h;
                vr20 vr20Var7 = this.a;
                hm5.M(obj);
                wsc0Var = wsc0Var2;
                i = i2;
                vr20Var6 = vr20Var7;
                objB = obj;
            } else if (b3 == 2) {
                mr20 mr20Var4 = this.X;
                s1g s1gVar2 = this.t;
                mr20Var = this.i;
                wsc0Var = this.h;
                vr20 vr20Var8 = this.a;
                hm5.M(obj);
                vr20Var = vr20Var5;
                mr20Var2 = mr20Var4;
                s1gVar = s1gVar2;
                b = 0;
                lnmVar = null;
                vr20Var6 = vr20Var8;
                d9nVar = d9nVar3;
                c2 = 2;
                c = 7;
                objC = obj;
                mr20 mr20Var5 = mr20Var;
                wsc0 wsc0Var3 = wsc0Var;
                mr20 mr20Var6 = (mr20) objC;
                lnm lnmVar2 = lnmVar;
                List list2 = wsc0Var3.e;
                kdy0 kdy0Var = vr01Var2.i;
                su01Var3.h("decorate_share_profiles");
                list = list2;
                vr20Var3 = vr20Var6;
                d9nVar2 = d9nVar;
                mr20VarQ = h5p1.q(mr20Var2, s1gVar, mr20Var5, mr20Var6, fyo1.v(rqt0.u(new lt20(vr01.e(vr01Var2, j6p1.m(new m441(new us0(((xr01) kdy0Var.e).d, linkedHashMap2, o4p1.r(new lt20(new m441(new ciw0(su01Var3, kdy0Var, list2, lnmVar2, (byte) 7)), new c6e0(su01Var3, kdy0Var, lnmVar2, (byte) 17), b), (q8n) kdy0Var.c), lnmVar2, (byte) 27)), jt01.V0, new ggx0(0, su01Var3, su01.class, "endShareProfilePoint", "endShareProfilePoint()V", 0, (byte) 10), new dsr0(su01Var3, (byte) 10))), new pr01(vr01Var2, null, (byte) 2), (byte) 0)), new dsr0(su01Var3, (byte) 6)), new h5r0((lnm) null, (byte) 2));
                if (vr01Var2.q.d()) {
                    yt91Var = vr01Var2.j;
                    arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        Set set = s4b1.f;
                        if (uic.j(((zuc0) obj3).c, ixu0Var)) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((zuc0) it.next()).c);
                    }
                    if (arrayList3.isEmpty()) {
                        huzVarM = new huz(new cbr(linkedHashMap2), (byte) 10);
                        b2 = 3;
                    } else {
                        su01Var3.h("decorate_sponsorships");
                        su01Var3.h("network_fetch_sponsorships");
                        Flowable flowable = ((uu00) yt91Var.b).b(new oi("recents", false, new k011(arrayList3, (byte) 3))).toFlowable(BackpressureStrategy.d);
                        vbm[] vbmVarArr = q601.a;
                        b2 = 3;
                        huzVarM = j6p1.m(new lt20(new a1b1(new fu20(z4p1.F(new jha1(o4p1.r(new kge(flowable), (q8n) yt91Var.c), (byte) 3), 1), new tr01(su01Var3, null, (byte) 1), (byte) 1), arrayList3, (byte) 1), new c6e0(su01Var3, yt91Var, (lnm) null, (byte) 24), (byte) 0), qva1.d1, new nda1(0, su01Var3, su01.class, "endSponsorshipPoint", "endSponsorshipPoint()V", 0, (byte) 2), new dsr0(su01Var3, (byte) 11));
                    }
                    vr20Var4 = null;
                    huzVarV = fyo1.v(rqt0.u(new lt20(vr01.e(vr01Var2, huzVarM), new pr01(vr01Var2, null, b2), (byte) 0)), new dsr0(su01Var3, (byte) 7));
                } else {
                    su01Var3.d(ou01.e);
                    huzVarV = new huz(linkedHashMap2, (byte) 10);
                    vr20Var4 = null;
                    b2 = 3;
                }
                if (vr01Var2.m.h()) {
                    vr20 vr20Var9 = vr20Var4;
                    su01Var2 = su01Var3;
                    ciw0 ciw0Var = new ciw0((Object) vr01Var2, (Object) list, (Object) su01Var2, (lnm) vr20Var9, (byte) 5);
                    vr01Var = vr01Var2;
                    vr20Var4 = vr20Var9;
                    list = list;
                    huzVarV2 = fyo1.v(new lt20(new m441(ciw0Var), new pr01(vr01Var, vr20Var4, (byte) 1), (byte) 0), new dsr0(su01Var2, (byte) 5));
                } else {
                    su01Var3.d(ou01.f);
                    huzVarV2 = new huz(linkedHashMap2, (byte) 10);
                    su01Var2 = su01Var3;
                    vr01Var = vr01Var2;
                }
                huz huzVar = huzVarV2;
                cik1Var = vr01Var.l;
                arrayList4 = new ArrayList();
                for (zuc0 zuc0Var : list) {
                    List listSingletonList = Collections.singletonList(zuc0Var.c);
                    groupMetadataP = i6p1.p(zuc0Var);
                    if (groupMetadataP != null) {
                        vr20VarD1 = o7h.d1(groupMetadataP.o(), b2);
                    } else {
                        vr20VarD1 = vr20Var4;
                    }
                    if (vr20VarD1 == null) {
                        vr20VarD1 = vr20Var;
                    }
                    r7h.W(o7h.N0((Iterable) vr20VarD1, listSingletonList), arrayList4);
                }
                arrayList5 = new ArrayList();
                for (Object obj4 : arrayList4) {
                    if (eyo1.v((String) obj4)) {
                        arrayList5.add(obj4);
                    }
                }
                List listJ0 = o7h.j0(arrayList5);
                ((xr01) cik1Var.d).getClass();
                linkedHashMap = xr01.f;
                if (linkedHashMap == null) {
                    linkedHashMap = linkedHashMap2;
                }
                arrayList6 = new ArrayList();
                for (Object obj5 : listJ0) {
                    if (!linkedHashMap.containsKey((String) obj5)) {
                        arrayList6.add(obj5);
                    }
                }
                if (arrayList6.isEmpty()) {
                    huzVarR = new huz(new cbr(linkedHashMap), (byte) 10);
                    mr20Var3 = mr20VarQ;
                } else {
                    mr20Var3 = mr20VarQ;
                    huzVarR = o4p1.r(new m441(new us0(linkedHashMap, linkedHashMap2, new m441(new xoh1(cik1Var, arrayList6, vr20Var4, (byte) 13)), vr20Var4, (byte) 27)), (q8n) cik1Var.c);
                }
                evzVarR = h5p1.r(mr20Var3, huzVarV, huzVar, rqt0.u(fyo1.v(new lt20(vr01.e(vr01Var, huzVarR), new pr01(vr01Var, vr20Var4, (byte) 4), (byte) 0), new dsr0(su01Var2, (byte) 8))), new woy((Object) vr01Var, (Object) wsc0Var3, (lnm) vr20Var4, b2));
                this.c = vr20Var4;
                this.d = vr20Var4;
                this.a = vr20Var4;
                this.h = vr20Var4;
                this.i = vr20Var4;
                this.t = vr20Var4;
                this.X = vr20Var4;
                this.b = b2;
                if (l4p1.s(vr20Var3, evzVarR, this) == d9nVar2) {
                    return d9nVar2;
                }
            } else {
                if (b3 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        }
        hm5.M(obj);
        wsc0 wsc0Var4 = (wsc0) obj2;
        this.c = null;
        this.d = null;
        this.a = vr20Var6;
        this.h = wsc0Var4;
        this.Y = 0;
        this.b = (byte) 1;
        objB = vr01Var2.b(wsc0Var4, su01Var3, this);
        if (objB == d9nVar3) {
            return d9nVar3;
        }
        wsc0Var = wsc0Var4;
        i = 0;
        mr20 mr20Var7 = (mr20) objB;
        List list3 = wsc0Var.e;
        m9m m9mVar = this.g;
        su01 su01Var4 = this.f;
        poj0 poj0Var = vr01Var2.g;
        long jB = vr01Var2.q.b();
        ArrayList arrayListT = poj0.t(list3);
        vr20Var = vr20Var5;
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = arrayListT.iterator();
        while (it2.hasNext()) {
            long j = jB;
            zuc0 zuc0Var2 = (zuc0) it2.next();
            GroupMetadata groupMetadataP2 = i6p1.p(zuc0Var2);
            if (groupMetadataP2 == null) {
                poj0Var.D(3, "Recents: Failed to parse group metadata for " + zuc0Var2.c + ", skipping decoration.");
                mmr0Var = null;
            } else {
                mmr0Var = new mmr0(i6p1.j(zuc0Var2), groupMetadataP2);
            }
            if (mmr0Var != null) {
                arrayList7.add(mmr0Var);
            }
            it2 = it2;
            jB = j;
        }
        long j2 = jB;
        Map mapT = sqg0.T(arrayList7);
        ArrayList arrayListT2 = poj0.t(list3);
        ArrayList arrayList8 = new ArrayList();
        Iterator it3 = arrayListT2.iterator();
        while (it3.hasNext()) {
            zuc0 zuc0Var3 = (zuc0) it3.next();
            Iterator it4 = it3;
            GroupMetadata groupMetadata = (GroupMetadata) mapT.get(i6p1.j(zuc0Var3));
            if (groupMetadata == null) {
                vr20Var2 = vr20Var;
            } else {
                Map map = zuc0Var3.g;
                String str = zuc0Var3.c;
                if (map.get("recent_type_saved") != null) {
                    Set set2 = s4b1.f;
                    if (uic.j(str, ixu0Var)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                boolean z2 = groupMetadata.getItemsCount() > 0;
                if (z && z2) {
                    List listD1 = o7h.d1(groupMetadata.o(), 3);
                    arrayList = new ArrayList();
                    for (Object obj6 : listD1) {
                        if (!eyo1.v((String) obj6)) {
                            arrayList.add(obj6);
                        }
                    }
                } else {
                    Set set3 = s4b1.f;
                    if (uic.j(str, ixu0Var) || uic.h(str, new blc0[]{blc0.u1, blc0.g1, blc0.fh, blc0.Pg, blc0.ti, blc0.C8})) {
                        arrayList = vr20Var;
                    } else {
                        List listD2 = o7h.d1(groupMetadata.o(), 3);
                        arrayList = new ArrayList();
                        while (r5.hasNext()) {
                            if (!eyo1.v((String) obj6)) {
                                arrayList.add(obj6);
                            }
                        }
                    }
                }
                vr20Var2 = (Iterable) arrayList;
            }
            r7h.W(vr20Var2, arrayList8);
            it3 = it4;
            d9nVar3 = d9nVar3;
        }
        d9n d9nVar4 = d9nVar3;
        if (arrayList8.isEmpty()) {
            mr20VarM = o4p1.r(new huz(new cbr(poj0Var.B(mapT, m9mVar)), (byte) 10), (q8n) poj0Var.c);
            su01Var = su01Var4;
            b = 0;
        } else {
            su01Var4.h("decorate_parents");
            m441 m441Var = new m441(new af0((byte) 18, su01Var4, poj0Var, arrayList8, mapT, m9mVar, (lnm) null));
            su01Var = su01Var4;
            b = 0;
            mr20VarM = j6p1.m(new m441(new hgo0(poj0Var, mapT, m9mVar, new lt20(r4p1.w(m441Var, fdg1.l0(j2 > 0 ? j2 : 5000L, ngv.d)), new kdk(su01Var4, poj0Var, mapT, m9mVar, null), (byte) 0), (lnm) null, (byte) 4)), q4r0.W0, new t0r0(0, su01Var, su01.class, "endParentPoint", "endParentPoint()V", 0, (byte) 18), new dsr0(su01Var, (byte) 0));
        }
        lnmVar = null;
        c = 7;
        s1g s1gVarV = fyo1.v(rqt0.u(new lt20(vr01.e(vr01Var2, mr20VarM), new c6e0(vr01Var2, list3, (lnm) null, (byte) 16), b)), new l5v0(su01Var, (byte) 7));
        mr20Var = vr01Var2.u;
        List list4 = wsc0Var.e;
        this.c = null;
        this.d = null;
        this.a = vr20Var6;
        this.h = wsc0Var;
        this.i = mr20Var;
        this.t = s1gVarV;
        this.X = mr20Var7;
        this.Y = i;
        c2 = 2;
        this.b = (byte) 2;
        objC = vr01Var2.c(list4, su01Var3, this);
        d9nVar = d9nVar4;
        if (objC == d9nVar) {
            return d9nVar;
        }
        mr20Var2 = mr20Var7;
        s1gVar = s1gVarV;
        mr20 mr20Var8 = mr20Var;
        wsc0 wsc0Var5 = wsc0Var;
        mr20 mr20Var9 = (mr20) objC;
        lnm lnmVar3 = lnmVar;
        List list5 = wsc0Var5.e;
        kdy0 kdy0Var2 = vr01Var2.i;
        su01Var3.h("decorate_share_profiles");
        list = list5;
        vr20Var3 = vr20Var6;
        d9nVar2 = d9nVar;
        mr20VarQ = h5p1.q(mr20Var2, s1gVar, mr20Var8, mr20Var9, fyo1.v(rqt0.u(new lt20(vr01.e(vr01Var2, j6p1.m(new m441(new us0(((xr01) kdy0Var2.e).d, linkedHashMap2, o4p1.r(new lt20(new m441(new ciw0(su01Var3, kdy0Var2, list5, lnmVar3, (byte) 7)), new c6e0(su01Var3, kdy0Var2, lnmVar3, (byte) 17), b), (q8n) kdy0Var2.c), lnmVar3, (byte) 27)), jt01.V0, new ggx0(0, su01Var3, su01.class, "endShareProfilePoint", "endShareProfilePoint()V", 0, (byte) 10), new dsr0(su01Var3, (byte) 10))), new pr01(vr01Var2, null, (byte) 2), (byte) 0)), new dsr0(su01Var3, (byte) 6)), new h5r0((lnm) null, (byte) 2));
        if (vr01Var2.q.d()) {
            su01Var3.d(ou01.e);
            huzVarV = new huz(linkedHashMap2, (byte) 10);
            vr20Var4 = null;
            b2 = 3;
        } else {
            yt91Var = vr01Var2.j;
            arrayList2 = new ArrayList();
            while (r9.hasNext()) {
                Set set4 = s4b1.f;
                if (uic.j(((zuc0) obj3).c, ixu0Var)) {
                    arrayList2.add(obj3);
                }
            }
            arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((zuc0) it.next()).c);
            }
            if (arrayList3.isEmpty()) {
                huzVarM = new huz(new cbr(linkedHashMap2), (byte) 10);
                b2 = 3;
            } else {
                su01Var3.h("decorate_sponsorships");
                su01Var3.h("network_fetch_sponsorships");
                Flowable flowable2 = ((uu00) yt91Var.b).b(new oi("recents", false, new k011(arrayList3, (byte) 3))).toFlowable(BackpressureStrategy.d);
                vbm[] vbmVarArr2 = q601.a;
                b2 = 3;
                huzVarM = j6p1.m(new lt20(new a1b1(new fu20(z4p1.F(new jha1(o4p1.r(new kge(flowable2), (q8n) yt91Var.c), (byte) 3), 1), new tr01(su01Var3, null, (byte) 1), (byte) 1), arrayList3, (byte) 1), new c6e0(su01Var3, yt91Var, (lnm) null, (byte) 24), (byte) 0), qva1.d1, new nda1(0, su01Var3, su01.class, "endSponsorshipPoint", "endSponsorshipPoint()V", 0, (byte) 2), new dsr0(su01Var3, (byte) 11));
            }
            vr20Var4 = null;
            huzVarV = fyo1.v(rqt0.u(new lt20(vr01.e(vr01Var2, huzVarM), new pr01(vr01Var2, null, b2), (byte) 0)), new dsr0(su01Var3, (byte) 7));
        }
        if (vr01Var2.m.h()) {
            su01Var3.d(ou01.f);
            huzVarV2 = new huz(linkedHashMap2, (byte) 10);
            su01Var2 = su01Var3;
            vr01Var = vr01Var2;
        } else {
            vr20 vr20Var10 = vr20Var4;
            su01Var2 = su01Var3;
            ciw0 ciw0Var2 = new ciw0((Object) vr01Var2, (Object) list, (Object) su01Var2, (lnm) vr20Var10, (byte) 5);
            vr01Var = vr01Var2;
            vr20Var4 = vr20Var10;
            list = list;
            huzVarV2 = fyo1.v(new lt20(new m441(ciw0Var2), new pr01(vr01Var, vr20Var4, (byte) 1), (byte) 0), new dsr0(su01Var2, (byte) 5));
        }
        huz huzVar2 = huzVarV2;
        cik1Var = vr01Var.l;
        arrayList4 = new ArrayList();
        while (r4.hasNext()) {
            List listSingletonList2 = Collections.singletonList(zuc0Var.c);
            groupMetadataP = i6p1.p(zuc0Var);
            if (groupMetadataP != null) {
                vr20VarD1 = o7h.d1(groupMetadataP.o(), b2);
            } else {
                vr20VarD1 = vr20Var4;
            }
            if (vr20VarD1 == null) {
                vr20VarD1 = vr20Var;
            }
            r7h.W(o7h.N0((Iterable) vr20VarD1, listSingletonList2), arrayList4);
        }
        arrayList5 = new ArrayList();
        while (r6.hasNext()) {
            if (eyo1.v((String) obj4)) {
                arrayList5.add(obj4);
            }
        }
        List listJ1 = o7h.j0(arrayList5);
        ((xr01) cik1Var.d).getClass();
        linkedHashMap = xr01.f;
        if (linkedHashMap == null) {
            linkedHashMap = linkedHashMap2;
        }
        arrayList6 = new ArrayList();
        while (r4.hasNext()) {
            if (!linkedHashMap.containsKey((String) obj5)) {
                arrayList6.add(obj5);
            }
        }
        if (arrayList6.isEmpty()) {
            huzVarR = new huz(new cbr(linkedHashMap), (byte) 10);
            mr20Var3 = mr20VarQ;
        } else {
            mr20Var3 = mr20VarQ;
            huzVarR = o4p1.r(new m441(new us0(linkedHashMap, linkedHashMap2, new m441(new xoh1(cik1Var, arrayList6, vr20Var4, (byte) 13)), vr20Var4, (byte) 27)), (q8n) cik1Var.c);
        }
        evzVarR = h5p1.r(mr20Var3, huzVarV, huzVar2, rqt0.u(fyo1.v(new lt20(vr01.e(vr01Var, huzVarR), new pr01(vr01Var, vr20Var4, (byte) 4), (byte) 0), new dsr0(su01Var2, (byte) 8))), new woy((Object) vr01Var, (Object) wsc0Var5, (lnm) vr20Var4, b2));
        this.c = vr20Var4;
        this.d = vr20Var4;
        this.a = vr20Var4;
        this.h = vr20Var4;
        this.i = vr20Var4;
        this.t = vr20Var4;
        this.X = vr20Var4;
        this.b = b2;
        if (l4p1.s(vr20Var3, evzVarR, this) == d9nVar2) {
            return d9nVar2;
        }
        return rih1.a;
    }
}
