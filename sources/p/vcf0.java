package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class vcf0 implements bdf0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cdf0 b;
    public final /* synthetic */ float c;

    public /* synthetic */ vcf0(cdf0 cdf0Var, float f, byte b) {
        this.a = b;
        this.b = cdf0Var;
        this.c = f;
    }

    @Override // p.bdf0
    public final void run() {
        byte b = this.a;
        float f = this.c;
        cdf0 cdf0Var = this.b;
        switch (b) {
            case 0:
                fcf0 fcf0Var = cdf0Var.a;
                if (fcf0Var != null) {
                    sdf0 sdf0Var = cdf0Var.b;
                    sdf0Var.s(sdf0Var.t, itj0.e(fcf0Var.l, fcf0Var.m, f));
                } else {
                    cdf0Var.f.add(new vcf0(cdf0Var, f, (byte) 0));
                }
                break;
            default:
                fcf0 fcf0Var2 = cdf0Var.a;
                if (fcf0Var2 != null) {
                    cdf0Var.t((int) itj0.e(fcf0Var2.l, fcf0Var2.m, f));
                } else {
                    cdf0Var.f.add(new vcf0(cdf0Var, f, (byte) 1));
                }
                break;
        }
    }
}
