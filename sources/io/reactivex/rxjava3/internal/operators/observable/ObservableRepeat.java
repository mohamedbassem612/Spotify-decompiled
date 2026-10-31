package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableRepeat<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;

    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {
        public final Observer a;
        public final SequentialDisposable b;
        public final ObservableSource c;
        public long d;

        public RepeatObserver(Observer observer, long j, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
            this.a = observer;
            this.b = sequentialDisposable;
            this.c = observableSource;
            this.d = j;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.b.isDisposed()) {
                    this.c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public final void onComplete() {
            long j = this.d;
            if (j != Long.MAX_VALUE) {
                this.d = j - 1;
            }
            if (j != 0) {
                a();
            } else {
                this.a.onComplete();
            }
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.b, disposable);
        }
    }

    public ObservableRepeat(Observable observable, long j) {
        super(observable);
        this.b = j;
    }

    public final void subscribeActual(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        long j = this.b;
        new RepeatObserver(observer, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, sequentialDisposable, ((AbstractObservableWithUpstream) this).a).a();
    }
}
