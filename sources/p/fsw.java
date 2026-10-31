package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fsw implements kku {
    public final /* synthetic */ rl1 a;
    public final /* synthetic */ iu30 b;

    public fsw(rl1 rl1Var, iu30 iu30Var) {
        this.a = rl1Var;
        this.b = iu30Var;
    }

    @Override // p.kku
    public final void dispose() {
        rl1.i(this.a).d(new gsw(this.b));
    }
}
