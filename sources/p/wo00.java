package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class wo00 implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wdd1 b;

    public /* synthetic */ wo00(wdd1 wdd1Var, byte b) {
        this.a = b;
        this.b = wdd1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        this.b.f(runnable);
    }
}
