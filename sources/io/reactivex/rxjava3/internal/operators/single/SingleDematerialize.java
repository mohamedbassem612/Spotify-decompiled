package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleDematerialize<T, R> extends Maybe<R> {
    public final Single a;
    public final Function b;

    public static final class DematerializeObserver<T, R> implements SingleObserver<T>, Disposable {
        public final MaybeObserver a;
        public final Function b;
        public Disposable c;

        public DematerializeObserver(MaybeObserver maybeObserver, Function function) {
            this.a = maybeObserver;
            this.b = function;
        }

        public void dispose() {
            this.c.dispose();
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
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
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The selector returned a null Notification");
                Notification notification = (Notification) objApply;
                if (notification.e()) {
                    maybeObserver.onSuccess(notification.d());
                } else if (notification.a == null) {
                    maybeObserver.onComplete();
                } else {
                    maybeObserver.onError(notification.c());
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                maybeObserver.onError(th);
            }
        }
    }

    public SingleDematerialize(Single single, Function function) {
        this.a = single;
        this.b = function;
    }

    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new DematerializeObserver(maybeObserver, this.b));
    }
}
