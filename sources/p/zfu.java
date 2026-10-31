package p;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zfu {
    public a6n c;
    public ThreadPoolExecutor d;
    public int a = 64;
    public int b = 5;
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public static void c(zfu zfuVar, gf01 gf01Var, jf01 jf01Var, gf01 gf01Var2, int i) {
        yfu yfuVar;
        gf01 gf01Var3;
        if ((i & 1) != 0) {
            gf01Var = null;
        }
        if ((i & 2) != 0) {
            jf01Var = null;
        }
        if ((i & 4) != 0) {
            gf01Var2 = null;
        }
        zfuVar.getClass();
        TimeZone timeZone = z4n1.a;
        boolean zIsShutdown = zfuVar.a().isShutdown();
        synchronized (zfuVar) {
            if (jf01Var != null) {
                try {
                    if (!zfuVar.g.remove(jf01Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (gf01Var2 != null) {
                gf01Var2.b.decrementAndGet();
                if (!zfuVar.f.remove(gf01Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (gf01Var != null) {
                zfuVar.e.add(gf01Var);
                jf01 jf01Var2 = gf01Var.c;
                if (!jf01Var2.c) {
                    String str = jf01Var2.b.a.d;
                    Iterator it = zfuVar.f.iterator();
                    do {
                        if (!it.hasNext()) {
                            Iterator it2 = zfuVar.e.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    gf01Var3 = null;
                                    break;
                                }
                                gf01Var3 = (gf01) it2.next();
                            } while (!u890.j(gf01Var3.c.b.a.d, str));
                        } else {
                            gf01Var3 = (gf01) it.next();
                        }
                    } while (!u890.j(gf01Var3.c.b.a.d, str));
                    if (gf01Var3 != null) {
                        gf01Var.b = gf01Var3.b;
                    }
                }
            }
            a6n a6nVar = (!(jf01Var == null && gf01Var2 == null) && (zIsShutdown || zfuVar.f.isEmpty()) && zfuVar.g.isEmpty()) ? zfuVar.c : null;
            byte b = 0;
            if (zIsShutdown) {
                List listL1 = o7h.l1(zfuVar.e);
                zfuVar.e.clear();
                yfuVar = new yfu(listL1, a6nVar, b);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = zfuVar.e.iterator();
                while (it3.hasNext()) {
                    gf01 gf01Var4 = (gf01) it3.next();
                    if (zfuVar.f.size() >= zfuVar.a) {
                        break;
                    }
                    if (gf01Var4.b.get() < zfuVar.b) {
                        it3.remove();
                        gf01Var4.b.incrementAndGet();
                        arrayList.add(gf01Var4);
                        zfuVar.f.add(gf01Var4);
                    }
                }
                yfuVar = new yfu(arrayList, a6nVar, b);
            }
        }
        int size = ((List) yfuVar.b).size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            gf01 gf01Var5 = (gf01) ((List) yfuVar.b).get(i2);
            if (gf01Var5 == gf01Var) {
                z = false;
            } else {
                jf01 jf01Var3 = gf01Var5.c;
                jf01Var3.e.m(jf01Var3, zfuVar);
            }
            if (zIsShutdown) {
                gf01Var5.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                jf01 jf01Var4 = gf01Var5.c;
                jf01Var4.j(interruptedIOException);
                gf01Var5.a.k(jf01Var4, interruptedIOException);
            } else {
                ExecutorService executorServiceA = zfuVar.a();
                jf01 jf01Var5 = gf01Var5.c;
                TimeZone timeZone2 = z4n1.a;
                try {
                    try {
                        executorServiceA.execute(gf01Var5);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        jf01 jf01Var6 = gf01Var5.c;
                        jf01Var6.j(interruptedIOException2);
                        gf01Var5.a.k(jf01Var6, interruptedIOException2);
                        jf01Var5.a.a.b(gf01Var5);
                    }
                } catch (Throwable th2) {
                    jf01Var5.a.a.b(gf01Var5);
                    throw th2;
                }
            }
        }
        if (z && gf01Var != null) {
            jf01 jf01Var7 = gf01Var.c;
            jf01Var7.e.n(jf01Var7, zfuVar);
        }
        Runnable runnable = (Runnable) yfuVar.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = this.d;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new SynchronousQueue(), (ThreadFactory) new y4n1(z4n1.b + " Dispatcher", false));
            this.d = threadPoolExecutor2;
            threadPoolExecutor = threadPoolExecutor2;
        }
        return threadPoolExecutor;
    }

    public final void b(gf01 gf01Var) {
        c(this, null, null, gf01Var, 3);
    }
}
