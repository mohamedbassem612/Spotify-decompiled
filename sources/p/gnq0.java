package p;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gnq0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public final void a(jh5 jh5Var, Object obj) {
        this.b.remove(jh5Var, obj);
    }

    public final void b(jh5 jh5Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((iu30) it.next()).invoke(jh5Var);
        }
    }

    public final Object c(jh5 jh5Var) {
        enq0 enq0Var = (enq0) this.a.get(jh5Var);
        if (enq0Var != null) {
            return enq0Var.a();
        }
        return null;
    }
}
