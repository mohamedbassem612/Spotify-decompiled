package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ConcatMapXMainObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
    public final AtomicThrowable a = new AtomicThrowable();
    public final int b;
    public final ErrorMode c;
    public SimpleQueue d;
    public Disposable e;
    public volatile boolean f;
    public volatile boolean g;

    public ConcatMapXMainObserver(int i, ErrorMode errorMode) {
        this.c = errorMode;
        this.b = i;
    }

    public void a() {
    }

    public abstract void b();

    public abstract void c();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.g = true;
        this.e.dispose();
        b();
        this.a.b();
        if (getAndIncrement() == 0) {
            this.d.clear();
            a();
        }
    }

    public abstract void f();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.g;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        this.f = true;
        c();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (this.a.a(th)) {
            if (this.c == ErrorMode.a) {
                b();
            }
            this.f = true;
            c();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (obj != null) {
            this.d.offer(obj);
        }
        c();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.h(this.e, disposable)) {
            this.e = disposable;
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iA = queueDisposable.a(7);
                if (iA == 1) {
                    this.d = queueDisposable;
                    this.f = true;
                    f();
                    c();
                    return;
                }
                if (iA == 2) {
                    this.d = queueDisposable;
                    f();
                    return;
                }
            }
            this.d = new SpscLinkedArrayQueue(this.b);
            f();
        }
    }
}
