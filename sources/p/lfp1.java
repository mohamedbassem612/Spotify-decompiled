package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lfp1 {
    public static final lfp1 d = new lfp1();
    public final Runnable a;
    public final Executor b;
    public lfp1 c;

    public lfp1() {
        this.a = null;
        this.b = null;
    }

    public lfp1(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
