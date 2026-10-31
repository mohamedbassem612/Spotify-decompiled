package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class DisposableAutoReleaseSubscriber<T> extends AtomicReference<pnc1> implements FlowableSubscriber<T>, Disposable, LambdaConsumerIntrospection {
    public final AtomicReference a;
    public final Consumer b;
    public final Consumer c;
    public final Action d;

    public DisposableAutoReleaseSubscriber(Consumer consumer, Consumer consumer2, Action action, DisposableContainer disposableContainer) {
        this.b = consumer;
        this.c = consumer2;
        this.d = action;
        this.a = new AtomicReference(disposableContainer);
    }

    public void dispose() {
        SubscriptionHelper.a(this);
        DisposableContainer disposableContainer = (DisposableContainer) this.a.getAndSet(null);
        if (disposableContainer != null) {
            disposableContainer.c(this);
        }
    }

    public final boolean hasCustomOnError() {
        return this.c != Functions.f;
    }

    public boolean isDisposed() {
        return SubscriptionHelper.a == get();
    }

    public final void onComplete() {
        SubscriptionHelper subscriptionHelper = get();
        SubscriptionHelper subscriptionHelper2 = SubscriptionHelper.a;
        if (subscriptionHelper != subscriptionHelper2) {
            lazySet(subscriptionHelper2);
            try {
                this.d.run();
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
        }
        DisposableContainer disposableContainer = (DisposableContainer) this.a.getAndSet(null);
        if (disposableContainer != null) {
            disposableContainer.c(this);
        }
    }

    public final void onError(Throwable th) {
        SubscriptionHelper subscriptionHelper = get();
        SubscriptionHelper subscriptionHelper2 = SubscriptionHelper.a;
        if (subscriptionHelper != subscriptionHelper2) {
            lazySet(subscriptionHelper2);
            try {
                this.c.accept(th);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                RxJavaPlugins.b(new CompositeException(new Throwable[]{th, th2}));
            }
        } else {
            RxJavaPlugins.b(th);
        }
        DisposableContainer disposableContainer = (DisposableContainer) this.a.getAndSet(null);
        if (disposableContainer != null) {
            disposableContainer.c(this);
        }
    }

    public final void onNext(Object obj) {
        if (get() != SubscriptionHelper.a) {
            try {
                this.b.accept(obj);
            } catch (Throwable th) {
                Exceptions.a(th);
                get().cancel();
                onError(th);
            }
        }
    }

    public final void onSubscribe(pnc1 pnc1Var) {
        if (SubscriptionHelper.d(this, pnc1Var)) {
            pnc1Var.request(Long.MAX_VALUE);
        }
    }
}
