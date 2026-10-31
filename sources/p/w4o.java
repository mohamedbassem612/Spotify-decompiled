package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w4o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x4o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4o(x4o x4oVar, byte b) {
        super(1);
        this.a = b;
        this.b = x4oVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x4o x4oVar = this.b;
        switch (b) {
            case 0:
                return new te1(d3p1.F(x4oVar.e, x4o.f(x4o.g((f5o) obj)), rih1Var), (byte) 26);
            default:
                ((qtr) obj).b(new lu(x4oVar, (lnm) null, (byte) 21));
                return rih1Var;
        }
    }
}
