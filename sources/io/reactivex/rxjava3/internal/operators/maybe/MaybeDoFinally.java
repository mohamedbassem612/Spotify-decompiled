package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorReturn;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import p.wf0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeDoFinally<T> extends AbstractMaybeWithUpstream<T, T> {
    public final wf0 b;

    public static final class DoFinallyObserver<T> extends AtomicInteger implements MaybeObserver<T>, Disposable {
        public final MaybeObserver a;
        public final Action b;
        public Disposable c;

        public DoFinallyObserver(MaybeObserver maybeObserver, wf0 wf0Var) {
            this.a = maybeObserver;
            this.b = wf0Var;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        public void dispose() {
            this.c.dispose();
            a();
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onComplete() {
            this.a.onComplete();
            a();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
            a();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            this.a.onSuccess(obj);
            a();
        }
    }

    public MaybeDoFinally(CompletableOnErrorReturn completableOnErrorReturn, wf0 wf0Var) {
        super(completableOnErrorReturn);
        this.b = wf0Var;
    }

    public final void i(MaybeObserver maybeObserver) {
        ((AbstractMaybeWithUpstream) this).a.subscribe(new DoFinallyObserver(maybeObserver, this.b));
    }
}
