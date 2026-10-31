package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleDelayWithObservable<T, U> extends Single<T> {
    public final Single a;
    public final ObservableSource b;

    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements Observer<U>, Disposable {
        public final SingleObserver a;
        public final SingleSource b;
        public boolean c;

        public OtherSubscriber(Single single, SingleObserver singleObserver) {
            this.a = singleObserver;
            this.b = single;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.b.subscribe(new ResumeSingleObserver(this.a, this));
        }

        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.b(th);
            } else {
                this.c = true;
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            get().dispose();
            onComplete();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                this.a.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithObservable(Single single, ObservableSource observableSource) {
        this.a = single;
        this.b = observableSource;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.b.subscribe(new OtherSubscriber(this.a, singleObserver));
    }
}
