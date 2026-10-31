package p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zch1 implements Executor {
    public static final zch1 a;
    public static final Handler b;
    public static final /* synthetic */ zch1[] c;

    static {
        zch1 zch1Var = new zch1("INSTANCE", 0);
        a = zch1Var;
        c = new zch1[]{zch1Var};
        b = new Handler(Looper.getMainLooper());
    }

    public static zch1 valueOf(String str) {
        return (zch1) Enum.valueOf(zch1.class, str);
    }

    public static zch1[] values() {
        return (zch1[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
