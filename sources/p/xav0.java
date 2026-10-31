package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xav0 {
    public final List a;
    public final CopyOnWriteArrayList b;

    public xav0(String str) {
        new jxa((byte) 17);
        this.b = new CopyOnWriteArrayList();
        a(new zm70(str));
        Iterator<E> it = z6x.a.iterator();
        while (it.hasNext()) {
            a((wav0) it.next());
        }
    }

    public static LinkedHashMap c(ArrayList arrayList) {
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wav0 wav0Var = (wav0) it.next();
            mmr0 mmr0VarN = oqn1.n(wav0Var.getPolicyId(), wav0Var.a());
            linkedHashMap.put(mmr0VarN.a, mmr0VarN.b);
        }
        return linkedHashMap;
    }

    public final void a(wav0 wav0Var) {
        this.b.add(wav0Var);
    }

    public final TreeMap b() {
        return new TreeMap(c(o7h.N0(z6x.a, this.b)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xav0) {
            return b().equals(((xav0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayListN0 = o7h.N0(z6x.a, this.b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListN0) {
            if (((wav0) obj).b()) {
                arrayList.add(obj);
            }
        }
        return c(arrayList).hashCode();
    }
}
