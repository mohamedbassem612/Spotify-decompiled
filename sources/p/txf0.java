package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class txf0 implements bkl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uxf0 b;
    public final /* synthetic */ zf30 c;
    public final /* synthetic */ lu9 d;
    public final /* synthetic */ ee5 e;
    public final /* synthetic */ e6w0 f;

    public /* synthetic */ txf0(uxf0 uxf0Var, zf30 zf30Var, lu9 lu9Var, ee5 ee5Var, e6w0 e6w0Var, byte b) {
        this.a = b;
        this.b = uxf0Var;
        this.c = zf30Var;
        this.d = lu9Var;
        this.e = ee5Var;
        this.f = e6w0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ee5 ee5Var = this.e;
        lu9 lu9Var = this.d;
        uxf0 uxf0Var = this.b;
        switch (b) {
            case 0:
                uxf0Var.a.e(lu9Var.a, lu9Var.b, lu9Var.c, this.e, this.c, this.f, false);
                break;
            case 1:
                uxf0Var.a.h(this.c, lu9Var.a, lu9Var.b, lu9Var.c, ee5Var.a, this.f);
                break;
            case 2:
                uxf0Var.a.e(lu9Var.a, lu9Var.b, lu9Var.c, this.e, this.c, this.f, true);
                break;
            default:
                uxf0Var.a.i(((iu9) obj).c, this.c, lu9Var.a, lu9Var.b, lu9Var.c, ee5Var.a, this.f);
                break;
        }
    }
}
