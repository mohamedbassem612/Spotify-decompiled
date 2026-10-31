package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.cfm0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableFlatMapSingle<T, R> extends AbstractObservableWithUpstream<T, R> {
    public final Function b;
    public final boolean c;

    public static final class FlatMapSingleObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer a;
        public final boolean b;
        public final Function f;
        public Disposable h;
        public volatile boolean i;
        public final CompositeDisposable c = new CompositeDisposable();
        public final AtomicThrowable e = new AtomicThrowable();
        public final AtomicInteger d = new AtomicInteger(1);
        public final AtomicReference g = new AtomicReference();

        public final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            public InnerObserver() {
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.b(get());
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                FlatMapSingleObserver flatMapSingleObserver = FlatMapSingleObserver.this;
                CompositeDisposable compositeDisposable = flatMapSingleObserver.c;
                compositeDisposable.c(this);
                if (flatMapSingleObserver.e.a(th)) {
                    if (!flatMapSingleObserver.b) {
                        flatMapSingleObserver.h.dispose();
                        compositeDisposable.dispose();
                    }
                    flatMapSingleObserver.d.decrementAndGet();
                    if (flatMapSingleObserver.getAndIncrement() == 0) {
                        flatMapSingleObserver.a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0044  */
            /* JADX WARN: Code duplicated, block: B:22:0x004f  */
            /* JADX WARN: Code duplicated, block: B:25:0x005f  */
            /* JADX WARN: Code duplicated, block: B:31:0x0076 A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Code duplicated, block: B:37:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                AtomicReference atomicReference;
                SpscLinkedArrayQueue spscLinkedArrayQueue;
                FlatMapSingleObserver flatMapSingleObserver = FlatMapSingleObserver.this;
                flatMapSingleObserver.c.c(this);
                if (flatMapSingleObserver.get() == 0) {
                    if (flatMapSingleObserver.compareAndSet(0, 1)) {
                        flatMapSingleObserver.a.onNext(obj);
                        boolean z = flatMapSingleObserver.d.decrementAndGet() == 0;
                        SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) flatMapSingleObserver.g.get();
                        if (z && (spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty())) {
                            flatMapSingleObserver.e.d(flatMapSingleObserver.a);
                            return;
                        } else if (flatMapSingleObserver.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        atomicReference = flatMapSingleObserver.g;
                        spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                        if (spscLinkedArrayQueue == null) {
                            spscLinkedArrayQueue = new SpscLinkedArrayQueue(Observable.bufferSize());
                            if (!cfm0.m(atomicReference, spscLinkedArrayQueue)) {
                                spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                            }
                        }
                        synchronized (spscLinkedArrayQueue) {
                            spscLinkedArrayQueue.offer(obj);
                        }
                        flatMapSingleObserver.d.decrementAndGet();
                        if (flatMapSingleObserver.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    atomicReference = flatMapSingleObserver.g;
                    spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                    if (spscLinkedArrayQueue == null) {
                        spscLinkedArrayQueue = new SpscLinkedArrayQueue(Observable.bufferSize());
                        if (!cfm0.m(atomicReference, spscLinkedArrayQueue)) {
                            spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                        }
                    }
                    synchronized (spscLinkedArrayQueue) {
                        spscLinkedArrayQueue.offer(obj);
                        flatMapSingleObserver.d.decrementAndGet();
                        if (flatMapSingleObserver.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                flatMapSingleObserver.a();
            }
        }

        public FlatMapSingleObserver(Observer observer, Function function, boolean z) {
            this.a = observer;
            this.f = function;
            this.b = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a() {
            Observer observer = this.a;
            AtomicInteger atomicInteger = this.d;
            AtomicReference atomicReference = this.g;
            int iAddAndGet = 1;
            while (!this.i) {
                if (!this.b && this.e.get() != null) {
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.g.get();
                    if (spscLinkedArrayQueue != null) {
                        spscLinkedArrayQueue.clear();
                    }
                    this.e.d(observer);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                Object objPoll = spscLinkedArrayQueue2 != null ? spscLinkedArrayQueue2.poll() : null;
                boolean z2 = objPoll == null;
                if (z && z2) {
                    this.e.d(this.a);
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(objPoll);
                }
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue3 = (SpscLinkedArrayQueue) this.g.get();
            if (spscLinkedArrayQueue3 != null) {
                spscLinkedArrayQueue3.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.i = true;
            this.h.dispose();
            this.c.dispose();
            this.e.b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.i;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.d.decrementAndGet();
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.d.decrementAndGet();
            if (this.e.a(th)) {
                if (!this.b) {
                    this.c.dispose();
                }
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            try {
                Object objApply = this.f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objApply;
                this.d.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.i || !this.c.b(innerObserver)) {
                    return;
                }
                singleSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.h.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.h, disposable)) {
                this.h = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapSingle(Observable observable, Function function, boolean z) {
        super(observable);
        this.b = function;
        this.c = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new FlatMapSingleObserver(observer, this.b, this.c));
    }
}
