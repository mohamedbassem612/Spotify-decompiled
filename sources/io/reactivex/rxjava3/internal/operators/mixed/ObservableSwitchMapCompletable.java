package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p.cfm0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableSwitchMapCompletable<T> extends Completable {
    public final Observable a;
    public final Function b;
    public final boolean c;

    public static final class SwitchMapCompletableObserver<T> implements Observer<T>, Disposable {
        public static final SwitchMapInnerObserver h = new SwitchMapInnerObserver(null);
        public final CompletableObserver a;
        public final Function b;
        public final boolean c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final AtomicReference e = new AtomicReference();
        public volatile boolean f;
        public Disposable g;

        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final SwitchMapCompletableObserver a;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver switchMapCompletableObserver) {
                this.a = switchMapCompletableObserver;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.a;
                if (cfm0.n(switchMapCompletableObserver.e, this) && switchMapCompletableObserver.f) {
                    switchMapCompletableObserver.d.c(switchMapCompletableObserver.a);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.a;
                if (!cfm0.n(switchMapCompletableObserver.e, this)) {
                    RxJavaPlugins.b(th);
                    return;
                }
                if (switchMapCompletableObserver.d.a(th)) {
                    if (switchMapCompletableObserver.c) {
                        if (switchMapCompletableObserver.f) {
                            switchMapCompletableObserver.d.c(switchMapCompletableObserver.a);
                        }
                    } else {
                        switchMapCompletableObserver.g.dispose();
                        switchMapCompletableObserver.a();
                        switchMapCompletableObserver.d.c(switchMapCompletableObserver.a);
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver, Function function, boolean z) {
            this.a = completableObserver;
            this.b = function;
            this.c = z;
        }

        public final void a() {
            AtomicReference atomicReference = this.e;
            SwitchMapInnerObserver switchMapInnerObserver = h;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 == null || switchMapInnerObserver2 == switchMapInnerObserver) {
                return;
            }
            DisposableHelper.a(switchMapInnerObserver2);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.g.dispose();
            a();
            this.d.b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.e.get() == h;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f = true;
            if (this.e.get() == null) {
                this.d.c(this.a);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.d;
            if (atomicThrowable.a(th)) {
                if (this.c) {
                    onComplete();
                } else {
                    a();
                    atomicThrowable.c(this.a);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            AtomicReference atomicReference;
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) objApply;
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    atomicReference = this.e;
                    switchMapInnerObserver = (SwitchMapInnerObserver) atomicReference.get();
                    if (switchMapInnerObserver == h) {
                        return;
                    }
                } while (!cfm0.o(atomicReference, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    DisposableHelper.a(switchMapInnerObserver);
                }
                completableSource.subscribe(switchMapInnerObserver2);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.g.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.g, disposable)) {
                this.g = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapCompletable(Observable observable, Function function, boolean z) {
        this.a = observable;
        this.b = function;
        this.c = z;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        Observable observable = this.a;
        Function function = this.b;
        if (ScalarXMapZHelper.a(observable, function, completableObserver)) {
            return;
        }
        observable.subscribe(new SwitchMapCompletableObserver(completableObserver, function, this.c));
    }
}
