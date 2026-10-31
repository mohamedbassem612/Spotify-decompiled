package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleUsing<T, U> extends Single<T> {
    public final Supplier a;
    public final Function b;
    public final Consumer c;
    public final boolean d;

    public static final class UsingSingleObserver<T, U> extends AtomicReference<Object> implements SingleObserver<T>, Disposable {
        public final SingleObserver a;
        public final Consumer b;
        public final boolean c;
        public Disposable d;

        public UsingSingleObserver(SingleObserver singleObserver, Object obj, boolean z, Consumer consumer) {
            super(obj);
            this.a = singleObserver;
            this.c = z;
            this.b = consumer;
        }

        public final void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.b.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        public void dispose() {
            boolean z = this.c;
            DisposableHelper disposableHelper = DisposableHelper.a;
            if (z) {
                a();
                this.d.dispose();
                this.d = disposableHelper;
            } else {
                this.d.dispose();
                this.d = disposableHelper;
                a();
            }
        }

        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        public final void onError(Throwable th) {
            this.d = DisposableHelper.a;
            boolean z = this.c;
            if (z) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.b.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    th = new CompositeException(new Throwable[]{th, th2});
                }
            }
            this.a.onError(th);
            if (z) {
                return;
            }
            a();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            this.d = DisposableHelper.a;
            SingleObserver singleObserver = this.a;
            boolean z = this.c;
            if (z) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.b.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    singleObserver.onError(th);
                    return;
                }
            }
            singleObserver.onSuccess(obj);
            if (z) {
                return;
            }
            a();
        }
    }

    public SingleUsing(Supplier supplier, Function function, Consumer consumer, boolean z) {
        this.a = supplier;
        this.b = function;
        this.c = consumer;
        this.d = z;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        Consumer consumer = this.c;
        boolean z = this.d;
        try {
            Object obj = this.a.get();
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The singleFunction returned a null SingleSource");
                ((SingleSource) objApply).subscribe(new UsingSingleObserver(singleObserver, obj, z, consumer));
            } catch (Throwable th) {
                th = th;
                Exceptions.a(th);
                if (z) {
                    try {
                        consumer.accept(obj);
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        th = new CompositeException(new Throwable[]{th, th2});
                    }
                }
                EmptyDisposable.f(th, singleObserver);
                if (z) {
                    return;
                }
                try {
                    consumer.accept(obj);
                } catch (Throwable th3) {
                    Exceptions.a(th3);
                    RxJavaPlugins.b(th3);
                }
            }
        } catch (Throwable th4) {
            Exceptions.a(th4);
            EmptyDisposable.f(th4, singleObserver);
        }
    }
}
