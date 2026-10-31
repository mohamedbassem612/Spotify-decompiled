package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r3a0 implements yt90 {
    public final ynb0 a;
    public final b0a0 b;
    public final xl01 c;
    public final c9c0 d;
    public final llm f;
    public faa0 g;
    public final idd1 e = new idd1(new pr90(this, (byte) 6));
    public final rku h = new rku();

    public r3a0(ynb0 ynb0Var, b0a0 b0a0Var, xl01 xl01Var, c9c0 c9c0Var, q8n q8nVar) {
        this.a = ynb0Var;
        this.b = b0a0Var;
        this.c = xl01Var;
        this.d = c9c0Var;
        this.f = l1d.x(q8nVar);
    }

    @Override // p.yt90
    public final void start() {
        this.g = c921.y(this.f, (o8n) null, 0, new no70(this, (lnm) null, (byte) 13), 3);
    }

    @Override // p.yt90
    public final void stop() {
        faa0 faa0Var = this.g;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.h.a();
        xl01 xl01Var = this.c;
        xl01Var.d.m(null, b7x.a);
        op71.r(xl01Var.c.a);
    }
}
