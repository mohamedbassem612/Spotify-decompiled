package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.l1d;
import p.pnc1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SubscriptionHelper implements pnc1 {
    public static final SubscriptionHelper a;
    public static final /* synthetic */ SubscriptionHelper[] b;

    static {
        SubscriptionHelper subscriptionHelper = new SubscriptionHelper("CANCELLED", 0);
        a = subscriptionHelper;
        b = new SubscriptionHelper[]{subscriptionHelper};
    }

    public static boolean a(AtomicReference atomicReference) {
        pnc1 pnc1Var;
        pnc1 pnc1Var2 = (pnc1) atomicReference.get();
        SubscriptionHelper subscriptionHelper = a;
        if (pnc1Var2 == subscriptionHelper || (pnc1Var = (pnc1) atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (pnc1Var == null) {
            return true;
        }
        pnc1Var.cancel();
        return true;
    }

    public static void b(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        pnc1 pnc1Var = (pnc1) atomicReference.get();
        if (pnc1Var != null) {
            pnc1Var.request(j);
            return;
        }
        if (e(j)) {
            BackpressureHelper.a(atomicLong, j);
            pnc1 pnc1Var2 = (pnc1) atomicReference.get();
            if (pnc1Var2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    pnc1Var2.request(andSet);
                }
            }
        }
    }

    public static void c(AtomicReference atomicReference, AtomicLong atomicLong, pnc1 pnc1Var) {
        if (d(atomicReference, pnc1Var)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                pnc1Var.request(andSet);
            }
        }
    }

    public static boolean d(AtomicReference atomicReference, pnc1 pnc1Var) {
        Objects.requireNonNull(pnc1Var, "s is null");
        while (!atomicReference.compareAndSet(null, pnc1Var)) {
            if (atomicReference.get() != null) {
                pnc1Var.cancel();
                if (atomicReference.get() == a) {
                    return false;
                }
                RxJavaPlugins.b(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean e(long j) {
        if (j > 0) {
            return true;
        }
        RxJavaPlugins.b(new IllegalArgumentException(l1d.l(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean f(pnc1 pnc1Var, pnc1 pnc1Var2) {
        if (pnc1Var2 == null) {
            RxJavaPlugins.b(new NullPointerException("next is null"));
            return false;
        }
        if (pnc1Var == null) {
            return true;
        }
        pnc1Var2.cancel();
        RxJavaPlugins.b(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static SubscriptionHelper valueOf(String str) {
        return (SubscriptionHelper) Enum.valueOf(SubscriptionHelper.class, str);
    }

    public static SubscriptionHelper[] values() {
        return (SubscriptionHelper[]) b.clone();
    }

    @Override // p.pnc1
    public final void cancel() {
    }

    @Override // p.pnc1
    public final void request(long j) {
    }
}
