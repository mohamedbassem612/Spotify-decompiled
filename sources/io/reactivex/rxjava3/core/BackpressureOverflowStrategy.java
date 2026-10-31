package io.reactivex.rxjava3.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class BackpressureOverflowStrategy {
    public static final BackpressureOverflowStrategy a;
    public static final /* synthetic */ BackpressureOverflowStrategy[] b;

    /* JADX INFO: Fake field, exist only in values array */
    BackpressureOverflowStrategy EF0;

    static {
        BackpressureOverflowStrategy backpressureOverflowStrategy = new BackpressureOverflowStrategy("ERROR", 0);
        BackpressureOverflowStrategy backpressureOverflowStrategy2 = new BackpressureOverflowStrategy("DROP_OLDEST", 1);
        a = backpressureOverflowStrategy2;
        b = new BackpressureOverflowStrategy[]{backpressureOverflowStrategy, backpressureOverflowStrategy2, new BackpressureOverflowStrategy("DROP_LATEST", 2)};
    }

    public static BackpressureOverflowStrategy valueOf(String str) {
        return (BackpressureOverflowStrategy) Enum.valueOf(BackpressureOverflowStrategy.class, str);
    }

    public static BackpressureOverflowStrategy[] values() {
        return (BackpressureOverflowStrategy[]) b.clone();
    }
}
