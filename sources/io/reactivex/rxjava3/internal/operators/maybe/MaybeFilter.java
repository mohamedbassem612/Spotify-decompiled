package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeFilter<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Predicate b;

    public static final class FilterMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver a;
        public final Predicate b;
        public Disposable c;

        public FilterMaybeObserver(MaybeObserver maybeObserver, Predicate predicate) {
            this.a = maybeObserver;
            this.b = predicate;
        }

        public void dispose() {
            Disposable disposable = this.c;
            this.c = DisposableHelper.a;
            disposable.dispose();
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

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.a;
            try {
                if (this.b.test(obj)) {
                    maybeObserver.onSuccess(obj);
                } else {
                    maybeObserver.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                maybeObserver.onError(th);
            }
        }
    }

    public MaybeFilter(Maybe maybe, Predicate predicate) {
        super(maybe);
        this.b = predicate;
    }

    public final void i(MaybeObserver maybeObserver) {
        ((AbstractMaybeWithUpstream) this).a.subscribe(new FilterMaybeObserver(maybeObserver, this.b));
    }
}
