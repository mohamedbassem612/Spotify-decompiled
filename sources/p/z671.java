package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z671 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ im0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z671(im0 im0Var, byte b) {
        super(1);
        this.a = b;
        this.b = im0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        im0 im0Var = this.b;
        switch (b) {
            case 0:
                ((qtr) obj).b(new f3(im0Var, (lnm) null, (byte) 24));
                return rih1Var;
            case 1:
                rwq0.z((qtr) obj, new cq61(im0Var, (byte) 5));
                return rih1Var;
            default:
                return (qzh) im0Var.f;
        }
    }
}
