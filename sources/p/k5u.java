package p;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k5u implements Executor {
    public static final k5u a;
    public static final /* synthetic */ k5u[] b;

    static {
        k5u k5uVar = new k5u("INSTANCE", 0);
        a = k5uVar;
        b = new k5u[]{k5uVar};
    }

    public static k5u valueOf(String str) {
        return (k5u) Enum.valueOf(k5u.class, str);
    }

    public static k5u[] values() {
        return (k5u[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
