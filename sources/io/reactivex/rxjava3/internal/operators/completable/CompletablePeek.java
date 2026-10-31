package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletablePeek extends Completable {
    public final Completable a;
    public final Consumer b;
    public final Consumer c;
    public final Action d;
    public final Action e;
    public final Action f;
    public final Action g;

    public final class CompletableObserverImplementation implements CompletableObserver, Disposable {
        public final CompletableObserver a;
        public Disposable b;

        public CompletableObserverImplementation(CompletableObserver completableObserver) {
            this.a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            try {
                CompletablePeek.this.g.run();
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
            this.b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            CompletableObserver completableObserver = this.a;
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.b == DisposableHelper.a) {
                return;
            }
            try {
                completablePeek.d.run();
                completablePeek.e.run();
                completableObserver.onComplete();
                try {
                    completablePeek.f.run();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                completableObserver.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.b == DisposableHelper.a) {
                RxJavaPlugins.b(th);
                return;
            }
            try {
                completablePeek.c.accept(th);
                completablePeek.e.run();
            } catch (Throwable th2) {
                Exceptions.a(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
            try {
                completablePeek.f.run();
            } catch (Throwable th3) {
                Exceptions.a(th3);
                RxJavaPlugins.b(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            CompletableObserver completableObserver = this.a;
            try {
                CompletablePeek.this.b.accept(disposable);
                if (DisposableHelper.h(this.b, disposable)) {
                    this.b = disposable;
                    completableObserver.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                disposable.dispose();
                this.b = DisposableHelper.a;
                completableObserver.onSubscribe(EmptyDisposable.a);
                completableObserver.onError(th);
            }
        }
    }

    public CompletablePeek(Completable completable, Consumer consumer, Consumer consumer2, Action action, Action action2, Action action3, Action action4) {
        this.a = completable;
        this.b = consumer;
        this.c = consumer2;
        this.d = action;
        this.e = action2;
        this.f = action3;
        this.g = action4;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        this.a.subscribe(new CompletableObserverImplementation(completableObserver));
    }
}
