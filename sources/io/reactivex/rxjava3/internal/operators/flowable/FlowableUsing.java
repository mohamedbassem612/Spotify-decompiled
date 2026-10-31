package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p.gnc1;
import p.moy0;
import p.pnc1;
import p.rbc;
import p.tg;
import p.yj1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableUsing<T, D> extends Flowable<T> {
    public final yj1 b;
    public final Function c;
    public final tg d;
    public final boolean e;

    public static final class UsingSubscriber<T, D> extends AtomicBoolean implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final Object b;
        public final Consumer c;
        public final boolean d;
        public pnc1 e;

        public UsingSubscriber(gnc1 gnc1Var, Object obj, tg tgVar, boolean z) {
            this.a = gnc1Var;
            this.b = obj;
            this.c = tgVar;
            this.d = z;
        }

        public final void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.c.accept(this.b);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        public final void cancel() {
            boolean z = this.d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.a;
            if (z) {
                a();
                this.e.cancel();
                this.e = subscriptionHelper;
            } else {
                this.e.cancel();
                this.e = subscriptionHelper;
                a();
            }
        }

        public final void onComplete() {
            boolean z = this.d;
            gnc1 gnc1Var = this.a;
            if (!z) {
                gnc1Var.onComplete();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.c.accept(this.b);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    gnc1Var.onError(th);
                    return;
                }
            }
            gnc1Var.onComplete();
        }

        public final void onError(Throwable th) {
            boolean z = this.d;
            gnc1 gnc1Var = this.a;
            if (!z) {
                gnc1Var.onError(th);
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.c.accept(this.b);
                } catch (Throwable th2) {
                    th = th2;
                    Exceptions.a(th);
                }
            }
            th = null;
            if (th != null) {
                gnc1Var.onError(new CompositeException(new Throwable[]{th, th}));
            } else {
                gnc1Var.onError(th);
            }
        }

        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.e, pnc1Var)) {
                this.e = pnc1Var;
                this.a.onSubscribe(this);
            }
        }

        public final void request(long j) {
            this.e.request(j);
        }
    }

    public FlowableUsing(yj1 yj1Var, tg tgVar) {
        rbc rbcVar = rbc.t;
        this.b = yj1Var;
        this.c = rbcVar;
        this.d = tgVar;
        this.e = true;
    }

    public final void V(gnc1 gnc1Var) {
        EmptySubscription emptySubscription = EmptySubscription.a;
        tg tgVar = this.d;
        try {
            Object obj = this.b.get();
            try {
                Object objApply = this.c.apply(obj);
                Objects.requireNonNull(objApply, "The sourceSupplier returned a null Publisher");
                ((moy0) objApply).subscribe(new UsingSubscriber(gnc1Var, obj, tgVar, this.e));
            } catch (Throwable th) {
                Exceptions.a(th);
                try {
                    tgVar.accept(obj);
                    gnc1Var.onSubscribe(emptySubscription);
                    gnc1Var.onError(th);
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    CompositeException compositeException = new CompositeException(new Throwable[]{th, th2});
                    gnc1Var.onSubscribe(emptySubscription);
                    gnc1Var.onError(compositeException);
                }
            }
        } catch (Throwable th3) {
            Exceptions.a(th3);
            gnc1Var.onSubscribe(emptySubscription);
            gnc1Var.onError(th3);
        }
    }
}
