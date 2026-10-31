package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableOnErrorComplete extends Completable {
    public final Completable a;
    public final Predicate b;

    public final class OnError implements CompletableObserver {
        public final CompletableObserver a;

        public OnError(CompletableObserver completableObserver) {
            this.a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            CompletableObserver completableObserver = this.a;
            try {
                if (CompletableOnErrorComplete.this.b.test(th)) {
                    completableObserver.onComplete();
                } else {
                    completableObserver.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                completableObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }
    }

    public CompletableOnErrorComplete(Completable completable, Predicate predicate) {
        this.a = completable;
        this.b = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        this.a.subscribe(new OnError(completableObserver));
    }
}
