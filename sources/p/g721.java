package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g721 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j721 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g721(j721 j721Var, byte b) {
        super(1);
        this.a = b;
        this.b = j721Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        j721 j721Var = this.b;
        switch (b) {
            case 0:
                return new e721(((d721) obj).b, (f721) j721Var.d.getValue());
            default:
                ((qtr) obj).b(new f3(j721Var, (lnm) null, (byte) 23));
                return rih1.a;
        }
    }
}
