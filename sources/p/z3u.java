package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z3u implements iac0, sck1, qe41 {
    public final /* synthetic */ byte a;
    public final tac0 b;
    public final tac0 c;
    public final rck1 d;
    public final oe41 e;

    public z3u(byte b) {
        this.a = b;
        w8c0 w8c0Var = w8c0.e;
        switch (b) {
            case 1:
                tac0 tac0Var = new tac0(this, true);
                this.b = tac0Var;
                nt21 nt21Var = new nt21(new pe41(this, new ww21(this, (byte) 4)));
                this.c = tac0Var;
                this.d = new rck1();
                this.e = (oe41) nt21Var.c;
                nt21Var.m();
                nt21Var.n(null);
                tac0Var.i(w8c0Var);
                break;
            default:
                tac0 tac0Var2 = new tac0(this, true);
                this.b = tac0Var2;
                nt21 nt21Var2 = new nt21(new pe41(this, new ww21(this, (byte) 4)));
                this.c = tac0Var2;
                this.d = new rck1();
                this.e = (oe41) nt21Var2.c;
                nt21Var2.m();
                nt21Var2.n(null);
                tac0Var2.i(w8c0Var);
                break;
        }
    }

    public final x8c0 getLifecycle() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final rck1 o() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final oe41 p() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }
}
