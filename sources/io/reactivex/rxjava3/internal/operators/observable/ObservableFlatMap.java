package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.dv20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableFlatMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    public final Function b;
    public final boolean c;
    public final int d;
    public final int e;

    public static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        public final MergeObserver a;
        public volatile boolean b;
        public volatile SimpleQueue c;
        public int d;

        public InnerObserver(MergeObserver mergeObserver) {
            this.a = mergeObserver;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.b = true;
            this.a.c();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.a.h.a(th)) {
                MergeObserver mergeObserver = this.a;
                if (!mergeObserver.c) {
                    mergeObserver.b();
                }
                this.b = true;
                this.a.c();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            int i = this.d;
            MergeObserver mergeObserver = this.a;
            if (i != 0) {
                mergeObserver.c();
                return;
            }
            if (mergeObserver.get() == 0 && mergeObserver.compareAndSet(0, 1)) {
                mergeObserver.a.onNext(obj);
                if (mergeObserver.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscLinkedArrayQueue = this.c;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(mergeObserver.e);
                    this.c = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(obj);
                if (mergeObserver.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeObserver.f();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iA = queueDisposable.a(7);
                if (iA == 1) {
                    this.d = iA;
                    this.c = queueDisposable;
                    this.b = true;
                    this.a.c();
                    return;
                }
                if (iA == 2) {
                    this.d = iA;
                    this.c = queueDisposable;
                }
            }
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        public static final InnerObserver[] P0 = new InnerObserver[0];
        public static final InnerObserver[] Q0 = new InnerObserver[0];
        public final ArrayDeque N0;
        public int O0;
        public Disposable X;
        public long Y;
        public int Z;
        public final Observer a;
        public final Function b;
        public final boolean c;
        public final int d;
        public final int e;
        public volatile SimplePlainQueue f;
        public volatile boolean g;
        public final AtomicThrowable h = new AtomicThrowable();
        public volatile boolean i;
        public final AtomicReference t;

        public MergeObserver(int i, int i2, Observer observer, Function function, boolean z) {
            this.a = observer;
            this.b = function;
            this.c = z;
            this.d = i;
            this.e = i2;
            if (i != Integer.MAX_VALUE) {
                this.N0 = new ArrayDeque(i);
            }
            this.t = new AtomicReference(P0);
        }

        public final boolean a() {
            if (this.i) {
                return true;
            }
            Throwable th = this.h.get();
            if (this.c || th == null) {
                return false;
            }
            b();
            this.h.d(this.a);
            return true;
        }

        public final boolean b() {
            this.X.dispose();
            AtomicReference atomicReference = this.t;
            InnerObserver[] innerObserverArr = Q0;
            InnerObserver[] innerObserverArr2 = (InnerObserver[]) atomicReference.getAndSet(innerObserverArr);
            if (innerObserverArr2 == innerObserverArr) {
                return false;
            }
            for (InnerObserver innerObserver : innerObserverArr2) {
                innerObserver.getClass();
                DisposableHelper.a(innerObserver);
            }
            return true;
        }

        public final void c() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.i = true;
            if (b()) {
                this.h.b();
            }
        }

        /* JADX WARN: Code duplicated, block: B:104:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[PHI: r4
          0x00c6: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00ac, B:66:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void f() {
            int size;
            boolean z;
            Observer observer = this.a;
            int iAddAndGet = 1;
            while (!a()) {
                SimplePlainQueue simplePlainQueue = this.f;
                int i = 0;
                if (simplePlainQueue != null) {
                    while (!a()) {
                        Object objPoll = simplePlainQueue.poll();
                        if (objPoll != null) {
                            observer.onNext(objPoll);
                            i++;
                        }
                    }
                    return;
                }
                if (i == 0) {
                    boolean z2 = this.g;
                    SimplePlainQueue simplePlainQueue2 = this.f;
                    InnerObserver[] innerObserverArr = (InnerObserver[]) this.t.get();
                    int length = innerObserverArr.length;
                    if (this.d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.N0.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z2 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && size == 0)) {
                        this.h.d(this.a);
                        return;
                    }
                    if (length != 0) {
                        int iMin = Math.min(length - 1, this.Z);
                        for (int i2 = 0; i2 < length; i2++) {
                            if (a()) {
                                return;
                            }
                            InnerObserver innerObserver = innerObserverArr[iMin];
                            SimpleQueue simpleQueue = innerObserver.c;
                            if (simpleQueue != null) {
                                do {
                                    try {
                                        Object objPoll2 = simpleQueue.poll();
                                        if (objPoll2 == null) {
                                            z = innerObserver.b;
                                            SimpleQueue simpleQueue2 = innerObserver.c;
                                            if (z && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                                g(innerObserver);
                                                i++;
                                            }
                                            iMin++;
                                            if (iMin == length) {
                                                iMin = 0;
                                            }
                                        } else {
                                            observer.onNext(objPoll2);
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.a(th);
                                        DisposableHelper.a(innerObserver);
                                        this.h.a(th);
                                        if (a()) {
                                            return;
                                        }
                                        g(innerObserver);
                                        i++;
                                        iMin++;
                                        if (iMin == length) {
                                        }
                                    }
                                } while (!a());
                                return;
                            }
                            z = innerObserver.b;
                            SimpleQueue simpleQueue3 = innerObserver.c;
                            if (z) {
                                g(innerObserver);
                                i++;
                            }
                            iMin++;
                            if (iMin == length) {
                                iMin = 0;
                            }
                        }
                        this.Z = iMin;
                    }
                    if (i == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.d != Integer.MAX_VALUE) {
                        i(i);
                    }
                } else if (this.d != Integer.MAX_VALUE) {
                    i(i);
                }
            }
        }

        public final void g(InnerObserver innerObserver) {
            AtomicReference atomicReference;
            InnerObserver[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                atomicReference = this.t;
                innerObserverArr = (InnerObserver[]) atomicReference.get();
                int length = innerObserverArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerObserverArr[i] == innerObserver) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = P0;
                } else {
                    InnerObserver[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i);
                    System.arraycopy(innerObserverArr, i + 1, innerObserverArr3, i, (length - i) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!dv20.o(atomicReference, innerObserverArr, innerObserverArr2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void h(ObservableSource observableSource) {
            boolean z;
            InnerObserver[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                z = false;
                if (!(observableSource instanceof Supplier)) {
                    this.Y++;
                    InnerObserver innerObserver = new InnerObserver(this);
                    AtomicReference atomicReference = this.t;
                    do {
                        innerObserverArr = (InnerObserver[]) atomicReference.get();
                        if (innerObserverArr == Q0) {
                            DisposableHelper.a(innerObserver);
                            return;
                        }
                        int length = innerObserverArr.length;
                        innerObserverArr2 = new InnerObserver[length + 1];
                        System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                        innerObserverArr2[length] = innerObserver;
                    } while (!dv20.o(atomicReference, innerObserverArr, innerObserverArr2));
                    observableSource.subscribe(innerObserver);
                    return;
                }
                try {
                    Object obj = ((Supplier) observableSource).get();
                    if (obj != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.a.onNext(obj);
                            if (decrementAndGet() != 0) {
                            }
                        } else {
                            SimplePlainQueue spscLinkedArrayQueue = this.f;
                            if (spscLinkedArrayQueue == null) {
                                spscLinkedArrayQueue = this.d == Integer.MAX_VALUE ? new SpscLinkedArrayQueue(this.e) : new SpscArrayQueue(this.d);
                                this.f = spscLinkedArrayQueue;
                            }
                            spscLinkedArrayQueue.offer(obj);
                            if (getAndIncrement() != 0) {
                                return;
                            }
                        }
                        f();
                    }
                } catch (Throwable th) {
                    Exceptions.a(th);
                    this.h.a(th);
                    c();
                }
                if (this.d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        observableSource = (ObservableSource) this.N0.poll();
                        if (observableSource == null) {
                            this.O0--;
                            z = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (!z);
            c();
        }

        public final void i(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        ObservableSource observableSource = (ObservableSource) this.N0.poll();
                        if (observableSource == null) {
                            this.O0--;
                        } else {
                            h(observableSource);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                i = i2;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.i;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            c();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
            } else if (this.h.a(th)) {
                this.g = true;
                c();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource = (ObservableSource) objApply;
                if (this.d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.O0;
                            if (i == this.d) {
                                this.N0.offer(observableSource);
                                return;
                            }
                            this.O0 = i + 1;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                h(observableSource);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                this.X.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.X, disposable)) {
                this.X = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMap(ObservableSource observableSource, Function function, boolean z, int i, int i2) {
        super(observableSource);
        this.b = function;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        Function function = this.b;
        ObservableSource observableSource = this.a;
        if (ObservableScalarXMap.b(observableSource, observer, function)) {
            return;
        }
        observableSource.subscribe(new MergeObserver(this.d, this.e, observer, this.b, this.c));
    }
}
