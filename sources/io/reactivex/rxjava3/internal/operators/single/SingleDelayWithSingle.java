package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleDelayWithSingle<T, U> extends Single<T> {
    public final Single a;
    public final SingleSource b;

    public static final class OtherObserver<T, U> extends AtomicReference<Disposable> implements SingleObserver<U>, Disposable {
        public final SingleObserver a;
        public final SingleSource b;

        public OtherObserver(Single single, SingleObserver singleObserver) {
            this.a = singleObserver;
            this.b = single;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            this.b.subscribe(new ResumeSingleObserver(this.a, this));
        }
    }

    public SingleDelayWithSingle(Single single, SingleSource singleSource) {
        this.a = single;
        this.b = singleSource;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.b.subscribe(new OtherObserver(this.a, singleObserver));
    }
}
