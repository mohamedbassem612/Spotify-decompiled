package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c6v extends pim0 implements zlb0 {
    public s24 O0;
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
            s24 s24Var = this.O0;
            zmg0 zmg0Var = (zmg0) mmr0Var.a;
            Object obj = mmr0Var.b;
            if (!u890.j(s24Var.I(), zmg0Var)) {
                ((hrr0) s24Var.t).setValue(zmg0Var);
                xgn0 xgn0Var = ((j590) s24Var.f).b;
                boolean zG = xgn0Var.g();
                if (zG) {
                    try {
                        n24 n24Var = (n24) s24Var.N0;
                        float fD = s24Var.I().d(obj);
                        if (!Float.isNaN(fD)) {
                            n24.a(n24Var, fD);
                            s24Var.c0((Object) null);
                        }
                        s24Var.b0(obj);
                        xgn0Var.c((Object) null);
                    } catch (Throwable th) {
                        xgn0Var.c((Object) null);
                        throw th;
                    }
                }
                if (!zG) {
                    s24Var.c0(obj);
                }
            }
        }
        this.R0 = ifh0Var.W() || this.R0;
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new pg((Object) ifh0Var, (Object) this, (Object) q5t0VarH, (byte) 12));
    }
}
