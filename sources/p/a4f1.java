package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a4f1 implements hw61 {
    public final ven0 a;
    public final hw61 b;
    public final hw61 c;
    public final tw4 d = ww4.a();
    public final tw4 e = ww4.a();
    public final tw4 f = ww4.a();

    public a4f1(ven0 ven0Var, hw61 hw61Var, hw61 hw61Var2) {
        this.a = ven0Var;
        this.b = hw61Var;
        this.c = hw61Var2;
    }

    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        tw4 tw4Var = this.d;
        tw4Var.n();
        tw4 tw4Var2 = this.e;
        tw4Var2.n();
        tw4 tw4Var3 = this.f;
        tw4Var3.n();
        htq0 htq0VarA = this.b.a(j, flb0Var, watVar);
        htq0 htq0VarA2 = this.c.a(j, flb0Var, watVar);
        if (htq0VarA instanceof htq0) {
            u8s0.a(tw4Var, htq0VarA.c);
        } else if (htq0VarA instanceof jtq0) {
            tw4Var.e(((jtq0) htq0VarA).c, 1);
        } else {
            if (!(htq0VarA instanceof itq0)) {
                eg.o();
                return null;
            }
            u8s0.c(tw4Var, ((itq0) htq0VarA).c);
        }
        if (htq0VarA2 instanceof htq0) {
            u8s0.a(tw4Var3, htq0VarA2.c);
        } else if (htq0VarA2 instanceof jtq0) {
            tw4Var3.e(((jtq0) htq0VarA2).c, 1);
        } else {
            if (!(htq0VarA2 instanceof itq0)) {
                eg.o();
                return null;
            }
            u8s0.c(tw4Var3, ((itq0) htq0VarA2).c);
        }
        tw4Var3.q(((kch0) this.a.getValue()).a);
        tw4Var2.l(tw4Var, tw4Var3, 2);
        return new htq0(tw4Var2);
    }
}
