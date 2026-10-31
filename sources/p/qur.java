package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class qur implements Update {
    public final /* synthetic */ kzt a;

    public qur(kzt kztVar) {
        this.a = kztVar;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0205  */
    /* JADX WARN: Code duplicated, block: B:162:0x0282  */
    /* JADX WARN: Code duplicated, block: B:164:0x0288  */
    /* JADX WARN: Code duplicated, block: B:170:0x0299  */
    /* JADX WARN: Code duplicated, block: B:175:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:205:0x0354  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ea  */
    public final Next a(Object obj, Object obj2) {
        nxt nxtVarD;
        iwc1 iwc1Var;
        mmr0 mmr0Var;
        long j;
        t0z t0zVar;
        mmr0 nztVar;
        iwc1 iwc1Var2;
        boolean z;
        boolean z2;
        Long lValueOf;
        Long l;
        boolean z3;
        rxt rxtVar;
        boolean zContains;
        boolean z4;
        szt sztVar = (szt) obj;
        gyt gytVar = (gyt) obj2;
        rzt rztVar = sztVar.d;
        kzt kztVar = this.a;
        yqg yqgVar = kztVar.a;
        Map map = sztVar.a.a;
        qzt qztVar = sztVar.b;
        long j2 = qztVar.d;
        long j3 = qztVar.e;
        pzt pztVar = sztVar.c;
        h5u0 h5u0Var = pztVar.b;
        Set set = pztVar.a;
        boolean z5 = gytVar instanceof dyt;
        qxt qxtVar = qxt.a;
        if (z5) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Set set2 = ((dyt) gytVar).a;
            bxt bxtVar = qztVar.a;
            String strD = bxtVar != null ? bxtVar.d() : null;
            if (strD == null) {
                zContains = false;
            } else {
                Set set3 = set;
                ArrayList arrayList = new ArrayList(q7h.U(set3, 10));
                Iterator it = set3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o89) it.next()).a);
                }
                Set set4 = set2;
                ArrayList arrayList2 = new ArrayList(q7h.U(set4, 10));
                Iterator it2 = set4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((o89) it2.next()).a);
                }
                zContains = o7h.K0(arrayList, arrayList2).contains(strD);
            }
            Set set5 = set2;
            if ((set5 instanceof Collection) && set5.isEmpty()) {
                z4 = false;
            } else {
                Iterator it3 = set5.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        o89 o89Var = (o89) it3.next();
                        Set set6 = set;
                        if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                            Iterator it4 = set6.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (u890.j(((o89) it4.next()).a, o89Var.a)) {
                                    }
                                }
                            }
                        }
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
            if (zContains || z4) {
                rxt rxtVar2 = (rztVar.d && !set2.isEmpty()) ? new rxt(true, h5u0Var != null ? h5u0Var.a : false) : null;
                if (rxtVar2 != null) {
                    linkedHashSet.add(rxtVar2);
                }
                linkedHashSet.add(qxtVar);
            }
            return Next.i(szt.a(sztVar, null, null, pzt.a(pztVar, set2, null, false, null, null, null, false, 126), 11), linkedHashSet);
        }
        if (gytVar instanceof cyt) {
            return Next.i(szt.a(sztVar, null, qzt.a(qztVar, null, null, ((cyt) gytVar).a, 0L, j3 + 1, 11), null, 13), Collections.singleton(qxtVar));
        }
        if (gytVar instanceof byt) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            boolean z6 = ((byt) gytVar).a;
            Long lValueOf2 = z6 ? Long.valueOf(yqgVar.b()) : null;
            if (!z6) {
                rxt rxtVar3 = (rztVar.d && !set.isEmpty()) ? new rxt(false, h5u0Var != null ? h5u0Var.a : false) : null;
                if (rxtVar3 != null) {
                    linkedHashSet2.add(rxtVar3);
                }
            }
            linkedHashSet2.add(qxtVar);
            return Next.i(szt.a(sztVar, null, null, pzt.a(pztVar, null, null, z6, lValueOf2, null, null, false, 115), 11), linkedHashSet2);
        }
        if (gytVar instanceof eyt) {
            return Next.i(szt.a(sztVar, null, null, pzt.a(pztVar, null, null, false, null, null, null, ((eyt) gytVar).a, 63), 11), Collections.singleton(qxtVar));
        }
        if (gytVar instanceof fyt) {
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            Map mapP = pztVar.f;
            h5u0 h5u0Var2 = ((fyt) gytVar).a;
            if (!((h5u0Var2 != null ? h5u0Var2.b : null) instanceof e5u0)) {
                z = false;
            } else if (u890.j(h5u0Var != null ? h5u0Var.b : null, h5u0Var2.b)) {
                z = false;
            } else {
                z = true;
            }
            if (!((h5u0Var != null ? h5u0Var.b : null) instanceof e5u0)) {
                z2 = false;
            } else if (h5u0Var.b.equals(h5u0Var2 != null ? h5u0Var2.b : null)) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z7 = !(h5u0Var != null && h5u0Var.a && (h5u0Var.b instanceof d5u0)) && (h5u0Var2 != null && h5u0Var2.a && (h5u0Var2.b instanceof d5u0));
            boolean z8 = (h5u0Var != null ? h5u0Var.c : 0) != (h5u0Var2 != null ? h5u0Var2.c : 0);
            f5u0 f5u0Var = h5u0Var != null ? h5u0Var.b : null;
            e5u0 e5u0Var = f5u0Var instanceof e5u0 ? (e5u0) f5u0Var : null;
            String str = e5u0Var != null ? e5u0Var.a : null;
            if (z2 && str != null) {
                mapP = sqg0.P(mapP, new mmr0(str, Long.valueOf(yqgVar.b())));
            }
            Map map2 = mapP;
            if (!z) {
                if (h5u0Var2.b instanceof e5u0) {
                    lValueOf = pztVar.e;
                } else {
                    l = null;
                }
                if (z7) {
                    z3 = h5u0Var2.a;
                    if (rztVar.d || set.isEmpty()) {
                        rxtVar = null;
                    } else {
                        rxtVar = new rxt(true, z3);
                    }
                    if (rxtVar != null) {
                        linkedHashSet3.add(rxtVar);
                    }
                }
                if (z || z2 || z7 || z8) {
                    linkedHashSet3.add(qxtVar);
                }
                return Next.i(szt.a(sztVar, null, null, pzt.a(pztVar, null, h5u0Var2, false, null, l, map2, false, 77), 11), linkedHashSet3);
            }
            lValueOf = Long.valueOf(yqgVar.b());
            l = lValueOf;
            if (z7) {
                z3 = h5u0Var2.a;
                if (rztVar.d) {
                    rxtVar = null;
                } else {
                    rxtVar = new rxt(true, z3);
                }
                if (rxtVar != null) {
                    linkedHashSet3.add(rxtVar);
                }
            }
            if (z) {
                linkedHashSet3.add(qxtVar);
            } else {
                linkedHashSet3.add(qxtVar);
            }
            return Next.i(szt.a(sztVar, null, null, pzt.a(pztVar, null, h5u0Var2, false, null, l, map2, false, 77), 11), linkedHashSet3);
        }
        if (gytVar instanceof ayt) {
            ayt aytVar = (ayt) gytVar;
            return Next.i(szt.a(sztVar, null, qzt.a(qztVar, aytVar.a, aytVar.b, null, j2 + 1, 0L, 20), null, 13), Collections.singleton(qxtVar));
        }
        mmr0 mmr0Var2 = null;
        int i = 2;
        if (gytVar instanceof zxt) {
            boolean z9 = h5u0Var != null ? h5u0Var.a : false;
            set.isEmpty();
            return Next.a(dm61.B0(new sxt[]{new rxt(true, z9), qxtVar}));
        }
        if (!(gytVar instanceof yxt)) {
            eg.o();
            return null;
        }
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        t0z<oxt> t0zVar2 = oxt.c;
        int iS = zno1.s(q7h.U(t0zVar2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        Iterator it5 = t0zVar2.iterator();
        while (it5.hasNext()) {
            Object next = it5.next();
            oxt oxtVar = (oxt) next;
            System.out.println(oxtVar);
            bxt bxtVar2 = qztVar.a;
            mmr0 mmr0Var3 = (bxtVar2 == null || (iwc1Var2 = qztVar.b) == null) ? mmr0Var2 : new mmr0(bxtVar2, iwc1Var2);
            if (mmr0Var3 == null) {
                mmr0Var = mmr0Var2;
                t0zVar = t0zVar2;
                it5 = it5;
                nztVar = mmr0Var;
            } else {
                Object obj3 = mmr0Var3.b;
                bxt bxtVarF = (bxt) mmr0Var3.a;
                if (kztVar.d(bxtVarF, sztVar) != null) {
                    mmr0Var = mmr0Var2;
                    t0zVar = t0zVar2;
                    it5 = it5;
                    nztVar = mmr0Var;
                } else {
                    nzt nztVar2 = (nzt) map.get(oxtVar);
                    iwc1 iwc1Var3 = (iwc1) obj3;
                    int iOrdinal = iwc1Var3.ordinal();
                    mmr0Var = mmr0Var2;
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        j = j2;
                    } else {
                        if (iOrdinal != i) {
                            eg.o();
                            return mmr0Var;
                        }
                        j = j3;
                    }
                    if (nztVar2 != null) {
                        iwc1 iwc1Var4 = nztVar2.b;
                        bxt bxtVar3 = nztVar2.a;
                        t0zVar = t0zVar2;
                        if (mmr0Var3.equals(new mmr0(kzt.f(bxtVar3, bxtVarF.e()), iwc1Var4))) {
                            nztVar = new nzt(bxtVar3, iwc1Var4, j);
                        }
                    } else {
                        t0zVar = t0zVar2;
                    }
                    if (bxtVarF.e().length() == 0) {
                        bxtVarF = kzt.f(bxtVarF, UUID.randomUUID().toString());
                    }
                    nztVar = new nzt(bxtVarF, iwc1Var3, j);
                }
            }
            linkedHashMap.put(next, nztVar);
            it5 = it5;
            mmr0Var2 = mmr0Var;
            t0zVar2 = t0zVar;
            i = 2;
        }
        mmr0 mmr0Var4 = mmr0Var2;
        for (oxt oxtVar2 : t0zVar2) {
            nzt nztVar3 = (nzt) map.get(oxtVar2);
            mmr0 mmr0Var5 = nztVar3 != null ? nztVar3.a : mmr0Var4;
            nzt nztVar4 = (nzt) linkedHashMap.get(oxtVar2);
            mmr0 mmr0Var6 = nztVar4 != null ? nztVar4.a : mmr0Var4;
            if (mmr0Var5 != null && !u890.j(mmr0Var6, mmr0Var5)) {
                if (mmr0Var6 != null) {
                    nxtVarD = lxt.a;
                } else {
                    System.out.println(oxtVar2);
                    bxt bxtVar4 = qztVar.a;
                    mmr0 mmr0Var7 = (bxtVar4 == null || (iwc1Var = qztVar.b) == null) ? mmr0Var4 : new mmr0(bxtVar4, iwc1Var);
                    mmr0 mmr0Var8 = mmr0Var7 != null ? (bxt) mmr0Var7.a : mmr0Var4;
                    mxt mxtVar = mxt.a;
                    if (mmr0Var8 == null || (nxtVarD = kztVar.d(mmr0Var8, sztVar)) == null) {
                        nxtVarD = mxtVar;
                    }
                }
                linkedHashSet4.add(new pxt(oxtVar2, mmr0Var5, nxtVarD));
            }
        }
        return Next.i(szt.a(sztVar, new ozt(linkedHashMap), mmr0Var4, mmr0Var4, 14), linkedHashSet4);
    }
}
