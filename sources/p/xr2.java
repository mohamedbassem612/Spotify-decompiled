package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xr2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hm40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr2(hm40 hm40Var, byte b) {
        super(1);
        this.a = b;
        this.b = hm40Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hm40 hm40Var = this.b;
        switch (b) {
            case 0:
                hm40Var.n((String) obj);
                break;
            case 1:
                hm40Var.s((String) obj);
                break;
            default:
                hm40Var.t((String) obj);
                break;
        }
        return rih1Var;
    }
}
