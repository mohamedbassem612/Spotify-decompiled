package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableCollectWithCollector<T, A, R> extends Observable<R> {
    public final Observable a;
    public final Collector b;

    public static final class CollectorObserver<T, A, R> extends DeferredScalarDisposable<R> implements Observer<T> {
        public final BiConsumer c;
        public final Function d;
        public Disposable e;
        public boolean f;
        public Object g;

        public CollectorObserver(Observer observer, Object obj, BiConsumer biConsumer, Function function) {
            super(observer);
            this.g = obj;
            this.c = biConsumer;
            this.d = function;
        }

        public void dispose() {
            super.dispose();
            this.e.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e = DisposableHelper.a;
            Object obj = this.g;
            this.g = null;
            try {
                Object objApply = this.d.apply(obj);
                Objects.requireNonNull(objApply, "The finisher returned a null value");
                b(objApply);
            } catch (Throwable th) {
                Exceptions.a(th);
                ((DeferredScalarDisposable) this).a.onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.b(th);
                return;
            }
            this.f = true;
            this.e = DisposableHelper.a;
            this.g = null;
            ((DeferredScalarDisposable) this).a.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onNext(Object obj) {
            if (this.f) {
                return;
            }
            try {
                this.c.accept(this.g, obj);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.e.dispose();
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.e, disposable)) {
                this.e = disposable;
                ((DeferredScalarDisposable) this).a.onSubscribe(this);
            }
        }
    }

    public ObservableCollectWithCollector(Observable observable, Collector collector) {
        this.a = observable;
        this.b = collector;
    }

    public final void subscribeActual(Observer observer) {
        Collector collector = this.b;
        try {
            this.a.subscribe(new CollectorObserver(observer, collector.supplier().get(), collector.accumulator(), collector.finisher()));
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.c(th, observer);
        }
    }
}
