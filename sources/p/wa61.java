package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wa61 implements ya61 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final ya61 b;

    public wa61(ya61 ya61Var) {
        this.b = ya61Var;
    }

    @Override // p.ya61
    public final void a(bb61 bb61Var) {
        if (this.a.get()) {
            return;
        }
        this.b.a(bb61Var);
    }

    public final void b() {
        this.a.set(true);
    }
}
