package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {
    public Object a;
    public Throwable b;
    public Disposable c;
    public volatile boolean d;

    public BlockingMultiObserver() {
        super(1);
    }

    public final void a(Consumer consumer, Consumer consumer2, Action action) {
        try {
            if (getCount() != 0) {
                try {
                    await();
                } catch (InterruptedException e) {
                    this.d = true;
                    Disposable disposable = this.c;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    consumer2.accept(e);
                    return;
                }
            }
            Throwable th = this.b;
            if (th != null) {
                consumer2.accept(th);
                return;
            }
            Object obj = this.a;
            if (obj != null) {
                consumer.accept(obj);
            } else {
                action.run();
            }
        } catch (Throwable th2) {
            Exceptions.a(th2);
            RxJavaPlugins.b(th2);
        }
    }

    public final Object b() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.d = true;
                Disposable disposable = this.c;
                if (disposable != null) {
                    disposable.dispose();
                }
                throw ExceptionHelper.f(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw ExceptionHelper.f(th);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        this.b = th;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onSubscribe(Disposable disposable) {
        this.c = disposable;
        if (this.d) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onSuccess(Object obj) {
        this.a = obj;
        countDown();
    }
}
