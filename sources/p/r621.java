package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r621 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ im0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r621(im0 im0Var, byte b) {
        super(1);
        this.a = b;
        this.b = im0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        im0 im0Var = this.b;
        switch (b) {
            case 0:
                rwq0.z((qtr) obj, new g001(im0Var, (byte) 29));
                return rih1.a;
            default:
                return (h98) im0Var.f;
        }
    }
}
