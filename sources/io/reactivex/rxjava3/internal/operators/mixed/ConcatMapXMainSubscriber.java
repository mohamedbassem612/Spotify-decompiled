package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ConcatMapXMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
    public final AtomicThrowable a = new AtomicThrowable();
    public final int b;
    public final ErrorMode c;
    public SimpleQueue d;
    public pnc1 e;
    public volatile boolean f;
    public volatile boolean g;
    public boolean h;

    public ConcatMapXMainSubscriber(int i, ErrorMode errorMode) {
        this.c = errorMode;
        this.b = i;
    }

    public void a() {
    }

    public abstract void b();

    public abstract void c();

    public void cancel() {
        h();
    }

    public abstract void g();

    public final void h() {
        this.g = true;
        this.e.cancel();
        b();
        this.a.b();
        if (getAndIncrement() == 0) {
            this.d.clear();
            a();
        }
    }

    @Override // p.gnc1
    public final void onComplete() {
        this.f = true;
        c();
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        if (this.a.a(th)) {
            if (this.c == ErrorMode.a) {
                b();
            }
            this.f = true;
            c();
        }
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        if (obj == null || this.d.offer(obj)) {
            c();
        } else {
            this.e.cancel();
            onError(new MissingBackpressureException("queue full?!"));
        }
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (SubscriptionHelper.f(this.e, pnc1Var)) {
            this.e = pnc1Var;
            if (pnc1Var instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) pnc1Var;
                int iA = queueSubscription.a(7);
                if (iA == 1) {
                    this.d = queueSubscription;
                    this.h = true;
                    this.f = true;
                    g();
                    c();
                    return;
                }
                if (iA == 2) {
                    this.d = queueSubscription;
                    g();
                    this.e.request(this.b);
                    return;
                }
            }
            this.d = new SpscArrayQueue(this.b);
            g();
            this.e.request(this.b);
        }
    }
}
