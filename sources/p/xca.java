package p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class xca {
    public static final AtomicInteger d = new AtomicInteger();
    public static final AtomicInteger e = new AtomicInteger();
    public final LinkedHashSet a = new LinkedHashSet();
    public final aos b;
    public final x610 c;

    public xca(x610 x610Var, aos aosVar) {
        aosVar.getClass();
        this.b = aosVar;
        x610Var.getClass();
        this.c = x610Var;
    }

    public final synchronized void a(int i, cv5 cv5Var) {
        if (this.a.contains(Integer.valueOf(i))) {
            this.b.a(i, e.incrementAndGet(), cv5Var);
        }
    }

    public final synchronized void b(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.a(((Integer) it.next()).intValue(), e.incrementAndGet(), obj);
        }
    }

    public abstract void e(q881 q881Var, int i);

    public void c() {
    }

    public void d() {
    }
}
