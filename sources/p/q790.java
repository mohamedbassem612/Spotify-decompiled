package p;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class q790 extends AtomicReference implements Runnable {
    public static final ghp0 a = new ghp0((byte) 2);
    public static final ghp0 b = new ghp0((byte) 2);

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        Runnable runnable = b;
        ghp0 ghp0Var = a;
        Runnable runnable2 = (Runnable) get();
        if (runnable2 instanceof Thread) {
            p790 p790Var = new p790(this);
            p790Var.a(Thread.currentThread());
            if (compareAndSet(runnable2, p790Var)) {
                try {
                    ((Thread) runnable2).interrupt();
                } finally {
                    if (((Runnable) getAndSet(ghp0Var)) == runnable) {
                        LockSupport.unpark((Thread) runnable2);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        p790 p790Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof p790;
            Runnable runnable2 = b;
            if (!z2 && runnable != runnable2) {
                break;
            }
            if (z2) {
                p790Var = (p790) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                z = Thread.interrupted() || z;
                LockSupport.park(p790Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            ghp0 ghp0Var = a;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, ghp0Var)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, ghp0Var)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, ghp0Var)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(objE);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        ghp0 ghp0Var = (Runnable) get();
        if (ghp0Var == a) {
            str = "running=[DONE]";
        } else if (ghp0Var instanceof p790) {
            str = "running=[INTERRUPTED]";
        } else if (ghp0Var instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) ghp0Var).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbG = dv20.g(str, ", ");
        sbG.append(f());
        return sbG.toString();
    }
}
