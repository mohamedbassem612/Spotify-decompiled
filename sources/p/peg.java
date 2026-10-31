package p;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class peg implements g761, dqr0 {
    public final qeg a = new qeg();
    public final cv30 b;

    public peg(iu30 iu30Var) {
        this.b = iu30Var;
    }

    public nma0 b(tka0 tka0Var) {
        uen0 uen0Var = (uen0) this.a.get(((wdg) tka0Var).n());
        Object hqcVar = uen0Var.a.get();
        if (hqcVar == null) {
            synchronized (uen0Var) {
                hqcVar = uen0Var.a.get();
                if (hqcVar == null) {
                    hqcVar = new hqc((nma0) this.b.invoke(tka0Var));
                    uen0Var.a = new SoftReference(hqcVar);
                }
            }
        }
        return ((hqc) hqcVar).a;
    }

    public Object d(tka0 tka0Var, ArrayList arrayList) {
        nma0 m231Var;
        uen0 uen0Var = (uen0) this.a.get(((wdg) tka0Var).n());
        Object cqr0Var = uen0Var.a.get();
        if (cqr0Var == null) {
            synchronized (uen0Var) {
                cqr0Var = uen0Var.a.get();
                if (cqr0Var == null) {
                    cqr0Var = new cqr0();
                    uen0Var.a = new SoftReference(cqr0Var);
                }
            }
        }
        cqr0 cqr0Var2 = (cqr0) cqr0Var;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new wma0((oma0) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = cqr0Var2.a;
        Object obj = concurrentHashMap.get(arrayList2);
        if (obj == null) {
            try {
                m231Var = (nma0) this.b.invoke(tka0Var, arrayList);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            e331 e331Var = new e331(m231Var);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, e331Var);
            obj = objPutIfAbsent == null ? e331Var : objPutIfAbsent;
        }
        return ((e331) obj).a;
    }

    public peg(vu30 vu30Var) {
        this.b = vu30Var;
    }
}
