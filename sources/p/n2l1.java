package p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n2l1 {
    public final m2l1 a = new m2l1((byte) 0);

    public n2l1(b291 b291Var) {
        Iterator it = b291Var.iterator();
        while (it.hasNext()) {
            tcm1 tcm1Var = (tcm1) it.next();
            o2l1 o2l1Var = tcm1Var.a;
            m2l1 m2l1Var = this.a;
            scm1 scm1Var = tcm1Var.b;
            Iterator it2 = o2l1Var.a.iterator();
            while (it2.hasNext()) {
                ((CopyOnWriteArrayList) m2l1Var.a.computeIfAbsent((String) it2.next(), azt.k)).add(scm1Var);
            }
        }
    }
}
