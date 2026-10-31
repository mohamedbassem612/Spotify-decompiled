package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableBuffer$BufferExactObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
    public final Observer a;
    public final int b;
    public final Supplier c;
    public Collection d;
    public int e;
    public Disposable f;

    public ObservableBuffer$BufferExactObserver(Observer observer, int i, Supplier supplier) {
        this.a = observer;
        this.b = i;
        this.c = supplier;
    }

    public final boolean a() {
        try {
            Object obj = this.c.get();
            Objects.requireNonNull(obj, "Empty buffer supplied");
            this.d = (Collection) obj;
            return true;
        } catch (Throwable th) {
            Exceptions.a(th);
            this.d = null;
            Disposable disposable = this.f;
            Observer observer = this.a;
            if (disposable == null) {
                EmptyDisposable.c(th, observer);
                return false;
            }
            disposable.dispose();
            observer.onError(th);
            return false;
        }
    }

    public void dispose() {
        this.f.dispose();
    }

    public boolean isDisposed() {
        return this.f.isDisposed();
    }

    public final void onComplete() {
        Collection collection = this.d;
        if (collection != null) {
            this.d = null;
            boolean zIsEmpty = collection.isEmpty();
            Observer observer = this.a;
            if (!zIsEmpty) {
                observer.onNext(collection);
            }
            observer.onComplete();
        }
    }

    public final void onError(Throwable th) {
        this.d = null;
        this.a.onError(th);
    }

    public final void onNext(Object obj) {
        Collection collection = this.d;
        if (collection != null) {
            collection.add(obj);
            int i = this.e + 1;
            this.e = i;
            if (i >= this.b) {
                this.a.onNext(collection);
                this.e = 0;
                a();
            }
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.h(this.f, disposable)) {
            this.f = disposable;
            this.a.onSubscribe(this);
        }
    }
}
