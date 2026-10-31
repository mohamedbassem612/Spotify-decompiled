package p;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dce extends jx30 implements Runnable {
    public ci7 c;
    public final LinkedBlockingQueue d = new LinkedBlockingQueue(1);
    public final CountDownLatch e = new CountDownLatch(1);
    public n8d0 f;
    public volatile n8d0 g;

    public dce(ci7 ci7Var, n8d0 n8d0Var) {
        this.c = ci7Var;
        n8d0Var.getClass();
        this.f = n8d0Var;
    }

    public static Object d(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // p.jx30
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.d.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        n8d0 n8d0Var = this.f;
        if (n8d0Var != null) {
            n8d0Var.cancel(z);
        }
        n8d0 n8d0Var2 = this.g;
        if (n8d0Var2 != null) {
            n8d0Var2.cancel(z);
        }
        return true;
    }

    @Override // p.jx30
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            n8d0 n8d0Var = this.f;
            if (n8d0Var != null) {
                long jNanoTime = System.nanoTime();
                n8d0Var.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.e.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - jNanoTime2);
            n8d0 n8d0Var2 = this.g;
            if (n8d0Var2 != null) {
                n8d0Var2.get(j, timeUnit);
            }
        }
        return this.a.get(j, timeUnit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, p.dce, p.jx30] */
    /* JADX WARN: Type inference failed for: r5v1, types: [p.dce] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.jx30] */
    /* JADX WARN: Type inference failed for: r5v4, types: [p.dce] */
    /* JADX WARN: Type inference failed for: r5v6, types: [p.jx30] */
    /* JADX WARN: Type inference failed for: r5v7, types: [p.jx30] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            p.n8d0 r2 = r5.f     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39 java.util.concurrent.ExecutionException -> L4a java.util.concurrent.CancellationException -> L57
            java.lang.Object r2 = p.poz0.z(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39 java.util.concurrent.ExecutionException -> L4a java.util.concurrent.CancellationException -> L57
            p.ci7 r3 = r5.c     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            p.n8d0 r2 = r3.apply(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r5.g = r2     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            p.n8d0 r3 = r5.a     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            boolean r3 = r3.isCancelled()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            if (r3 == 0) goto L3b
            java.util.concurrent.LinkedBlockingQueue r0 = r5.d     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            java.lang.Object r0 = d(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r2.cancel(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r5.g = r1     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
        L29:
            r5.c = r1
            r5.f = r1
            java.util.concurrent.CountDownLatch r5 = r5.e
            r5.countDown()
            return
        L33:
            r0 = move-exception
            goto L81
        L35:
            r0 = move-exception
            goto L5b
        L37:
            r0 = move-exception
            goto L6c
        L39:
            r0 = move-exception
            goto L74
        L3b:
            p.xwn1 r3 = new p.xwn1     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r4 = 8
            r3.<init>(r5, r2, r0, r4)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            p.n5u r0 = p.n5u.a()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r2.b(r3, r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L4a:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            p.mzc r2 = r5.b     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            if (r2 == 0) goto L29
            r2.c(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L57:
            r5.cancel(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L5b:
            p.mzc r2 = r5.b     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L62
            r2.c(r0)     // Catch: java.lang.Throwable -> L33
        L62:
            r5.c = r1
            r5.f = r1
            java.util.concurrent.CountDownLatch r5 = r5.e
            r5.countDown()
            goto L80
        L6c:
            p.mzc r2 = r5.b     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L62
            r2.c(r0)     // Catch: java.lang.Throwable -> L33
            goto L62
        L74:
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L33
            p.mzc r2 = r5.b     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L62
            r2.c(r0)     // Catch: java.lang.Throwable -> L33
            goto L62
        L80:
            return
        L81:
            r5.c = r1
            r5.f = r1
            java.util.concurrent.CountDownLatch r5 = r5.e
            r5.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dce.run():void");
    }

    @Override // p.jx30
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.a.isDone()) {
            n8d0 n8d0Var = this.f;
            if (n8d0Var != null) {
                n8d0Var.get();
            }
            this.e.await();
            n8d0 n8d0Var2 = this.g;
            if (n8d0Var2 != null) {
                n8d0Var2.get();
            }
        }
        return this.a.get();
    }
}
