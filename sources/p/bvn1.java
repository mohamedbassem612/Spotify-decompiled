package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bvn1 {
    public static final bvn1 d = new bvn1();
    public final Runnable a;
    public final Executor b;
    public bvn1 c;

    public bvn1() {
        this.a = null;
        this.b = null;
    }

    public bvn1(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
