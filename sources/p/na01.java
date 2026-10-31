package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class na01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pa01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na01(pa01 pa01Var, byte b) {
        super(1);
        this.a = b;
        this.b = pa01Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pa01 pa01Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                return pa01Var.d ? hu20.e(new lt20(pa01Var.g.b(str), new q8t0(3, (lnm) null, (byte) 7), (byte) 0), new c6e0((byte) 15, pa01Var, str, (lnm) null)) : d3p1.F(pa01Var.a, pa01Var.h, str);
            default:
                ((qtr) obj).b(new pnp0(pa01Var, (lnm) null, (byte) 14));
                return rih1.a;
        }
    }
}
