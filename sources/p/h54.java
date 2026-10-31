package p;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h54 {
    public final Executor a;
    public final ynb0 b;
    public final ynb0 c;
    public boolean e;
    public final CountDownLatch d = new CountDownLatch(1);
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();

    public h54(Executor executor, ynb0 ynb0Var, ynb0 ynb0Var2) {
        this.a = executor;
        this.b = ynb0Var;
        this.c = ynb0Var2;
    }
}
