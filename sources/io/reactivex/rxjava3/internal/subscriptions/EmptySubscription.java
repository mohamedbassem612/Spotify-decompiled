package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.operators.QueueSubscription;
import p.gnc1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EmptySubscription implements QueueSubscription<Object> {
    public static final EmptySubscription a;
    public static final /* synthetic */ EmptySubscription[] b;

    static {
        EmptySubscription emptySubscription = new EmptySubscription("INSTANCE", 0);
        a = emptySubscription;
        b = new EmptySubscription[]{emptySubscription};
    }

    public static void b(gnc1 gnc1Var) {
        gnc1Var.onSubscribe(a);
        gnc1Var.onComplete();
    }

    public static void c(Throwable th, gnc1 gnc1Var) {
        gnc1Var.onSubscribe(a);
        gnc1Var.onError(th);
    }

    public static EmptySubscription valueOf(String str) {
        return (EmptySubscription) Enum.valueOf(EmptySubscription.class, str);
    }

    public static EmptySubscription[] values() {
        return (EmptySubscription[]) b.clone();
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    public final int a(int i) {
        return 2;
    }

    @Override // p.pnc1
    public final void cancel() {
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override // p.pnc1
    public final void request(long j) {
        SubscriptionHelper.e(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
