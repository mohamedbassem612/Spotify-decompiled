package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ui0 implements yw0 {
    public final crd a;
    public final hld b;
    public final llm c;

    public ui0(crd crdVar, hld hldVar, q8n q8nVar) {
        this.a = crdVar;
        this.b = hldVar;
        this.c = smo1.e(q8nVar);
    }

    @Override // p.yw0
    public final void start() {
        l4p1.u(this.c, x4p1.h(f5p1.q(rqt0.u(yoi1.g(((drd) this.a).c)), new j1(this.b)), new jk((byte) 1)));
    }

    @Override // p.yw0
    public final void stop() {
        smo1.q(this.c);
    }
}
