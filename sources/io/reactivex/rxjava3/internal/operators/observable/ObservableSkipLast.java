package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableSkipLast<T> extends AbstractObservableWithUpstream<T, T> {
    public final int b;

    public static final class SkipLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {
        public final Observer a;
        public final int b;
        public Disposable c;

        public SkipLastObserver(Observer observer, int i) {
            super(i);
            this.a = observer;
            this.b = i;
        }

        public void dispose() {
            this.c.dispose();
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            if (this.b == size()) {
                this.a.onNext(poll());
            }
            offer(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLast(Observable observable, int i) {
        super(observable);
        this.b = i;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new SkipLastObserver(observer, this.b));
    }
}
