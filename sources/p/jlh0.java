package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jlh0 implements plh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rlh0 b;
    public final /* synthetic */ float c;

    public /* synthetic */ jlh0(rlh0 rlh0Var, float f, byte b) {
        this.a = b;
        this.b = rlh0Var;
        this.c = f;
    }

    public final void f(kh70 kh70Var, int i) {
        byte b = this.a;
        float f = this.c;
        rlh0 rlh0Var = this.b;
        switch (b) {
            case 0:
                kh70Var.S0(rlh0Var.c, i, f);
                break;
            case 1:
                kh70Var.d(rlh0Var.c, i, f);
                break;
            default:
                int iO = rlh0Var.o();
                xlh0 xlh0Var = rlh0Var.c;
                if (iO < 6) {
                    kh70Var.d(xlh0Var, i, f);
                } else {
                    kh70Var.O(xlh0Var, i);
                }
                break;
        }
    }
}
