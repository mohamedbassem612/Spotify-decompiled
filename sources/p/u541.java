package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u541 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n0o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u541(n0o n0oVar, byte b) {
        super(1);
        this.a = b;
        this.b = n0oVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        n0o n0oVar = this.b;
        switch (b) {
            case 0:
                vi11 vi11Var = (vi11) n0oVar.t;
                vi11Var.getClass();
                return h4p1.g(new n641(vi11Var, (p541) obj, (lnm) null, (byte) 0));
            case 1:
                return n0oVar.g((p541) obj, j1r.a);
            default:
                ((qtr) obj).b(new k8y0(n0oVar, null, (byte) 11));
                return rih1.a;
        }
    }
}
