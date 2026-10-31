package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b37 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f37 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b37(f37 f37Var, byte b) {
        super(1);
        this.a = b;
        this.b = f37Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        f37 f37Var = this.b;
        switch (b) {
            case 0:
                x27 x27Var = (x27) obj;
                ht20 ht20Var = new ht20(new c64(d3p1.H(f37Var.b, f37Var.e, x27Var), x27Var, (byte) 13), new sd0(2, (lnm) null, (byte) 12));
                Flowable flowable = f37Var.a;
                vbm[] vbmVarArr = q601.a;
                return new x010(ht20Var, new kge(flowable), new z27(3, null, (byte) 0), (byte) 1);
            default:
                x27 x27Var2 = (x27) obj;
                if (f37Var.d) {
                    return x27Var2.a;
                }
                return null;
        }
    }
}
