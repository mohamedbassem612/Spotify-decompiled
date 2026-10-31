package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractObservableWithUpstream<T, U> {
    public final Supplier b;
    public final ObservableSource c;
    public final Function d;

    public static final class BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements Observer<T>, Disposable {
        public long X;
        public final Observer a;
        public final Supplier b;
        public final ObservableSource c;
        public final Function d;
        public volatile boolean h;
        public volatile boolean t;
        public final SpscLinkedArrayQueue i = new SpscLinkedArrayQueue(Observable.bufferSize());
        public final CompositeDisposable e = new CompositeDisposable();
        public final AtomicReference f = new AtomicReference();
        public LinkedHashMap Y = new LinkedHashMap();
        public final AtomicThrowable g = new AtomicThrowable();

        public static final class BufferOpenObserver<Open> extends AtomicReference<Disposable> implements Observer<Open>, Disposable {
            public final BufferBoundaryObserver a;

            public BufferOpenObserver(BufferBoundaryObserver bufferBoundaryObserver) {
                this.a = bufferBoundaryObserver;
            }

            public void dispose() {
                DisposableHelper.a(this);
            }

            public boolean isDisposed() {
                return get() == DisposableHelper.a;
            }

            public final void onComplete() {
                lazySet(DisposableHelper.a);
                BufferBoundaryObserver bufferBoundaryObserver = this.a;
                bufferBoundaryObserver.e.c(this);
                if (bufferBoundaryObserver.e.i() == 0) {
                    DisposableHelper.a(bufferBoundaryObserver.f);
                    bufferBoundaryObserver.h = true;
                    bufferBoundaryObserver.b();
                }
            }

            public final void onError(Throwable th) {
                lazySet(DisposableHelper.a);
                BufferBoundaryObserver bufferBoundaryObserver = this.a;
                DisposableHelper.a(bufferBoundaryObserver.f);
                bufferBoundaryObserver.e.c(this);
                bufferBoundaryObserver.onError(th);
            }

            public final void onNext(Object obj) {
                BufferBoundaryObserver bufferBoundaryObserver = this.a;
                try {
                    Object obj2 = bufferBoundaryObserver.b.get();
                    Objects.requireNonNull(obj2, "The bufferSupplier returned a null Collection");
                    Collection collection = (Collection) obj2;
                    Object objApply = bufferBoundaryObserver.d.apply(obj);
                    Objects.requireNonNull(objApply, "The bufferClose returned a null ObservableSource");
                    ObservableSource observableSource = (ObservableSource) objApply;
                    long j = bufferBoundaryObserver.X;
                    bufferBoundaryObserver.X = 1 + j;
                    synchronized (bufferBoundaryObserver) {
                        try {
                            LinkedHashMap linkedHashMap = bufferBoundaryObserver.Y;
                            if (linkedHashMap == null) {
                                return;
                            }
                            linkedHashMap.put(Long.valueOf(j), collection);
                            BufferCloseObserver bufferCloseObserver = new BufferCloseObserver(bufferBoundaryObserver, j);
                            bufferBoundaryObserver.e.b(bufferCloseObserver);
                            observableSource.subscribe(bufferCloseObserver);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    DisposableHelper.a(bufferBoundaryObserver.f);
                    bufferBoundaryObserver.onError(th2);
                }
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }
        }

        public BufferBoundaryObserver(Observer observer, ObservableSource observableSource, Function function, Supplier supplier) {
            this.a = observer;
            this.b = supplier;
            this.c = observableSource;
            this.d = function;
        }

        public final void a(BufferCloseObserver bufferCloseObserver, long j) {
            boolean z;
            this.e.c(bufferCloseObserver);
            if (this.e.i() == 0) {
                DisposableHelper.a(this.f);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.Y;
                    if (linkedHashMap == null) {
                        return;
                    }
                    this.i.offer(linkedHashMap.remove(Long.valueOf(j)));
                    if (z) {
                        this.h = true;
                    }
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.a;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.i;
            int iAddAndGet = 1;
            while (!this.t) {
                boolean z = this.h;
                if (z && this.g.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.g.d(observer);
                    return;
                }
                Collection collection = (Collection) spscLinkedArrayQueue.poll();
                boolean z2 = collection == null;
                if (z && z2) {
                    observer.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(collection);
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void dispose() {
            if (DisposableHelper.a(this.f)) {
                this.t = true;
                this.e.dispose();
                synchronized (this) {
                    this.Y = null;
                }
                if (getAndIncrement() != 0) {
                    this.i.clear();
                }
            }
        }

        public boolean isDisposed() {
            return DisposableHelper.b((Disposable) this.f.get());
        }

        public final void onComplete() {
            this.e.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.Y;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.i.offer((Collection) it.next());
                    }
                    this.Y = null;
                    this.h = true;
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.g.a(th)) {
                this.e.dispose();
                synchronized (this) {
                    this.Y = null;
                }
                this.h = true;
                b();
            }
        }

        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.Y;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this.f, disposable)) {
                BufferOpenObserver bufferOpenObserver = new BufferOpenObserver(this);
                this.e.b(bufferOpenObserver);
                this.c.subscribe(bufferOpenObserver);
            }
        }
    }

    public static final class BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        public final BufferBoundaryObserver a;
        public final long b;

        public BufferCloseObserver(BufferBoundaryObserver bufferBoundaryObserver, long j) {
            this.a = bufferBoundaryObserver;
            this.b = j;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.a;
        }

        public final void onComplete() {
            DisposableHelper disposableHelper = get();
            DisposableHelper disposableHelper2 = DisposableHelper.a;
            if (disposableHelper != disposableHelper2) {
                lazySet(disposableHelper2);
                this.a.a(this, this.b);
            }
        }

        public final void onError(Throwable th) {
            DisposableHelper disposableHelper = get();
            DisposableHelper disposableHelper2 = DisposableHelper.a;
            if (disposableHelper == disposableHelper2) {
                RxJavaPlugins.b(th);
                return;
            }
            lazySet(disposableHelper2);
            BufferBoundaryObserver bufferBoundaryObserver = this.a;
            DisposableHelper.a(bufferBoundaryObserver.f);
            bufferBoundaryObserver.e.c(this);
            bufferBoundaryObserver.onError(th);
        }

        public final void onNext(Object obj) {
            DisposableHelper disposableHelper = (Disposable) get();
            DisposableHelper disposableHelper2 = DisposableHelper.a;
            if (disposableHelper != disposableHelper2) {
                lazySet(disposableHelper2);
                disposableHelper.dispose();
                this.a.a(this, this.b);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this, disposable);
        }
    }

    public ObservableBufferBoundary(Observable observable, ObservableSource observableSource, Function function, Supplier supplier) {
        super(observable);
        this.c = observableSource;
        this.d = function;
        this.b = supplier;
    }

    public final void subscribeActual(Observer observer) {
        BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(observer, this.c, this.d, this.b);
        observer.onSubscribe(bufferBoundaryObserver);
        ((AbstractObservableWithUpstream) this).a.subscribe(bufferBoundaryObserver);
    }
}
