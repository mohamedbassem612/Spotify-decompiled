package p;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class and0 implements rjp0 {
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final kl1 b;
    public final Executor c;

    public and0(Executor executor, kl1 kl1Var) {
        this.c = executor;
        this.b = kl1Var;
    }

    public final void b(Object obj) {
        this.c.execute(new ag20(this, (bnd0) obj, (byte) 14));
    }
}
