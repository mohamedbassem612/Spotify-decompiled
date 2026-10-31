package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeSwitchIfEmptySingle<T> extends Single<T> {
    public final Maybe a;
    public final SingleSource b;

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final SingleObserver a;
        public final SingleSource b;

        public static final class OtherSingleObserver<T> implements SingleObserver<T> {
            public final SingleObserver a;
            public final AtomicReference b;

            public OtherSingleObserver(SingleObserver singleObserver, AtomicReference atomicReference) {
                this.a = singleObserver;
                this.b = atomicReference;
            }

            public final void onError(Throwable th) {
                this.a.onError(th);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this.b, disposable);
            }

            public final void onSuccess(Object obj) {
                this.a.onSuccess(obj);
            }
        }

        public SwitchIfEmptyMaybeObserver(SingleObserver singleObserver, SingleSource singleSource) {
            this.a = singleObserver;
            this.b = singleSource;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            DisposableHelper disposableHelper = (Disposable) get();
            if (disposableHelper == DisposableHelper.a || !compareAndSet(disposableHelper, null)) {
                return;
            }
            this.b.subscribe(new OtherSingleObserver(this.a, this));
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
            this.a.onSuccess(obj);
        }
    }

    public MaybeSwitchIfEmptySingle(Maybe maybe, SingleSource singleSource) {
        this.a = maybe;
        this.b = singleSource;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new SwitchIfEmptyMaybeObserver(singleObserver, this.b));
    }
}
