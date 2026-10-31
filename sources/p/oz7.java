package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oz7 implements o8u0 {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ yqg b;
    public final /* synthetic */ yo00 c;

    public oz7(ssw0 ssw0Var, yqg yqgVar, yo00 yo00Var) {
        this.a = ssw0Var;
        this.b = yqgVar;
        this.c = yo00Var;
    }

    public final void H(int i) {
        ssw0 ssw0Var = this.a;
        if (i == 3) {
            ilo1.E(new kz7(this.b.e(), this.c.getDuration()), ssw0Var);
        } else {
            if (i != 4) {
                return;
            }
            ilo1.E(jz7.a, ssw0Var);
        }
    }
}
