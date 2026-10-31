package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jjh1 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ji0 ji0Var = (ji0) it.next();
            int i = ji0Var.c1;
            String str = ji0Var.a;
            if (i != 2) {
                hhg1.f(f4i1.f("Ad ", str, " is a managed ad and cannot be added to the registry"));
                return;
            }
            ConcurrentHashMap concurrentHashMap = this.a;
            ji0 ji0Var2 = (ji0) concurrentHashMap.get(str);
            String str2 = ji0Var2 != null ? ji0Var2.t : null;
            if (!(str2 == null ? false : pap1.v(str2, ji0Var.t))) {
                concurrentHashMap.put(str, ji0Var);
            }
        }
    }

    public final void b(ji0 ji0Var) {
        a(k4p1.x(ji0Var));
    }
}
