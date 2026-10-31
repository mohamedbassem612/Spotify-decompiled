package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zun0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bvn0 b;
    public final /* synthetic */ th30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zun0(bvn0 bvn0Var, th30 th30Var, byte b) {
        super(1);
        this.a = b;
        this.b = bvn0Var;
        this.c = th30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        th30 th30Var = this.c;
        bvn0 bvn0Var = this.b;
        switch (b) {
            case 0:
                bvn0.p((xun0) obj, bvn0Var.c, th30Var);
                break;
            default:
                bvn0.p((xun0) obj, bvn0Var.b, th30Var);
                break;
        }
        return rih1Var;
    }
}
