package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MaybeOnErrorComplete$OnErrorCompleteMultiObserver<T> implements MaybeObserver<T>, SingleObserver<T>, Disposable {
    public final MaybeObserver a;
    public final Predicate b;
    public Disposable c;

    public MaybeOnErrorComplete$OnErrorCompleteMultiObserver(MaybeObserver maybeObserver, Predicate predicate) {
        this.a = maybeObserver;
        this.b = predicate;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.c.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        MaybeObserver maybeObserver = this.a;
        try {
            if (this.b.test(th)) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onError(th);
            }
        } catch (Throwable th2) {
            Exceptions.a(th2);
            maybeObserver.onError(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.h(this.c, disposable)) {
            this.c = disposable;
            this.a.onSubscribe(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onSuccess(Object obj) {
        this.a.onSuccess(obj);
    }
}
