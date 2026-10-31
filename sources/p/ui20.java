package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ui20 implements qx9 {
    public static final AtomicReference a = new AtomicReference();

    @Override // p.qx9
    public final void a(boolean z) {
        synchronized (wi20.k) {
            try {
                for (wi20 wi20Var : new ArrayList(wi20.l.values())) {
                    if (wi20Var.e.get()) {
                        Iterator it = wi20Var.i.iterator();
                        while (it.hasNext()) {
                            wi20 wi20Var2 = ((ti20) it.next()).a;
                            if (!z) {
                                ((v0s) wi20Var2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
