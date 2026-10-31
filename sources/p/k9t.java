package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k9t implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ k9t(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:144:0x023a  */
    /* JADX WARN: Code duplicated, block: B:159:0x027c  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:205:0x0362  */
    /* JADX WARN: Code duplicated, block: B:220:0x039d  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0405  */
    /* JADX WARN: Code duplicated, block: B:268:0x045f  */
    /* JADX WARN: Code duplicated, block: B:286:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:287:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:299:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:324:0x0550  */
    /* JADX WARN: Code duplicated, block: B:329:0x0569  */
    /* JADX WARN: Code duplicated, block: B:336:0x057c  */
    /* JADX WARN: Code duplicated, block: B:355:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:372:0x062f  */
    /* JADX WARN: Code duplicated, block: B:390:0x0673  */
    /* JADX WARN: Code duplicated, block: B:405:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:422:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:437:0x072d  */
    /* JADX WARN: Code duplicated, block: B:458:0x0796  */
    /* JADX WARN: Code duplicated, block: B:475:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:490:0x080d  */
    /* JADX WARN: Code duplicated, block: B:507:0x0845  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:524:0x0882  */
    /* JADX WARN: Code duplicated, block: B:539:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:554:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:578:0x04d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x055c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[LOOP:5: B:322:0x054a->B:591:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x0146  */
    /* JADX WARN: Code duplicated, block: B:99:0x0181  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object emit(Object obj, lnm lnmVar) {
        j9t j9tVar;
        m9t m9tVar;
        n9t n9tVar;
        o9t o9tVar;
        dct dctVar;
        ect ectVar;
        lkt lktVar;
        mkt mktVar;
        nkt nktVar;
        hpt hptVar;
        ipt iptVar;
        upt uptVar;
        jst jstVar;
        eut eutVar;
        tut tutVar;
        l0l l0lVar;
        Iterator it;
        Boolean boolValueOf;
        vut vutVar;
        Object next;
        jql1 jql1Var;
        aza azaVar;
        String str;
        Locale locale;
        xut xutVar;
        hyt hytVar;
        jyt jytVar;
        kyt kytVar;
        lyt lytVar;
        myt mytVar;
        nyt nytVar;
        oyt oytVar;
        a6u a6uVar;
        h7u h7uVar;
        pmu pmuVar;
        vmu vmuVar;
        wmu wmuVar;
        ContextTrack contextTrack;
        xmu xmuVar;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object bytVar = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof j9t) {
                    j9tVar = (j9t) lnmVar;
                    int i = j9tVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        j9tVar.b = i - Integer.MIN_VALUE;
                    } else {
                        j9tVar = new j9t(this, lnmVar);
                    }
                } else {
                    j9tVar = new j9t(this, lnmVar);
                }
                Object obj2 = j9tVar.a;
                int i2 = j9tVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                if (!((cxc0) obj).f.j) {
                    return rih1Var;
                }
                j9tVar.b = 1;
                return vr20Var.emit(obj, j9tVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof m9t) {
                    m9tVar = (m9t) lnmVar;
                    int i3 = m9tVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        m9tVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        m9tVar = new m9t(this, lnmVar);
                    }
                } else {
                    m9tVar = new m9t(this, lnmVar);
                }
                Object obj3 = m9tVar.a;
                int i4 = m9tVar.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    Boolean boolValueOf2 = Boolean.valueOf(((cxc0) obj).f.g);
                    m9tVar.b = 1;
                    return vr20Var.emit(boolValueOf2, m9tVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof n9t) {
                    n9tVar = (n9t) lnmVar;
                    int i5 = n9tVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        n9tVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        n9tVar = new n9t(this, lnmVar);
                    }
                } else {
                    n9tVar = new n9t(this, lnmVar);
                }
                Object obj4 = n9tVar.a;
                int i6 = n9tVar.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    ((Boolean) obj).getClass();
                    n9tVar.b = 1;
                    return vr20Var.emit(rih1Var, n9tVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof o9t) {
                    o9tVar = (o9t) lnmVar;
                    int i7 = o9tVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        o9tVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        o9tVar = new o9t(this, lnmVar);
                    }
                } else {
                    o9tVar = new o9t(this, lnmVar);
                }
                Object obj5 = o9tVar.a;
                int i8 = o9tVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                o9tVar.b = 1;
                return vr20Var.emit(obj, o9tVar) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof dct) {
                    dctVar = (dct) lnmVar;
                    int i9 = dctVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        dctVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        dctVar = new dct(this, lnmVar);
                    }
                } else {
                    dctVar = new dct(this, lnmVar);
                }
                Object obj6 = dctVar.a;
                int i10 = dctVar.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (!(obj instanceof zdt)) {
                    return rih1Var;
                }
                dctVar.b = 1;
                return vr20Var.emit(obj, dctVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof ect) {
                    ectVar = (ect) lnmVar;
                    int i11 = ectVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ectVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        ectVar = new ect(this, lnmVar);
                    }
                } else {
                    ectVar = new ect(this, lnmVar);
                }
                Object obj7 = ectVar.a;
                int i12 = ectVar.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    p260 p260Var = ((t1v0) obj).b;
                    ectVar.b = 1;
                    return vr20Var.emit(p260Var, ectVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof lkt) {
                    lktVar = (lkt) lnmVar;
                    int i13 = lktVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        lktVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        lktVar = new lkt(this, lnmVar);
                    }
                } else {
                    lktVar = new lkt(this, lnmVar);
                }
                Object obj8 = lktVar.a;
                int i14 = lktVar.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                if (((Set) obj).isEmpty()) {
                    return rih1Var;
                }
                lktVar.b = 1;
                return vr20Var.emit(obj, lktVar) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof mkt) {
                    mktVar = (mkt) lnmVar;
                    int i15 = mktVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        mktVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        mktVar = new mkt(this, lnmVar);
                    }
                } else {
                    mktVar = new mkt(this, lnmVar);
                }
                Object obj9 = mktVar.a;
                int i16 = mktVar.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (((ryg) entry.getValue()) == ryg.a) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet = linkedHashMap.keySet();
                mktVar.b = 1;
                return vr20Var.emit(setKeySet, mktVar) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof nkt) {
                    nktVar = (nkt) lnmVar;
                    int i17 = nktVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        nktVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        nktVar = new nkt(this, lnmVar);
                    }
                } else {
                    nktVar = new nkt(this, lnmVar);
                }
                Object obj10 = nktVar.a;
                int i18 = nktVar.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    fs1 fs1Var = new fs1((Set) obj);
                    nktVar.b = 1;
                    return vr20Var.emit(fs1Var, nktVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof hpt) {
                    hptVar = (hpt) lnmVar;
                    int i19 = hptVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        hptVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        hptVar = new hpt(this, lnmVar);
                    }
                } else {
                    hptVar = new hpt(this, lnmVar);
                }
                Object obj11 = hptVar.a;
                int i20 = hptVar.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                if (!((PlayerState) obj).track().c()) {
                    return rih1Var;
                }
                hptVar.b = 1;
                return vr20Var.emit(obj, hptVar) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof ipt) {
                    iptVar = (ipt) lnmVar;
                    int i21 = iptVar.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        iptVar.b = i21 - Integer.MIN_VALUE;
                    } else {
                        iptVar = new ipt(this, lnmVar);
                    }
                } else {
                    iptVar = new ipt(this, lnmVar);
                }
                Object obj12 = iptVar.a;
                int i22 = iptVar.b;
                if (i22 == 0) {
                    hm5.M(obj12);
                    Object objB = ((PlayerState) obj).track().b();
                    iptVar.b = 1;
                    return vr20Var.emit(objB, iptVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof upt) {
                    uptVar = (upt) lnmVar;
                    int i23 = uptVar.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        uptVar.b = i23 - Integer.MIN_VALUE;
                    } else {
                        uptVar = new upt(this, lnmVar);
                    }
                } else {
                    uptVar = new upt(this, lnmVar);
                }
                Object obj13 = uptVar.a;
                int i24 = uptVar.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                Boolean bool = (Boolean) ((cma1) obj).a;
                Boolean boolValueOf3 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                uptVar.b = 1;
                return vr20Var.emit(boolValueOf3, uptVar) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof jst) {
                    jstVar = (jst) lnmVar;
                    int i25 = jstVar.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        jstVar.b = i25 - Integer.MIN_VALUE;
                    } else {
                        jstVar = new jst(this, lnmVar);
                    }
                } else {
                    jstVar = new jst(this, lnmVar);
                }
                Object obj14 = jstVar.a;
                int i26 = jstVar.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                jstVar.b = 1;
                return vr20Var.emit(obj, jstVar) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof eut) {
                    eutVar = (eut) lnmVar;
                    int i27 = eutVar.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        eutVar.b = i27 - Integer.MIN_VALUE;
                    } else {
                        eutVar = new eut(this, lnmVar);
                    }
                } else {
                    eutVar = new eut(this, lnmVar);
                }
                Object obj15 = eutVar.a;
                int i28 = eutVar.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry2 : map.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    re9 re9Var = ((nya) entry2.getValue()).a;
                    arrayList.add(new cut(str2, re9Var.c, re9Var.b.b, re9Var.d));
                }
                Set setP1 = o7h.p1(arrayList);
                eutVar.b = 1;
                return vr20Var.emit(setP1, eutVar) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof tut) {
                    tutVar = (tut) lnmVar;
                    int i29 = tutVar.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        tutVar.b = i29 - Integer.MIN_VALUE;
                    } else {
                        tutVar = new tut(this, lnmVar);
                    }
                } else {
                    tutVar = new tut(this, lnmVar);
                }
                Object obj16 = tutVar.a;
                int i30 = tutVar.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                List list = (List) obj;
                list.getClass();
                List list2 = list;
                for (Object obj17 : list2) {
                    if (((l0l) obj17).l()) {
                        bytVar = obj17;
                        l0lVar = (l0l) bytVar;
                        if ((l0lVar != null || !l0lVar.isActive()) && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                            it = list2.iterator();
                            while (it.hasNext()) {
                                if (((l0l) it.next()).isActive()) {
                                    z = true;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z);
                        tutVar.b = 1;
                        if (vr20Var.emit(boolValueOf, tutVar) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                l0lVar = (l0l) bytVar;
                if (l0lVar != null) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (((l0l) it.next()).isActive()) {
                            z = true;
                        }
                    }
                } else {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (((l0l) it.next()).isActive()) {
                            z = true;
                        }
                    }
                }
                boolValueOf = Boolean.valueOf(z);
                tutVar.b = 1;
                if (vr20Var.emit(boolValueOf, tutVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 15:
                if (lnmVar instanceof vut) {
                    vutVar = (vut) lnmVar;
                    int i31 = vutVar.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        vutVar.b = i31 - Integer.MIN_VALUE;
                    } else {
                        vutVar = new vut(this, lnmVar);
                    }
                } else {
                    vutVar = new vut(this, lnmVar);
                }
                Object obj18 = vutVar.a;
                int i32 = vutVar.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                mmr0 mmr0Var = (mmr0) obj;
                Set<cut> set = (Set) mmr0Var.a;
                List list3 = (List) mmr0Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (cut cutVar : set) {
                    Iterator it2 = list3.iterator();
                    do {
                        if (it2.hasNext()) {
                            next = it2.next();
                            str = cutVar.a;
                            locale = Locale.ROOT;
                        } else {
                            next = null;
                        }
                        jql1Var = (jql1) next;
                        if (jql1Var != null) {
                            azaVar = new aza(cutVar, jql1Var);
                        } else {
                            azaVar = null;
                        }
                        if (azaVar != null) {
                            arrayList2.add(azaVar);
                        }
                    } while (!str.toLowerCase(locale).equals(((jql1) next).a.toLowerCase(locale)));
                    jql1Var = (jql1) next;
                    if (jql1Var != null) {
                        azaVar = new aza(cutVar, jql1Var);
                    } else {
                        azaVar = null;
                    }
                    if (azaVar != null) {
                        arrayList2.add(azaVar);
                    }
                }
                Set setP2 = o7h.p1(arrayList2);
                vutVar.b = 1;
                return vr20Var.emit(setP2, vutVar) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof xut) {
                    xutVar = (xut) lnmVar;
                    int i33 = xutVar.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        xutVar.b = i33 - Integer.MIN_VALUE;
                    } else {
                        xutVar = new xut(this, lnmVar);
                    }
                } else {
                    xutVar = new xut(this, lnmVar);
                }
                Object obj19 = xutVar.a;
                int i34 = xutVar.b;
                if (i34 == 0) {
                    hm5.M(obj19);
                    List listK0 = z561.k0(new sgg1(zlt.V0, z561.T(zlt.U0, z561.T(zlt.T0, z561.T(zlt.S0, new i46(((c7l) obj).c, (byte) 1))))));
                    xutVar.b = 1;
                    return vr20Var.emit(listK0, xutVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof hyt) {
                    hytVar = (hyt) lnmVar;
                    int i35 = hytVar.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        hytVar.b = i35 - Integer.MIN_VALUE;
                    } else {
                        hytVar = new hyt(this, lnmVar);
                    }
                } else {
                    hytVar = new hyt(this, lnmVar);
                }
                Object obj20 = hytVar.a;
                int i36 = hytVar.b;
                if (i36 == 0) {
                    hm5.M(obj20);
                    nnr nnrVar = (nnr) ((spq0) obj).h();
                    if (nnrVar != null) {
                        int iOrdinal = nnrVar.B.a.d.ordinal();
                        if (iOrdinal == 0) {
                            bytVar = new byt(false);
                        } else if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                            bytVar = new byt(true);
                        } else if (iOrdinal != 4) {
                            eg.o();
                        }
                    }
                    if (bytVar == null) {
                        return rih1Var;
                    }
                    hytVar.b = 1;
                    return vr20Var.emit(bytVar, hytVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof jyt) {
                    jytVar = (jyt) lnmVar;
                    int i37 = jytVar.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        jytVar.b = i37 - Integer.MIN_VALUE;
                    } else {
                        jytVar = new jyt(this, lnmVar);
                    }
                } else {
                    jytVar = new jyt(this, lnmVar);
                }
                Object obj21 = jytVar.a;
                int i38 = jytVar.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    cyt cytVar = new cyt((Set) obj);
                    jytVar.b = 1;
                    return vr20Var.emit(cytVar, jytVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof kyt) {
                    kytVar = (kyt) lnmVar;
                    int i39 = kytVar.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        kytVar.b = i39 - Integer.MIN_VALUE;
                    } else {
                        kytVar = new kyt(this, lnmVar);
                    }
                } else {
                    kytVar = new kyt(this, lnmVar);
                }
                Object obj22 = kytVar.a;
                int i40 = kytVar.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                List list4 = (List) obj;
                list4.getClass();
                ArrayList<l0l> arrayList3 = new ArrayList();
                for (Object obj23 : list4) {
                    l0l l0lVar2 = (l0l) obj23;
                    if (!l0lVar2.l() && !l0lVar2.o() && l0lVar2.n() && !ihc1.y0(l0lVar2.d())) {
                        arrayList3.add(obj23);
                    }
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                for (l0l l0lVar3 : arrayList3) {
                    arrayList4.add(new o89(l0lVar3.d(), l0lVar3.getName(), l0lVar3.getType(), l0lVar3.f()));
                }
                Set setP3 = o7h.p1(arrayList4);
                kytVar.b = 1;
                return vr20Var.emit(setP3, kytVar) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof lyt) {
                    lytVar = (lyt) lnmVar;
                    int i41 = lytVar.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        lytVar.b = i41 - Integer.MIN_VALUE;
                    } else {
                        lytVar = new lyt(this, lnmVar);
                    }
                } else {
                    lytVar = new lyt(this, lnmVar);
                }
                Object obj24 = lytVar.a;
                int i42 = lytVar.b;
                if (i42 == 0) {
                    hm5.M(obj24);
                    dyt dytVar = new dyt((Set) obj);
                    lytVar.b = 1;
                    return vr20Var.emit(dytVar, lytVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof myt) {
                    mytVar = (myt) lnmVar;
                    int i43 = mytVar.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        mytVar.b = i43 - Integer.MIN_VALUE;
                    } else {
                        mytVar = new myt(this, lnmVar);
                    }
                } else {
                    mytVar = new myt(this, lnmVar);
                }
                Object obj25 = mytVar.a;
                int i44 = mytVar.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                eyt eytVar = new eyt(bool2.booleanValue());
                mytVar.b = 1;
                return vr20Var.emit(eytVar, mytVar) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof nyt) {
                    nytVar = (nyt) lnmVar;
                    int i45 = nytVar.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        nytVar.b = i45 - Integer.MIN_VALUE;
                    } else {
                        nytVar = new nyt(this, lnmVar);
                    }
                } else {
                    nytVar = new nyt(this, lnmVar);
                }
                Object obj26 = nytVar.a;
                int i46 = nytVar.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                pok0 pok0Var = (pok0) obj;
                ayt aytVar = new ayt(pok0Var.a, pok0Var.b);
                nytVar.b = 1;
                return vr20Var.emit(aytVar, nytVar) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof oyt) {
                    oytVar = (oyt) lnmVar;
                    int i47 = oytVar.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        oytVar.b = i47 - Integer.MIN_VALUE;
                    } else {
                        oytVar = new oyt(this, lnmVar);
                    }
                } else {
                    oytVar = new oyt(this, lnmVar);
                }
                Object obj27 = oytVar.a;
                int i48 = oytVar.b;
                if (i48 == 0) {
                    hm5.M(obj27);
                    fyt fytVar = new fyt((h5u0) obj);
                    oytVar.b = 1;
                    return vr20Var.emit(fytVar, oytVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof a6u) {
                    a6uVar = (a6u) lnmVar;
                    int i49 = a6uVar.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        a6uVar.b = i49 - Integer.MIN_VALUE;
                    } else {
                        a6uVar = new a6u(this, lnmVar);
                    }
                } else {
                    a6uVar = new a6u(this, lnmVar);
                }
                Object obj28 = a6uVar.a;
                int i50 = a6uVar.b;
                if (i50 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf4 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    a6uVar.b = 1;
                    return vr20Var.emit(boolValueOf4, a6uVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof h7u) {
                    h7uVar = (h7u) lnmVar;
                    int i51 = h7uVar.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        h7uVar.b = i51 - Integer.MIN_VALUE;
                    } else {
                        h7uVar = new h7u(this, lnmVar);
                    }
                } else {
                    h7uVar = new h7u(this, lnmVar);
                }
                Object obj29 = h7uVar.a;
                int i52 = h7uVar.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                h7uVar.b = 1;
                return vr20Var.emit(obj, h7uVar) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof pmu) {
                    pmuVar = (pmu) lnmVar;
                    int i53 = pmuVar.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        pmuVar.b = i53 - Integer.MIN_VALUE;
                    } else {
                        pmuVar = new pmu(this, lnmVar);
                    }
                } else {
                    pmuVar = new pmu(this, lnmVar);
                }
                Object obj30 = pmuVar.a;
                int i54 = pmuVar.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                PlayerState playerState = (PlayerState) obj;
                playerState.getClass();
                Boolean boolValueOf5 = Boolean.valueOf(o4p1.t(playerState));
                pmuVar.b = 1;
                return vr20Var.emit(boolValueOf5, pmuVar) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof vmu) {
                    vmuVar = (vmu) lnmVar;
                    int i55 = vmuVar.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        vmuVar.b = i55 - Integer.MIN_VALUE;
                    } else {
                        vmuVar = new vmu(this, lnmVar);
                    }
                } else {
                    vmuVar = new vmu(this, lnmVar);
                }
                Object obj31 = vmuVar.a;
                int i56 = vmuVar.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                if (!((PlayerState) obj).track().c()) {
                    return rih1Var;
                }
                vmuVar.b = 1;
                return vr20Var.emit(obj, vmuVar) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof wmu) {
                    wmuVar = (wmu) lnmVar;
                    int i57 = wmuVar.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        wmuVar.b = i57 - Integer.MIN_VALUE;
                    } else {
                        wmuVar = new wmu(this, lnmVar);
                    }
                } else {
                    wmuVar = new wmu(this, lnmVar);
                }
                Object obj32 = wmuVar.a;
                int i58 = wmuVar.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                PlayerState playerState2 = (PlayerState) obj;
                playerState2.getClass();
                smu smuVar = (o4p1.C(playerState2) && (contextTrack = (ContextTrack) playerState2.track().h()) != null && nhc1.Y(contextTrack.uri(), "spotify:media:", false)) ? o4p1.x(playerState2) ? tmu.a : smu.a : rmu.a;
                wmuVar.b = 1;
                return vr20Var.emit(smuVar, wmuVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof xmu) {
                    xmuVar = (xmu) lnmVar;
                    int i59 = xmuVar.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        xmuVar.b = i59 - Integer.MIN_VALUE;
                    } else {
                        xmuVar = new xmu(this, lnmVar);
                    }
                } else {
                    xmuVar = new xmu(this, lnmVar);
                }
                Object obj33 = xmuVar.a;
                int i60 = xmuVar.b;
                if (i60 == 0) {
                    hm5.M(obj33);
                    Boolean boolValueOf6 = Boolean.valueOf(((umu) obj) instanceof tmu);
                    xmuVar.b = 1;
                    return vr20Var.emit(boolValueOf6, xmuVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj33);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ k9t(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
