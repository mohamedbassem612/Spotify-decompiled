package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.InnerQueuedObserver;
import io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableConcatMapEager<T, R> extends AbstractObservableWithUpstream<T, R> {
    public final Function b;
    public final ErrorMode c;
    public final int d;
    public final int e;

    public static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, InnerQueuedObserverSupport<R> {
        public int N0;
        public int X;
        public volatile boolean Y;
        public InnerQueuedObserver Z;
        public final Observer a;
        public final Function b;
        public final int c;
        public final int d;
        public final ErrorMode e;
        public final AtomicThrowable f = new AtomicThrowable();
        public final ArrayDeque g = new ArrayDeque();
        public SimpleQueue h;
        public Disposable i;
        public volatile boolean t;

        public ConcatMapEagerMainObserver(Observer observer, Function function, int i, int i2, ErrorMode errorMode) {
            this.a = observer;
            this.b = function;
            this.c = i;
            this.d = i2;
            this.e = errorMode;
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
        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        public final void a() {
            ErrorMode errorMode = ErrorMode.a;
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue simpleQueue = this.h;
            ArrayDeque arrayDeque = this.g;
            Observer observer = this.a;
            ErrorMode errorMode2 = this.e;
            int iAddAndGet = 1;
            while (true) {
                int i = this.N0;
                while (i != this.c) {
                    if (this.Y) {
                        simpleQueue.clear();
                        g();
                        return;
                    }
                    if (errorMode2 == errorMode && this.f.get() != null) {
                        simpleQueue.clear();
                        g();
                        this.f.d(this.a);
                        return;
                    }
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (objPoll == null) {
                            break;
                        }
                        Object objApply = this.b.apply(objPoll);
                        Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                        ObservableSource observableSource = (ObservableSource) objApply;
                        InnerQueuedObserver innerQueuedObserver = new InnerQueuedObserver(this, this.d);
                        arrayDeque.offer(innerQueuedObserver);
                        observableSource.subscribe(innerQueuedObserver);
                        i++;
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        this.i.dispose();
                        simpleQueue.clear();
                        g();
                        this.f.a(th);
                        this.f.d(this.a);
                        return;
                    }
                }
                this.N0 = i;
                if (this.Y) {
                    simpleQueue.clear();
                    g();
                    return;
                }
                if (errorMode2 == errorMode && this.f.get() != null) {
                    simpleQueue.clear();
                    g();
                    this.f.d(this.a);
                    return;
                }
                InnerQueuedObserver innerQueuedObserver2 = this.Z;
                if (innerQueuedObserver2 == null) {
                    if (errorMode2 == ErrorMode.b && this.f.get() != null) {
                        simpleQueue.clear();
                        g();
                        this.f.d(observer);
                        return;
                    }
                    boolean z = this.t;
                    InnerQueuedObserver innerQueuedObserver3 = (InnerQueuedObserver) arrayDeque.poll();
                    boolean z2 = innerQueuedObserver3 == null;
                    if (z && z2) {
                        if (this.f.get() == null) {
                            observer.onComplete();
                            return;
                        }
                        simpleQueue.clear();
                        g();
                        this.f.d(observer);
                        return;
                    }
                    if (!z2) {
                        this.Z = innerQueuedObserver3;
                    }
                    innerQueuedObserver2 = innerQueuedObserver3;
                }
                if (innerQueuedObserver2 != null) {
                    SimpleQueue simpleQueue2 = innerQueuedObserver2.c;
                    while (true) {
                        if (this.Y) {
                            simpleQueue.clear();
                            g();
                            return;
                        }
                        boolean z3 = innerQueuedObserver2.d;
                        if (errorMode2 == errorMode && this.f.get() != null) {
                            simpleQueue.clear();
                            g();
                            this.f.d(observer);
                            return;
                        }
                        try {
                            Object objPoll2 = simpleQueue2.poll();
                            boolean z4 = objPoll2 == null;
                            if (z3 && z4) {
                                this.Z = null;
                                this.N0--;
                            } else if (!z4) {
                                observer.onNext(objPoll2);
                            }
                        } catch (Throwable th2) {
                            Exceptions.a(th2);
                            this.f.a(th2);
                            this.Z = null;
                            this.N0--;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        public final void b(InnerQueuedObserver innerQueuedObserver, Object obj) {
            innerQueuedObserver.c.offer(obj);
            a();
        }

        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        public final void c(InnerQueuedObserver innerQueuedObserver) {
            innerQueuedObserver.d = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.Y) {
                return;
            }
            this.Y = true;
            this.i.dispose();
            this.f.b();
            if (getAndIncrement() == 0) {
                do {
                    this.h.clear();
                    g();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.InnerQueuedObserverSupport
        public final void f(InnerQueuedObserver innerQueuedObserver, Throwable th) {
            if (this.f.a(th)) {
                if (this.e == ErrorMode.a) {
                    this.i.dispose();
                }
                innerQueuedObserver.d = true;
                a();
            }
        }

        public final void g() {
            InnerQueuedObserver innerQueuedObserver = this.Z;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                InnerQueuedObserver innerQueuedObserver2 = (InnerQueuedObserver) this.g.poll();
                if (innerQueuedObserver2 == null) {
                    return;
                } else {
                    innerQueuedObserver2.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.Y;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.t = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f.a(th)) {
                this.t = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.X == 0) {
                this.h.offer(obj);
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.i, disposable)) {
                this.i = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iA = queueDisposable.a(3);
                    if (iA == 1) {
                        this.X = iA;
                        this.h = queueDisposable;
                        this.t = true;
                        this.a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iA == 2) {
                        this.X = iA;
                        this.h = queueDisposable;
                        this.a.onSubscribe(this);
                        return;
                    }
                }
                this.h = new SpscLinkedArrayQueue(this.d);
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapEager(Observable observable, Function function, ErrorMode errorMode, int i, int i2) {
        super(observable);
        this.b = function;
        this.c = errorMode;
        this.d = i;
        this.e = i2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new ConcatMapEagerMainObserver(observer, this.b, this.d, this.e, this.c));
    }
}
