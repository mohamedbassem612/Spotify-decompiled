package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d9c0 implements gq90, yt90 {
    public final o860 a;
    public final llm b;
    public final bpb1 c = gio1.b(new ap90(new yo90(xo90.c), new ro90((vo90) null, (wo90) null, (zo90) null), (to90) null, new uo90(0)));

    public d9c0(q8n q8nVar, o860 o860Var) {
        this.a = o860Var;
        this.b = i3a.k(q8nVar);
    }

    @Override // p.gq90
    public final zob1 b() {
        return d5p1.h(this.c);
    }

    public final void start() {
        o860 o860Var = this.a;
        l4p1.u(this.b, new fu20(hu20.e(rqt0.u(new x3s((mr20) ((vun) o860Var.d).b, (byte) 0)), new uls((lnm) null, o860Var, (byte) 28)), new y160(this, (lnm) null, (byte) 29), (byte) 1));
    }

    public final void stop() {
        op71.q(this.b.a, (CancellationException) null);
    }
}
