package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableDoOnLifecycle$SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, pnc1 {
    public final gnc1 a;
    public final Consumer b;
    public final LongConsumer c;
    public final Action d;
    public pnc1 e;

    public FlowableDoOnLifecycle$SubscriptionLambdaSubscriber(gnc1 gnc1Var, Consumer consumer, LongConsumer longConsumer, Action action) {
        this.a = gnc1Var;
        this.b = consumer;
        this.d = action;
        this.c = longConsumer;
    }

    public final void cancel() {
        SubscriptionHelper subscriptionHelper = this.e;
        SubscriptionHelper subscriptionHelper2 = SubscriptionHelper.a;
        if (subscriptionHelper != subscriptionHelper2) {
            this.e = subscriptionHelper2;
            try {
                this.d.run();
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
            subscriptionHelper.cancel();
        }
    }

    public final void onComplete() {
        if (this.e != SubscriptionHelper.a) {
            this.a.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.e != SubscriptionHelper.a) {
            this.a.onError(th);
        } else {
            RxJavaPlugins.b(th);
        }
    }

    public final void onNext(Object obj) {
        this.a.onNext(obj);
    }

    public final void onSubscribe(pnc1 pnc1Var) {
        gnc1 gnc1Var = this.a;
        try {
            this.b.accept(pnc1Var);
            if (SubscriptionHelper.f(this.e, pnc1Var)) {
                this.e = pnc1Var;
                gnc1Var.onSubscribe(this);
            }
        } catch (Throwable th) {
            Exceptions.a(th);
            pnc1Var.cancel();
            this.e = SubscriptionHelper.a;
            gnc1Var.onSubscribe(EmptySubscription.a);
            gnc1Var.onError(th);
        }
    }

    public final void request(long j) {
        try {
            this.c.getClass();
        } catch (Throwable th) {
            Exceptions.a(th);
            RxJavaPlugins.b(th);
        }
        this.e.request(j);
    }
}
