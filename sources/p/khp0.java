package p;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class khp0 implements ihp0 {
    public final char A;
    public final aip0 a;
    public final o8n b;
    public final int c;
    public final bk20 d;
    public volatile z1c e;
    public final LinkedHashMap f;
    public final dbm g;
    public final Set h;
    public final Set i;
    public final ConcurrentHashMap j;
    public final AtomicLong k;
    public final ConcurrentHashMap l;
    public final ConcurrentHashMap m;
    public final ConcurrentHashMap n;
    public final ConcurrentHashMap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f51p;
    public final ConcurrentHashMap q;
    public final ConcurrentHashMap r;
    public final ConcurrentLinkedDeque s;
    public final yzu t;
    public final llm u;
    public final y580 v;
    public final AtomicInteger w;
    public final zpj0 x;
    public myq0 y;
    public faa0 z;

    static {
        new yla((byte) 18);
    }

    public khp0(aip0 aip0Var) {
        Set set;
        List listR = w8p1.r();
        List listU = w8p1.u();
        fns fnsVar = igu.a;
        List listT = w8p1.t();
        bk20 bk20Var = bk20.P0;
        this.a = aip0Var;
        this.b = fnsVar;
        this.c = 300000000;
        this.d = bk20Var;
        List list = listT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((vgp0) obj).a;
            Object objH = linkedHashMap.get(str);
            if (objH == null) {
                objH = cfm0.h(str, linkedHashMap);
            }
            ((List) objH).add(obj);
        }
        this.f = linkedHashMap;
        this.g = new dbm((byte) 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            set = w7x.a;
            if (!zHasNext) {
                break;
            }
            Set set2 = (Set) ((vgp0) it.next()).d.get(qm81.TRACE);
            if (set2 != null) {
                set = set2;
            }
            r7h.W(set, arrayList);
        }
        this.h = o7h.p1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Set set3 = (Set) ((vgp0) it2.next()).d.get(qm81.EVENT);
            if (set3 == null) {
                set3 = set;
            }
            r7h.W(set3, arrayList2);
        }
        this.i = o7h.p1(arrayList2);
        this.j = new ConcurrentHashMap();
        this.k = new AtomicLong(0L);
        this.l = new ConcurrentHashMap();
        this.m = new ConcurrentHashMap();
        this.n = new ConcurrentHashMap();
        this.o = new ConcurrentHashMap();
        this.f51p = new ConcurrentHashMap();
        this.q = new ConcurrentHashMap();
        this.r = new ConcurrentHashMap();
        this.s = new ConcurrentLinkedDeque();
        this.t = new yzu(this.a);
        llm llmVarE = smo1.e(ha71.A(guo1.B(), this.b).y(new z8n("ObservationPlatformImpl")));
        this.u = llmVarE;
        this.v = y580.k1;
        this.w = new AtomicInteger(0);
        this.A = (char) 60000;
        yla.l(listT);
        c921.y(llmVarE, (o8n) null, 0, new k53(this, (lnm) null, (byte) 21), 3);
        this.x = new zpj0(o7h.N0(listU, listR), new mdp0(this.a, (byte) 20), new mdp0(this.a, (byte) 21), this, this.b);
    }

    public final void A(wgp0 wgp0Var) {
        ConcurrentHashMap concurrentHashMap = this.m;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            UUID uuid = (UUID) entry.getKey();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) entry.getValue();
            if (copyOnWriteArrayList.remove(wgp0Var)) {
                if (copyOnWriteArrayList.isEmpty()) {
                    concurrentHashMap.remove(uuid);
                    return;
                }
                return;
            }
        }
    }

    @Override // p.ihp0
    public final mr20 a() {
        return k4p1.B((jfe) this.a.a.getValue());
    }

    @Override // p.ihp0
    public final void b(kj41 kj41Var, String str) {
    }

    @Override // p.ihp0
    public final void c(nif1 nif1Var, String str) {
    }

    @Override // p.ihp0
    public final nan e(String str, kqj0 kqj0Var) {
        opj0 opj0Var = opj0.b;
        zpj0 zpj0Var = this.x;
        return new pan(zpj0Var.h(str, opj0Var, kqj0Var), zpj0Var);
    }

    @Override // p.ihp0
    public final kj41 f(String str, UUID uuid) {
        faa0 faa0Var;
        long j;
        long j2;
        String str2 = str;
        lj41 lj41Var = new lj41(uuid, str2, this);
        List list = (List) this.f.get(str2);
        if (list != null) {
            ArrayList<vgp0> arrayList = new ArrayList();
            for (Object obj : list) {
                if (this.g.g((vgp0) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                long jA = this.a.a();
                this.a.getClass();
                long jM = b9p1.m(System.currentTimeMillis());
                lj41Var.d(jA);
                boolean zIsEmpty = this.l.isEmpty();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                for (vgp0 vgp0Var : arrayList) {
                    wgp0 wgp0Var = new wgp0(str2, vgp0Var, this.a, jA, jM);
                    wgp0Var.h.g.put("build_variant", "release");
                    this.l.put(wgp0Var.d, wgp0Var);
                    Collection collection = (Set) vgp0Var.d.get(qm81.TRACE);
                    if (collection == null) {
                        collection = w7x.a;
                    }
                    this.j.put(wgp0Var.d, collection);
                    Iterator it = this.n.entrySet().iterator();
                    while (it.hasNext()) {
                        qif1 qif1Var = (qif1) ((Map.Entry) it.next()).getValue();
                        wgp0Var.a(qif1Var.e);
                        qif1Var.h = true;
                    }
                    zpj0 zpj0Var = this.x;
                    synchronized (zpj0Var.m) {
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            for (mmr0 mmr0Var : zpj0Var.j.o()) {
                                jA = jA;
                                String str3 = (String) mmr0Var.a;
                                a6e a6eVar = (a6e) mmr0Var.b;
                                npj0 npj0VarN = zpj0Var.j.n(str3);
                                if (npj0VarN != null) {
                                    long j3 = jM;
                                    ArrayList arrayListD = zpj0Var.d(wgp0Var, npj0VarN, a6eVar.a());
                                    if (!arrayListD.isEmpty()) {
                                        r7h.W(arrayListD, arrayList2);
                                        Function0 function0 = (Function0) zpj0Var.h.get(str3);
                                        if (function0 != null) {
                                            zpj0.e(arrayListD, function0);
                                        }
                                    }
                                    jM = j3;
                                }
                            }
                            j = jA;
                            j2 = jM;
                            Iterator it2 = zpj0Var.i.iterator();
                            while (it2.hasNext()) {
                                ypj0 ypj0Var = (ypj0) it2.next();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : arrayList2) {
                                    Iterator it3 = it2;
                                    if (ypj0Var.b().contains(((mqj0) obj2).e().a)) {
                                        arrayList3.add(obj2);
                                    }
                                    it2 = it3;
                                }
                                Iterator it4 = it2;
                                zpj0.f(arrayList3, ypj0Var.a());
                                it2 = it4;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Set set = (Set) vgp0Var.d.get(qm81.EVENT);
                    if (set == null) {
                        set = w7x.a;
                    }
                    wgp0Var.g = this.t.w(set);
                    copyOnWriteArrayList.add(wgp0Var);
                    if (vgp0Var.d.containsKey(qm81.TIME_SERIES) && this.w.incrementAndGet() == 1) {
                        this.v.getClass();
                    }
                    str2 = str;
                    jA = j;
                    jM = j2;
                }
                this.m.put(uuid, copyOnWriteArrayList);
                z();
                if (zIsEmpty && ((faa0Var = this.z) == null || !faa0Var.isActive())) {
                    this.z = c921.y(this.u, (o8n) null, 0, new cto0(this, (lnm) null, (byte) 6), 3);
                }
            }
        }
        return lj41Var;
    }

    @Override // p.ihp0
    public final boolean g(oif1 oif1Var) {
        return this.h.contains(oif1Var.a);
    }

    @Override // p.ihp0
    public final kj41 h(String str) {
        return (kj41) this.o.remove(str);
    }

    @Override // p.ihp0
    public final void i(ByteBuffer byteBuffer, long j) {
        this.e = new z1c(byteBuffer, j);
    }

    @Override // p.ihp0
    public final tga j(List list, iu30 iu30Var) {
        ix7 ix7Var;
        zpj0 zpj0Var = this.x;
        synchronized (zpj0Var.m) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    npj0 npj0Var = (npj0) it.next();
                    npj0 npj0Var2 = (npj0) zpj0Var.j.E(npj0Var.b(), npj0Var.a(), npj0Var.c()).a;
                    a6e a6eVarK = zpj0Var.j.k(npj0Var.b());
                    if (a6eVarK != null) {
                        r7h.W(zpj0Var.c(npj0Var2, a6eVarK.a()), arrayList);
                    }
                }
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((npj0) it2.next()).b());
                }
                zpj0Var.i.add(new ypj0(uuidRandomUUID, o7h.p1(arrayList2), iu30Var));
                zpj0.f(arrayList, iu30Var);
                ix7Var = new ix7(uuidRandomUUID, new lbc0(zpj0Var, (byte) 23));
            } catch (Throwable th) {
                throw th;
            }
        }
        return ix7Var;
    }

    @Override // p.ihp0
    public final nif1 k(String str, Object obj, Long l) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 0 || cCharAt >= 128) {
                l1d.z("Trace key '", str, "' contains non-ASCII characters. Keys must be ASCII.");
                return wco0.a;
            }
        }
        if (!this.h.contains(str)) {
            return wco0.a;
        }
        String strC = f4i1.c(System.identityHashCode(obj), str);
        ConcurrentHashMap concurrentHashMap = this.n;
        qif1 qif1Var = (qif1) concurrentHashMap.get(strC);
        if (qif1Var != null) {
            return qif1Var;
        }
        qif1 qif1Var2 = new qif1(str, this.a, l, new ocp0(this, strC, (byte) 24), this.d);
        concurrentHashMap.put(strC, qif1Var2);
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            ((wgp0) it.next()).a(qif1Var2.e);
            qif1Var2.h = true;
        }
        return qif1Var2;
    }

    @Override // p.ihp0
    public final nif1 m(String str) {
        return (nif1) this.f51p.remove(str);
    }

    @Override // p.ihp0
    public final void n(yob1 yob1Var) {
        if (this.i.contains(yob1Var.a())) {
            this.t.I(yob1Var);
        }
    }

    @Override // p.ihp0
    public final boolean o(String str) {
        return this.h.contains(str);
    }

    @Override // p.ihp0
    public final x940 q(String str, kqj0 kqj0Var) {
        opj0 opj0Var = opj0.d;
        zpj0 zpj0Var = this.x;
        return new y940(zpj0Var.h(str, opj0Var, kqj0Var), zpj0Var);
    }

    @Override // p.ihp0
    public final egp0 r(String str, kqj0 kqj0Var, Function0 function0) {
        a6e a6eVarK;
        zpj0 zpj0Var = this.x;
        opj0 opj0Var = opj0.d;
        synchronized (zpj0Var.m) {
            zpj0Var.h.put(str, function0);
            mmr0 mmr0VarE = zpj0Var.j.E(str, opj0Var, kqj0Var);
            npj0 npj0Var = (npj0) mmr0VarE.a;
            if (((Boolean) mmr0VarE.b).booleanValue() && (a6eVarK = zpj0Var.j.k(str)) != null) {
                zpj0.e(zpj0Var.c(npj0Var, a6eVarK.a()), function0);
            }
        }
        return new mka((byte) 18);
    }

    @Override // p.ihp0
    public final void s() {
        c921.y(this.u, (o8n) null, 0, new iyb0(this, (lnm) null, (byte) 22), 3);
    }

    @Override // p.ihp0
    public final void t(String str, String str2, Map map) {
        if (this.i.contains(str) && !this.l.isEmpty()) {
            this.t.C(str, str2, map);
        }
    }

    @Override // p.ihp0
    public final kj41 u(String str) {
        this.a.getClass();
        return f(str, UUID.randomUUID());
    }

    @Override // p.ihp0
    public final void unregisterObservableMetric(String str) {
        zpj0 zpj0Var = this.x;
        synchronized (zpj0Var.m) {
            try {
                zpj0Var.h.remove(str);
                LinkedHashMap linkedHashMap = zpj0Var.e;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((mqj0) entry.getValue()).e().a.equals(str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    mqj0 mqj0Var = (mqj0) zpj0Var.e.remove((oqj0) ((Map.Entry) it.next()).getKey());
                    if (mqj0Var != null) {
                        zpj0Var.i(mqj0Var);
                        Long lM = j0p1.m(mqj0Var.e().c);
                        if (lM != null) {
                            zpj0Var.n.s(mqj0Var, lM.longValue());
                        }
                        zpj0Var.k.v(mqj0Var.f());
                        mqj0Var.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.ihp0
    public final void v(long j, long j2) {
        oif1 oif1Var = oif1.HITCHES;
        if (g(oif1Var)) {
            ConcurrentHashMap concurrentHashMap = this.r;
            aom aomVar = (aom) concurrentHashMap.get(oif1Var);
            if (aomVar == null) {
                aomVar = new aom("ui.hitches", this.a, this.d);
                concurrentHashMap.put(oif1Var, aomVar);
            }
            aomVar.d(j, j2, "hitch");
        }
    }

    @Override // p.ihp0
    public final wma1 w(String str, oif1 oif1Var, Long l) {
        if (!g(oif1Var)) {
            return uco0.a;
        }
        ConcurrentHashMap concurrentHashMap = this.r;
        aom aomVar = (aom) concurrentHashMap.get(oif1Var);
        if (aomVar == null) {
            aomVar = new aom(oif1Var.a, this.a, this.d);
            concurrentHashMap.put(oif1Var, aomVar);
        }
        return aomVar.c(l, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    public final void x() {
        long micros;
        long jA = this.a.a();
        Collection collectionValues = this.l.values();
        ArrayList<wgp0> arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (true) {
            Long l = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            wgp0 wgp0Var = (wgp0) next;
            long j = wgp0Var.e;
            Long l2 = wgp0Var.b.f;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                if (1 <= jLongValue && jLongValue < 3601) {
                    l = l2;
                }
                if (l != null) {
                    micros = TimeUnit.SECONDS.toMicros(l.longValue());
                } else {
                    micros = this.c;
                }
            } else {
                micros = this.c;
            }
            if (jA > j && jA - j > micros) {
                arrayList.add(next);
            }
        }
        for (wgp0 wgp0Var2 : arrayList) {
            wgp0Var2.h.g.put("observation_outcome", "duration_capped");
            if (wgp0Var2.c(null)) {
                y(wgp0Var2);
            }
        }
    }

    public final void y(wgp0 wgp0Var) {
        mmr0 mmr0Var;
        wny0 wny0Var;
        wny0 wny0Var2;
        this.l.remove(wgp0Var.d);
        this.j.remove(wgp0Var.d);
        A(wgp0Var);
        vgp0 vgp0Var = wgp0Var.b;
        sqg0.U(wgp0Var.h.g);
        List list = vgp0Var.e;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                pze0.m(it.next());
                throw null;
            }
        }
        long j = wgp0Var.e;
        long j2 = wgp0Var.i;
        Set set = (Set) wgp0Var.b.d.get(qm81.EVENT);
        if (set == null) {
            set = w7x.a;
        }
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry> setEntrySet = this.r.entrySet();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            entry.getClass();
            oif1 oif1Var = (oif1) entry.getKey();
            aom aomVar = (aom) entry.getValue();
            if (g(oif1Var)) {
                aip0 aip0Var = aomVar.b;
                ReentrantLock reentrantLock = aomVar.f;
                reentrantLock.lock();
                try {
                    ArrayList arrayList3 = aomVar.g;
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((xma1) it2.next()).f);
                    }
                    reentrantLock.unlock();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : arrayList4) {
                        yma1 yma1Var = (yma1) obj;
                        long j3 = j;
                        long j4 = yma1Var.d;
                        long j5 = yma1Var.c;
                        if ((j4 > j3 && j5 < j2) || (j4 == 0 && j5 < j2)) {
                            arrayList5.add(obj);
                        }
                        j = j3;
                    }
                    long j6 = j;
                    if (arrayList5.isEmpty()) {
                        wny0Var2 = null;
                        j = j6;
                    } else {
                        aip0Var.getClass();
                        long j7 = j2;
                        wny0Var = new wny0(UUID.randomUUID(), aomVar.a, j6, j7, new CopyOnWriteArrayList(arrayList5), 16);
                        j = j6;
                        j2 = j7;
                        aip0Var.b(wny0Var);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } else {
                wny0Var2 = null;
            }
            if (wny0Var2 != null) {
                wny0Var2 = wny0Var;
                arrayList2.add(wny0Var2);
            } else {
                wny0Var2 = wny0Var;
            }
        }
        arrayList.addAll(arrayList2);
        Collection collectionValues = this.q.values();
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = collectionValues.iterator();
        while (it3.hasNext()) {
            ((toe1) it3.next()).a(j, j2);
        }
        arrayList.addAll(arrayList6);
        sny0 sny0VarF = this.t.F(j, j2, set, wgp0Var.g);
        if (sny0VarF != null) {
            arrayList.add(sny0VarF);
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            wgp0Var.a((ml81) it4.next());
        }
        zpj0 zpj0Var = this.x;
        long j8 = wgp0Var.i;
        long j9 = wgp0Var.j;
        synchronized (zpj0Var.m) {
            try {
                zpj0Var.g(new gpj0(wgp0Var.d), j8);
                Map map = (Map) zpj0Var.f.remove(wgp0Var.d);
                if (map == null) {
                    mmr0Var = new mmr0(z6x.a, w7x.a);
                } else {
                    for (mqj0 mqj0Var : map.values()) {
                        zpj0Var.i(mqj0Var);
                        Long lM = j0p1.m(mqj0Var.e().c);
                        if (lM != null) {
                            zpj0Var.n.s(mqj0Var, lM.longValue());
                        }
                    }
                    Collection collectionValues2 = map.values();
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it5 = collectionValues2.iterator();
                    while (it5.hasNext()) {
                        aqj0 aqj0VarD = ((mqj0) it5.next()).d(1, j8, j9);
                        if (aqj0VarD != null) {
                            arrayList7.add(aqj0VarD);
                        }
                    }
                    Iterator it6 = map.values().iterator();
                    while (it6.hasNext()) {
                        zpj0Var.k.v(((mqj0) it6.next()).f());
                    }
                    ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
                    Iterator it7 = arrayList7.iterator();
                    while (it7.hasNext()) {
                        arrayList8.add(((aqj0) it7.next()).f().b());
                    }
                    mmr0Var = new mmr0(arrayList7, o7h.p1(arrayList8));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        List<aqj0> list2 = (List) mmr0Var.a;
        Set set2 = (Set) mmr0Var.b;
        if (!list2.isEmpty()) {
            khp0 khp0Var = zpj0Var.c;
            for (aqj0 aqj0Var : list2) {
                UUID uuidH = aqj0Var.h();
                if (wgp0Var.b(qm81.METRIC, aqj0Var.c())) {
                    wgp0Var.h.h.put(uuidH, "metric");
                }
                khp0Var.a.b(eth.Y(aqj0Var));
            }
        }
        zpj0Var.k(set2);
        aip0 aip0Var2 = wgp0Var.c;
        uny0 uny0Var = wgp0Var.h;
        aip0Var2.b(new uny0(uny0Var.a, uny0Var.b, uny0Var.c, wgp0Var.e, wgp0Var.i, uny0Var.f, uny0Var.g, uny0Var.h));
        z();
        if (wgp0Var.b.d.containsKey(qm81.TIME_SERIES) && this.w.decrementAndGet() == 0) {
            this.v.getClass();
        }
    }

    public final void z() {
        z1c z1cVar = this.e;
        if (z1cVar == null) {
            return;
        }
        long jIncrementAndGet = this.k.incrementAndGet();
        Collection<Set> collectionValues = this.j.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Set set : collectionValues) {
            set.getClass();
            r7h.W(set, linkedHashSet);
        }
        z1cVar.d(jIncrementAndGet, linkedHashSet);
    }
}
