package p;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hwn1 implements Executor {
    public static final hwn1 a;
    public static final /* synthetic */ hwn1[] b;

    static {
        hwn1 hwn1Var = new hwn1("INSTANCE", 0);
        a = hwn1Var;
        b = new hwn1[]{hwn1Var};
    }

    public static hwn1[] values() {
        return (hwn1[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
