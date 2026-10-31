package p;

import com.spotify.kodiak.table.table.DataSourceException;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fv00 implements cmh1 {
    public final uu00 a;
    public final boolean b;
    public final String c;
    public final iu30 d;
    public final sty e;
    public final sty f;
    public final ConcurrentHashMap j;
    public final Object g = new Object();
    public final ArrayList h = new ArrayList();
    public Set i = w7x.a;
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    public fv00(uu00 uu00Var, boolean z, String str, iu30 iu30Var, sty styVar, sty styVar2, Map map) {
        this.a = uu00Var;
        this.b = z;
        this.c = str;
        this.d = iu30Var;
        this.e = styVar;
        this.f = styVar2;
        this.j = new ConcurrentHashMap(map);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$UnsupportedKey */
    @Override // p.cmh1
    public final Map a(Set set) throws DataSourceException.UnsupportedKey {
        Set setV0;
        LinkedHashMap linkedHashMap;
        synchronized (this.g) {
            try {
                Set setV1 = dm61.v0(set, this.i);
                setV0 = dm61.v0(setV1, this.j.keySet());
                this.i = set;
                Set set2 = setV1;
                int iS = zno1.s(q7h.U(set2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                for (Object obj : set2) {
                    jh5 jh5Var = (jh5) obj;
                    Object obj2 = this.k.get(jh5Var);
                    if (obj2 == null) {
                        obj2 = this.j.get(jh5Var);
                    }
                    linkedHashMap.put(obj, obj2 != null ? new j3r(obj2) : i3r.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (setV0.isEmpty()) {
            setV0 = null;
        }
        if (setV0 == null) {
            return linkedHashMap;
        }
        Set<jh5> set3 = setV0;
        ArrayList<ev00> arrayList = new ArrayList(q7h.U(set3, 10));
        for (jh5 jh5Var2 : set3) {
            zjd1 zjd1Var = jh5Var2.a;
            xv00 xv00Var = zjd1Var instanceof xv00 ? (xv00) zjd1Var : null;
            if (xv00Var == null) {
                throw new DataSourceException.UnsupportedKey(jh5Var2);
            }
            Object obj3 = jh5Var2.b;
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str == null) {
                eg.m("Invalid key type");
                return null;
            }
            arrayList.add(new ev00(str, xv00Var.a, xv00Var));
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (ev00 ev00Var : arrayList) {
            arrayList2.add(new rv00(ev00Var.a, ((wdg) ev00Var.b).n(), false));
        }
        p811 p811Var = new p811();
        Disposable disposableSubscribe = this.a.b(new oi(this.c, this.b, new ib5(arrayList2, (byte) 15))).subscribe((Consumer) new qg7(arrayList, this, p811Var, (byte) 12));
        synchronized (this.g) {
            ArrayList arrayList3 = this.h;
            disposableSubscribe.getClass();
            arrayList3.add(disposableSubscribe);
        }
        p811Var.a = disposableSubscribe;
        return linkedHashMap;
    }

    @Override // p.cmh1
    public final void b(Set set) {
        Set set2 = set;
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            this.j.remove((jh5) it.next());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            this.k.remove((jh5) it2.next());
        }
        this.f.invoke(set);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$InvalidAction */
    @Override // p.cmh1
    public final Object c(List list, onm onmVar) throws DataSourceException.InvalidAction {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return rih1.a;
        }
        mmr0 mmr0Var = (mmr0) it.next();
        throw new DataSourceException.InvalidAction((jh5) mmr0Var.a, mmr0Var.b);
    }

    public final ArrayList d(Map map) {
        ArrayList arrayList;
        this.j.putAll(map);
        synchronized (this.g) {
            try {
                Set setKeySet = map.keySet();
                ArrayList<jh5> arrayList2 = new ArrayList();
                for (Object obj : setKeySet) {
                    if (this.i.contains((jh5) obj)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(q7h.U(arrayList2, 10));
                for (jh5 jh5Var : arrayList2) {
                    Object objG = this.k.get(jh5Var);
                    if (objG == null) {
                        objG = sqg0.G(jh5Var, map);
                    }
                    arrayList.add(oqn1.n(jh5Var, new j3r(objG)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    @Override // p.cmh1
    public final void dispose() {
        List listL1;
        synchronized (this.g) {
            listL1 = o7h.l1(this.h);
            this.h.clear();
        }
        Iterator it = listL1.iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).dispose();
        }
        this.e.invoke(this);
    }
}
