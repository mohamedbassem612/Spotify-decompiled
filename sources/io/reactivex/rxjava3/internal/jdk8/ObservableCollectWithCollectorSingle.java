package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableCollectWithCollectorSingle<T, A, R> extends Single<R> implements FuseToObservable<R> {
    public final Observable a;
    public final Collector b;

    public static final class CollectorSingleObserver<T, A, R> implements Observer<T>, Disposable {
        public final SingleObserver a;
        public final BiConsumer b;
        public final Function c;
        public Disposable d;
        public boolean e;
        public Object f;

        public CollectorSingleObserver(SingleObserver singleObserver, Object obj, BiConsumer biConsumer, Function function) {
            this.a = singleObserver;
            this.f = obj;
            this.b = biConsumer;
            this.c = function;
        }

        public void dispose() {
            this.d.dispose();
            this.d = DisposableHelper.a;
        }

        public boolean isDisposed() {
            return this.d == DisposableHelper.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onComplete() {
            SingleObserver singleObserver = this.a;
            if (this.e) {
                return;
            }
            this.e = true;
            this.d = DisposableHelper.a;
            Object obj = this.f;
            this.f = null;
            try {
                Object objApply = this.c.apply(obj);
                Objects.requireNonNull(objApply, "The finisher returned a null value");
                singleObserver.onSuccess(objApply);
            } catch (Throwable th) {
                Exceptions.a(th);
                singleObserver.onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e = true;
            this.d = DisposableHelper.a;
            this.f = null;
            this.a.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            try {
                this.b.accept(this.f, obj);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.d.dispose();
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableCollectWithCollectorSingle(Observable observable, Collector collector) {
        this.a = observable;
        this.b = collector;
    }

    public final Observable a() {
        return new ObservableCollectWithCollector(this.a, this.b);
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        Collector collector = this.b;
        try {
            this.a.subscribe(new CollectorSingleObserver(singleObserver, collector.supplier().get(), collector.accumulator(), collector.finisher()));
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.f(th, singleObserver);
        }
    }
}
