package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lot0 implements xpw {
    public final u6y0 a;
    public final rg4 b;
    public final i5y0 c;
    public final y4m1 d;
    public final js20 e = x3p1.n(new wao0(1, this, lot0.class, "observeState", "observeState(Lcom/spotify/promptedplaylists/elements/playonready/PlayOnReadyElement$Props;)Lkotlinx/coroutines/flow/Flow;", 0, (byte) 24), ent0.X, fnt0.f, (o8n) null, new fgs0(this, (byte) 16), 8);
    public final ia00 f = n3o1.q(this).a(e9t0.S0, e9t0.T0);
    public final psw g;

    public lot0(u6y0 u6y0Var, rg4 rg4Var, i5y0 i5y0Var, y4m1 y4m1Var) {
        this.a = u6y0Var;
        this.b = rg4Var;
        this.c = i5y0Var;
        this.d = y4m1Var;
        j2i j2iVar = new j2i(1387179397, new t9r0(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
