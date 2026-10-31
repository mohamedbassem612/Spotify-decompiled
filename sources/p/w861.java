package p;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w861 implements Runnable {
    public final /* synthetic */ CountDownLatch a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x861 c;

    public w861(y861 y861Var, CountDownLatch countDownLatch, int i, x861 x861Var) {
        this.a = countDownLatch;
        this.b = i;
        this.c = x861Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y861.c(this.a, this.b, this.c);
    }
}
