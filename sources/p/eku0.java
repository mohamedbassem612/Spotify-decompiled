package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eku0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xju0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ kt91 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eku0(xju0 xju0Var, iu30 iu30Var, kt91 kt91Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xju0Var;
        this.c = iu30Var;
        this.d = kt91Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        kt91 kt91Var = this.d;
        iu30 iu30Var = this.c;
        xju0 xju0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                f5p1.e(xju0Var, iu30Var, kt91Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                f5p1.e(xju0Var, iu30Var, kt91Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
