package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableTakeLast<T> extends AbstractObservableWithUpstream<T, T> {
    public final int b;

    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {
        public final Observer a;
        public final int b;
        public Disposable c;
        public volatile boolean d;

        public TakeLastObserver(Observer observer, int i) {
            this.a = observer;
            this.b = i;
        }

        public void dispose() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.c.dispose();
        }

        public boolean isDisposed() {
            return this.d;
        }

        public final void onComplete() {
            Observer observer = this.a;
            while (!this.d) {
                T tPoll = poll();
                if (tPoll == null) {
                    observer.onComplete();
                    return;
                }
                observer.onNext(tPoll);
            }
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            if (this.b == size()) {
                poll();
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

    public ObservableTakeLast(Observable observable, int i) {
        super(observable);
        this.b = i;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new TakeLastObserver(observer, this.b));
    }
}
