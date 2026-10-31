package p;

import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class emh1 implements cmh1 {
    public final hcf1 a;
    public final k6g1 b;
    public final hcf1 c;
    public final sjf1 d;
    public final /* synthetic */ fmh1 e;

    public emh1(fmh1 fmh1Var, hcf1 hcf1Var, k6g1 k6g1Var, hcf1 hcf1Var2, sjf1 sjf1Var) {
        this.e = fmh1Var;
        this.a = hcf1Var;
        this.b = k6g1Var;
        this.c = hcf1Var2;
        this.d = sjf1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$UnsupportedKey */
    @Override // p.cmh1
    public final Map a(Set set) throws DataSourceException.UnsupportedKey {
        Set<jh5> set2 = set;
        zjd1 zjd1Var = this.e.b;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        for (jh5 jh5Var : set2) {
            if (!u890.j(jh5Var.a, zjd1Var)) {
                throw new DataSourceException.UnsupportedKey(jh5Var);
            }
            arrayList.add(jh5Var.b);
        }
        Set<Map.Entry> setEntrySet = ((Map) this.a.invoke(o7h.p1(arrayList))).entrySet();
        int iS = zno1.s(q7h.U(setEntrySet, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Map.Entry entry : setEntrySet) {
            mmr0 mmr0VarN = oqn1.n(new jh5(zjd1Var, entry.getKey()), (k3r) entry.getValue());
            linkedHashMap.put(mmr0VarN.a, mmr0VarN.b);
        }
        return linkedHashMap;
    }

    @Override // p.cmh1
    public final void b(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (u890.j(((jh5) obj).a, this.e.b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jh5) it.next()).b);
        }
        this.c.invoke(o7h.p1(arrayList2));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$InvalidAction */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$UnsupportedKey */
    @Override // p.cmh1
    public final Object c(List list, onm onmVar) throws DataSourceException.InvalidAction, DataSourceException.UnsupportedKey {
        List<mmr0> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (mmr0 mmr0Var : list2) {
            Object obj = mmr0Var.a;
            Object obj2 = mmr0Var.b;
            jh5 jh5Var = (jh5) obj;
            if (!u890.j(jh5Var.a, this.e.b)) {
                obj = null;
            }
            jh5 jh5Var2 = (jh5) obj;
            Object obj3 = jh5Var2 != null ? jh5Var2.b : null;
            if (obj3 == null) {
                obj3 = null;
            }
            if (obj3 == null) {
                throw new DataSourceException.UnsupportedKey(jh5Var);
            }
            Object obj4 = obj2 != null ? obj2 : null;
            if (obj4 == null) {
                throw new DataSourceException.InvalidAction(jh5Var, obj2);
            }
            arrayList.add(oqn1.n(obj3, obj4));
        }
        Object objInvoke = this.b.invoke(arrayList, onmVar);
        return objInvoke == d9n.a ? objInvoke : rih1.a;
    }

    @Override // p.cmh1
    public final void dispose() {
        this.d.invoke();
    }
}
