package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class thg0 implements f961 {
    public final n680 a;
    public final yyp0 b;

    public thg0(glg glgVar, kly0 kly0Var) {
        n680 n680Var = new n680();
        this.a = n680Var;
        zyp0 zyp0VarB = ((w5b1) kly0Var.get()).a.b();
        zyp0VarB.c.add(glgVar);
        this.b = new yyp0(new azp0(zyp0VarB)).a(n680Var);
    }

    public final void shutdown() {
        this.a.c();
    }

    public final Object getApi() {
        return this;
    }
}
