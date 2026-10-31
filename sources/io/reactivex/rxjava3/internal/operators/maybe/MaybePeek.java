package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybePeek<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Consumer b;
    public final Consumer c;
    public final Consumer d;
    public final Action e;
    public final Action f;
    public final Action g;

    public static final class MaybePeekObserver<T> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver a;
        public final MaybePeek b;
        public Disposable c;

        public MaybePeekObserver(MaybeObserver maybeObserver, MaybePeek maybePeek) {
            this.a = maybeObserver;
            this.b = maybePeek;
        }

        public final void a() {
            try {
                this.b.f.run();
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
        }

        public final void b(Throwable th) {
            try {
                this.b.d.accept(th);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                th = new CompositeException(new Throwable[]{th, th2});
            }
            this.c = DisposableHelper.a;
            this.a.onError(th);
            a();
        }

        public void dispose() {
            try {
                this.b.g.run();
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
            this.c.dispose();
            this.c = DisposableHelper.a;
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onComplete() {
            DisposableHelper disposableHelper = this.c;
            DisposableHelper disposableHelper2 = DisposableHelper.a;
            if (disposableHelper == disposableHelper2) {
                return;
            }
            try {
                this.b.e.run();
                this.c = disposableHelper2;
                this.a.onComplete();
                a();
            } catch (Throwable th) {
                Exceptions.a(th);
                b(th);
            }
        }

        public final void onError(Throwable th) {
            if (this.c == DisposableHelper.a) {
                RxJavaPlugins.b(th);
            } else {
                b(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            MaybeObserver maybeObserver = this.a;
            if (DisposableHelper.h(this.c, disposable)) {
                try {
                    this.b.b.accept(disposable);
                    this.c = disposable;
                    maybeObserver.onSubscribe(this);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    disposable.dispose();
                    this.c = DisposableHelper.a;
                    maybeObserver.onSubscribe(EmptyDisposable.a);
                    maybeObserver.onError(th);
                }
            }
        }

        public final void onSuccess(Object obj) {
            DisposableHelper disposableHelper = this.c;
            DisposableHelper disposableHelper2 = DisposableHelper.a;
            if (disposableHelper == disposableHelper2) {
                return;
            }
            try {
                this.b.c.accept(obj);
                this.c = disposableHelper2;
                this.a.onSuccess(obj);
                a();
            } catch (Throwable th) {
                Exceptions.a(th);
                b(th);
            }
        }
    }

    public MaybePeek(Maybe maybe, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action, Action action2, Action action3) {
        super(maybe);
        this.b = consumer;
        this.c = consumer2;
        this.d = consumer3;
        this.e = action;
        this.f = action2;
        this.g = action3;
    }

    public final void i(MaybeObserver maybeObserver) {
        ((AbstractMaybeWithUpstream) this).a.subscribe(new MaybePeekObserver(maybeObserver, this));
    }
}
