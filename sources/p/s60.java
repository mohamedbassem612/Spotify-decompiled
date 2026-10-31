package p;

import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s60 implements cmh1 {
    public final iu30 a;
    public boolean c;
    public boolean f;
    public boolean h;
    public final cmh1 i;
    public final jdc j;
    public LinkedHashSet k;
    public final /* synthetic */ w60 l;
    public final Object b = new Object();
    public Set d = w7x.a;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();

    public s60(w60 w60Var, iu30 iu30Var) {
        this.l = w60Var;
        this.a = iu30Var;
        this.i = w60Var.a.c(new s20(this, (byte) 1));
        gnq0 gnq0Var = w60Var.c;
        j2 j2Var = new j2(this, (byte) 5);
        gnq0Var.c.add(j2Var);
        this.j = new jdc(gnq0Var, j2Var);
    }

    @Override // p.cmh1
    public final Map a(Set set) {
        Object j3rVar;
        synchronized (this.b) {
            if (this.c) {
                return b7x.a;
            }
            Set set2 = this.d;
            Set setV0 = dm61.v0(set, set2);
            Set setV1 = dm61.v0(set2, set);
            this.d = set;
            LinkedHashMap linkedHashMap = this.e;
            Iterator it = setV1.iterator();
            while (it.hasNext()) {
                linkedHashMap.remove((jh5) it.next());
            }
            LinkedHashMap linkedHashMap2 = this.g;
            Iterator it2 = setV1.iterator();
            while (it2.hasNext()) {
                linkedHashMap2.remove((jh5) it2.next());
            }
            this.f = true;
            try {
                Map mapA = this.i.a(set);
                Set set3 = setV0;
                w60 w60Var = this.l;
                int iS = zno1.s(q7h.U(set3, 10));
                int i = 16;
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS);
                for (Object obj : set3) {
                    jh5 jh5Var = (jh5) obj;
                    Object objC = w60Var.c.c(jh5Var);
                    if (objC != null) {
                        j3rVar = new j3r(objC);
                    } else {
                        j3rVar = (k3r) mapA.get(jh5Var);
                        if (j3rVar == null) {
                            j3rVar = i3r.a;
                        }
                    }
                    linkedHashMap3.put(obj, j3rVar);
                }
                synchronized (this.b) {
                    try {
                        Set set4 = setV0;
                        int iS2 = zno1.s(q7h.U(set4, 10));
                        if (iS2 >= 16) {
                            i = iS2;
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(i);
                        for (Object obj2 : set4) {
                            jh5 jh5Var2 = (jh5) obj2;
                            k3r k3rVar = (k3r) this.e.get(jh5Var2);
                            if (k3rVar == null) {
                                Object obj3 = linkedHashMap3.get(jh5Var2);
                                obj3.getClass();
                                k3rVar = (k3r) obj3;
                            }
                            linkedHashMap4.put(obj2, k3rVar);
                        }
                        if (this.c) {
                            this.f = false;
                            return linkedHashMap4;
                        }
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            jh5 jh5Var3 = (jh5) entry.getKey();
                            k3r k3rVar2 = (k3r) entry.getValue();
                            if (!this.e.containsKey(jh5Var3)) {
                                this.e.put(jh5Var3, k3rVar2);
                            }
                        }
                        LinkedHashMap linkedHashMap5 = this.g;
                        Iterator it3 = setV0.iterator();
                        while (it3.hasNext()) {
                            linkedHashMap5.remove((jh5) it3.next());
                        }
                        this.f = false;
                        e();
                        return linkedHashMap4;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                synchronized (this.b) {
                    this.f = false;
                    try {
                        e();
                    } catch (Throwable th3) {
                        j2h1.h(th2, th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // p.cmh1
    public final void b(Set set) {
        Object obj = this.b;
        w60 w60Var = this.l;
        synchronized (obj) {
            if (this.c) {
                throw new IllegalStateException("Subscription is disposed");
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                jh5 jh5Var = (jh5) it.next();
                gnq0 gnq0Var = w60Var.c;
                if (gnq0Var.a.remove(jh5Var) != null) {
                    gnq0Var.b(jh5Var);
                }
                this.e.remove(jh5Var);
                this.g.remove(jh5Var);
            }
        }
        this.i.b(set);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$InvalidAction */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$UnsupportedKey */
    /* JADX WARN: Code duplicated, block: B:103:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:73:0x016d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:0: B:78:0x01a0->B:95:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0149 A[SYNTHETIC] */
    @Override // p.cmh1
    public final Object c(List list, onm onmVar) throws DataSourceException.InvalidAction, DataSourceException.UnsupportedKey {
        r60 r60Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        l20 l20Var;
        ArrayList<mmr0> arrayList3;
        LinkedHashMap linkedHashMap;
        w60 w60Var;
        int i;
        Iterator it;
        l20 l20Var2;
        Object arrayList4;
        List list2;
        k2 k2Var;
        if (onmVar instanceof r60) {
            r60Var = (r60) onmVar;
            int i2 = r60Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r60Var.g = i2 - Integer.MIN_VALUE;
            } else {
                r60Var = new r60(this, onmVar);
            }
        } else {
            r60Var = new r60(this, onmVar);
        }
        Object obj = r60Var.e;
        d9n d9nVar = d9n.a;
        int i3 = r60Var.g;
        if (i3 != 0) {
            if (i3 == 1) {
                arrayList2 = r60Var.a;
                hm5.M(obj);
            } else {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = r60Var.d;
                it = r60Var.c;
                w60Var = r60Var.b;
                hm5.M(obj);
            }
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                l20 l20Var3 = (l20) entry.getKey();
                list2 = (List) entry.getValue();
                k2Var = l20Var3.b;
                r60Var.a = null;
                r60Var.b = w60Var;
                r60Var.c = it;
                r60Var.d = i;
                r60Var.g = 2;
                if (w60Var.f(list2, k2Var, r60Var) == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1.a;
        }
        hm5.M(obj);
        synchronized (this.b) {
            if (this.c) {
                throw new IllegalStateException("Subscription is disposed");
            }
        }
        List<mmr0> list3 = list;
        w60 w60Var2 = this.l;
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            jh5 jh5Var = (jh5) ((mmr0) it2.next()).a;
            if (!ob51.f(w60Var2.a, jh5Var)) {
                throw new DataSourceException.UnsupportedKey(jh5Var);
            }
        }
        w60 w60Var3 = this.l;
        arrayList = new ArrayList(q7h.U(list3, 10));
        for (mmr0 mmr0Var : list3) {
            List list4 = w60Var3.b;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : list4) {
                if (((Boolean) ((l20) obj2).a.invoke(mmr0Var.a, mmr0Var.b)).booleanValue()) {
                    arrayList5.add(obj2);
                }
            }
            int size = arrayList5.size();
            if (size == 0) {
                l20Var = null;
            } else {
                if (size != 1) {
                    throw new DataSourceException.InvalidAction((jh5) mmr0Var.a, mmr0Var.b);
                }
                l20Var = (l20) o7h.V0(arrayList5);
            }
            arrayList.add(oqn1.n(mmr0Var, l20Var));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((mmr0) obj3).b == null) {
                arrayList6.add(obj3);
            }
        }
        ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            arrayList7.add((mmr0) ((mmr0) it3.next()).a);
        }
        if (arrayList7.isEmpty()) {
            arrayList3 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (((mmr0) obj4).b != null) {
                    arrayList3.add(obj4);
                }
            }
            linkedHashMap = new LinkedHashMap();
            for (mmr0 mmr0Var2 : arrayList3) {
                Object obj5 = mmr0Var2.b;
                obj5.getClass();
                l20Var2 = (l20) obj5;
                arrayList4 = linkedHashMap.get(l20Var2);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(l20Var2, arrayList4);
                }
                ((List) arrayList4).add((mmr0) mmr0Var2.a);
            }
            w60Var = this.l;
            i = 0;
            it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                l20 l20Var4 = (l20) entry2.getKey();
                list2 = (List) entry2.getValue();
                k2Var = l20Var4.b;
                r60Var.a = null;
                r60Var.b = w60Var;
                r60Var.c = it;
                r60Var.d = i;
                r60Var.g = 2;
                if (w60Var.f(list2, k2Var, r60Var) == d9nVar) {
                }
            }
            return rih1.a;
        }
        cmh1 cmh1Var = this.i;
        r60Var.a = arrayList;
        r60Var.g = 1;
        if (cmh1Var.c(arrayList7, r60Var) != d9nVar) {
            arrayList2 = arrayList;
        }
        return d9nVar;
        arrayList = arrayList2;
        arrayList3 = new ArrayList();
        while (r4.hasNext()) {
            if (((mmr0) obj4).b != null) {
                arrayList3.add(obj4);
            }
        }
        linkedHashMap = new LinkedHashMap();
        while (r1.hasNext()) {
            Object obj6 = mmr0Var2.b;
            obj6.getClass();
            l20Var2 = (l20) obj6;
            arrayList4 = linkedHashMap.get(l20Var2);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(l20Var2, arrayList4);
            }
            ((List) arrayList4).add((mmr0) mmr0Var2.a);
        }
        w60Var = this.l;
        i = 0;
        it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            l20 l20Var5 = (l20) entry3.getKey();
            list2 = (List) entry3.getValue();
            k2Var = l20Var5.b;
            r60Var.a = null;
            r60Var.b = w60Var;
            r60Var.c = it;
            r60Var.d = i;
            r60Var.g = 2;
            if (w60Var.f(list2, k2Var, r60Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }

    public final void d(Map map) {
        synchronized (this.b) {
            try {
                if (this.c) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    jh5 jh5Var = (jh5) entry.getKey();
                    k3r k3rVar = (k3r) entry.getValue();
                    if (this.d.contains(jh5Var) && !u890.j(this.e.get(jh5Var), k3rVar)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    jh5 jh5Var2 = (jh5) entry2.getKey();
                    k3r k3rVar2 = (k3r) entry2.getValue();
                    this.e.put(jh5Var2, k3rVar2);
                    this.g.put(jh5Var2, k3rVar2);
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.cmh1
    public final void dispose() {
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.g.clear();
            this.f = false;
            x0d.r(this.j);
            this.i.dispose();
            this.l.d.remove(this);
        }
    }

    public final void e() {
        List listS;
        while (true) {
            synchronized (this.b) {
                if (this.f || this.h || this.g.isEmpty()) {
                    break;
                    break;
                    break;
                } else {
                    this.h = true;
                    listS = sqg0.S(this.g);
                    this.g.clear();
                }
            }
            try {
                this.a.invoke(listS);
                synchronized (this.b) {
                    this.h = false;
                }
            } catch (Throwable th) {
                synchronized (this.b) {
                    this.h = false;
                    throw th;
                }
            }
        }
    }
}
