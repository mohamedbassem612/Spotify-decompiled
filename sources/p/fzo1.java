package p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class fzo1 implements gyn1 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(fzo1.class.getName());
    public static final qgo1 f;
    public static final Object g;
    public volatile Object a;
    public volatile zeo1 b;
    public volatile ivo1 c;

    static {
        qgo1 oso1Var;
        try {
            oso1Var = new wlo1(AtomicReferenceFieldUpdater.newUpdater(ivo1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(ivo1.class, ivo1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(fzo1.class, ivo1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(fzo1.class, zeo1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(fzo1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            oso1Var = new oso1();
        }
        Throwable th2 = th;
        f = oso1Var;
        if (th2 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static void d(fzo1 fzo1Var) {
        ivo1 ivo1Var;
        qgo1 qgo1Var;
        zeo1 zeo1Var;
        zeo1 zeo1Var2;
        zeo1 zeo1Var3;
        do {
            ivo1Var = fzo1Var.c;
            qgo1Var = f;
        } while (!qgo1Var.E(fzo1Var, ivo1Var, ivo1.c));
        while (true) {
            zeo1Var = null;
            if (ivo1Var == null) {
                break;
            }
            Thread thread = ivo1Var.a;
            if (thread != null) {
                ivo1Var.a = null;
                LockSupport.unpark(thread);
            }
            ivo1Var = ivo1Var.b;
        }
        do {
            zeo1Var2 = fzo1Var.b;
        } while (!qgo1Var.C(fzo1Var, zeo1Var2, zeo1.d));
        while (true) {
            zeo1Var3 = zeo1Var;
            zeo1Var = zeo1Var2;
            if (zeo1Var == null) {
                break;
            }
            zeo1Var2 = zeo1Var.c;
            zeo1Var.c = zeo1Var3;
        }
        while (zeo1Var3 != null) {
            Runnable runnable = zeo1Var3.a;
            zeo1 zeo1Var4 = zeo1Var3.c;
            f(runnable, zeo1Var3.b);
            zeo1Var3 = zeo1Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", gvg.h("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object h(Object obj) throws ExecutionException {
        if (obj instanceof z1o1) {
            Throwable th = ((z1o1) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof jbo1) {
            throw new ExecutionException(((jbo1) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return gvg.f(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        zeo1 zeo1Var = this.b;
        zeo1 zeo1Var2 = zeo1.d;
        if (zeo1Var != zeo1Var2) {
            zeo1 zeo1Var3 = new zeo1(runnable, executor);
            do {
                zeo1Var3.c = zeo1Var;
                if (f.C(this, zeo1Var, zeo1Var3)) {
                    return;
                } else {
                    zeo1Var = this.b;
                }
            } while (zeo1Var != zeo1Var2);
        }
        f(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        z1o1 z1o1Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            z1o1Var = new z1o1(new CancellationException("Future.cancel() was called."));
        } else {
            z1o1Var = z ? z1o1.b : z1o1.c;
        }
        if (!f.D(this, obj, z1o1Var)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void g(ivo1 ivo1Var) {
        ivo1Var.a = null;
        while (true) {
            ivo1 ivo1Var2 = this.c;
            if (ivo1Var2 != ivo1.c) {
                ivo1 ivo1Var3 = null;
                while (ivo1Var2 != null) {
                    ivo1 ivo1Var4 = ivo1Var2.b;
                    if (ivo1Var2.a != null) {
                        ivo1Var3 = ivo1Var2;
                    } else if (ivo1Var3 != null) {
                        ivo1Var3.b = ivo1Var4;
                        if (ivo1Var3.a == null) {
                        }
                    } else if (!f.E(this, ivo1Var2, ivo1Var4)) {
                    }
                    ivo1Var2 = ivo1Var4;
                }
                return;
            }
            return;
        }
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ivo1 ivo1Var = this.c;
            ivo1 ivo1Var2 = ivo1.c;
            if (ivo1Var != ivo1Var2) {
                ivo1 ivo1Var3 = new ivo1();
                while (true) {
                    qgo1 qgo1Var = f;
                    qgo1Var.A(ivo1Var3, ivo1Var);
                    if (qgo1Var.E(this, ivo1Var, ivo1Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(ivo1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(ivo1Var3);
                        break;
                    }
                    ivo1Var = this.c;
                    if (ivo1Var == ivo1Var2) {
                    }
                }
            }
            return h(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = true;
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = gvg.f(nanos2, strConcat2, " nanoseconds ");
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(f4i1.f(strConcat, " for ", string));
    }

    public final boolean isCancelled() {
        return this.a instanceof z1o1;
    }

    public final boolean isDone() {
        return this.a != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof z1o1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e2) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return h(obj2);
            }
            ivo1 ivo1Var = this.c;
            ivo1 ivo1Var2 = ivo1.c;
            if (ivo1Var != ivo1Var2) {
                ivo1 ivo1Var3 = new ivo1();
                do {
                    qgo1 qgo1Var = f;
                    qgo1Var.A(ivo1Var3, ivo1Var);
                    if (qgo1Var.E(this, ivo1Var, ivo1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                g(ivo1Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    ivo1Var = this.c;
                } while (ivo1Var != ivo1Var2);
            }
            return h(this.a);
        }
        throw new InterruptedException();
    }
}
