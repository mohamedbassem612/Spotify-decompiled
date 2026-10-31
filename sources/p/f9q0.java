package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f9q0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n0o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9q0(n0o n0oVar, byte b) {
        super(1);
        this.a = b;
        this.b = n0oVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        n0o n0oVar = this.b;
        switch (b) {
            case 0:
                return hu20.e(d3p1.H(n0oVar.b, (o3r) n0oVar.X, (String) obj), new t4o0((lnm) null, n0oVar, (byte) 8));
            default:
                ((qtr) obj).b(new pnp0(n0oVar, null, (byte) 2));
                return rih1.a;
        }
    }
}
