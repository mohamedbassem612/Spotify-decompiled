package p;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class em5 implements Runnable {
    public final /* synthetic */ byte a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (dhn.a.contains(gm5.class)) {
                    return;
                }
                try {
                    gm5.c = null;
                    if (w0o1.k() != 2) {
                        gm5.d(2);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    dhn.a(gm5.class, th);
                    return;
                }
            case 1:
                if (dhn.a.contains(dim0.class)) {
                    return;
                }
                try {
                    etc1.a();
                    return;
                } catch (Throwable th2) {
                    dhn.a(dim0.class, th2);
                    return;
                }
            case 2:
                if (dhn.a.contains(dim0.class)) {
                    return;
                }
                try {
                    ns80.a();
                    return;
                } catch (Throwable th3) {
                    dhn.a(dim0.class, th3);
                    return;
                }
            default:
                AtomicBoolean atomicBoolean = omn0.c;
                if (dhn.a.contains(omn0.class)) {
                    return;
                }
                try {
                    try {
                        Iterator it = omn0.b.iterator();
                        while (it.hasNext()) {
                            ((nmn0) it.next()).a(true);
                        }
                        atomicBoolean.set(false);
                        return;
                    } catch (Throwable th4) {
                        dhn.a(omn0.class, th4);
                        return;
                    }
                } catch (Throwable th5) {
                    atomicBoolean.set(false);
                    throw th5;
                }
        }
    }
}
