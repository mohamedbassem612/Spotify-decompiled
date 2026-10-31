package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kym extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kym(el9 el9Var, byte b) {
        super(1);
        this.a = b;
        this.b = el9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(el9Var.b, el9Var.c, (fym) obj);
            default:
                ((qtr) obj).b(new ep0(el9Var, (lnm) null, (byte) 20));
                return rih1.a;
        }
    }
}
