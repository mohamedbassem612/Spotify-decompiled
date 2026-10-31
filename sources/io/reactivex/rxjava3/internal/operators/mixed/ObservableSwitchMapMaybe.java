package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableSwitchMapMaybe<T, R> extends Observable<R> {
    public final Observable a;
    public final Function b;
    public final boolean c;

    public static final class SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final SwitchMapMaybeObserver i = new SwitchMapMaybeObserver(null);
        public final Observer a;
        public final Function b;
        public final boolean c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final AtomicReference e = new AtomicReference();
        public Disposable f;
        public volatile boolean g;
        public volatile boolean h;

        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            public final SwitchMapMaybeMainObserver a;
            public volatile Object b;

            public SwitchMapMaybeObserver(SwitchMapMaybeMainObserver switchMapMaybeMainObserver) {
                this.a = switchMapMaybeMainObserver;
            }

            public final void onComplete() {
                SwitchMapMaybeMainObserver switchMapMaybeMainObserver = this.a;
                AtomicReference atomicReference = switchMapMaybeMainObserver.e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                switchMapMaybeMainObserver.b();
            }

            public final void onError(Throwable th) {
                SwitchMapMaybeMainObserver switchMapMaybeMainObserver = this.a;
                AtomicReference atomicReference = switchMapMaybeMainObserver.e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.b(th);
                        return;
                    }
                }
                if (switchMapMaybeMainObserver.d.a(th)) {
                    if (!switchMapMaybeMainObserver.c) {
                        switchMapMaybeMainObserver.f.dispose();
                        switchMapMaybeMainObserver.a();
                    }
                    switchMapMaybeMainObserver.b();
                }
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }

            public final void onSuccess(Object obj) {
                this.b = obj;
                this.a.b();
            }
        }

        public SwitchMapMaybeMainObserver(Observer observer, Function function, boolean z) {
            this.a = observer;
            this.b = function;
            this.c = z;
        }

        public final void a() {
            AtomicReference atomicReference = this.e;
            SwitchMapMaybeObserver switchMapMaybeObserver = i;
            SwitchMapMaybeObserver switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            DisposableHelper.a(switchMapMaybeObserver2);
        }

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
                SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
                boolean z2 = switchMapMaybeObserver == null;
                if (z && z2) {
                    atomicThrowable.d(observer);
                    return;
                }
                if (z2 || switchMapMaybeObserver.b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapMaybeObserver, null) && atomicReference.get() == switchMapMaybeObserver) {
                    }
                    observer.onNext(switchMapMaybeObserver.b);
                }
            }
        }

        public void dispose() {
            this.h = true;
            this.f.dispose();
            a();
            this.d.b();
        }

        public boolean isDisposed() {
            return this.h;
        }

        public final void onComplete() {
            this.g = true;
            b();
        }

        public final void onError(Throwable th) {
            if (this.d.a(th)) {
                if (!this.c) {
                    a();
                }
                this.g = true;
                b();
            }
        }

        public final void onNext(Object obj) {
            SwitchMapMaybeObserver switchMapMaybeObserver = i;
            AtomicReference atomicReference = this.e;
            SwitchMapMaybeObserver switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.get();
            if (switchMapMaybeObserver2 != null) {
                DisposableHelper.a(switchMapMaybeObserver2);
            }
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) objApply;
                SwitchMapMaybeObserver switchMapMaybeObserver3 = new SwitchMapMaybeObserver(this);
                while (true) {
                    SwitchMapMaybeObserver switchMapMaybeObserver4 = (SwitchMapMaybeObserver) atomicReference.get();
                    if (switchMapMaybeObserver4 == switchMapMaybeObserver) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(switchMapMaybeObserver4, switchMapMaybeObserver3)) {
                            maybeSource.subscribe(switchMapMaybeObserver3);
                            return;
                        }
                    } while (atomicReference.get() == switchMapMaybeObserver4);
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                this.f.dispose();
                atomicReference.getAndSet(switchMapMaybeObserver);
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.f, disposable)) {
                this.f = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapMaybe(Observable observable, Function function, boolean z) {
        this.a = observable;
        this.b = function;
        this.c = z;
    }

    public final void subscribeActual(Observer observer) {
        Observable observable = this.a;
        Function function = this.b;
        if (ScalarXMapZHelper.b(observable, function, observer)) {
            return;
        }
        observable.subscribe(new SwitchMapMaybeMainObserver(observer, function, this.c));
    }
}
