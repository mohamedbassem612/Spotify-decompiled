package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class LambdaSubscriber<T> extends AtomicReference<pnc1> implements FlowableSubscriber<T>, pnc1, Disposable, LambdaConsumerIntrospection {
    public final Consumer a;
    public final Consumer b;
    public final Action c;

    public LambdaSubscriber(Consumer consumer, Consumer consumer2, Action action) {
        this.a = consumer;
        this.b = consumer2;
        this.c = action;
    }

    @Override // p.pnc1
    public final void cancel() {
        SubscriptionHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.b != Functions.f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == SubscriptionHelper.a;
    }

    @Override // p.gnc1
    public final void onComplete() {
        pnc1 pnc1Var = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.a;
        if (pnc1Var != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.c.run();
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
        }
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        pnc1 pnc1Var = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.a;
        if (pnc1Var == subscriptionHelper) {
            RxJavaPlugins.b(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            RxJavaPlugins.b(new CompositeException(th, th2));
        }
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            Exceptions.a(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (SubscriptionHelper.d(this, pnc1Var)) {
            try {
                FlowableInternalHelper$RequestMax.a.accept(this);
            } catch (Throwable th) {
                Exceptions.a(th);
                pnc1Var.cancel();
                onError(th);
            }
        }
    }

    @Override // p.pnc1
    public final void request(long j) {
        get().request(j);
    }
}
