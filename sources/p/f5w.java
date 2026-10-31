package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f5w extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5w(el9 el9Var, byte b) {
        super(1);
        this.a = b;
        this.b = el9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                d5w d5wVar = (d5w) obj;
                return new x010(((x6w) el9Var.h).a(d5wVar.b), d3p1.H(el9Var.b, el9Var.c, d5wVar.a), new mnl(3, (lnm) null, (byte) 19), (byte) 1);
            default:
                ((qtr) obj).b(new js(el9Var, (lnm) null, (byte) 9));
                return rih1.a;
        }
    }
}
