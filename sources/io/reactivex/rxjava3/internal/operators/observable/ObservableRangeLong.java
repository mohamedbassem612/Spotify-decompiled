package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableRangeLong extends Observable<Long> {
    public final long a;
    public final long b;

    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        public final Observer a;
        public final long b;
        public long c;
        public boolean d;

        public RangeDisposable(Observer observer, long j, long j2) {
            this.a = observer;
            this.c = j;
            this.b = j2;
        }

        public final int a(int i) {
            this.d = true;
            return 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void clear() {
            this.c = this.b;
            lazySet(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void dispose() {
            set(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean isDisposed() {
            return get() != 0;
        }

        public final boolean isEmpty() {
            return this.c == this.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object poll() {
            long j = this.c;
            if (j != this.b) {
                this.c = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }
    }

    public ObservableRangeLong(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final void subscribeActual(Observer observer) {
        Observer observer2;
        long j = this.b;
        long j2 = this.a;
        Disposable rangeDisposable = new RangeDisposable(observer, j2, j + j2);
        observer.onSubscribe(rangeDisposable);
        if (rangeDisposable.d) {
            return;
        }
        long j3 = rangeDisposable.c;
        while (true) {
            long j4 = rangeDisposable.b;
            observer2 = rangeDisposable.a;
            if (j3 == j4 || rangeDisposable.get() != 0) {
                break;
            }
            observer2.onNext(Long.valueOf(j3));
            j3++;
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            observer2.onComplete();
        }
    }
}
