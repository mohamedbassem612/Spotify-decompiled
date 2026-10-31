package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableMergeWithCompletable<T> extends AbstractObservableWithUpstream<T, T> {
    public final CompletableSource b;

    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer a;
        public final AtomicReference b = new AtomicReference();
        public final OtherObserver c = new OtherObserver(this);
        public final AtomicThrowable d = new AtomicThrowable();
        public volatile boolean e;
        public volatile boolean f;

        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final MergeWithObserver a;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.a = mergeWithObserver;
            }

            public final void onComplete() {
                MergeWithObserver mergeWithObserver = this.a;
                mergeWithObserver.f = true;
                if (mergeWithObserver.e) {
                    HalfSerializer.a(mergeWithObserver.a, mergeWithObserver, mergeWithObserver.d);
                }
            }

            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.a;
                DisposableHelper.a(mergeWithObserver.b);
                HalfSerializer.b(mergeWithObserver.a, th, mergeWithObserver, mergeWithObserver.d);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }
        }

        public MergeWithObserver(Observer observer) {
            this.a = observer;
        }

        public void dispose() {
            DisposableHelper.a(this.b);
            DisposableHelper.a(this.c);
            this.d.b();
        }

        public boolean isDisposed() {
            return DisposableHelper.b((Disposable) this.b.get());
        }

        public final void onComplete() {
            this.e = true;
            if (this.f) {
                HalfSerializer.a(this.a, this, this.d);
            }
        }

        public final void onError(Throwable th) {
            DisposableHelper.a(this.c);
            HalfSerializer.b(this.a, th, this, this.d);
        }

        public final void onNext(Object obj) {
            HalfSerializer.c(this.a, obj, this, this.d);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.b, disposable);
        }
    }

    public ObservableMergeWithCompletable(Observable observable, CompletableSource completableSource) {
        super(observable);
        this.b = completableSource;
    }

    public final void subscribeActual(Observer observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        ((AbstractObservableWithUpstream) this).a.subscribe(mergeWithObserver);
        this.b.subscribe(mergeWithObserver.c);
    }
}
