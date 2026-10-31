package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oib implements akb {
    public final sib a;
    public final tgb b;
    public final llm c;
    public final bpb1 d = gio1.b(w7x.a);
    public final bpb1 e = gio1.b(b7x.a);
    public final bpb1 f = gio1.b(oeo0.a);
    public final dt71 g = mgo1.e(0, 1, 0, 5);

    public oib(sib sibVar, q8n q8nVar, tgb tgbVar) {
        this.a = sibVar;
        this.b = tgbVar;
        this.c = smo1.e(ha71.A(op71.f(), q8nVar));
    }

    @Override // p.akb
    public final void start() {
        if (this.b.isEnabled()) {
            l4p1.u(this.c, f5p1.q(rqt0.u(new mgb(oqo1.y(k4k.n(oqo1.q(this.e, this.g), this.d)), this, (byte) 2)), new xe2(this, (lnm) null, (byte) 1)));
        }
    }

    @Override // p.akb
    public final void stop() {
        if (this.b.isEnabled()) {
            op71.r(this.c.a);
            sib sibVar = this.a;
            Function0 function0 = sibVar.h;
            if (function0 != null) {
                function0.invoke();
            }
            sibVar.h = null;
            this.e.m((Object) null, b7x.a);
            this.f.m((Object) null, oeo0.a);
            this.g.d();
        }
    }
}
