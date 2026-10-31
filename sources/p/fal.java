package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fal implements f961 {
    public final lc4 a;
    public final kly0 b;
    public final kly0 c;
    public final q8n d;
    public final bpb1 e;
    public final xe01 f;
    public final idd1 g;

    public fal(lc4 lc4Var, d7p d7pVar, d7p d7pVar2, q8n q8nVar) {
        this.a = lc4Var;
        this.b = d7pVar;
        this.c = d7pVar2;
        this.d = q8nVar;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.e = bpb1VarB;
        this.f = d5p1.h(bpb1VarB);
        idd1 idd1Var = new idd1(new vjh(this, (byte) 22));
        this.g = idd1Var;
        if (lc4Var.a()) {
            c921.y((c9n) idd1Var.getValue(), (o8n) null, 0, new awe(this, (lnm) null, (byte) 17), 3);
        }
    }

    public final void shutdown() {
        if (this.a.a()) {
            smo1.q((c9n) this.g.getValue());
        }
    }

    public final Object getApi() {
        return this;
    }
}
