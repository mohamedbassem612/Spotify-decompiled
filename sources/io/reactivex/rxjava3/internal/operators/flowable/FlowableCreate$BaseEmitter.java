package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.gvg;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class FlowableCreate$BaseEmitter<T> extends AtomicLong implements FlowableEmitter<T>, pnc1 {
    public final gnc1 a;
    public final SequentialDisposable b = new SequentialDisposable();

    public FlowableCreate$BaseEmitter(gnc1 gnc1Var) {
        this.a = gnc1Var;
    }

    public final void a() {
        SequentialDisposable sequentialDisposable = this.b;
        if (sequentialDisposable.isDisposed()) {
            return;
        }
        try {
            this.a.onComplete();
        } finally {
            sequentialDisposable.dispose();
        }
    }

    public final boolean b(Throwable th) {
        SequentialDisposable sequentialDisposable = this.b;
        if (sequentialDisposable.isDisposed()) {
            return false;
        }
        try {
            this.a.onError(th);
            return true;
        } finally {
            sequentialDisposable.dispose();
        }
    }

    public void c() {
    }

    public final void cancel() {
        this.b.dispose();
        d();
    }

    public void d() {
    }

    public boolean e(Throwable th) {
        return b(th);
    }

    @Override // io.reactivex.rxjava3.core.FlowableEmitter
    public final boolean isCancelled() {
        return this.b.isDisposed();
    }

    public void onComplete() {
        a();
    }

    public final void onError(Throwable th) {
        if (th == null) {
            th = ExceptionHelper.b("onError called with a null Throwable.");
        }
        if (e(th)) {
            return;
        }
        RxJavaPlugins.b(th);
    }

    public final void request(long j) {
        if (SubscriptionHelper.e(j)) {
            BackpressureHelper.a(this, j);
            c();
        }
    }

    @Override // io.reactivex.rxjava3.core.FlowableEmitter
    public final void setCancellable(Cancellable cancellable) {
        DisposableHelper.f(this.b, new CancellableDisposable(cancellable));
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return gvg.h(getClass().getSimpleName(), "{", super.toString(), "}");
    }

    @Override // io.reactivex.rxjava3.core.FlowableEmitter
    public final boolean tryOnError(Throwable th) {
        return e(th);
    }
}
