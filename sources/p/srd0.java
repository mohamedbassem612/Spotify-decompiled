package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class srd0 implements f961 {
    public final n4f0 a;
    public final AtomicReference b = new AtomicReference(null);

    public srd0(n4f0 n4f0Var) {
        this.a = n4f0Var;
    }

    @Override // p.dwo
    public final void shutdown() {
        this.a.b(new jgd0(this, (byte) 5));
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
