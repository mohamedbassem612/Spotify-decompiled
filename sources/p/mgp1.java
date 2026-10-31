package p;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mgp1 extends AtomicReference implements Runnable {
    public static final ghp0 c = new ghp0((byte) 4);
    public static final ghp0 d = new ghp0((byte) 4);
    public final Callable a;
    public final /* synthetic */ ogp1 b;

    public mgp1(ogp1 ogp1Var, Callable callable) {
        this.b = ogp1Var;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        zfp1 zfp1Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof zfp1;
            Runnable runnable2 = d;
            if (!z2) {
                if (runnable != runnable2) {
                    break;
                }
            } else {
                zfp1Var = (zfp1) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                z = Thread.interrupted() || z;
                LockSupport.park(zfp1Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            ogp1 ogp1Var = this.b;
            boolean zIsDone = ogp1Var.isDone();
            ghp0 ghp0Var = c;
            if (zIsDone) {
                objCall = null;
            } else {
                try {
                    objCall = this.a.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, ghp0Var)) {
                            a(threadCurrentThread);
                        }
                        boolean zF = tfp1.g.F(ogp1Var, null, new kfp1(th));
                        if (zF) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (!compareAndSet(threadCurrentThread, ghp0Var)) {
                            a(threadCurrentThread);
                        }
                        if (tfp1.g.F(ogp1Var, null, tfp1.d)) {
                            nfp1.h(ogp1Var);
                        }
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, ghp0Var)) {
                a(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            if (objCall == null) {
                objCall = tfp1.d;
            }
            if (tfp1.g.F(ogp1Var, null, objCall)) {
                nfp1.h(ogp1Var);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strQ;
        ghp0 ghp0Var = (Runnable) get();
        if (ghp0Var == c) {
            strQ = "running=[DONE]";
        } else if (ghp0Var instanceof zfp1) {
            strQ = "running=[INTERRUPTED]";
        } else if (ghp0Var instanceof Thread) {
            String name = ((Thread) ghp0Var).getName();
            strQ = l1d.q(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strQ = "running=[NOT STARTED YET]";
        }
        String string = this.a.toString();
        return l1d.q(new StringBuilder(strQ.length() + 2 + String.valueOf(string).length()), strQ, ", ", string);
    }
}
