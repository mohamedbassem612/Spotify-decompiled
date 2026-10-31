package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {
    public static final Object[] e = new Object[0];
    public static final ReplaySubscription[] f = new ReplaySubscription[0];
    public static final ReplaySubscription[] g = new ReplaySubscription[0];
    public final UnboundedReplayBuffer b;
    public boolean c;
    public final AtomicReference d = new AtomicReference(f);

    public static final class ReplaySubscription<T> extends AtomicInteger implements pnc1 {
        public final gnc1 a;
        public final ReplayProcessor b;
        public Integer c;
        public final AtomicLong d = new AtomicLong();
        public volatile boolean e;
        public long f;

        public ReplaySubscription(gnc1 gnc1Var, ReplayProcessor replayProcessor) {
            this.a = gnc1Var;
            this.b = replayProcessor;
        }

        public final void cancel() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.b.f0(this);
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.d, j);
                this.b.b.a(this);
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> {
        public final ArrayList a = new ArrayList(16);
        public Throwable b;
        public volatile boolean c;
        public volatile int d;

        public final void a(ReplaySubscription replaySubscription) {
            int iIntValue;
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            ArrayList arrayList = this.a;
            gnc1 gnc1Var = replaySubscription.a;
            Integer num = replaySubscription.c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                replaySubscription.c = 0;
            }
            long j = replaySubscription.f;
            int iAddAndGet = 1;
            do {
                long j2 = replaySubscription.d.get();
                while (j != j2) {
                    if (replaySubscription.e) {
                        replaySubscription.c = null;
                        return;
                    }
                    boolean z = this.c;
                    int i = this.d;
                    if (z && iIntValue == i) {
                        replaySubscription.c = null;
                        replaySubscription.e = true;
                        Throwable th = this.b;
                        if (th == null) {
                            gnc1Var.onComplete();
                            return;
                        } else {
                            gnc1Var.onError(th);
                            return;
                        }
                    }
                    if (iIntValue == i) {
                        break;
                    }
                    gnc1Var.onNext(arrayList.get(iIntValue));
                    iIntValue++;
                    j++;
                }
                if (j == j2) {
                    if (replaySubscription.e) {
                        replaySubscription.c = null;
                        return;
                    }
                    boolean z2 = this.c;
                    int i2 = this.d;
                    if (z2 && iIntValue == i2) {
                        replaySubscription.c = null;
                        replaySubscription.e = true;
                        Throwable th2 = this.b;
                        if (th2 == null) {
                            gnc1Var.onComplete();
                            return;
                        } else {
                            gnc1Var.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.c = Integer.valueOf(iIntValue);
                replaySubscription.f = j;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    public ReplayProcessor(UnboundedReplayBuffer unboundedReplayBuffer) {
        this.b = unboundedReplayBuffer;
    }

    public static ReplayProcessor e0() {
        return new ReplayProcessor(new UnboundedReplayBuffer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(gnc1 gnc1Var) {
        ReplaySubscription replaySubscription = new ReplaySubscription(gnc1Var, this);
        gnc1Var.onSubscribe(replaySubscription);
        AtomicReference atomicReference = this.d;
        loop0: while (true) {
            ReplaySubscription[] replaySubscriptionArr = (ReplaySubscription[]) atomicReference.get();
            if (replaySubscriptionArr == g) {
                break;
            }
            int length = replaySubscriptionArr.length;
            ReplaySubscription[] replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
            do {
                if (atomicReference.compareAndSet(replaySubscriptionArr, replaySubscriptionArr2)) {
                    if (!replaySubscription.e) {
                        break loop0;
                    }
                    f0(replaySubscription);
                    return;
                }
            } while (atomicReference.get() == replaySubscriptionArr);
        }
        this.b.a(replaySubscription);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(ReplaySubscription replaySubscription) {
        ReplaySubscription[] replaySubscriptionArr;
        while (true) {
            AtomicReference atomicReference = this.d;
            ReplaySubscription[] replaySubscriptionArr2 = (ReplaySubscription[]) atomicReference.get();
            if (replaySubscriptionArr2 == g || replaySubscriptionArr2 == (replaySubscriptionArr = f)) {
                return;
            }
            int length = replaySubscriptionArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (replaySubscriptionArr2[i] == replaySubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                replaySubscriptionArr = new ReplaySubscription[length - 1];
                System.arraycopy(replaySubscriptionArr2, 0, replaySubscriptionArr, 0, i);
                System.arraycopy(replaySubscriptionArr2, i + 1, replaySubscriptionArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(replaySubscriptionArr2, replaySubscriptionArr)) {
                if (atomicReference.get() != replaySubscriptionArr2) {
                }
            }
            return;
        }
    }

    public final void onComplete() {
        if (this.c) {
            return;
        }
        this.c = true;
        UnboundedReplayBuffer unboundedReplayBuffer = this.b;
        unboundedReplayBuffer.c = true;
        for (ReplaySubscription replaySubscription : (ReplaySubscription[]) this.d.getAndSet(g)) {
            unboundedReplayBuffer.a(replaySubscription);
        }
    }

    public final void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (this.c) {
            RxJavaPlugins.b(th);
            return;
        }
        this.c = true;
        UnboundedReplayBuffer unboundedReplayBuffer = this.b;
        unboundedReplayBuffer.b = th;
        unboundedReplayBuffer.c = true;
        for (ReplaySubscription replaySubscription : (ReplaySubscription[]) this.d.getAndSet(g)) {
            unboundedReplayBuffer.a(replaySubscription);
        }
    }

    public final void onNext(Object obj) {
        ExceptionHelper.c(obj, "onNext called with a null value.");
        if (this.c) {
            return;
        }
        UnboundedReplayBuffer unboundedReplayBuffer = this.b;
        unboundedReplayBuffer.a.add(obj);
        unboundedReplayBuffer.d++;
        for (ReplaySubscription replaySubscription : (ReplaySubscription[]) this.d.get()) {
            unboundedReplayBuffer.a(replaySubscription);
        }
    }

    public final void onSubscribe(pnc1 pnc1Var) {
        if (this.c) {
            pnc1Var.cancel();
        } else {
            pnc1Var.request(Long.MAX_VALUE);
        }
    }
}
