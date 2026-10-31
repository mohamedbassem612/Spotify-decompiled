package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableCreate$LatestAsyncEmitter<T> extends FlowableCreate$BaseEmitter<T> {
    public final AtomicReference c;
    public Throwable d;
    public volatile boolean e;
    public final AtomicInteger f;

    public FlowableCreate$LatestAsyncEmitter(gnc1 gnc1Var) {
        super(gnc1Var);
        this.c = new AtomicReference();
        this.f = new AtomicInteger();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate$BaseEmitter
    public final void c() {
        f();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate$BaseEmitter
    public final void d() {
        if (this.f.getAndIncrement() == 0) {
            this.c.lazySet(null);
        }
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate$BaseEmitter
    public final boolean e(Throwable th) {
        if (this.e || this.b.isDisposed()) {
            return false;
        }
        this.d = th;
        this.e = true;
        f();
        return true;
    }

    public final void f() {
        if (this.f.getAndIncrement() != 0) {
            return;
        }
        gnc1 gnc1Var = this.a;
        AtomicReference atomicReference = this.c;
        int iAddAndGet = 1;
        do {
            long j = get();
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    break;
                }
                if (this.b.isDisposed()) {
                    atomicReference.lazySet(null);
                    return;
                }
                boolean z = this.e;
                Object andSet = atomicReference.getAndSet(null);
                boolean z2 = andSet == null;
                if (z && z2) {
                    Throwable th = this.d;
                    if (th != null) {
                        b(th);
                        return;
                    } else {
                        a();
                        return;
                    }
                }
                if (z2) {
                    break;
                }
                gnc1Var.onNext(andSet);
                j2++;
            }
            if (j2 == j) {
                if (this.b.isDisposed()) {
                    atomicReference.lazySet(null);
                    return;
                }
                boolean z3 = this.e;
                boolean z4 = atomicReference.get() == null;
                if (z3 && z4) {
                    Throwable th2 = this.d;
                    if (th2 != null) {
                        b(th2);
                        return;
                    } else {
                        a();
                        return;
                    }
                }
            }
            if (j2 != 0) {
                BackpressureHelper.e(this, j2);
            }
            iAddAndGet = this.f.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate$BaseEmitter
    public final void onComplete() {
        this.e = true;
        f();
    }

    public void onNext(T t) {
        if (this.e || this.b.isDisposed()) {
            return;
        }
        if (t == null) {
            onError(ExceptionHelper.b("onNext called with a null value."));
        } else {
            this.c.set(t);
            f();
        }
    }
}
