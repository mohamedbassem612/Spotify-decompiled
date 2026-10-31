package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.l1d;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class SubscriptionArbiter extends AtomicInteger implements pnc1 {
    public pnc1 a;
    public long b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong d = new AtomicLong();
    public final AtomicLong e = new AtomicLong();
    public final boolean f;
    public volatile boolean g;
    public boolean h;

    public SubscriptionArbiter(boolean z) {
        this.f = z;
    }

    public final void c() {
        int iAddAndGet = 1;
        long jC = 0;
        pnc1 pnc1Var = null;
        do {
            pnc1 pnc1Var2 = (pnc1) this.c.get();
            if (pnc1Var2 != null) {
                pnc1Var2 = (pnc1) this.c.getAndSet(null);
            }
            long andSet = this.d.get();
            if (andSet != 0) {
                andSet = this.d.getAndSet(0L);
            }
            long andSet2 = this.e.get();
            if (andSet2 != 0) {
                andSet2 = this.e.getAndSet(0L);
            }
            pnc1 pnc1Var3 = this.a;
            if (this.g) {
                if (pnc1Var3 != null) {
                    pnc1Var3.cancel();
                    this.a = null;
                }
                if (pnc1Var2 != null) {
                    pnc1Var2.cancel();
                }
            } else {
                long jC2 = this.b;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = BackpressureHelper.c(jC2, andSet);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet2;
                        if (jC2 < 0) {
                            RxJavaPlugins.b(new ProtocolViolationException(l1d.l(jC2, "More produced than requested: ")));
                            jC2 = 0;
                        }
                    }
                    this.b = jC2;
                }
                if (pnc1Var2 != null) {
                    if (pnc1Var3 != null && this.f) {
                        pnc1Var3.cancel();
                    }
                    this.a = pnc1Var2;
                    if (jC2 != 0) {
                        jC = BackpressureHelper.c(jC, jC2);
                        pnc1Var = pnc1Var2;
                    }
                } else if (pnc1Var3 != null && andSet != 0) {
                    jC = BackpressureHelper.c(jC, andSet);
                    pnc1Var = pnc1Var3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC != 0) {
            pnc1Var.request(jC);
        }
    }

    public void cancel() {
        if (this.g) {
            return;
        }
        this.g = true;
        if (getAndIncrement() != 0) {
            return;
        }
        c();
    }

    public final void d(long j) {
        if (this.h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.a(this.e, j);
            if (getAndIncrement() != 0) {
                return;
            }
            c();
            return;
        }
        long j2 = this.b;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                RxJavaPlugins.b(new ProtocolViolationException(l1d.l(j3, "More produced than requested: ")));
                j3 = 0;
            }
            this.b = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        c();
    }

    public final void e(pnc1 pnc1Var) {
        if (this.g) {
            pnc1Var.cancel();
            return;
        }
        Objects.requireNonNull(pnc1Var, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            pnc1 pnc1Var2 = (pnc1) this.c.getAndSet(pnc1Var);
            if (pnc1Var2 != null && this.f) {
                pnc1Var2.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            c();
            return;
        }
        pnc1 pnc1Var3 = this.a;
        if (pnc1Var3 != null && this.f) {
            pnc1Var3.cancel();
        }
        this.a = pnc1Var;
        long j = this.b;
        if (decrementAndGet() != 0) {
            c();
        }
        if (j != 0) {
            pnc1Var.request(j);
        }
    }

    public void onSubscribe(pnc1 pnc1Var) {
        e(pnc1Var);
    }

    @Override // p.pnc1
    public final void request(long j) {
        if (!SubscriptionHelper.e(j) || this.h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.a(this.d, j);
            if (getAndIncrement() != 0) {
                return;
            }
            c();
            return;
        }
        long j2 = this.b;
        if (j2 != Long.MAX_VALUE) {
            long jC = BackpressureHelper.c(j2, j);
            this.b = jC;
            if (jC == Long.MAX_VALUE) {
                this.h = true;
            }
        }
        pnc1 pnc1Var = this.a;
        if (decrementAndGet() != 0) {
            c();
        }
        if (pnc1Var != null) {
            pnc1Var.request(j);
        }
    }
}
