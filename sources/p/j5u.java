package p;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j5u implements Executor {
    public static final j5u a;
    public static final /* synthetic */ j5u[] b;

    static {
        j5u j5uVar = new j5u("INSTANCE", 0);
        a = j5uVar;
        b = new j5u[]{j5uVar};
    }

    public static j5u valueOf(String str) {
        return (j5u) Enum.valueOf(j5u.class, str);
    }

    public static j5u[] values() {
        return (j5u[]) b.clone();
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
