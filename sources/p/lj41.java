package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lj41 implements kj41 {
    public final UUID a;
    public final String b;
    public final khp0 c;
    public long d = 0;

    public lj41(UUID uuid, String str, khp0 khp0Var) {
        this.a = uuid;
        this.b = str;
        this.c = khp0Var;
    }

    @Override // p.kj41
    public final void a(long j) {
        UUID uuid = this.a;
        khp0 khp0Var = this.c;
        CopyOnWriteArrayList<wgp0> copyOnWriteArrayList = (CopyOnWriteArrayList) khp0Var.m.remove(uuid);
        if (copyOnWriteArrayList == null) {
            return;
        }
        for (wgp0 wgp0Var : copyOnWriteArrayList) {
            if (wgp0Var.c(Long.valueOf(j))) {
                khp0Var.y(wgp0Var);
            }
        }
    }

    @Override // p.kj41
    public final long b() {
        return this.d;
    }

    @Override // p.kj41
    public final kj41 c(Map map) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.m.get(this.a);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((wgp0) it.next()).h.g.putAll(map);
            }
        }
        return this;
    }

    @Override // p.kj41
    public final void cancel() {
        khp0 khp0Var = this.c;
        CopyOnWriteArrayList<wgp0> copyOnWriteArrayList = (CopyOnWriteArrayList) khp0Var.m.remove(this.a);
        if (copyOnWriteArrayList == null) {
            return;
        }
        for (wgp0 wgp0Var : copyOnWriteArrayList) {
            AtomicBoolean atomicBoolean = wgp0Var.k;
            UUID uuid = wgp0Var.d;
            if (atomicBoolean.compareAndSet(false, true)) {
                khp0Var.l.remove(uuid);
                khp0Var.j.remove(uuid);
                khp0Var.A(wgp0Var);
                zpj0 zpj0Var = khp0Var.x;
                synchronized (zpj0Var.m) {
                    try {
                        Map map = (Map) zpj0Var.f.remove(wgp0Var.d);
                        if (map != null) {
                            Collection collectionValues = map.values();
                            ArrayList arrayList = new ArrayList(q7h.U(collectionValues, 10));
                            Iterator it = collectionValues.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((mqj0) it.next()).e().a);
                            }
                            Set setP1 = o7h.p1(arrayList);
                            for (mqj0 mqj0Var : map.values()) {
                                zpj0Var.i(mqj0Var);
                                Long lM = j0p1.m(mqj0Var.e().c);
                                if (lM != null) {
                                    zpj0Var.n.s(mqj0Var, lM.longValue());
                                }
                                zpj0Var.k.v(mqj0Var.f());
                            }
                            Iterator it2 = map.values().iterator();
                            while (it2.hasNext()) {
                                ((mqj0) it2.next()).a();
                            }
                            zpj0Var.k(setP1);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                khp0Var.z();
                if (wgp0Var.b.d.containsKey(qm81.TIME_SERIES) && khp0Var.w.decrementAndGet() == 0) {
                    khp0Var.v.getClass();
                }
            }
        }
    }

    @Override // p.kj41
    public final kj41 d(long j) {
        this.d = j;
        khp0 khp0Var = this.c;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) khp0Var.m.get(this.a);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((wgp0) it.next()).e = j;
            }
        }
        return this;
    }

    @Override // p.kj41
    public final Map getAttributes() {
        wgp0 wgp0Var;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.m.get(this.a);
        return (copyOnWriteArrayList == null || (wgp0Var = (wgp0) o7h.s0(copyOnWriteArrayList)) == null) ? b7x.a : sqg0.U(wgp0Var.h.g);
    }

    @Override // p.kj41
    public final UUID getId() {
        return this.a;
    }

    @Override // p.kj41
    public final String getKey() {
        return this.b;
    }

    @Override // p.kj41
    public final kj41 setAttribute(String str, String str2) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.m.get(this.a);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((wgp0) it.next()).h.g.put(str, str2);
            }
        }
        return this;
    }

    @Override // p.kj41
    public final void stop() {
        UUID uuid = this.a;
        khp0 khp0Var = this.c;
        CopyOnWriteArrayList<wgp0> copyOnWriteArrayList = (CopyOnWriteArrayList) khp0Var.m.remove(uuid);
        if (copyOnWriteArrayList == null) {
            return;
        }
        for (wgp0 wgp0Var : copyOnWriteArrayList) {
            wgp0Var.getClass();
            if (wgp0Var.c(null)) {
                khp0Var.y(wgp0Var);
            }
        }
    }
}
