package p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rzq implements d0r {
    public static final j3r y = new j3r(rih1.a);
    public final ukj0 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final dmh1 c;
    public final zhq0 d;
    public final Object e;
    public final CopyOnWriteArrayList f;
    public int g;
    public UUID h;
    public cmh1 i;
    public final t811 j;
    public final LinkedHashSet k;
    public final LinkedHashSet l;
    public final LinkedHashSet m;
    public final long n;
    public Long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qzq f77p;
    public final yrg0 q;
    public final ConcurrentHashMap r;
    public final AtomicBoolean s;
    public Set t;
    public final AtomicBoolean u;
    public boolean v;
    public long w;
    public long x;

    public rzq(l2r l2rVar, ukj0 ukj0Var) {
        this.a = ukj0Var;
        dmh1 dmh1VarA = l2rVar.a();
        this.c = dmh1VarA;
        this.d = new zhq0((byte) 14);
        this.e = new Object();
        this.f = new CopyOnWriteArrayList();
        this.j = new t811();
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
        this.m = new LinkedHashSet();
        this.n = System.nanoTime();
        this.f77p = new qzq((byte) 0);
        this.q = new yrg0((byte) 2);
        this.r = new ConcurrentHashMap();
        this.s = new AtomicBoolean(false);
        this.i = dmh1VarA.c(new s20(this, (byte) 11));
        this.t = w7x.a;
        this.u = new AtomicBoolean(false);
        this.x = -1L;
    }

    @Override // p.d0r
    public final void a(q0r q0rVar) {
        this.f.add(q0rVar);
    }

    @Override // p.d0r
    public final k1r b(f1r f1rVar) {
        boolean z;
        boolean z2;
        int size;
        List items = f1rVar.getItems();
        boolean z3 = items instanceof Collection;
        Map map = this.j;
        if (!z3 || !items.isEmpty()) {
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                e1r e1rVar = (e1r) it.next();
                if (!e1rVar.a.a() && map.get(e1rVar.a) == null) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        List items2 = f1rVar.getItems();
        if (!(items2 instanceof Collection) || !items2.isEmpty()) {
            Iterator it2 = items2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((e1r) it2.next()).c != null) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (!z && !z2) {
            return f1rVar.a(map);
        }
        boolean z4 = z2;
        nen0 nen0Var = new nen0();
        Map tpg0Var = new tpg0(nen0Var);
        int i = 0;
        for (e1r e1rVar2 : f1rVar.getItems()) {
            ppa0 ppa0Var = e1rVar2.c;
            if (ppa0Var == null || e1rVar2.d == null) {
                size = 0;
            } else {
                size = ppa0Var.a().size();
                if (size < 1) {
                    size = 1;
                }
            }
            i += size + 1;
        }
        zhq0 zhq0Var = this.d;
        ses0 ses0VarA = zhq0Var.a(i);
        try {
            oen0 oen0Var = new oen0();
            n811 n811Var = new n811();
            Iterator it3 = f1rVar.getItems().iterator();
            while (it3.hasNext()) {
                jh5 jh5Var = ((e1r) it3.next()).a;
                k3r k3rVar = (k3r) map.get(jh5Var);
                if (jh5Var.a()) {
                    nen0Var.m(jh5Var, y);
                } else if (k3rVar != null) {
                    nen0Var.m(jh5Var, k3rVar);
                } else if (oen0Var.a(jh5Var)) {
                    int i2 = n811Var.a;
                    n811Var.a = i2 + 1;
                    ses0VarA.p(i2, jh5Var);
                }
            }
            o(ses0VarA, 0, n811Var.a, nen0Var);
            if (z4) {
                oen0 oen0Var2 = new oen0();
                while (true) {
                    int i3 = n811Var.a;
                    l811 l811Var = new l811();
                    Iterator it4 = f1rVar.getItems().iterator();
                    while (it4.hasNext()) {
                        rzq rzqVar = this;
                        ((e1r) it4.next()).a(tpg0Var, new j96(nen0Var, oen0Var2, l811Var, rzqVar, ses0VarA, n811Var, (byte) 7));
                        this = rzqVar;
                    }
                    rzq rzqVar2 = this;
                    if (!l811Var.a) {
                        break;
                    }
                    rzqVar2.o(ses0VarA, i3, n811Var.a, nen0Var);
                    this = rzqVar2;
                }
            }
            return f1rVar.a(tpg0Var);
        } finally {
            zhq0Var.q(ses0VarA);
        }
    }

    @Override // p.d0r
    public final c0r c(f1r f1rVar) {
        int i;
        boolean z;
        synchronized (this.e) {
            if (this.i == null) {
                return new mzq();
            }
            List items = f1rVar.getItems();
            HashSet<jh5> hashSet = new HashSet(((items.size() * 4) / 3) + 1);
            zhq0 zhq0Var = this.d;
            ses0 ses0VarA = zhq0Var.a(items.size());
            try {
                synchronized (this.e) {
                    try {
                        Iterator it = items.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            jh5 jh5Var = ((e1r) it.next()).a;
                            if (hashSet.add(jh5Var)) {
                                boolean zA = jh5Var.a();
                                boolean z2 = !zA && this.j.get(jh5Var) == null;
                                this.j.a.compute(jh5Var, kdz0.c);
                                if (zA) {
                                    this.j.a.compute(jh5Var, new fnq0(y, (byte) 1));
                                } else {
                                    if (this.k.add(jh5Var)) {
                                        this.v = true;
                                        this.w++;
                                    }
                                    if (z2) {
                                        int i2 = i + 1;
                                        ses0VarA.p(i, jh5Var);
                                        i = i2;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i > 0) {
                    try {
                        this.c.b(ses0VarA);
                        synchronized (this.e) {
                            for (int i3 = 0; i3 < i; i3++) {
                                jh5 jh5VarH = ses0VarA.h(i3);
                                if (jh5VarH != null) {
                                    k3r k3rVarO = ses0VarA.o(i3);
                                    if (k3rVarO instanceof j3r) {
                                        this.j.a.compute(jh5VarH, new fnq0(k3rVarO, (byte) 1));
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    } catch (DataSourceException unused) {
                    }
                }
                zhq0Var.q(ses0VarA);
                nzq nzqVar = new nzq(items, hashSet, f1rVar, this);
                synchronized (this.e) {
                    ukj0 ukj0Var = this.a;
                    if (ukj0Var != null) {
                        ukj0Var.j(k(f1rVar, nzqVar));
                    }
                }
                synchronized (this.e) {
                    for (jh5 jh5Var2 : hashSet) {
                        yrg0 yrg0Var = this.q;
                        mmr0 mmr0VarN = oqn1.n(jh5Var2, nzqVar);
                        Object obj = mmr0VarN.a;
                        Object obj2 = mmr0VarN.b;
                        nen0 nen0Var = (nen0) yrg0Var.b;
                        Object objG = nen0Var.g(obj);
                        if (objG == null) {
                            nen0Var.m(obj, obj2);
                        } else if (objG instanceof oen0) {
                            ((oen0) objG).a(obj2);
                        } else if (!objG.equals(obj2)) {
                            oen0 oen0Var = new oen0();
                            oen0Var.a(objG);
                            oen0Var.a(obj2);
                            nen0Var.m(obj, oen0Var);
                        }
                    }
                    try {
                        q(nzqVar);
                        nzqVar.b();
                        z = this.g == 0;
                    } catch (Throwable th2) {
                        boolean z3 = false;
                        for (jh5 jh5Var3 : nzqVar.b) {
                            this.q.o(oqn1.n(jh5Var3, nzqVar));
                            t811 t811Var = this.j;
                            l811 l811Var = new l811();
                            t811Var.a.compute(jh5Var3, new s811(jh5Var3, l811Var));
                            if (l811Var.a && !jh5Var3.a()) {
                                this.k.remove(jh5Var3);
                                this.l.add(jh5Var3);
                                qzq qzqVar = this.f77p;
                                qzqVar.remove(jh5Var3);
                                qzqVar.put(jh5Var3, Long.valueOf(System.nanoTime()));
                                z3 = true;
                            }
                        }
                        if (z3) {
                            this.v = true;
                            this.w++;
                        }
                        throw th2;
                    }
                }
                if (z) {
                    r();
                }
                return nzqVar;
            } catch (Throwable th3) {
                zhq0Var.q(ses0VarA);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.d0r
    public final Object e(zjd1 zjd1Var, List list, lnm lnmVar) {
        onm ozqVar;
        cmh1 cmh1Var;
        if (lnmVar instanceof ozq) {
            ozqVar = (ozq) lnmVar;
            int i = ((ozq) ozqVar).c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ((ozq) ozqVar).c = i - Integer.MIN_VALUE;
            } else {
                ozqVar = new ozq(this, lnmVar);
            }
        } else {
            ozqVar = new ozq(this, lnmVar);
        }
        Object obj = ((ozq) ozqVar).a;
        d9n d9nVar = d9n.a;
        int i2 = ((ozq) ozqVar).c;
        if (i2 == 0) {
            hm5.M(obj);
            synchronized (this.e) {
                cmh1Var = this.i;
            }
            if (cmh1Var == null) {
                eg.m("subscription is null");
                return null;
            }
            List<mmr0> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (mmr0 mmr0Var : list2) {
                Object obj2 = mmr0Var.a;
                arrayList.add(oqn1.n(new jh5(zjd1Var, obj2), mmr0Var.b));
            }
            ((ozq) ozqVar).c = 1;
            if (cmh1Var.c(arrayList, ozqVar) == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    @Override // p.d0r
    public final void f(Function0 function0) {
        boolean z;
        synchronized (this.e) {
            z = true;
            int i = this.g + 1;
            this.g = i;
            if (i == 1 && this.a != null) {
                UUID uuidRandomUUID = UUID.randomUUID();
                this.h = uuidRandomUUID;
                ukj0 ukj0Var = this.a;
                String.valueOf(uuidRandomUUID);
                ukj0Var.getClass();
            }
        }
        try {
            function0.invoke();
            synchronized (this.e) {
                try {
                    int i2 = this.g - 1;
                    this.g = i2;
                    if (i2 != 0) {
                        z = false;
                    }
                    if (z) {
                        if (this.a != null) {
                            String.valueOf(this.h);
                        }
                        this.h = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                p();
            }
        } catch (Throwable th2) {
            synchronized (this.e) {
                try {
                    this.g--;
                    if (this.g != 0) {
                        z = false;
                    }
                    if (z) {
                        if (this.a != null) {
                            String.valueOf(this.h);
                        }
                        this.h = null;
                    }
                    if (z) {
                        p();
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // p.d0r
    public final String g(f1r f1rVar) {
        String string;
        synchronized (this.e) {
            try {
                long jNanoTime = System.nanoTime();
                StringBuilder sb = new StringBuilder();
                sb.append("ageMs=");
                sb.append((jNanoTime - this.n) / 1000000);
                sb.append(" disposed=");
                sb.append(this.i == null);
                Long l = this.o;
                if (l != null) {
                    long jLongValue = l.longValue();
                    sb.append(" disposedMsAgo=");
                    sb.append((jNanoTime - jLongValue) / 1000000);
                }
                for (e1r e1rVar : f1rVar.getItems()) {
                    jh5 jh5Var = e1rVar.a;
                    sb.append("; ");
                    sb.append(i3p1.t(jh5Var));
                    if (e1rVar.c != null) {
                        sb.append(" resolver=true");
                    }
                    sb.append(" slot=");
                    k3r k3rVar = (k3r) this.j.get(jh5Var);
                    sb.append(k3rVar != null ? i3p1.w(k3rVar) : "none");
                    Long l2 = (Long) this.f77p.get(jh5Var);
                    sb.append(" lastFullReleaseMsAgo=");
                    sb.append(l2 != null ? Long.valueOf((jNanoTime - l2.longValue()) / 1000000) : "none");
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // p.d0r
    public final void h(q0r q0rVar) {
        this.f.remove(q0rVar);
    }

    @Override // p.d0r
    public final Map j() {
        ConcurrentHashMap concurrentHashMap = this.j.a;
        xkg0 xkg0Var = new xkg0(concurrentHashMap.size());
        concurrentHashMap.forEach(new p6d(xkg0Var, (byte) 2));
        return xkg0Var.b();
    }

    public final hp21 k(f1r f1rVar, nzq nzqVar) {
        int i;
        String message;
        List<e1r> items = f1rVar.getItems();
        ArrayList arrayList = new ArrayList(q7h.U(items, 10));
        for (e1r e1rVar : items) {
            arrayList.add(new ip21(e1rVar.a.a.toString(), e1rVar.a.b.toString(), eqq.v(e1rVar.b)));
        }
        k1r k1rVar = (k1r) nzqVar.c.getValue();
        boolean z = k1rVar instanceof i1r;
        if (z) {
            i = 2;
        } else if (k1rVar instanceof j1r) {
            i = 1;
        } else {
            if (!(k1rVar instanceof h1r)) {
                eg.o();
                return null;
            }
            i = 3;
        }
        if (z) {
            message = String.valueOf(((i1r) k1rVar).a);
        } else if (k1rVar instanceof j1r) {
            message = "Loading...";
        } else {
            if (!(k1rVar instanceof h1r)) {
                eg.o();
                return null;
            }
            message = ((h1r) k1rVar).a.getMessage();
        }
        UUID uuid = this.h;
        return new hp21(i, message, uuid != null ? uuid.toString() : null, arrayList);
    }

    public final void l() {
        cmh1 cmh1Var;
        synchronized (this.e) {
            cmh1Var = this.i;
            this.i = null;
            if (this.o == null) {
                this.o = Long.valueOf(System.nanoTime());
            }
        }
        if (cmh1Var != null) {
            cmh1Var.dispose();
        }
    }

    public final void m() {
        LinkedHashSet linkedHashSet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (jh5 jh5Var : (jh5[]) this.r.keySet().toArray(new jh5[0])) {
            jh5Var.getClass();
            k3r k3rVar = (k3r) this.r.remove(jh5Var);
            if (k3rVar != null) {
                linkedHashMap.put(jh5Var, k3rVar);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        synchronized (this.e) {
            try {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    this.j.a.compute((jh5) entry.getKey(), new fnq0((k3r) entry.getValue(), (byte) 1));
                }
                linkedHashSet = new LinkedHashSet();
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Object objG = ((nen0) this.q.b).g((jh5) ((Map.Entry) it.next()).getKey());
                    linkedHashSet.addAll(objG == null ? w7x.a : objG instanceof oen0 ? new yl61((oen0) objG) : Collections.singleton(objG));
                }
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    if (q((lzq) it2.next())) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.a != null) {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                jh5 jh5Var2 = (jh5) entry2.getKey();
                k3r k3rVar2 = (k3r) entry2.getValue();
                String string = jh5Var2.a.toString();
                String string2 = jh5Var2.b.toString();
                String strR = rc11.a.b(k3rVar2.getClass()).r();
                if (strR == null) {
                    strR = "Unknown";
                }
                arrayList.add(new svh1(string, string2, strR, k3rVar2.toString()));
            }
            new rvh1(linkedHashMap.size(), arrayList);
        }
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            ((lzq) it3.next()).b();
        }
        if (z) {
            p();
        }
        Set setKeySet = linkedHashMap.keySet();
        if (this.a != null) {
            this.j.a.size();
        }
        Iterator it4 = this.f.iterator();
        while (it4.hasNext()) {
            ((q0r) it4.next()).a(setKeySet);
        }
    }

    public final void n(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.r.merge((jh5) entry.getKey(), (k3r) entry.getValue(), pzq.b);
        }
        if (u890.j(Looper.getMainLooper(), Looper.myLooper())) {
            m();
        } else if (this.s.compareAndSet(false, true)) {
            this.b.post(new g54(this, (byte) 6));
        }
    }

    public final void o(ses0 ses0Var, int i, int i2, nen0 nen0Var) {
        if (i == i2) {
            return;
        }
        try {
            long jK = ses0Var.k();
            try {
                int iC = ses0Var.c();
                for (int i3 = 0; i3 < iC; i3++) {
                    if (ses0Var.g(i3)) {
                        ses0Var.h(i3).getClass();
                        if (i3 < i || i3 >= i2) {
                            ses0Var.d(i3);
                        }
                    }
                }
                this.c.b(ses0Var);
                ses0Var.i(jK);
                while (i < i2) {
                    jh5 jh5VarH = ses0Var.h(i);
                    k3r k3rVarO = ses0Var.o(i);
                    if (jh5VarH != null && k3rVarO != null && !nen0Var.b(jh5VarH)) {
                        nen0Var.m(jh5VarH, k3rVarO);
                    }
                    i++;
                }
            } catch (Throwable th) {
                ses0Var.i(jK);
                throw th;
            }
        } catch (DataSourceException unused) {
        }
    }

    public final void p() {
        Set setP1;
        synchronized (this.e) {
            if (!this.v && this.l.isEmpty() && this.m.isEmpty()) {
                return;
            }
            this.v = false;
            synchronized (this.e) {
                try {
                    cmh1 cmh1Var = this.i;
                    if (cmh1Var == null) {
                        return;
                    }
                    LinkedHashSet linkedHashSetV0 = o7h.v0(this.l, this.k);
                    this.l.clear();
                    LinkedHashSet linkedHashSetV1 = o7h.v0(this.m, this.k);
                    this.m.clear();
                    boolean z = (linkedHashSetV0.isEmpty() && linkedHashSetV1.isEmpty() && this.w == this.x) ? false : true;
                    if (z) {
                        setP1 = o7h.p1(this.k);
                        this.t = setP1;
                        this.x = this.w;
                    } else {
                        setP1 = this.t;
                    }
                    LinkedHashSet linkedHashSetY0 = dm61.y0(linkedHashSetV0, linkedHashSetV1);
                    if (linkedHashSetY0.isEmpty() || s(cmh1Var, dm61.v0(setP1, linkedHashSetY0)) != null) {
                        Map map = null;
                        if (z) {
                            Map mapS = s(cmh1Var, setP1);
                            if (mapS == null) {
                                return;
                            }
                            if (!mapS.isEmpty()) {
                                map = mapS;
                            }
                        }
                        if (map != null) {
                            n(map);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean q(lzq lzqVar) {
        l811 l811Var = new l811();
        Iterator it = lzqVar.d().iterator();
        while (it.hasNext()) {
            ((e1r) it.next()).a(this.j, new m3n(lzqVar, this, l811Var, (byte) 4));
        }
        return l811Var.a;
    }

    public final void r() {
        if (this.u.compareAndSet(false, true)) {
            this.b.post(new a6n(this, (byte) 1));
        }
    }

    public final Map s(cmh1 cmh1Var, Set set) {
        boolean z;
        Map mapA;
        boolean z2;
        synchronized (this.e) {
            z = this.i == cmh1Var;
        }
        if (!z) {
            return null;
        }
        try {
            mapA = cmh1Var.a(set);
        } catch (IllegalStateException e) {
            synchronized (this.e) {
                if (this.i == cmh1Var) {
                    throw e;
                }
                mapA = null;
            }
        }
        if (mapA == null) {
            return null;
        }
        synchronized (this.e) {
            z2 = this.i == cmh1Var;
        }
        if (z2) {
            return mapA;
        }
        return null;
    }
}
