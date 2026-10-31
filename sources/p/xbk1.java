package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xbk1 {
    public final ybk1 a = new ybk1();

    public final void P(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        ybk1 ybk1Var = this.a;
        if (ybk1Var.d) {
            ybk1.a(autoCloseable);
            return;
        }
        synchronized (ybk1Var.a) {
            autoCloseable2 = (AutoCloseable) ybk1Var.b.put(str, autoCloseable);
        }
        ybk1.a(autoCloseable2);
    }

    public final void Q() {
        ybk1 ybk1Var = this.a;
        if (!ybk1Var.d) {
            ybk1Var.d = true;
            synchronized (ybk1Var.a) {
                try {
                    Iterator it = ybk1Var.b.values().iterator();
                    while (it.hasNext()) {
                        ybk1.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = ybk1Var.c.iterator();
                    while (it2.hasNext()) {
                        ybk1.a((AutoCloseable) it2.next());
                    }
                    ybk1Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        S();
    }

    public final AutoCloseable R(String str) {
        AutoCloseable autoCloseable;
        ybk1 ybk1Var = this.a;
        synchronized (ybk1Var.a) {
            autoCloseable = (AutoCloseable) ybk1Var.b.get(str);
        }
        return autoCloseable;
    }

    public void S() {
    }
}
