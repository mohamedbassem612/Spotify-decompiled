package p;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class v6<V> extends a490 implements n8d0 {
    static final boolean a;
    static final bub0 b;
    private static final a c;
    private static final Object d;
    private volatile d listeners;
    private volatile Object value;
    private volatile k waiters;

    public static abstract class a {
        public boolean a(v6 v6Var, d dVar, d dVar2) {
            synchronized (v6Var) {
                try {
                    if (v6Var.listeners != dVar) {
                        return false;
                    }
                    v6Var.listeners = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean b(v6 v6Var, Object obj, Object obj2) {
            synchronized (v6Var) {
                try {
                    if (v6Var.value != obj) {
                        return false;
                    }
                    v6Var.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean c(v6 v6Var, k kVar, k kVar2) {
            synchronized (v6Var) {
                try {
                    if (v6Var.waiters != kVar) {
                        return false;
                    }
                    v6Var.waiters = kVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public d d(v6 v6Var, d dVar) {
            d dVar2;
            synchronized (v6Var) {
                try {
                    dVar2 = v6Var.listeners;
                    if (dVar2 != dVar) {
                        v6Var.listeners = dVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar2;
        }

        public k e(v6 v6Var, k kVar) {
            k kVar2;
            synchronized (v6Var) {
                try {
                    kVar2 = v6Var.waiters;
                    if (kVar2 != kVar) {
                        v6Var.waiters = kVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return kVar2;
        }

        public void f(k kVar, k kVar2) {
            kVar.next = kVar2;
        }

        public void g(k kVar, Thread thread) {
            kVar.thread = thread;
        }
    }

    public static final class b {
        static final b c;
        static final b d;
        final boolean a;
        final Throwable b;

        static {
            if (v6.a) {
                d = null;
                c = null;
            } else {
                d = new b(null, false);
                c = new b(null, true);
            }
        }

        public b(Throwable th, boolean z) {
            this.a = z;
            this.b = th;
        }
    }

    public static final class c {
        static final c b = new c(new a("Failure occurred while trying to finish a future."));
        final Throwable a;

        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            th.getClass();
            this.a = th;
        }
    }

    public static final class e extends a {
        final AtomicReferenceFieldUpdater<k, Thread> a;
        final AtomicReferenceFieldUpdater<k, k> b;
        final AtomicReferenceFieldUpdater<? super v6<?>, k> c;
        final AtomicReferenceFieldUpdater<? super v6<?>, d> d;
        final AtomicReferenceFieldUpdater<? super v6<?>, Object> e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // p.v6.a
        public final boolean a(v6 v6Var, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<? super v6<?>, d> atomicReferenceFieldUpdater = this.d;
            while (!atomicReferenceFieldUpdater.compareAndSet(v6Var, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(v6Var) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // p.v6.a
        public final boolean b(v6 v6Var, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super v6<?>, Object> atomicReferenceFieldUpdater = this.e;
            while (!atomicReferenceFieldUpdater.compareAndSet(v6Var, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(v6Var) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // p.v6.a
        public final boolean c(v6 v6Var, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<? super v6<?>, k> atomicReferenceFieldUpdater = this.c;
            while (!atomicReferenceFieldUpdater.compareAndSet(v6Var, kVar, kVar2)) {
                if (atomicReferenceFieldUpdater.get(v6Var) != kVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // p.v6.a
        public final d d(v6 v6Var, d dVar) {
            return this.d.getAndSet(v6Var, dVar);
        }

        @Override // p.v6.a
        public final k e(v6 v6Var, k kVar) {
            return this.c.getAndSet(v6Var, kVar);
        }

        @Override // p.v6.a
        public final void f(k kVar, k kVar2) {
            this.b.lazySet(kVar, kVar2);
        }

        @Override // p.v6.a
        public final void g(k kVar, Thread thread) {
            this.a.lazySet(kVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
        final v6<V> a;
        final n8d0 b;

        public f(v6 v6Var, n8d0 n8d0Var) {
            this.a = v6Var;
            this.b = n8d0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((v6) this.a).value != this) {
                return;
            }
            if (v6.c.b(this.a, this, v6.q(this.b))) {
                v6.n(this.a, false);
            }
        }
    }

    public static final class g extends a {
    }

    public interface h<V> extends n8d0 {
    }

    public static abstract class i<V> extends v6<V> implements h<V> {
    }

    public static final class j extends a {
        static final Unsafe a;
        static final long b;
        static final long c;
        static final long d;
        static final long e;
        static final long f;

        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            public final Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    c = unsafe.objectFieldOffset(v6.class.getDeclaredField("waiters"));
                    b = unsafe.objectFieldOffset(v6.class.getDeclaredField("listeners"));
                    d = unsafe.objectFieldOffset(v6.class.getDeclaredField("value"));
                    e = unsafe.objectFieldOffset(k.class.getDeclaredField("thread"));
                    f = unsafe.objectFieldOffset(k.class.getDeclaredField("next"));
                    a = unsafe;
                } catch (NoSuchFieldException e2) {
                    eg.j(e2);
                }
            } catch (PrivilegedActionException e3) {
                bhn0.o("Could not initialize intrinsics", e3.getCause());
            }
        }

        @Override // p.v6.a
        public final boolean a(v6 v6Var, d dVar, d dVar2) {
            Unsafe unsafe = a;
            long j = b;
            while (!unsafe.compareAndSwapObject(v6Var, j, dVar, dVar2)) {
                if (unsafe.getObject(v6Var, j) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // p.v6.a
        public final boolean b(v6 v6Var, Object obj, Object obj2) {
            Unsafe unsafe = a;
            long j = d;
            while (!unsafe.compareAndSwapObject(v6Var, j, obj, obj2)) {
                if (unsafe.getObject(v6Var, j) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // p.v6.a
        public final boolean c(v6 v6Var, k kVar, k kVar2) {
            Unsafe unsafe = a;
            long j = c;
            while (!unsafe.compareAndSwapObject(v6Var, j, kVar, kVar2)) {
                if (unsafe.getObject(v6Var, j) != kVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // p.v6.a
        public final d d(v6 v6Var, d dVar) {
            d dVar2;
            do {
                dVar2 = v6Var.listeners;
                if (dVar == dVar2) {
                    break;
                }
            } while (!a(v6Var, dVar2, dVar));
            return dVar2;
        }

        @Override // p.v6.a
        public final k e(v6 v6Var, k kVar) {
            k kVar2;
            do {
                kVar2 = v6Var.waiters;
                if (kVar == kVar2) {
                    break;
                }
            } while (!c(v6Var, kVar2, kVar));
            return kVar2;
        }

        @Override // p.v6.a
        public final void f(k kVar, k kVar2) {
            a.putObject(kVar, f, kVar2);
        }

        @Override // p.v6.a
        public final void g(k kVar, Thread thread) {
            a.putObject(kVar, e, thread);
        }
    }

    public static final class k {
        static final k a = new k();
        volatile k next;
        volatile Thread thread;

        public k() {
            v6.c.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        a gVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        a = z;
        b = new bub0(v6.class);
        Throwable th2 = null;
        try {
            gVar = new j();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "next"), AtomicReferenceFieldUpdater.newUpdater(v6.class, k.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(v6.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(v6.class, Object.class, "value"));
            } catch (Error | Exception e3) {
                th2 = e3;
                gVar = new g();
            }
        }
        c = gVar;
        if (th2 != null) {
            bub0 bub0Var = b;
            Logger loggerA = bub0Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            bub0Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        d = new Object();
    }

    public static void n(v6 v6Var, boolean z) {
        d dVar = null;
        while (true) {
            v6Var.getClass();
            for (k kVarE = c.e(v6Var, k.a); kVarE != null; kVarE = kVarE.next) {
                Thread thread = kVarE.thread;
                if (thread != null) {
                    kVarE.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                v6Var.r();
                z = false;
            }
            v6Var.l();
            d dVar2 = dVar;
            d dVarD = c.d(v6Var, d.c);
            d dVar3 = dVar2;
            while (dVarD != null) {
                d dVar4 = dVarD.next;
                dVarD.next = dVar3;
                dVar3 = dVarD;
                dVarD = dVar4;
            }
            while (dVar3 != null) {
                dVar = dVar3.next;
                Runnable runnable = dVar3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    v6Var = fVar.a;
                    if (v6Var.value == fVar) {
                        if (c.b(v6Var, fVar, q(fVar.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVar3.b;
                    Objects.requireNonNull(executor);
                    o(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
        }
    }

    public static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            b.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object p(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == d) {
            return null;
        }
        return obj;
    }

    public static Object q(n8d0 n8d0Var) {
        Object obj;
        Throwable thA;
        if (n8d0Var instanceof h) {
            Object bVar = ((v6) n8d0Var).value;
            if (bVar instanceof b) {
                b bVar2 = (b) bVar;
                if (bVar2.a) {
                    bVar = bVar2.b != null ? new b(bVar2.b, false) : b.d;
                }
            }
            Objects.requireNonNull(bVar);
            return bVar;
        }
        if ((n8d0Var instanceof a490) && (thA = ((a490) n8d0Var).a()) != null) {
            return new c(thA);
        }
        boolean zIsCancelled = n8d0Var.isCancelled();
        if ((!a) && zIsCancelled) {
            b bVar3 = b.d;
            Objects.requireNonNull(bVar3);
            return bVar3;
        }
        try {
            try {
                n8d0 n8d0Var2 = n8d0Var;
                boolean z = false;
                while (true) {
                    try {
                        obj = n8d0Var2.get();
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
                if (!zIsCancelled) {
                    return obj == null ? d : obj;
                }
                return new b(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + n8d0Var), false);
            } catch (Error e2) {
                e = e2;
                return new c(e);
            }
        } catch (Error | Exception e3) {
            e = e3;
            return new c(e);
        } catch (CancellationException e4) {
            if (zIsCancelled) {
                return new b(e4, false);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + n8d0Var, e4));
        } catch (ExecutionException e5) {
            if (!zIsCancelled) {
                return new c(e5.getCause());
            }
            return new b(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + n8d0Var, e5), false);
        }
    }

    @Override // p.a490
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof c) {
            return ((c) obj).a;
        }
        return null;
    }

    public void b(Runnable runnable, Executor executor) {
        d dVar;
        dm5.s(executor, "Executor was null.");
        if (!isDone() && (dVar = this.listeners) != d.c) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (c.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != d.c);
        }
        o(runnable, executor);
    }

    public boolean cancel(boolean z) {
        b bVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (a) {
            bVar = new b(new CancellationException("Future.cancel() was called."), z);
        } else {
            bVar = z ? b.c : b.d;
            Objects.requireNonNull(bVar);
        }
        boolean z2 = false;
        while (true) {
            if (c.b(this, obj, bVar)) {
                n(this, z);
                if (obj instanceof f) {
                    n8d0 n8d0Var = ((f) obj).b;
                    if (n8d0Var instanceof h) {
                        this = (v6) n8d0Var;
                        obj = this.value;
                        if ((obj == null) | (obj instanceof f)) {
                            z2 = true;
                        }
                    } else {
                        n8d0Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.value;
            if (!(obj instanceof f)) {
                return z2;
            }
        }
    }

    public Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof f))) {
            return p(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.waiters;
            if (kVar != k.a) {
                k kVar2 = new k();
                while (true) {
                    c.f(kVar2, kVar);
                    if (c.c(this, kVar, kVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                t(kVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return p(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        t(kVar2);
                        break;
                    }
                    kVar = this.waiters;
                    if (kVar == k.a) {
                    }
                }
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return p(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof f))) {
                return p(obj4);
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
        StringBuilder sbS = cy30.s(j2, "Waited ", " ");
        sbS.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbS.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = gvg.f(nanos2, strConcat, " nanoseconds ");
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(f4i1.f(string3, " for ", string));
    }

    public boolean isCancelled() {
        return this.value instanceof b;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(StringBuilder sb) {
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
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        m(obj, sb);
        sb.append("]");
    }

    public final void m(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String s() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void t(k kVar) {
        kVar.thread = null;
        while (true) {
            k kVar2 = this.waiters;
            if (kVar2 == k.a) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.next;
                if (kVar2.thread != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.next = kVar4;
                    if (kVar3.thread == null) {
                    }
                } else if (!c.c(this, kVar2, kVar4)) {
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    public final String toString() {
        String strS;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.value;
            if (obj instanceof f) {
                sb.append(", setFuture=[");
                n8d0 n8d0Var = ((f) obj).b;
                try {
                    if (n8d0Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(n8d0Var);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strS = s();
                    if (jhc1.F(strS)) {
                        strS = null;
                    }
                } catch (Exception | StackOverflowError e4) {
                    strS = "Exception thrown from implementation: " + e4.getClass();
                }
                if (strS != null) {
                    sb.append(", info=[");
                    sb.append(strS);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                k(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!c.b(this, null, obj)) {
            return false;
        }
        n(this, false);
        return true;
    }

    public boolean v(Throwable th) {
        th.getClass();
        if (!c.b(this, null, new c(th))) {
            return false;
        }
        n(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean w(n8d0 n8d0Var) {
        c cVar;
        n8d0Var.getClass();
        Object obj = this.value;
        if (obj != null) {
            if (obj instanceof b) {
                n8d0Var.cancel(((b) obj).a);
            }
        } else if (n8d0Var.isDone()) {
            if (c.b(this, null, q(n8d0Var))) {
                n(this, false);
                return true;
            }
        } else {
            f fVar = new f(this, n8d0Var);
            if (c.b(this, null, fVar)) {
                try {
                    n8d0Var.b(fVar, l5u.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Error | Exception unused) {
                        cVar = c.b;
                    }
                    c.b(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.value;
            if (obj instanceof b) {
                n8d0Var.cancel(((b) obj).a);
            }
        }
        return false;
    }

    public final boolean x() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).a;
    }

    public static final class d {
        static final d c = new d();
        final Runnable a;
        final Executor b;
        d next;

        public d() {
            this.a = null;
            this.b = null;
        }

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    public void l() {
    }

    public void r() {
    }

    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return p(obj2);
            }
            k kVar = this.waiters;
            if (kVar != k.a) {
                k kVar2 = new k();
                do {
                    c.f(kVar2, kVar);
                    if (c.c(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                t(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return p(obj);
                    }
                    kVar = this.waiters;
                } while (kVar != k.a);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return p(obj3);
        }
        throw new InterruptedException();
    }
}
