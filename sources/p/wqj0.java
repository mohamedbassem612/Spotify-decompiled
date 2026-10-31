package p;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wqj0 {
    public final fnn a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicReference c = new AtomicReference(null);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean e;

    public wqj0(fnn fnnVar) {
        this.a = fnnVar;
    }

    public final int a() {
        return this.b.incrementAndGet();
    }

    public final void b() {
        this.e = true;
        c();
    }

    public final void c() {
        vqj0 vqj0Var;
        if (this.e && (vqj0Var = (vqj0) this.c.get()) != null && vqj0Var.a == this.b.get() && this.d.compareAndSet(false, true)) {
            this.a.invoke(vqj0Var.b);
        }
    }
}
