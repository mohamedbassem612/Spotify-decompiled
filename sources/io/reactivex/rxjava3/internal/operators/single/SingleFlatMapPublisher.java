package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {
    public final Single b;
    public final Function c;

    public SingleFlatMapPublisher(Single single, Function function) {
        this.b = single;
        this.c = function;
    }

    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new SingleFlatMapPublisherObserver(gnc1Var, this.c));
    }

    public static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements SingleObserver<S>, FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final Function b;
        public final AtomicReference c = new AtomicReference();
        public Disposable d;

        public SingleFlatMapPublisherObserver(gnc1 gnc1Var, Function function) {
            this.a = gnc1Var;
            this.b = function;
        }

        public final void cancel() {
            this.d.dispose();
            SubscriptionHelper.a(this.c);
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            this.d = disposable;
            this.a.onSubscribe(this);
        }

        public final void onSuccess(Object obj) {
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "the mapper returned a null Publisher");
                moy0 moy0Var = (moy0) objApply;
                if (this.c.get() != SubscriptionHelper.a) {
                    moy0Var.subscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                this.a.onError(th);
            }
        }

        public final void request(long j) {
            SubscriptionHelper.b(this.c, this, j);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            SubscriptionHelper.c(this.c, this, pnc1Var);
        }
    }
}
