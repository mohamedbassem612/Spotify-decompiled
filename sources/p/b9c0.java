package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b9c0 implements omo, yt90 {
    public final cp31 a;
    public final llm b;
    public final bpb1 c = gio1.b((Object) null);

    public b9c0(q8n q8nVar, cp31 cp31Var) {
        this.a = cp31Var;
        this.b = i3a.k(q8nVar);
    }

    @Override // p.omo
    public final zob1 current() {
        return d5p1.h(this.c);
    }

    public final void start() {
        cp31 cp31Var = this.a;
        l4p1.u(this.b, new fu20(rqt0.u(new x010(yoi1.g(((lx91) cp31Var.a).k.f().distinctUntilChanged()), ((her) cp31Var.b).a(), new ms4(cp31Var, (lnm) null, (byte) 4), (byte) 1)), new y160(this, (lnm) null, (byte) 28), (byte) 1));
    }

    public final void stop() {
        op71.q(this.b.a, (CancellationException) null);
    }
}
