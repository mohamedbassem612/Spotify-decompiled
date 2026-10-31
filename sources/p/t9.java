package p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class t9 implements n8d0 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(t9.class.getName());
    public static final oto1 f;
    public static final Object g;
    public volatile Object a;
    public volatile o9 b;
    public volatile s9 c;

    static {
        p9 r9Var;
        try {
            r9Var = new p9(AtomicReferenceFieldUpdater.newUpdater(s9.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(s9.class, s9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(t9.class, s9.class, "c"), AtomicReferenceFieldUpdater.newUpdater(t9.class, o9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(t9.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            r9Var = new r9();
        }
        f = r9Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void e(t9 t9Var) {
        o9 o9Var;
        o9 o9Var2;
        o9 o9Var3 = null;
        while (true) {
            s9 s9Var = t9Var.c;
            if (f.j(t9Var, s9Var, s9.c)) {
                while (s9Var != null) {
                    Thread thread = s9Var.a;
                    if (thread != null) {
                        s9Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    s9Var = s9Var.b;
                }
                t9Var.d();
                do {
                    o9Var = t9Var.b;
                } while (!f.h(t9Var, o9Var, o9.d));
                while (true) {
                    o9Var2 = o9Var3;
                    o9Var3 = o9Var;
                    if (o9Var3 == null) {
                        break;
                    }
                    o9Var = o9Var3.c;
                    o9Var3.c = o9Var2;
                }
                while (o9Var2 != null) {
                    o9Var3 = o9Var2.c;
                    q9 q9Var = o9Var2.a;
                    if (q9Var instanceof q9) {
                        q9 q9Var2 = q9Var;
                        t9Var = q9Var2.a;
                        if (t9Var.a == q9Var2) {
                            if (f.i(t9Var, q9Var2, h(q9Var2.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        f(q9Var, o9Var2.b);
                    }
                    o9Var2 = o9Var3;
                }
                return;
            }
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof l9) {
            Throwable th = ((l9) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof n9) {
            throw new ExecutionException(((n9) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object h(n8d0 n8d0Var) {
        if (n8d0Var instanceof t9) {
            Object obj = ((t9) n8d0Var).a;
            if (!(obj instanceof l9)) {
                return obj;
            }
            l9 l9Var = (l9) obj;
            if (l9Var.a) {
                return l9Var.b != null ? new l9(l9Var.b, false) : l9.d;
            }
            return obj;
        }
        boolean zIsCancelled = n8d0Var.isCancelled();
        if ((!d) && zIsCancelled) {
            return l9.d;
        }
        try {
            Object objI = i(n8d0Var);
            return objI == null ? g : objI;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new l9(e2, false);
            }
            return new n9(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + n8d0Var, e2));
        } catch (ExecutionException e3) {
            return new n9(e3.getCause());
        } catch (Throwable th) {
            return new n9(th);
        }
    }

    public static Object i(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(objI == this ? "this future" : String.valueOf(objI));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // p.n8d0
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        o9 o9Var = this.b;
        o9 o9Var2 = o9.d;
        if (o9Var != o9Var2) {
            o9 o9Var3 = new o9(runnable, executor);
            do {
                o9Var3.c = o9Var;
                if (f.h(this, o9Var, o9Var3)) {
                    return;
                } else {
                    o9Var = this.b;
                }
            } while (o9Var != o9Var2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        l9 l9Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof q9)) {
            return false;
        }
        if (d) {
            l9Var = new l9(new CancellationException("Future.cancel() was called."), z);
        } else {
            l9Var = z ? l9.c : l9.d;
        }
        boolean z2 = false;
        while (true) {
            if (f.i(this, obj, l9Var)) {
                e(this);
                if (!(obj instanceof q9)) {
                    break;
                }
                n8d0 n8d0Var = ((q9) obj).b;
                if (!(n8d0Var instanceof t9)) {
                    n8d0Var.cancel(z);
                    break;
                }
                this = (t9) n8d0Var;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof q9)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof q9)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        s9 s9Var = s9.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof q9))) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            s9 s9Var2 = this.c;
            if (s9Var2 != s9Var) {
                s9 s9Var3 = new s9();
                z = true;
                while (true) {
                    oto1 oto1Var = f;
                    oto1Var.u(s9Var3, s9Var2);
                    if (oto1Var.j(this, s9Var2, s9Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                k(s9Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof q9))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(s9Var3);
                        break;
                    }
                    s9Var2 = this.c;
                    if (s9Var2 == s9Var) {
                    }
                }
            }
            return g(this.a);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.a;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof q9))) {
                return g(obj3);
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
        StringBuilder sbS = cy30.s(j, "Waited ", " ");
        sbS.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbS.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z2) {
                strConcat = gvg.f(nanos2, strConcat, " nanoseconds ");
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(f4i1.f(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof l9;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof q9)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        Object obj = this.a;
        if (obj instanceof q9) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            n8d0 n8d0Var = ((q9) obj).b;
            return l1d.n(n8d0Var == this ? "this future" : String.valueOf(n8d0Var), "]", sb);
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(s9 s9Var) {
        s9Var.a = null;
        while (true) {
            s9 s9Var2 = this.c;
            if (s9Var2 == s9.c) {
                return;
            }
            s9 s9Var3 = null;
            while (s9Var2 != null) {
                s9 s9Var4 = s9Var2.b;
                if (s9Var2.a != null) {
                    s9Var3 = s9Var2;
                } else if (s9Var3 != null) {
                    s9Var3.b = s9Var4;
                    if (s9Var3.a == null) {
                    }
                } else if (!f.j(this, s9Var2, s9Var4)) {
                }
                s9Var2 = s9Var4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.i(this, (Object) null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!f.i(this, (Object) null, new n9(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof l9) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strJ = j();
            } catch (RuntimeException e2) {
                strJ = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strJ != null && !strJ.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strJ);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        s9 s9Var = s9.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof q9))) {
                return g(obj2);
            }
            s9 s9Var2 = this.c;
            if (s9Var2 != s9Var) {
                s9 s9Var3 = new s9();
                do {
                    oto1 oto1Var = f;
                    oto1Var.u(s9Var3, s9Var2);
                    if (oto1Var.j(this, s9Var2, s9Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(s9Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof q9))));
                        return g(obj);
                    }
                    s9Var2 = this.c;
                } while (s9Var2 != s9Var);
            }
            return g(this.a);
        }
        throw new InterruptedException();
    }
}
