package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zgs0 implements yt90 {
    public final Observable a;
    public final vu60 b;
    public final iw60 c;
    public final llm d;

    public zgs0(Observable observable, vu60 vu60Var, iw60 iw60Var, q8n q8nVar) {
        this.a = observable;
        this.b = vu60Var;
        this.c = iw60Var;
        this.d = l1d.x(q8nVar);
    }

    @Override // p.yt90
    public final void start() {
        l4p1.u(this.d, f5p1.q(yoi1.g(this.a.switchMap(new vgq0(this, (byte) 4))), new iyb0(this, (lnm) null, (byte) 29)));
    }

    @Override // p.yt90
    public final void stop() {
        op71.r(this.d.a);
    }
}
