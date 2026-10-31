package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {
    public final int b;
    public final int c;
    public final Supplier d;

    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {
        public final Observer a;
        public final int b;
        public final int c;
        public final Supplier d;
        public Disposable e;
        public final ArrayDeque f = new ArrayDeque();
        public long g;

        public BufferSkipObserver(Observer observer, int i, int i2, Supplier supplier) {
            this.a = observer;
            this.b = i;
            this.c = i2;
            this.d = supplier;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.e.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            while (true) {
                ArrayDeque arrayDeque = this.f;
                boolean zIsEmpty = arrayDeque.isEmpty();
                Observer observer = this.a;
                if (zIsEmpty) {
                    observer.onComplete();
                    return;
                }
                observer.onNext(arrayDeque.poll());
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f.clear();
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            long j = this.g;
            this.g = 1 + j;
            long j2 = j % ((long) this.c);
            Observer observer = this.a;
            ArrayDeque arrayDeque = this.f;
            if (j2 == 0) {
                try {
                    Object obj2 = this.d.get();
                    if (obj2 == null) {
                        throw ExceptionHelper.b("The bufferSupplier returned a null Collection.");
                    }
                    Throwable th = ExceptionHelper.a;
                    arrayDeque.offer((Collection) obj2);
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    arrayDeque.clear();
                    this.e.dispose();
                    observer.onError(th2);
                    return;
                }
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(obj);
                if (this.b <= collection.size()) {
                    it.remove();
                    observer.onNext(collection);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.e, disposable)) {
                this.e = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableBuffer(Observable observable, int i, int i2, Supplier supplier) {
        super(observable);
        this.b = i;
        this.c = i2;
        this.d = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ObservableSource observableSource = this.a;
        Supplier supplier = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i != i2) {
            observableSource.subscribe(new BufferSkipObserver(observer, i2, i, supplier));
            return;
        }
        BufferExactObserver bufferExactObserver = new BufferExactObserver(observer, i2, supplier);
        if (bufferExactObserver.a()) {
            observableSource.subscribe(bufferExactObserver);
        }
    }
}
