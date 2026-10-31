package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gn9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hn9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn9(hn9 hn9Var, byte b) {
        super(1);
        this.a = b;
        this.b = hn9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hn9 hn9Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(hn9Var.h, hn9Var.Y, (String) obj);
            default:
                ((qtr) obj).b(new lu(hn9Var, (lnm) null, (byte) 9));
                return rih1.a;
        }
    }
}
