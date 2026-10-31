package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j63 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l63 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j63(l63 l63Var, byte b) {
        super(1);
        this.a = b;
        this.b = l63Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        l63 l63Var = this.b;
        switch (b) {
            case 0:
                h63 h63Var = (h63) obj;
                return new x010(d3p1.H(l63Var.c, l63Var.g, h63Var), l63Var.b.a(), new qr0(h63Var, null, (byte) 2), (byte) 1);
            default:
                ((qtr) obj).b(new js(l63Var, (lnm) null, (byte) 3));
                return rih1.a;
        }
    }
}
