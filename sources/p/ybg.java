package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ybg {
    public static final bma1 d = bma1.b.u("churn_locked_state_unlocked_at");
    public final ov20 a;
    public final dma1 b;
    public final yqg c;

    public ybg(ov20 ov20Var, dma1 dma1Var, yqg yqgVar) {
        this.a = ov20Var;
        this.b = dma1Var;
        this.c = yqgVar;
    }

    public final iib a() {
        return new iib(((bw20) this.a).a("payments-locked-state", false), this, (byte) 1);
    }
}
