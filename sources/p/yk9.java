package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yk9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ al9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yk9(al9 al9Var, byte b) {
        super(1);
        this.a = b;
        this.b = al9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        al9 al9Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(al9Var.a, al9Var.e, (vk9) obj);
            default:
                ((qtr) obj).b(new lu(al9Var, (lnm) null, (byte) 8));
                return rih1.a;
        }
    }
}
