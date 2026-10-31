package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d6v extends pim0 implements zlb0 {
    public t24 O0;
    public vu30 P0;
    public qqq0 Q0;
    public boolean R0;

    public final void A1() {
        this.R0 = false;
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        if (!ifh0Var.W() || !this.R0) {
            mmr0 mmr0Var = (mmr0) this.P0.invoke(new yr80((((long) q5t0VarH.b) & 4294967295L) | (((long) q5t0VarH.a) << 32)), new hjl(j));
            this.O0.j((wvr) mmr0Var.a, mmr0Var.b);
        }
        this.R0 = ifh0Var.W() || this.R0;
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new pg((Object) ifh0Var, (Object) this, (Object) q5t0VarH, (byte) 13));
    }
}
