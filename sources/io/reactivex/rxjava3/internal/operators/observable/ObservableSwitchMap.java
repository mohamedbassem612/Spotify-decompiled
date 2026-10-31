package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableSwitchMap<T, R> extends AbstractObservableWithUpstream<T, R> {
    public final Function b;
    public final int c;
    public final boolean d;

    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {
        public final SwitchMapObserver a;
        public final long b;
        public final int c;
        public volatile SimpleQueue d;
        public volatile boolean e;

        public SwitchMapInnerObserver(SwitchMapObserver switchMapObserver, long j, int i) {
            this.a = switchMapObserver;
            this.b = j;
            this.c = i;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.b == this.a.t) {
                this.e = true;
                this.a.a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            SwitchMapObserver switchMapObserver = this.a;
            switchMapObserver.getClass();
            if (this.b != switchMapObserver.t || !ExceptionHelper.a(switchMapObserver.e, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            if (!switchMapObserver.d) {
                switchMapObserver.h.dispose();
                switchMapObserver.f = true;
            }
            this.e = true;
            switchMapObserver.a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.b == this.a.t) {
                if (obj != null) {
                    this.d.offer(obj);
                }
                this.a.a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iA = queueDisposable.a(7);
                    if (iA == 1) {
                        this.d = queueDisposable;
                        this.e = true;
                        this.a.a();
                        return;
                    } else if (iA == 2) {
                        this.d = queueDisposable;
                        return;
                    }
                }
                this.d = new SpscLinkedArrayQueue(this.c);
            }
        }
    }

    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final SwitchMapInnerObserver X;
        public final Observer a;
        public final Function b;
        public final int c;
        public final boolean d;
        public volatile boolean f;
        public volatile boolean g;
        public Disposable h;
        public volatile long t;
        public final AtomicReference i = new AtomicReference();
        public final AtomicThrowable e = new AtomicThrowable();

        static {
            SwitchMapInnerObserver switchMapInnerObserver = new SwitchMapInnerObserver(null, -1L, 1);
            X = switchMapInnerObserver;
            DisposableHelper.a(switchMapInnerObserver);
        }

        public SwitchMapObserver(Observer observer, Function function, int i, boolean z) {
            this.a = observer;
            this.b = function;
            this.c = i;
            this.d = z;
        }

        /* JADX WARN: Code duplicated, block: B:89:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x0010 A[SYNTHETIC] */
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
            SimpleQueue simpleQueue;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.a;
            AtomicReference atomicReference = this.i;
            boolean z = this.d;
            int iAddAndGet = 1;
            while (!this.g) {
                if (this.f) {
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        if (z2) {
                            Throwable th = this.e.get();
                            if (th != null) {
                                observer.onError(th);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                    } else if (this.e.get() != null) {
                        this.e.d(observer);
                        return;
                    } else if (z2) {
                        observer.onComplete();
                        return;
                    }
                }
                SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) atomicReference.get();
                if (switchMapInnerObserver != null && (simpleQueue = switchMapInnerObserver.d) != null) {
                    boolean z3 = false;
                    while (!this.g) {
                        if (switchMapInnerObserver == atomicReference.get()) {
                            if (!z && this.e.get() != null) {
                                this.e.d(observer);
                                return;
                            }
                            boolean z4 = switchMapInnerObserver.e;
                            try {
                                objPoll = simpleQueue.poll();
                            } catch (Throwable th2) {
                                Exceptions.a(th2);
                                this.e.a(th2);
                                while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                }
                                if (z) {
                                    DisposableHelper.a(switchMapInnerObserver);
                                } else {
                                    SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) this.i.getAndSet(X);
                                    if (switchMapInnerObserver2 != null) {
                                        DisposableHelper.a(switchMapInnerObserver2);
                                    }
                                    this.h.dispose();
                                    this.f = true;
                                }
                                z3 = true;
                                objPoll = null;
                            }
                            boolean z5 = objPoll == null;
                            if (z4 && z5) {
                                while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                }
                            } else if (!z5) {
                                observer.onNext(objPoll);
                            }
                            if (z3) {
                                continue;
                            }
                        }
                        z3 = true;
                        if (z3) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.h.dispose();
            SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.i.getAndSet(X);
            if (switchMapInnerObserver != null) {
                DisposableHelper.a(switchMapInnerObserver);
            }
            this.e.b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.g;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            SwitchMapInnerObserver switchMapInnerObserver;
            if (this.f || !ExceptionHelper.a(this.e, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            if (!this.d && (switchMapInnerObserver = (SwitchMapInnerObserver) this.i.getAndSet(X)) != null) {
                DisposableHelper.a(switchMapInnerObserver);
            }
            this.f = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            long j = this.t + 1;
            this.t = j;
            SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.i.get();
            if (switchMapInnerObserver != null) {
                DisposableHelper.a(switchMapInnerObserver);
            }
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The ObservableSource returned is null");
                ObservableSource observableSource = (ObservableSource) objApply;
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this, j, this.c);
                while (true) {
                    SwitchMapInnerObserver switchMapInnerObserver3 = (SwitchMapInnerObserver) this.i.get();
                    if (switchMapInnerObserver3 == X) {
                        return;
                    }
                    AtomicReference atomicReference = this.i;
                    do {
                        if (atomicReference.compareAndSet(switchMapInnerObserver3, switchMapInnerObserver2)) {
                            observableSource.subscribe(switchMapInnerObserver2);
                            return;
                        }
                    } while (atomicReference.get() == switchMapInnerObserver3);
                }
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

    public ObservableSwitchMap(ObservableSource observableSource, Function function, int i, boolean z) {
        super(observableSource);
        this.b = function;
        this.c = i;
        this.d = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ObservableSource observableSource = this.a;
        Function function = this.b;
        if (ObservableScalarXMap.b(observableSource, observer, function)) {
            return;
        }
        observableSource.subscribe(new SwitchMapObserver(observer, function, this.c, this.d));
    }
}
