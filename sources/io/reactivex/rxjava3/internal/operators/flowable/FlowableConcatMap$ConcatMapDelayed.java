package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.Objects;
import p.gnc1;
import p.moy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableConcatMap$ConcatMapDelayed<T, R> extends FlowableConcatMap.BaseConcatMapSubscriber<T, R> {
    public final boolean N0;
    public final gnc1 Z;

    public FlowableConcatMap$ConcatMapDelayed(int i, Function function, gnc1 gnc1Var, boolean z) {
        super(function, i);
        this.Z = gnc1Var;
        this.N0 = z;
    }

    public final void a(Throwable th) {
        if (((FlowableConcatMap.BaseConcatMapSubscriber) this).t.a(th)) {
            if (!this.N0) {
                ((FlowableConcatMap.BaseConcatMapSubscriber) this).e.cancel();
                ((FlowableConcatMap.BaseConcatMapSubscriber) this).h = true;
            }
            ((FlowableConcatMap.BaseConcatMapSubscriber) this).X = false;
            c();
        }
    }

    public final void b(Object obj) {
        this.Z.onNext(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        Object obj;
        if (getAndIncrement() == 0) {
            while (!((FlowableConcatMap.BaseConcatMapSubscriber) this).i) {
                if (!((FlowableConcatMap.BaseConcatMapSubscriber) this).X) {
                    boolean z = ((FlowableConcatMap.BaseConcatMapSubscriber) this).h;
                    if (z && !this.N0 && ((Throwable) ((FlowableConcatMap.BaseConcatMapSubscriber) this).t.get()) != null) {
                        ((FlowableConcatMap.BaseConcatMapSubscriber) this).t.e(this.Z);
                        return;
                    }
                    try {
                        Object objPoll = ((FlowableConcatMap.BaseConcatMapSubscriber) this).g.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            ((FlowableConcatMap.BaseConcatMapSubscriber) this).t.e(this.Z);
                            return;
                        }
                        if (!z2) {
                            try {
                                Object objApply = ((FlowableConcatMap.BaseConcatMapSubscriber) this).b.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                                Supplier supplier = (moy0) objApply;
                                if (((FlowableConcatMap.BaseConcatMapSubscriber) this).Y != 1) {
                                    int i = ((FlowableConcatMap.BaseConcatMapSubscriber) this).f + 1;
                                    if (i == ((FlowableConcatMap.BaseConcatMapSubscriber) this).d) {
                                        ((FlowableConcatMap.BaseConcatMapSubscriber) this).f = 0;
                                        ((FlowableConcatMap.BaseConcatMapSubscriber) this).e.request(i);
                                    } else {
                                        ((FlowableConcatMap.BaseConcatMapSubscriber) this).f = i;
                                    }
                                }
                                if (supplier instanceof Supplier) {
                                    try {
                                        obj = supplier.get();
                                    } catch (Throwable th) {
                                        Exceptions.a(th);
                                        ((FlowableConcatMap.BaseConcatMapSubscriber) this).t.a(th);
                                        if (!this.N0) {
                                            ((FlowableConcatMap.BaseConcatMapSubscriber) this).e.cancel();
                                            ((FlowableConcatMap.BaseConcatMapSubscriber) this).t.e(this.Z);
                                            return;
                                        }
                                        obj = null;
                                    }
                                    if (obj == null) {
                                        continue;
                                    } else if (((SubscriptionArbiter) ((FlowableConcatMap.BaseConcatMapSubscriber) this).a).h) {
                                        this.Z.onNext(obj);
                                    } else {
                                        ((FlowableConcatMap.BaseConcatMapSubscriber) this).X = true;
                                        ((FlowableConcatMap.BaseConcatMapSubscriber) this).a.e(new FlowableConcatMap$SimpleScalarSubscription(obj, ((FlowableConcatMap.BaseConcatMapSubscriber) this).a));
                                    }
                                } else {
                                    ((FlowableConcatMap.BaseConcatMapSubscriber) this).X = true;
                                    supplier.subscribe(((FlowableConcatMap.BaseConcatMapSubscriber) this).a);
                                }
                            } catch (Throwable th2) {
                                Exceptions.a(th2);
                                ((FlowableConcatMap.BaseConcatMapSubscriber) this).e.cancel();
                                ((FlowableConcatMap.BaseConcatMapSubscriber) this).t.a(th2);
                                ((FlowableConcatMap.BaseConcatMapSubscriber) this).t.e(this.Z);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.a(th3);
                        ((FlowableConcatMap.BaseConcatMapSubscriber) this).e.cancel();
                        ((FlowableConcatMap.BaseConcatMapSubscriber) this).t.a(th3);
                        ((FlowableConcatMap.BaseConcatMapSubscriber) this).t.e(this.Z);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public final void cancel() {
        if (((FlowableConcatMap.BaseConcatMapSubscriber) this).i) {
            return;
        }
        ((FlowableConcatMap.BaseConcatMapSubscriber) this).i = true;
        ((FlowableConcatMap.BaseConcatMapSubscriber) this).a.cancel();
        ((FlowableConcatMap.BaseConcatMapSubscriber) this).e.cancel();
        ((FlowableConcatMap.BaseConcatMapSubscriber) this).t.b();
    }

    public final void d() {
        this.Z.onSubscribe(this);
    }

    public final void onError(Throwable th) {
        if (((FlowableConcatMap.BaseConcatMapSubscriber) this).t.a(th)) {
            ((FlowableConcatMap.BaseConcatMapSubscriber) this).h = true;
            c();
        }
    }

    public final void request(long j) {
        ((FlowableConcatMap.BaseConcatMapSubscriber) this).a.request(j);
    }
}
