package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.BasicQueueDisposable;
import java.util.Objects;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableFromArray<T> extends Observable<T> {
    public final Object[] a;

    public static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {
        public final Observer a;
        public final Object[] b;
        public int c;
        public boolean d;
        public volatile boolean e;

        public FromArrayDisposable(Observer observer, Object[] objArr) {
            this.a = observer;
            this.b = objArr;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            this.d = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.c = this.b.length;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.e = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.e;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.c == this.b.length;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            int i = this.c;
            Object[] objArr = this.b;
            if (i == objArr.length) {
                return null;
            }
            this.c = i + 1;
            Object obj = objArr[i];
            Objects.requireNonNull(obj, "The array element is null");
            return obj;
        }
    }

    public ObservableFromArray(Object[] objArr) {
        this.a = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        Observer observer2;
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer, this.a);
        observer.onSubscribe(fromArrayDisposable);
        if (fromArrayDisposable.d) {
            return;
        }
        Object[] objArr = fromArrayDisposable.b;
        int length = objArr.length;
        int i = 0;
        while (true) {
            observer2 = fromArrayDisposable.a;
            if (i >= length || fromArrayDisposable.isDisposed()) {
                break;
            }
            Object obj = objArr[i];
            if (obj == null) {
                observer2.onError(new NullPointerException(gvg.e(i, "The element at index ", " is null")));
                return;
            } else {
                observer2.onNext(obj);
                i++;
            }
        }
        if (fromArrayDisposable.isDisposed()) {
            return;
        }
        observer2.onComplete();
    }
}
