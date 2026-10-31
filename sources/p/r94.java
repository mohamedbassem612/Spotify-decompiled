package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class r94 implements Executor {
    public final /* synthetic */ ha4 a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ha4 outOfFrameExecutor = this.a.getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.G(new q01(runnable));
        }
    }
}
