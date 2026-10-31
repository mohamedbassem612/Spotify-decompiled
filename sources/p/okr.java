package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class okr implements dxc {
    public final Executor a;
    public final dxc b;

    public okr(Executor executor, dxc dxcVar) {
        this.a = executor;
        this.b = dxcVar;
    }

    @Override // p.dxc
    public final sy21 c() {
        return this.b.c();
    }

    @Override // p.dxc
    public final void cancel() {
        this.b.cancel();
    }

    @Override // p.dxc
    public final dxc clone() {
        return new okr(this.a, this.b.clone());
    }

    @Override // p.dxc
    public final boolean f() {
        return this.b.f();
    }

    @Override // p.dxc
    public final ln21 m() {
        return this.b.m();
    }

    @Override // p.dxc
    public final boolean o() {
        return this.b.o();
    }

    @Override // p.dxc
    public final void p(myc mycVar) {
        this.b.p(new lbq(this, mycVar));
    }
}
