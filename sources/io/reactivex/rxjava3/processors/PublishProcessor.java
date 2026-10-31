package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.i3a;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {
    public static final PublishSubscription[] d = new PublishSubscription[0];
    public static final PublishSubscription[] e = new PublishSubscription[0];
    public final AtomicReference b = new AtomicReference(e);
    public Throwable c;

    public static final class PublishSubscription<T> extends AtomicLong implements pnc1 {
        public final gnc1 a;
        public final PublishProcessor b;

        public PublishSubscription(gnc1 gnc1Var, PublishProcessor publishProcessor) {
            this.a = gnc1Var;
            this.b = publishProcessor;
        }

        @Override // p.pnc1
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.b.e0(this);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.b(this, j);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        AtomicReference atomicReference;
        PublishSubscription[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        PublishSubscription publishSubscription = new PublishSubscription(gnc1Var, this);
        gnc1Var.onSubscribe(publishSubscription);
        do {
            atomicReference = this.b;
            publishSubscriptionArr = (PublishSubscription[]) atomicReference.get();
            if (publishSubscriptionArr == d) {
                Throwable th = this.c;
                if (th != null) {
                    gnc1Var.onError(th);
                    return;
                } else {
                    gnc1Var.onComplete();
                    return;
                }
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!i3a.p(atomicReference, publishSubscriptionArr, publishSubscriptionArr2));
        if (publishSubscription.get() == Long.MIN_VALUE) {
            e0(publishSubscription);
        }
    }

    public final void e0(PublishSubscription publishSubscription) {
        AtomicReference atomicReference;
        PublishSubscription[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            atomicReference = this.b;
            publishSubscriptionArr = (PublishSubscription[]) atomicReference.get();
            if (publishSubscriptionArr == d || publishSubscriptionArr == (publishSubscriptionArr2 = e)) {
                return;
            }
            int length = publishSubscriptionArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishSubscriptionArr[i] == publishSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                publishSubscriptionArr2 = new PublishSubscription[length - 1];
                System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, i);
                System.arraycopy(publishSubscriptionArr, i + 1, publishSubscriptionArr2, i, (length - i) - 1);
            }
        } while (!i3a.p(atomicReference, publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // p.gnc1
    public final void onComplete() {
        AtomicReference atomicReference = this.b;
        Object obj = atomicReference.get();
        Object obj2 = d;
        if (obj == obj2) {
            return;
        }
        PublishSubscription[] publishSubscriptionArr = (PublishSubscription[]) atomicReference.getAndSet(obj2);
        for (PublishSubscription publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                publishSubscription.a.onComplete();
            }
        }
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.b;
        Object obj = atomicReference.get();
        Object obj2 = d;
        if (obj == obj2) {
            RxJavaPlugins.b(th);
            return;
        }
        this.c = th;
        for (PublishSubscription publishSubscription : (PublishSubscription[]) atomicReference.getAndSet(obj2)) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                publishSubscription.a.onError(th);
            } else {
                RxJavaPlugins.b(th);
            }
        }
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        ExceptionHelper.c(obj, "onNext called with a null value.");
        for (PublishSubscription publishSubscription : (PublishSubscription[]) this.b.get()) {
            gnc1 gnc1Var = publishSubscription.a;
            long j = publishSubscription.get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    gnc1Var.onNext(obj);
                    BackpressureHelper.f(publishSubscription, 1L);
                } else {
                    publishSubscription.cancel();
                    gnc1Var.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (this.b.get() == d) {
            pnc1Var.cancel();
        } else {
            pnc1Var.request(Long.MAX_VALUE);
        }
    }
}
