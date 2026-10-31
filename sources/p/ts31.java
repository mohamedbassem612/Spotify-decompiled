package p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ts31 implements cmh1 {
    public final List a;
    public final iu30 b;
    public volatile boolean d;
    public final cmh1 s;
    public final Object c = new Object();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final Handler j = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final AtomicBoolean l = new AtomicBoolean();
    public final xfz0 m = new xfz0(this, (byte) 6);
    public final AtomicInteger n = new AtomicInteger();
    public final HashMap o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap.KeySetView f87p = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap.KeySetView q = ConcurrentHashMap.newKeySet();
    public final HashMap r = new HashMap();

    public ts31(w1k w1kVar, List list, iu30 iu30Var) {
        this.a = list;
        this.b = iu30Var;
        this.s = w1kVar.c(new hbz0(this, (byte) 10));
    }

    @Override // p.cmh1
    public final Map a(Set set) {
        xkg0 xkg0VarB;
        k3r k3rVar;
        this.n.incrementAndGet();
        try {
            synchronized (this.c) {
                try {
                    if (this.d) {
                        throw new IllegalStateException("Subscription is disposed");
                    }
                    xkg0 xkg0Var = new xkg0();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        jh5 jh5Var = (jh5) it.next();
                        or31 or31VarF = f(jh5Var);
                        if (or31VarF != null) {
                        }
                    }
                    xkg0 xkg0VarB2 = xkg0Var.b();
                    Set setV0 = dm61.v0(set, xkg0VarB2.keySet());
                    Set<jh5> setV1 = dm61.v0(xkg0VarB2.keySet(), this.e);
                    Set<jh5> setV2 = dm61.v0(setV0, this.f);
                    this.f87p.retainAll(set);
                    LinkedHashSet linkedHashSet = this.e;
                    linkedHashSet.clear();
                    linkedHashSet.addAll(xkg0VarB2.keySet());
                    LinkedHashSet linkedHashSet2 = this.f;
                    linkedHashSet2.clear();
                    linkedHashSet2.addAll(setV0);
                    LinkedHashMap linkedHashMap = this.h;
                    linkedHashMap.clear();
                    linkedHashMap.putAll(xkg0VarB2);
                    this.g.clear();
                    for (Map.Entry entry : this.h.entrySet()) {
                        jh5 jh5Var2 = (jh5) entry.getKey();
                        ((or31) entry.getValue()).a(jh5Var2, new hf31(this, jh5Var2, (byte) 6));
                    }
                    LinkedHashSet linkedHashSetY0 = dm61.y0(setV0, this.g.keySet());
                    this.i.keySet().retainAll(linkedHashSetY0);
                    this.k.keySet().retainAll(linkedHashSetY0);
                    this.q.retainAll(linkedHashSetY0);
                    for (Map.Entry entry2 : this.s.a(linkedHashSetY0).entrySet()) {
                        jh5 jh5Var3 = (jh5) entry2.getKey();
                        this.i.put(jh5Var3, (k3r) entry2.getValue());
                        this.q.remove(jh5Var3);
                    }
                    xkg0 xkg0Var2 = new xkg0();
                    for (jh5 jh5Var4 : setV2) {
                        if (this.q.contains(jh5Var4)) {
                            k3rVar = null;
                        } else {
                            k3rVar = (k3r) this.k.get(jh5Var4);
                            if (k3rVar == null) {
                                k3rVar = (k3r) this.i.get(jh5Var4);
                            }
                        }
                        if (k3rVar == null) {
                            k3rVar = i3r.a;
                        }
                        if (k3rVar instanceof h3r) {
                            this.f87p.add(jh5Var4);
                            k3rVar = i3r.a;
                        }
                        xkg0Var2.put(jh5Var4, k3rVar);
                    }
                    for (jh5 jh5Var5 : setV1) {
                        k3r k3rVarD = d(jh5Var5, new v3v0(this));
                        if (k3rVarD instanceof h3r) {
                            this.f87p.add(jh5Var5);
                            k3rVarD = i3r.a;
                        }
                        xkg0Var2.put(jh5Var5, k3rVarD);
                    }
                    xkg0VarB = xkg0Var2.b();
                    this.r.keySet().retainAll(this.e);
                    for (jh5 jh5Var6 : setV1) {
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        Object obj = this.h.get(jh5Var6);
                        obj.getClass();
                        ((or31) obj).a(jh5Var6, new hf31(this, linkedHashSet3, (byte) 7));
                        if (!linkedHashSet3.isEmpty()) {
                            this.r.put(jh5Var6, linkedHashSet3);
                        }
                    }
                    this.o.keySet().retainAll(set);
                    this.o.putAll(xkg0VarB);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.n.decrementAndGet() == 0 && ((!this.k.isEmpty() || !this.f87p.isEmpty()) && this.l.compareAndSet(false, true))) {
                this.j.post(this.m);
            }
            return xkg0VarB;
        } catch (Throwable th2) {
            if (this.n.decrementAndGet() == 0 && ((!this.k.isEmpty() || !this.f87p.isEmpty()) && this.l.compareAndSet(false, true))) {
                this.j.post(this.m);
            }
            throw th2;
        }
    }

    @Override // p.cmh1
    public final void b(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new IllegalStateException("Subscription is disposed");
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jh5 jh5Var = (jh5) it.next();
                    or31 or31VarF = f(jh5Var);
                    if (or31VarF != null) {
                        or31VarF.a(jh5Var, new nqv(linkedHashSet, (byte) 1));
                    } else {
                        linkedHashSet.add(jh5Var);
                    }
                }
                this.q.addAll(linkedHashSet);
                ConcurrentHashMap.KeySetView keySetView = this.f87p;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    Iterable iterable = (Set) this.g.get((jh5) it2.next());
                    if (iterable == null) {
                        iterable = w7x.a;
                    }
                    r7h.W(iterable, arrayList);
                }
                keySetView.removeAll(dm61.y0(linkedHashSet, arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.s.b(linkedHashSet);
    }

    @Override // p.cmh1
    public final Object c(List list, onm onmVar) {
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new IllegalStateException("Subscription is disposed");
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jh5 jh5Var = (jh5) ((mmr0) it.next()).a;
                    List list2 = this.a;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((Boolean) ((or31) it2.next()).a.invoke(jh5Var)).booleanValue()) {
                                throw new DataSourceException.UnsupportedKey(jh5Var);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objC = this.s.c(list, onmVar);
        return objC == d9n.a ? objC : rih1.a;
    }

    public final k3r d(jh5 jh5Var, iu30 iu30Var) {
        Object obj = this.h.get(jh5Var);
        obj.getClass();
        or31 or31Var = (or31) obj;
        zhq0 zhq0VarC = xs31.c();
        ses0 ses0VarA = zhq0VarC.a(((Number) or31Var.b.invoke(jh5Var)).intValue());
        try {
            or31Var.c.J(jh5Var, ses0VarA, 0, Integer.valueOf(ses0VarA.c()));
            int iC = ses0VarA.c();
            for (int i = 0; i < iC; i++) {
                jh5 jh5VarH = ses0VarA.h(i);
                if (jh5VarH != null) {
                    k3r k3rVar = (k3r) iu30Var.invoke(jh5VarH);
                    if (k3rVar == null) {
                        k3rVar = i3r.a;
                    }
                    ses0VarA.n(i, k3rVar);
                }
            }
            return (k3r) or31Var.d.J(jh5Var, ses0VarA, 0, Integer.valueOf(ses0VarA.c()));
        } finally {
            zhq0VarC.q(ses0VarA);
        }
    }

    @Override // p.cmh1
    public final void dispose() {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.k.clear();
            this.f87p.clear();
            this.q.clear();
            this.r.clear();
            this.s.dispose();
        }
    }

    public final void e() {
        k3r k3rVarD;
        this.l.set(false);
        if (this.n.get() > 0) {
            return;
        }
        ArrayList<mmr0> arrayList = new ArrayList(this.k.size());
        for (Map.Entry entry : this.k.entrySet()) {
            jh5 jh5Var = (jh5) entry.getKey();
            k3r k3rVar = (k3r) entry.getValue();
            if (this.k.remove(jh5Var, k3rVar)) {
                arrayList.add(oqn1.n(jh5Var, k3rVar));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.c) {
            try {
                if (this.d) {
                    return;
                }
                Set<jh5> setO1 = o7h.o1(this.f87p);
                this.f87p.clear();
                for (mmr0 mmr0Var : arrayList) {
                    jh5 jh5Var2 = (jh5) mmr0Var.a;
                    k3r k3rVar2 = (k3r) mmr0Var.b;
                    if (this.f.contains(jh5Var2) || this.g.containsKey(jh5Var2)) {
                        this.i.put(jh5Var2, k3rVar2);
                    }
                    if (this.f.contains(jh5Var2)) {
                        setO1.add(jh5Var2);
                    }
                    if (this.g.containsKey(jh5Var2)) {
                        Object obj = this.g.get(jh5Var2);
                        obj.getClass();
                        setO1.addAll((Collection) obj);
                        if (!this.q.contains(jh5Var2)) {
                            Object obj2 = this.g.get(jh5Var2);
                            obj2.getClass();
                            for (jh5 jh5Var3 : (Set) obj2) {
                                Set set = (Set) this.r.get(jh5Var3);
                                if (set != null) {
                                    set.remove(jh5Var2);
                                    if (set.isEmpty()) {
                                        this.r.remove(jh5Var3);
                                    }
                                }
                            }
                        }
                    }
                }
                for (jh5 jh5Var4 : setO1) {
                    if (this.e.contains(jh5Var4)) {
                        Set set2 = (Set) this.r.get(jh5Var4);
                        jh5Var4.getClass();
                        k3rVarD = d(jh5Var4, new hf31(set2, this, (byte) 5));
                    } else {
                        k3rVarD = (k3r) this.i.get(jh5Var4);
                        if (k3rVarD == null) {
                            k3rVarD = i3r.a;
                        }
                    }
                    arrayList2.add(oqn1.n(jh5Var4, k3rVarD));
                }
                r7h.a0(arrayList2, new zw11(this, (byte) 18));
                if (arrayList2.isEmpty() || this.d) {
                    return;
                }
                this.b.invoke(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final or31 f(jh5 jh5Var) {
        Object next;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((Boolean) ((or31) next).a.invoke(jh5Var)).booleanValue()) {
                return (or31) next;
            }
        }
        next = null;
        return (or31) next;
    }
}
