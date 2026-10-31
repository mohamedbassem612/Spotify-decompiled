package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qu31 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ru31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu31(ru31 ru31Var, byte b) {
        super(1);
        this.a = b;
        this.b = ru31Var;
    }

    public final Object invoke(Object obj) {
        bpb1 huzVar;
        byte b = this.a;
        ru31 ru31Var = this.b;
        switch (b) {
            case 0:
                fu31 fu31Var = (fu31) obj;
                r091 r091Var = ru31Var.e;
                if (r091Var == null || (huzVar = r091Var.g) == null) {
                    huzVar = new huz((Object) null, (byte) 10);
                }
                return new x010(huzVar, d3p1.H(ru31Var.a, ru31Var.X, fu31Var), new lok0(3, (lnm) null, (byte) 26), (byte) 1);
            case 1:
                ((qtr) obj).b(new lcm(ru31Var, (lnm) null, (byte) 13));
                return rih1.a;
            case 2:
                fu31 fu31Var2 = (fu31) obj;
                if (ru31Var.e != null) {
                    return fu31Var2.b.b;
                }
                return null;
            default:
                ftv ftvVar = ((fu31) obj).b;
                return new noa0(ru31Var.b, ftvVar.b, ftvVar.a);
        }
    }
}
