package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class srg extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hf2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ srg(hf2 hf2Var, byte b) {
        super(1);
        this.a = b;
        this.b = hf2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hf2 hf2Var = this.b;
        switch (b) {
            case 0:
                return hf2Var.g((weu) ((u601) hf2Var.f).getValue());
            default:
                ((qtr) obj).b(new trg(hf2Var, (lnm) null, (byte) 0));
                return rih1.a;
        }
    }
}
