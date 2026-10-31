package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class tcf0 implements bdf0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cdf0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ tcf0(cdf0 cdf0Var, int i, byte b) {
        this.a = b;
        this.b = cdf0Var;
        this.c = i;
    }

    @Override // p.bdf0
    public final void run() {
        byte b = this.a;
        int i = this.c;
        cdf0 cdf0Var = this.b;
        switch (b) {
            case 0:
                cdf0Var.o(i);
                break;
            case 1:
                cdf0Var.p(i);
                break;
            default:
                cdf0Var.t(i);
                break;
        }
    }
}
