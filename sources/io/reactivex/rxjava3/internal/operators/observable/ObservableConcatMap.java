package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableConcatMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    public final Function b;
    public final int c;
    public final ErrorMode d;

    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public volatile boolean X;
        public int Y;
        public final Observer a;
        public final Function b;
        public final int c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final DelayErrorInnerObserver e;
        public final boolean f;
        public SimpleQueue g;
        public Disposable h;
        public volatile boolean i;
        public volatile boolean t;

        public static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {
            public final Observer a;
            public final ConcatMapDelayErrorObserver b;

            public DelayErrorInnerObserver(Observer observer, ConcatMapDelayErrorObserver concatMapDelayErrorObserver) {
                this.a = observer;
                this.b = concatMapDelayErrorObserver;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.b;
                concatMapDelayErrorObserver.i = false;
                concatMapDelayErrorObserver.a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th) {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.b;
                if (concatMapDelayErrorObserver.d.a(th)) {
                    if (!concatMapDelayErrorObserver.f) {
                        concatMapDelayErrorObserver.h.dispose();
                    }
                    concatMapDelayErrorObserver.i = false;
                    concatMapDelayErrorObserver.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                this.a.onNext(obj);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }
        }

        public ConcatMapDelayErrorObserver(Observer observer, Function function, int i, boolean z) {
            this.a = observer;
            this.b = function;
            this.c = i;
            this.f = z;
            this.e = new DelayErrorInnerObserver(observer, this);
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
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.a;
            SimpleQueue simpleQueue = this.g;
            AtomicThrowable atomicThrowable = this.d;
            while (true) {
                if (!this.i) {
                    if (this.X) {
                        simpleQueue.clear();
                        return;
                    }
                    if (!this.f && ((Throwable) atomicThrowable.get()) != null) {
                        simpleQueue.clear();
                        this.X = true;
                        atomicThrowable.d(observer);
                        return;
                    }
                    boolean z = this.t;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.X = true;
                            atomicThrowable.d(observer);
                            return;
                        }
                        if (!z2) {
                            try {
                                Object objApply = this.b.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                                ObservableSource observableSource = (ObservableSource) objApply;
                                if (observableSource instanceof Supplier) {
                                    try {
                                        Object obj = ((Supplier) observableSource).get();
                                        if (obj != null && !this.X) {
                                            observer.onNext(obj);
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.a(th);
                                        atomicThrowable.a(th);
                                    }
                                } else {
                                    this.i = true;
                                    observableSource.subscribe(this.e);
                                }
                            } catch (Throwable th2) {
                                Exceptions.a(th2);
                                this.X = true;
                                this.h.dispose();
                                simpleQueue.clear();
                                atomicThrowable.a(th2);
                                atomicThrowable.d(observer);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.a(th3);
                        this.X = true;
                        this.h.dispose();
                        atomicThrowable.a(th3);
                        atomicThrowable.d(observer);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.X = true;
            this.h.dispose();
            DelayErrorInnerObserver delayErrorInnerObserver = this.e;
            delayErrorInnerObserver.getClass();
            DisposableHelper.a(delayErrorInnerObserver);
            this.d.b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.X;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.t = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.d.a(th)) {
                this.t = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.Y == 0) {
                this.g.offer(obj);
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.h, disposable)) {
                this.h = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iA = queueDisposable.a(3);
                    if (iA == 1) {
                        this.Y = iA;
                        this.g = queueDisposable;
                        this.t = true;
                        this.a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iA == 2) {
                        this.Y = iA;
                        this.g = queueDisposable;
                        this.a.onSubscribe(this);
                        return;
                    }
                }
                this.g = new SpscLinkedArrayQueue(this.c);
                this.a.onSubscribe(this);
            }
        }
    }

    public static final class SourceObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        public final SerializedObserver a;
        public final Function b;
        public final InnerObserver c;
        public final int d;
        public SimpleQueue e;
        public Disposable f;
        public volatile boolean g;
        public volatile boolean h;
        public volatile boolean i;
        public int t;

        public static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {
            public final SerializedObserver a;
            public final SourceObserver b;

            public InnerObserver(SerializedObserver serializedObserver, SourceObserver sourceObserver) {
                this.a = serializedObserver;
                this.b = sourceObserver;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                SourceObserver sourceObserver = this.b;
                sourceObserver.g = false;
                sourceObserver.a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th) {
                this.b.dispose();
                this.a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                this.a.onNext(obj);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }
        }

        public SourceObserver(SerializedObserver serializedObserver, Function function, int i) {
            this.a = serializedObserver;
            this.b = function;
            this.d = i;
            this.c = new InnerObserver(serializedObserver, this);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.h) {
                if (!this.g) {
                    boolean z = this.i;
                    try {
                        Object objPoll = this.e.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.h = true;
                            this.a.onComplete();
                            return;
                        }
                        if (!z2) {
                            try {
                                Object objApply = this.b.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                                ObservableSource observableSource = (ObservableSource) objApply;
                                this.g = true;
                                observableSource.subscribe(this.c);
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                dispose();
                                this.e.clear();
                                this.a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        dispose();
                        this.e.clear();
                        this.a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.e.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.h = true;
            InnerObserver innerObserver = this.c;
            innerObserver.getClass();
            DisposableHelper.a(innerObserver);
            this.f.dispose();
            if (getAndIncrement() == 0) {
                this.e.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.h;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.i) {
                return;
            }
            this.i = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.i) {
                RxJavaPlugins.b(th);
                return;
            }
            this.i = true;
            dispose();
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.i) {
                return;
            }
            if (this.t == 0) {
                this.e.offer(obj);
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.f, disposable)) {
                this.f = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iA = queueDisposable.a(3);
                    if (iA == 1) {
                        this.t = iA;
                        this.e = queueDisposable;
                        this.i = true;
                        this.a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iA == 2) {
                        this.t = iA;
                        this.e = queueDisposable;
                        this.a.onSubscribe(this);
                        return;
                    }
                }
                this.e = new SpscLinkedArrayQueue(this.d);
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMap(int i, ObservableSource observableSource, Function function, ErrorMode errorMode) {
        super(observableSource);
        this.b = function;
        this.d = errorMode;
        this.c = Math.max(8, i);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ObservableSource observableSource = this.a;
        Function function = this.b;
        if (ObservableScalarXMap.b(observableSource, observer, function)) {
            return;
        }
        ErrorMode errorMode = ErrorMode.a;
        int i = this.c;
        ErrorMode errorMode2 = this.d;
        if (errorMode2 == errorMode) {
            observableSource.subscribe(new SourceObserver(new SerializedObserver(observer), function, i));
        } else {
            observableSource.subscribe(new ConcatMapDelayErrorObserver(observer, function, i, errorMode2 == ErrorMode.c));
        }
    }
}
