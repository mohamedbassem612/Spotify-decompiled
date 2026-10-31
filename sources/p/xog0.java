package p;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xog0 extends nog0 {
    public final ReferenceQueue h;

    public xog0(ipg0 ipg0Var, int i) {
        super(ipg0Var, i);
        this.h = new ReferenceQueue();
    }

    @Override // p.nog0
    public final void e() {
        while (this.h.poll() != null) {
        }
    }

    @Override // p.nog0
    public final void f() {
        b(this.h);
    }

    @Override // p.nog0
    public final nog0 k() {
        return this;
    }
}
