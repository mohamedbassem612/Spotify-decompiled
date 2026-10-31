package p;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l5u implements Executor {
    public static final l5u a;
    public static final /* synthetic */ l5u[] b;

    static {
        l5u l5uVar = new l5u("INSTANCE", 0);
        a = l5uVar;
        b = new l5u[]{l5uVar};
    }

    public static l5u valueOf(String str) {
        return (l5u) Enum.valueOf(l5u.class, str);
    }

    public static l5u[] values() {
        return (l5u[]) b.clone();
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
