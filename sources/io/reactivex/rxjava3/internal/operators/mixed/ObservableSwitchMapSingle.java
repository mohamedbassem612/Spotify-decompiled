package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.cfm0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {
    public final Observable a;
    public final Function b;
    public final boolean c;

    public static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final SwitchMapSingleObserver i = new SwitchMapSingleObserver(null);
        public final Observer a;
        public final Function b;
        public final boolean c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final AtomicReference e = new AtomicReference();
        public Disposable f;
        public volatile boolean g;
        public volatile boolean h;

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            public final SwitchMapSingleMainObserver a;
            public volatile Object b;

            public SwitchMapSingleObserver(SwitchMapSingleMainObserver switchMapSingleMainObserver) {
                this.a = switchMapSingleMainObserver;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                SwitchMapSingleMainObserver switchMapSingleMainObserver = this.a;
                if (!cfm0.n(switchMapSingleMainObserver.e, this)) {
                    RxJavaPlugins.b(th);
                } else if (switchMapSingleMainObserver.d.a(th)) {
                    if (!switchMapSingleMainObserver.c) {
                        switchMapSingleMainObserver.f.dispose();
                        switchMapSingleMainObserver.a();
                    }
                    switchMapSingleMainObserver.b();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                this.b = obj;
                this.a.b();
            }
        }

        public SwitchMapSingleMainObserver(Observer observer, Function function, boolean z) {
            this.a = observer;
            this.b = function;
            this.c = z;
        }

        public final void a() {
            AtomicReference atomicReference = this.e;
            SwitchMapSingleObserver switchMapSingleObserver = i;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.a(switchMapSingleObserver2);
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
        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.a;
            AtomicThrowable atomicThrowable = this.d;
            AtomicReference atomicReference = this.e;
            int iAddAndGet = 1;
            while (!this.h) {
                if (atomicThrowable.get() != null && !this.c) {
                    atomicThrowable.d(observer);
                    return;
                }
                boolean z = this.g;
                SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                boolean z2 = switchMapSingleObserver == null;
                if (z && z2) {
                    atomicThrowable.d(observer);
                    return;
                } else if (z2 || switchMapSingleObserver.b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    cfm0.k(atomicReference, switchMapSingleObserver);
                    observer.onNext(switchMapSingleObserver.b);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.h = true;
            this.f.dispose();
            a();
            this.d.b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.h;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.g = true;
            b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.d.a(th)) {
                if (!this.c) {
                    a();
                }
                this.g = true;
                b();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            SwitchMapSingleObserver switchMapSingleObserver;
            SwitchMapSingleObserver switchMapSingleObserver2 = i;
            AtomicReference atomicReference = this.e;
            SwitchMapSingleObserver switchMapSingleObserver3 = (SwitchMapSingleObserver) atomicReference.get();
            if (switchMapSingleObserver3 != null) {
                DisposableHelper.a(switchMapSingleObserver3);
            }
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objApply;
                SwitchMapSingleObserver switchMapSingleObserver4 = new SwitchMapSingleObserver(this);
                do {
                    switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                    if (switchMapSingleObserver == switchMapSingleObserver2) {
                        return;
                    }
                } while (!cfm0.o(atomicReference, switchMapSingleObserver, switchMapSingleObserver4));
                singleSource.subscribe(switchMapSingleObserver4);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.f.dispose();
                atomicReference.getAndSet(switchMapSingleObserver2);
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.f, disposable)) {
                this.f = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapSingle(Observable observable, Function function, boolean z) {
        this.a = observable;
        this.b = function;
        this.c = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        Observable observable = this.a;
        Function function = this.b;
        if (ScalarXMapZHelper.c(observable, function, observer)) {
            return;
        }
        observable.subscribe(new SwitchMapSingleMainObserver(observer, function, this.c));
    }
}
