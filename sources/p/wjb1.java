package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wjb1 extends ff30 {
    public final /* synthetic */ fn51 b;
    public final /* synthetic */ o0g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjb1(o0g o0gVar, fn51 fn51Var, fn51 fn51Var2) {
        super(fn51Var);
        this.c = o0gVar;
        this.b = fn51Var2;
    }

    @Override // p.ff30, p.fn51
    public final en51 b(long j) {
        en51 en51VarB = this.b.b(j);
        pn51 pn51Var = en51VarB.a;
        long j2 = pn51Var.a;
        long j3 = pn51Var.b;
        long j4 = this.c.b;
        pn51 pn51Var2 = new pn51(j2, j3 + j4);
        pn51 pn51Var3 = en51VarB.b;
        return new en51(pn51Var2, new pn51(pn51Var3.a, pn51Var3.b + j4));
    }
}
