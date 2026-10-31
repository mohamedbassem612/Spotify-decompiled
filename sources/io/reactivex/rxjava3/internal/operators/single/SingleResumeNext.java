package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleResumeNext<T> extends Single<T> {
    public final Single a;
    public final Function b;

    public static final class ResumeMainSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        public final SingleObserver a;
        public final Function b;

        public ResumeMainSingleObserver(SingleObserver singleObserver, Function function) {
            this.a = singleObserver;
            this.b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            SingleObserver singleObserver = this.a;
            try {
                Object objApply = this.b.apply(th);
                Objects.requireNonNull(objApply, "The nextFunction returned a null SingleSource.");
                ((SingleSource) objApply).subscribe(new ResumeSingleObserver(singleObserver, this));
            } catch (Throwable th2) {
                Exceptions.a(th2);
                singleObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.a.onSuccess(obj);
        }
    }

    public SingleResumeNext(Single single, Function function) {
        this.a = single;
        this.b = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new ResumeMainSingleObserver(singleObserver, this.b));
    }
}
