package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
abstract class AbstractBackpressureThrottlingSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, pnc1 {
    public final gnc1 a;
    public pnc1 b;
    public volatile boolean c;
    public Throwable d;
    public volatile boolean e;
    public final AtomicLong f = new AtomicLong();
    public final AtomicReference g = new AtomicReference();

    public AbstractBackpressureThrottlingSubscriber(gnc1 gnc1Var) {
        this.a = gnc1Var;
    }

    public final boolean a(boolean z, boolean z2, gnc1 gnc1Var, AtomicReference atomicReference) {
        if (this.e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.d;
        if (th != null) {
            atomicReference.lazySet(null);
            gnc1Var.onError(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        gnc1Var.onComplete();
        return true;
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        gnc1 gnc1Var = this.a;
        AtomicLong atomicLong = this.f;
        AtomicReference atomicReference = this.g;
        int iAddAndGet = 1;
        do {
            long j = 0;
            while (true) {
                if (j == atomicLong.get()) {
                    break;
                }
                boolean z = this.c;
                Object andSet = atomicReference.getAndSet(null);
                boolean z2 = andSet == null;
                if (a(z, z2, gnc1Var, atomicReference)) {
                    return;
                }
                if (z2) {
                    break;
                }
                gnc1Var.onNext(andSet);
                j++;
            }
            if (j == atomicLong.get()) {
                if (a(this.c, atomicReference.get() == null, gnc1Var, atomicReference)) {
                    return;
                }
            }
            if (j != 0) {
                BackpressureHelper.e(atomicLong, j);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // p.pnc1
    public final void cancel() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.cancel();
        if (getAndIncrement() == 0) {
            this.g.lazySet(null);
        }
    }

    @Override // p.gnc1
    public final void onComplete() {
        this.c = true;
        b();
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        this.d = th;
        this.c = true;
        b();
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (SubscriptionHelper.f(this.b, pnc1Var)) {
            this.b = pnc1Var;
            this.a.onSubscribe(this);
            pnc1Var.request(Long.MAX_VALUE);
        }
    }

    @Override // p.pnc1
    public final void request(long j) {
        if (SubscriptionHelper.e(j)) {
            BackpressureHelper.a(this.f, j);
            b();
        }
    }
}
