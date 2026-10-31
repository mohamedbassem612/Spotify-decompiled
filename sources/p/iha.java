package p;

import com.spotify.kodiak.table.table.DataSourceException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iha implements cmh1 {
    public final iu30 a;
    public final Object b = new Object();
    public boolean c;
    public final llm d;
    public final vfa e;
    public Set f;
    public final LinkedHashMap g;
    public final n36 h;
    public boolean i;
    public final boolean j;
    public final HashMap k;
    public long l;
    public final /* synthetic */ jha m;

    public iha(jha jhaVar, iu30 iu30Var) {
        this.m = jhaVar;
        this.a = iu30Var;
        this.d = smo1.e(ha71.A(guo1.B(), jhaVar.c));
        vfa vfaVarD = jhaVar.b.d();
        this.e = vfaVarD;
        this.f = w7x.a;
        this.g = new LinkedHashMap();
        this.h = new n36();
        this.j = vfaVarD.t();
        this.k = new HashMap();
    }

    @Override // p.cmh1
    public final Map a(Set set) throws Throwable {
        Map mapB;
        Map map;
        Long lValueOf;
        qfs0 qfs0Var;
        Object obj = this.b;
        jha jhaVar = this.m;
        synchronized (obj) {
            try {
                if (this.c) {
                    throw new IllegalStateException("Subscription is disposed");
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jh5 jh5Var = (jh5) it.next();
                    if (!ob51.f(jhaVar, jh5Var)) {
                        throw new DataSourceException.UnsupportedKey(jh5Var);
                    }
                }
                Set setV0 = dm61.v0(set, this.f);
                Set setV1 = dm61.v0(this.f, set);
                LinkedHashSet linkedHashSetV0 = o7h.v0(set, this.f);
                if (setV0.isEmpty()) {
                    mapB = b7x.a;
                } else {
                    List listL1 = o7h.l1(setV0);
                    zhq0 zhq0VarA = kha.a();
                    ses0 ses0VarA = zhq0VarA.a(listL1.size());
                    try {
                        int i = 0;
                        for (Object obj2 : listL1) {
                            int i2 = i + 1;
                            if (i < 0) {
                                p7h.T();
                                throw null;
                            }
                            ses0VarA.p(i, (jh5) obj2);
                            i = i2;
                        }
                        jhaVar.b(ses0VarA);
                        xkg0 xkg0Var = new xkg0(listL1.size());
                        int i3 = 0;
                        for (Object obj3 : listL1) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                p7h.T();
                                throw null;
                            }
                            jh5 jh5Var2 = (jh5) obj3;
                            Object objO = ses0VarA.o(i3);
                            if (objO == null) {
                                objO = i3r.a;
                            }
                            xkg0Var.put(jh5Var2, objO);
                            i3 = i4;
                        }
                        mapB = xkg0Var.b();
                        zhq0VarA.q(ses0VarA);
                    } catch (Throwable th) {
                        zhq0VarA.q(ses0VarA);
                        throw th;
                    }
                }
                map = mapB;
                this.f = set;
                Iterator it2 = setV1.iterator();
                while (it2.hasNext()) {
                    this.g.remove((jh5) it2.next());
                }
                for (Map.Entry entry : map.entrySet()) {
                    this.g.put((jh5) entry.getKey(), (k3r) entry.getValue());
                }
                if (this.j) {
                    HashMap map2 = this.k;
                    Iterator it3 = setV1.iterator();
                    while (it3.hasNext()) {
                        map2.remove((jh5) it3.next());
                    }
                    long j = this.l + 1;
                    this.l = j;
                    lValueOf = Long.valueOf(j);
                    Iterator it4 = setV0.iterator();
                    while (it4.hasNext()) {
                        this.k.put((jh5) it4.next(), Long.valueOf(j));
                    }
                } else {
                    lValueOf = null;
                }
                this.h.addLast(new qfs0(new voa0(setV0, setV1, linkedHashSetV0), lValueOf));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.b) {
            if (this.i) {
                return map;
            }
            this.i = true;
            Throwable th3 = null;
            while (true) {
                synchronized (this.b) {
                    try {
                        boolean z = this.c;
                        n36 n36Var = this.h;
                        if (z) {
                            n36Var.clear();
                            qfs0Var = null;
                        } else {
                            qfs0Var = (qfs0) n36Var.p();
                        }
                        if (qfs0Var == null) {
                            this.i = false;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (qfs0Var == null) {
                    break;
                }
                Long lB = qfs0Var.b();
                try {
                    this.e.c(qfs0Var.a(), this.m.a, this.d, new kd8(this, lB, (byte) 12), new hj8(this, lB, (byte) 11));
                } catch (Throwable th5) {
                    if (th3 == null) {
                        th3 = th5;
                    } else if (th3 != th5) {
                        j2h1.h(th3, th5);
                    }
                }
            }
            if (th3 == null) {
                return map;
            }
            throw th3;
        }
    }

    @Override // p.cmh1
    public final void b(Set set) {
        synchronized (this.b) {
            if (this.c) {
                throw new IllegalStateException("Subscription is disposed");
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.g.remove((jh5) it.next());
            }
        }
        jha jhaVar = this.m;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            jhaVar.d.a((jh5) it2.next(), (Object) null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$InvalidAction */
    @Override // p.cmh1
    public final Object c(List list, onm onmVar) throws DataSourceException.InvalidAction {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return rih1.a;
        }
        mmr0 mmr0Var = (mmr0) it.next();
        synchronized (this.b) {
            if (this.c) {
                throw new IllegalStateException("Subscription is disposed");
            }
        }
        throw new DataSourceException.InvalidAction((jh5) mmr0Var.a, mmr0Var.b);
    }

    public final boolean d(jh5 jh5Var, Long l) {
        if (!this.f.contains(jh5Var)) {
            return false;
        }
        if (l == null) {
            return true;
        }
        Long l2 = (Long) this.k.get(jh5Var);
        return l2 != null && l2.longValue() == l.longValue();
    }

    @Override // p.cmh1
    public final void dispose() {
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            this.c = true;
            smo1.q(this.d);
            this.e.a();
            this.m.e.remove(this);
        }
    }
}
