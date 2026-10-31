package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompletableResumeNext extends Completable {
    public final Completable a;
    public final Function b;

    public static final class ResumeNextObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        public final CompletableObserver a;
        public final Function b;
        public boolean c;

        public ResumeNextObserver(CompletableObserver completableObserver, Function function) {
            this.a = completableObserver;
            this.b = function;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            boolean z = this.c;
            CompletableObserver completableObserver = this.a;
            if (z) {
                completableObserver.onError(th);
                return;
            }
            this.c = true;
            try {
                Object objApply = this.b.apply(th);
                Objects.requireNonNull(objApply, "The errorMapper returned a null CompletableSource");
                ((CompletableSource) objApply).subscribe(this);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                completableObserver.onError(new CompositeException(new Throwable[]{th, th2}));
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this, disposable);
        }
    }

    public CompletableResumeNext(Completable completable, Function function) {
        this.a = completable;
        this.b = function;
    }

    public final void r(CompletableObserver completableObserver) {
        ResumeNextObserver resumeNextObserver = new ResumeNextObserver(completableObserver, this.b);
        completableObserver.onSubscribe(resumeNextObserver);
        this.a.subscribe(resumeNextObserver);
    }
}
