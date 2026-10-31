package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.QueueDrainObserver;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final Supplier f;
    public final int g;
    public final boolean h;

    public static final class BufferExactBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public Disposable N0;
        public long O0;
        public long P0;
        public final Scheduler.Worker X;
        public Collection Y;
        public Disposable Z;
        public final Supplier f;
        public final long g;
        public final TimeUnit h;
        public final int i;
        public final boolean t;

        public BufferExactBoundedObserver(SerializedObserver serializedObserver, Supplier supplier, long j, TimeUnit timeUnit, int i, boolean z, Scheduler.Worker worker) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f = supplier;
            this.g = j;
            this.h = timeUnit;
            this.i = i;
            this.t = z;
            this.X = worker;
        }

        @Override // io.reactivex.rxjava3.internal.observers.QueueDrainObserver, io.reactivex.rxjava3.internal.util.ObservableQueueDrain
        public final void a(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        public void dispose() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.N0.dispose();
            this.X.dispose();
            synchronized (this) {
                this.Y = null;
            }
        }

        public boolean isDisposed() {
            return this.d;
        }

        public final void onComplete() {
            Collection collection;
            this.X.dispose();
            synchronized (this) {
                collection = this.Y;
                this.Y = null;
            }
            if (collection != null) {
                this.c.offer(collection);
                this.e = true;
                if (b()) {
                    QueueDrainHelper.c(this.c, this.b, this, this);
                }
            }
        }

        public final void onError(Throwable th) {
            synchronized (this) {
                this.Y = null;
            }
            this.b.onError(th);
            this.X.dispose();
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x005d */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x0073
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onNext(java.lang.Object r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.util.Collection r0 = r7.Y     // Catch: java.lang.Throwable -> L6e
                if (r0 != 0) goto Lb
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                r8 = r0
                r1 = r7
                goto L71
            Lb:
                r0.add(r8)     // Catch: java.lang.Throwable -> L6e
                int r8 = r0.size()     // Catch: java.lang.Throwable -> L6e
                int r1 = r7.i     // Catch: java.lang.Throwable -> L6e
                if (r8 >= r1) goto L18
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L18:
                r8 = 0
                r7.Y = r8     // Catch: java.lang.Throwable -> L6e
                long r1 = r7.O0     // Catch: java.lang.Throwable -> L6e
                r3 = 1
                long r1 = r1 + r3
                r7.O0 = r1     // Catch: java.lang.Throwable -> L6e
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L6e
                boolean r8 = r7.t
                if (r8 == 0) goto L2c
                io.reactivex.rxjava3.disposables.Disposable r8 = r7.Z
                r8.dispose()
            L2c:
                r7.f(r0, r7)
                io.reactivex.rxjava3.functions.Supplier r8 = r7.f     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L5f
                java.lang.String r0 = "The buffer supplied is null"
                java.util.Objects.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L5f
                java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L5f
                monitor-enter(r7)
                r7.Y = r8     // Catch: java.lang.Throwable -> L58
                long r0 = r7.P0     // Catch: java.lang.Throwable -> L58
                long r0 = r0 + r3
                r7.P0 = r0     // Catch: java.lang.Throwable -> L58
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L58
                boolean r8 = r7.t
                if (r8 == 0) goto L57
                io.reactivex.rxjava3.core.Scheduler$Worker r0 = r7.X
                long r2 = r7.g
                java.util.concurrent.TimeUnit r6 = r7.h
                r4 = r2
                r1 = r7
                io.reactivex.rxjava3.disposables.Disposable r7 = r0.c(r1, r2, r4, r6)
                r1.Z = r7
            L57:
                return
            L58:
                r0 = move-exception
                r1 = r7
            L5a:
                r7 = r0
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5d
                throw r7
            L5d:
                r0 = move-exception
                goto L5a
            L5f:
                r0 = move-exception
                r1 = r7
                r7 = r0
                io.reactivex.rxjava3.exceptions.Exceptions.a(r7)
                io.reactivex.rxjava3.observers.SerializedObserver r8 = r1.b
                r8.onError(r7)
                r1.dispose()
                return
            L6e:
                r0 = move-exception
                r1 = r7
            L70:
                r8 = r0
            L71:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L73
                throw r8
            L73:
                r0 = move-exception
                goto L70
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.ObservableBufferTimed.BufferExactBoundedObserver.onNext(java.lang.Object):void");
        }

        public final void onSubscribe(Disposable disposable) {
            SerializedObserver serializedObserver = this.b;
            if (DisposableHelper.h(this.N0, disposable)) {
                this.N0 = disposable;
                try {
                    Object obj = this.f.get();
                    Objects.requireNonNull(obj, "The buffer supplied is null");
                    this.Y = (Collection) obj;
                    serializedObserver.onSubscribe(this);
                    long j = this.g;
                    this.Z = this.X.c(this, j, j, this.h);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    disposable.dispose();
                    EmptyDisposable.c(th, serializedObserver);
                    this.X.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Object obj = this.f.get();
                Objects.requireNonNull(obj, "The bufferSupplier returned a null buffer");
                Collection collection = (Collection) obj;
                synchronized (this) {
                    Collection collection2 = this.Y;
                    if (collection2 != null && this.O0 == this.P0) {
                        this.Y = collection;
                        f(collection2, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                dispose();
                this.b.onError(th);
            }
        }
    }

    public static final class BufferExactUnboundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public Collection X;
        public final AtomicReference Y;
        public final Supplier f;
        public final long g;
        public final TimeUnit h;
        public final Scheduler i;
        public Disposable t;

        public BufferExactUnboundedObserver(SerializedObserver serializedObserver, Supplier supplier, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(serializedObserver, new MpscLinkedQueue());
            this.Y = new AtomicReference();
            this.f = supplier;
            this.g = j;
            this.h = timeUnit;
            this.i = scheduler;
        }

        @Override // io.reactivex.rxjava3.internal.observers.QueueDrainObserver, io.reactivex.rxjava3.internal.util.ObservableQueueDrain
        public final void a(Observer observer, Object obj) {
            this.b.onNext((Collection) obj);
        }

        public void dispose() {
            DisposableHelper.a(this.Y);
            this.t.dispose();
        }

        public boolean isDisposed() {
            return this.Y.get() == DisposableHelper.a;
        }

        public final void onComplete() {
            Collection collection;
            synchronized (this) {
                collection = this.X;
                this.X = null;
            }
            if (collection != null) {
                this.c.offer(collection);
                this.e = true;
                if (b()) {
                    QueueDrainHelper.c(this.c, this.b, null, this);
                }
            }
            DisposableHelper.a(this.Y);
        }

        public final void onError(Throwable th) {
            synchronized (this) {
                this.X = null;
            }
            this.b.onError(th);
            DisposableHelper.a(this.Y);
        }

        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.X;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            SerializedObserver serializedObserver = this.b;
            if (DisposableHelper.h(this.t, disposable)) {
                this.t = disposable;
                try {
                    Object obj = this.f.get();
                    Objects.requireNonNull(obj, "The buffer supplied is null");
                    this.X = (Collection) obj;
                    serializedObserver.onSubscribe(this);
                    AtomicReference atomicReference = this.Y;
                    if (DisposableHelper.b((Disposable) atomicReference.get())) {
                        return;
                    }
                    long j = this.g;
                    DisposableHelper.f(atomicReference, this.i.e(this, j, j, this.h));
                } catch (Throwable th) {
                    Exceptions.a(th);
                    dispose();
                    EmptyDisposable.c(th, serializedObserver);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Collection collection;
            try {
                Object obj = this.f.get();
                Objects.requireNonNull(obj, "The bufferSupplier returned a null buffer");
                Collection collection2 = (Collection) obj;
                synchronized (this) {
                    try {
                        collection = this.X;
                        if (collection != null) {
                            this.X = collection2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (collection == null) {
                    DisposableHelper.a(this.Y);
                } else {
                    c(collection, this);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                this.b.onError(th2);
                dispose();
            }
        }
    }

    public static final class BufferSkipBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public final LinkedList X;
        public Disposable Y;
        public final Supplier f;
        public final long g;
        public final long h;
        public final TimeUnit i;
        public final Scheduler.Worker t;

        public final class RemoveFromBuffer implements Runnable {
            public final Collection a;

            public RemoveFromBuffer(Collection collection) {
                this.a = collection;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    BufferSkipBoundedObserver.this.X.remove(this.a);
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.f(this.a, bufferSkipBoundedObserver.t);
            }
        }

        public final class RemoveFromBufferEmit implements Runnable {
            public final Collection a;

            public RemoveFromBufferEmit(Collection collection) {
                this.a = collection;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    BufferSkipBoundedObserver.this.X.remove(this.a);
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.f(this.a, bufferSkipBoundedObserver.t);
            }
        }

        public BufferSkipBoundedObserver(SerializedObserver serializedObserver, Supplier supplier, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f = supplier;
            this.g = j;
            this.h = j2;
            this.i = timeUnit;
            this.t = worker;
            this.X = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.observers.QueueDrainObserver, io.reactivex.rxjava3.internal.util.ObservableQueueDrain
        public final void a(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        public void dispose() {
            if (this.d) {
                return;
            }
            this.d = true;
            synchronized (this) {
                this.X.clear();
            }
            this.Y.dispose();
            this.t.dispose();
        }

        public boolean isDisposed() {
            return this.d;
        }

        public final void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.X);
                this.X.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.offer((Collection) it.next());
            }
            this.e = true;
            if (b()) {
                QueueDrainHelper.c(this.c, this.b, this.t, this);
            }
        }

        public final void onError(Throwable th) {
            this.e = true;
            synchronized (this) {
                this.X.clear();
            }
            this.b.onError(th);
            this.t.dispose();
        }

        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    Iterator it = this.X.iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            Scheduler.Worker worker = this.t;
            SerializedObserver serializedObserver = this.b;
            if (DisposableHelper.h(this.Y, disposable)) {
                this.Y = disposable;
                try {
                    Object obj = this.f.get();
                    Objects.requireNonNull(obj, "The buffer supplied is null");
                    Collection collection = (Collection) obj;
                    this.X.add(collection);
                    serializedObserver.onSubscribe(this);
                    long j = this.h;
                    this.t.c(this, j, j, this.i);
                    worker.b(new RemoveFromBufferEmit(collection), this.g, this.i);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    disposable.dispose();
                    EmptyDisposable.c(th, serializedObserver);
                    worker.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.d) {
                return;
            }
            try {
                Object obj = this.f.get();
                Objects.requireNonNull(obj, "The bufferSupplier returned a null buffer");
                Collection collection = (Collection) obj;
                synchronized (this) {
                    try {
                        if (this.d) {
                            return;
                        }
                        this.X.add(collection);
                        this.t.b(new RemoveFromBuffer(collection), this.g, this.i);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                this.b.onError(th2);
                dispose();
            }
        }
    }

    public ObservableBufferTimed(Observable observable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Supplier supplier, int i, boolean z) {
        super(observable);
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = supplier;
        this.g = i;
        this.h = z;
    }

    public final void subscribeActual(Observer observer) {
        long j = this.c;
        long j2 = this.b;
        ObservableSource observableSource = ((AbstractObservableWithUpstream) this).a;
        if (j2 == j && this.g == Integer.MAX_VALUE) {
            observableSource.subscribe(new BufferExactUnboundedObserver(new SerializedObserver(observer), this.f, j2, this.d, this.e));
            return;
        }
        Scheduler.Worker workerB = this.e.b();
        long j3 = this.b;
        long j4 = this.c;
        if (j3 != j4) {
            observableSource.subscribe(new BufferSkipBoundedObserver(new SerializedObserver(observer), this.f, j3, j4, this.d, workerB));
            return;
        }
        observableSource.subscribe(new BufferExactBoundedObserver(new SerializedObserver(observer), this.f, j3, this.d, this.g, this.h, workerB));
    }
}
