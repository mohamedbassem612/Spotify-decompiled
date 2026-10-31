package p;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yyn1 extends nvn1 implements gyn1 {
    public gyn1 h;
    public ScheduledFuture i;

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof xun1) {
            Throwable th = ((xun1) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof avn1) {
            throw new ExecutionException(((avn1) obj).a);
        }
        if (obj == nvn1.d) {
            return null;
        }
        return obj;
    }

    public static boolean g(Object obj) {
        return !(obj instanceof yun1);
    }

    public static Object h(gyn1 gyn1Var) {
        Object obj;
        Throwable thD;
        if (gyn1Var instanceof yyn1) {
            Object xun1Var = ((yyn1) gyn1Var).a;
            if (xun1Var instanceof xun1) {
                xun1 xun1Var2 = (xun1) xun1Var;
                if (xun1Var2.a) {
                    Throwable th = xun1Var2.b;
                    xun1Var = th != null ? new xun1(th, false) : xun1.d;
                }
            }
            Objects.requireNonNull(xun1Var);
            return xun1Var;
        }
        if ((gyn1Var instanceof nvn1) && (thD = ((nvn1) gyn1Var).d()) != null) {
            return new avn1(thD);
        }
        boolean zIsCancelled = gyn1Var.isCancelled();
        boolean z = true;
        if ((!nvn1.f) && zIsCancelled) {
            xun1 xun1Var3 = xun1.d;
            Objects.requireNonNull(xun1Var3);
            return xun1Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = gyn1Var.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new avn1(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new avn1(e);
            } catch (CancellationException e3) {
                return !zIsCancelled ? new avn1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(gyn1Var)), e3)) : new xun1(e3, false);
            } catch (ExecutionException e4) {
                return zIsCancelled ? new xun1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(gyn1Var)), e4), false) : new avn1(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (zIsCancelled) {
            return new xun1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(gyn1Var))), false);
        }
        return obj == null ? nvn1.d : obj;
    }

    public static void j(yyn1 yyn1Var) {
        bvn1 bvn1Var = null;
        while (true) {
            yyn1Var.getClass();
            for (ivn1 ivn1VarR = nvn1.g.R(yyn1Var); ivn1VarR != null; ivn1VarR = ivn1VarR.b) {
                Thread thread = ivn1VarR.a;
                if (thread != null) {
                    ivn1VarR.a = null;
                    LockSupport.unpark(thread);
                }
            }
            gyn1 gyn1Var = yyn1Var.h;
            if ((yyn1Var.a instanceof xun1) & (gyn1Var != null)) {
                Object obj = yyn1Var.a;
                gyn1Var.cancel((obj instanceof xun1) && ((xun1) obj).a);
            }
            ScheduledFuture scheduledFuture = yyn1Var.i;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            yyn1Var.h = null;
            yyn1Var.i = null;
            bvn1 bvn1Var2 = bvn1Var;
            bvn1 bvn1VarQ = nvn1.g.Q(yyn1Var);
            bvn1 bvn1Var3 = bvn1Var2;
            while (bvn1VarQ != null) {
                bvn1 bvn1Var4 = bvn1VarQ.c;
                bvn1VarQ.c = bvn1Var3;
                bvn1Var3 = bvn1VarQ;
                bvn1VarQ = bvn1Var4;
            }
            while (bvn1Var3 != null) {
                Runnable runnable = bvn1Var3.a;
                bvn1 bvn1Var5 = bvn1Var3.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof yun1) {
                    yun1 yun1Var = (yun1) runnable;
                    yyn1Var = yun1Var.a;
                    if (yyn1Var.a != yun1Var) {
                        continue;
                    } else if (nvn1.g.V(yyn1Var, yun1Var, h(yun1Var.b))) {
                        bvn1Var = bvn1Var5;
                    }
                } else {
                    Executor executor = bvn1Var3.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                bvn1Var3 = bvn1Var5;
            }
            return;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            nvn1.e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", gvg.h("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        bvn1 bvn1Var;
        bvn1 bvn1Var2 = bvn1.d;
        if (executor == null) {
            bhn0.i("Executor was null.");
            return;
        }
        if (!isDone() && (bvn1Var = this.b) != bvn1Var2) {
            bvn1 bvn1Var3 = new bvn1(runnable, executor);
            do {
                bvn1Var3.c = bvn1Var;
                if (nvn1.g.U(this, bvn1Var, bvn1Var3)) {
                    return;
                } else {
                    bvn1Var = this.b;
                }
            } while (bvn1Var != bvn1Var2);
        }
        k(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        xun1 xun1Var;
        Object obj = this.a;
        if (!(obj instanceof yun1) && !(obj == null)) {
            return false;
        }
        if (nvn1.f) {
            xun1Var = new xun1(new CancellationException("Future.cancel() was called."), z);
        } else {
            xun1Var = z ? xun1.c : xun1.d;
            Objects.requireNonNull(xun1Var);
        }
        boolean z2 = false;
        while (true) {
            if (nvn1.g.V(this, obj, xun1Var)) {
                j(this);
                if (obj instanceof yun1) {
                    gyn1 gyn1Var = ((yun1) obj).b;
                    if (gyn1Var instanceof yyn1) {
                        this = (yyn1) gyn1Var;
                        obj = this.a;
                        if ((obj == null) | (obj instanceof yun1)) {
                            z2 = true;
                        }
                    } else {
                        gyn1Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.a;
            if (g(obj)) {
                return z2;
            }
        }
    }

    @Override // p.nvn1
    public final Throwable d() {
        if (!(this instanceof yyn1)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof avn1) {
            return ((avn1) obj).a;
        }
        return null;
    }

    public final String f() {
        gyn1 gyn1Var = this.h;
        ScheduledFuture scheduledFuture = this.i;
        if (gyn1Var == null) {
            return null;
        }
        String strF = f4i1.f("inputFuture=[", gyn1Var.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strF + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strF;
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        ivn1 ivn1Var = ivn1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && g(obj)) {
            return e(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ivn1 ivn1Var2 = this.c;
            if (ivn1Var2 != ivn1Var) {
                ivn1 ivn1Var3 = new ivn1();
                while (true) {
                    ggo1 ggo1Var = nvn1.g;
                    ggo1Var.S(ivn1Var3, ivn1Var2);
                    if (ggo1Var.W(this, ivn1Var2, ivn1Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(ivn1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && g(obj2)) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        a(ivn1Var3);
                        break;
                    }
                    long j4 = j3;
                    ivn1Var2 = this.c;
                    if (ivn1Var2 != ivn1Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null) && g(obj4)) {
                return e(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == j2 || nanos2 > 1000;
            if (jConvert > j2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(StringBuilder sb) {
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
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    public final boolean isCancelled() {
        return this.a instanceof xun1;
    }

    public final boolean isDone() {
        Object obj = this.a;
        return (obj != null) & g(obj);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof xun1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof yun1) {
                sb.append(", setFuture=[");
                gyn1 gyn1Var = ((yun1) obj).b;
                try {
                    if (gyn1Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(gyn1Var);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = f();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                i(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() throws InterruptedException {
        Object obj;
        ivn1 ivn1Var = ivn1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & g(obj2)) {
                return e(obj2);
            }
            ivn1 ivn1Var2 = this.c;
            if (ivn1Var2 != ivn1Var) {
                ivn1 ivn1Var3 = new ivn1();
                do {
                    ggo1 ggo1Var = nvn1.g;
                    ggo1Var.S(ivn1Var3, ivn1Var2);
                    if (ggo1Var.W(this, ivn1Var2, ivn1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                a(ivn1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & g(obj)));
                        return e(obj);
                    }
                    ivn1Var2 = this.c;
                } while (ivn1Var2 != ivn1Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        throw new InterruptedException();
    }
}
