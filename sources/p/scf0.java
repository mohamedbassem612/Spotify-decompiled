package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class scf0 implements bdf0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cdf0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ scf0(cdf0 cdf0Var, String str, byte b) {
        this.a = b;
        this.b = cdf0Var;
        this.c = str;
    }

    @Override // p.bdf0
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s(this.c);
                break;
            case 1:
                this.b.q(this.c);
                break;
            default:
                this.b.u(this.c);
                break;
        }
    }
}
