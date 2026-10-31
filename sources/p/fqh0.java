package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class fqh0 implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iqh0 b;

    public /* synthetic */ fqh0(iqh0 iqh0Var, byte b) {
        this.a = b;
        this.b = iqh0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        this.b.M(runnable);
    }
}
