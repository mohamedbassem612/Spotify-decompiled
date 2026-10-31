package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s7b1 implements f961, r7b1 {
    public final kly0 a;
    public final kly0 b;
    public final xok0 c = new xok0((byte) 4);
    public final vku d = new vku();
    public final AtomicBoolean e;

    public s7b1(kly0 kly0Var, kly0 kly0Var2) {
        this.a = kly0Var;
        this.b = kly0Var2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        atomicBoolean.set(true);
    }

    @Override // p.dwo
    public final void shutdown() {
        this.d.c();
        this.e.set(false);
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
