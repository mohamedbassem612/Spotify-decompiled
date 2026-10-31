package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mai0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ fza b;
    public final /* synthetic */ km3 c;
    public final /* synthetic */ ytp0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mai0(fza fzaVar, km3 km3Var, ytp0 ytp0Var) {
        super(2);
        this.b = fzaVar;
        this.c = km3Var;
        this.d = ytp0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                mey0 mey0Var = (mey0) obj;
                t810 t810Var = (t810) obj2;
                return ioo1.F(mey0Var, t810Var, ng20.k(t810Var.a, mey0Var), this.b, this.c, this.d);
            default:
                xai0 xai0Var = (xai0) obj2;
                return ioo1.F((mey0) obj, xai0Var.a, xai0Var.b, this.b, this.c, this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mai0(ng20 ng20Var, fza fzaVar, km3 km3Var, ytp0 ytp0Var) {
        super(2);
        this.b = fzaVar;
        this.c = km3Var;
        this.d = ytp0Var;
    }
}
