package io.reactivex.rxjava3.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class BackpressureStrategy {
    public static final BackpressureStrategy a;
    public static final BackpressureStrategy b;
    public static final BackpressureStrategy c;
    public static final BackpressureStrategy d;
    public static final /* synthetic */ BackpressureStrategy[] e;

    static {
        BackpressureStrategy backpressureStrategy = new BackpressureStrategy("MISSING", 0);
        a = backpressureStrategy;
        BackpressureStrategy backpressureStrategy2 = new BackpressureStrategy("ERROR", 1);
        BackpressureStrategy backpressureStrategy3 = new BackpressureStrategy("BUFFER", 2);
        b = backpressureStrategy3;
        BackpressureStrategy backpressureStrategy4 = new BackpressureStrategy("DROP", 3);
        c = backpressureStrategy4;
        BackpressureStrategy backpressureStrategy5 = new BackpressureStrategy("LATEST", 4);
        d = backpressureStrategy5;
        e = new BackpressureStrategy[]{backpressureStrategy, backpressureStrategy2, backpressureStrategy3, backpressureStrategy4, backpressureStrategy5};
    }

    public static BackpressureStrategy valueOf(String str) {
        return (BackpressureStrategy) Enum.valueOf(BackpressureStrategy.class, str);
    }

    public static BackpressureStrategy[] values() {
        return (BackpressureStrategy[]) e.clone();
    }
}
