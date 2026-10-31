package p;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class nfp1 extends tfp1 {
    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof jfp1) {
            Throwable th = ((jfp1) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof kfp1) {
            throw new ExecutionException(((kfp1) obj).a);
        }
        if (obj == tfp1.d) {
            return null;
        }
        return obj;
    }

    public static Object g(nfp1 nfp1Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = nfp1Var.get();
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

    public static void h(nfp1 nfp1Var) {
        for (rfp1 rfp1VarD = tfp1.g.D(nfp1Var); rfp1VarD != null; rfp1VarD = rfp1VarD.b) {
            Thread thread = rfp1VarD.a;
            if (thread != null) {
                rfp1VarD.a = null;
                LockSupport.unpark(thread);
            }
        }
        nfp1Var.e();
        lfp1 lfp1VarE = tfp1.g.E(nfp1Var);
        lfp1 lfp1Var = null;
        while (lfp1VarE != null) {
            lfp1 lfp1Var2 = lfp1VarE.c;
            lfp1VarE.c = lfp1Var;
            lfp1Var = lfp1VarE;
            lfp1VarE = lfp1Var2;
        }
        while (lfp1Var != null) {
            Runnable runnable = lfp1Var.a;
            lfp1 lfp1Var3 = lfp1Var.c;
            Objects.requireNonNull(runnable);
            Executor executor = lfp1Var.b;
            Objects.requireNonNull(executor);
            j(runnable, executor);
            lfp1Var = lfp1Var3;
        }
    }

    public static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger loggerA = tfp1.e.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", rjx.o(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
        }
    }

    public final void b(Runnable runnable, Executor executor) {
        lfp1 lfp1Var;
        lfp1 lfp1Var2 = lfp1.d;
        if (executor == null) {
            bhn0.i("Executor was null.");
            return;
        }
        if (!isDone() && (lfp1Var = this.b) != lfp1Var2) {
            lfp1 lfp1Var3 = new lfp1(runnable, executor);
            do {
                lfp1Var3.c = lfp1Var;
                if (tfp1.g.C(this, lfp1Var, lfp1Var3)) {
                    return;
                } else {
                    lfp1Var = this.b;
                }
            } while (lfp1Var != lfp1Var2);
        }
        j(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        jfp1 jfp1Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (tfp1.f) {
            jfp1Var = new jfp1(new CancellationException("Future.cancel() was called."), z);
        } else {
            jfp1Var = z ? jfp1.c : jfp1.d;
            Objects.requireNonNull(jfp1Var);
        }
        if (!tfp1.g.F(this, obj, jfp1Var)) {
            return false;
        }
        h(this);
        return true;
    }

    public abstract String f();

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        rfp1 rfp1Var = rfp1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return d(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            rfp1 rfp1Var2 = this.c;
            if (rfp1Var2 != rfp1Var) {
                rfp1 rfp1Var3 = new rfp1();
                while (true) {
                    too1 too1Var = tfp1.g;
                    too1Var.A(rfp1Var3, rfp1Var2);
                    if (too1Var.B(this, rfp1Var2, rfp1Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(rfp1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        a(rfp1Var3);
                        break;
                    }
                    long j4 = j3;
                    rfp1Var2 = this.c;
                    if (rfp1Var2 != rfp1Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return d(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if (obj4 != null) {
                return d(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == j2 || nanos2 > 1000;
            if (jConvert > j2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                sb2.append(strConcat);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(l1d.q(new StringBuilder(string3.length() + 5 + string.length()), string3, " for ", string));
    }

    public final void i(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            if (objG == null) {
                sb.append("null");
            } else if (objG == this) {
                sb.append("this future");
            } else {
                sb.append(objG.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objG)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final boolean isCancelled() {
        return this.a instanceof jfp1;
    }

    public final boolean isDone() {
        return this.a != null;
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
        if (this.a instanceof jfp1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                strConcat = f();
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (Throwable th) {
                if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                    throw th;
                }
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                i(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void e() {
    }

    public final Object get() throws InterruptedException {
        Object obj;
        rfp1 rfp1Var = rfp1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return d(obj2);
            }
            rfp1 rfp1Var2 = this.c;
            if (rfp1Var2 != rfp1Var) {
                rfp1 rfp1Var3 = new rfp1();
                do {
                    too1 too1Var = tfp1.g;
                    too1Var.A(rfp1Var3, rfp1Var2);
                    if (too1Var.B(this, rfp1Var2, rfp1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                a(rfp1Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    rfp1Var2 = this.c;
                } while (rfp1Var2 != rfp1Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return d(obj3);
        }
        throw new InterruptedException();
    }
}
