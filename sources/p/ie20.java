package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ie20 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ br0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie20(br0 br0Var, byte b) {
        super(1);
        this.a = b;
        this.b = br0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        br0 br0Var = this.b;
        switch (b) {
            case 0:
                return new mt(((ve20) br0Var.c).b, (byte) 12);
            default:
                ((qtr) obj).b(new kr(br0Var, (lnm) null, (byte) 15));
                return rih1.a;
        }
    }
}
