package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u371 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o2n0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u371(o2n0 o2n0Var, byte b) {
        super(1);
        this.a = b;
        this.b = o2n0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        o2n0 o2n0Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(o2n0Var.b, o2n0Var.d, (s371) obj);
            default:
                ((qtr) obj).b(new gz0((Object) o2n0Var, (lnm) null, (byte) 23));
                return rih1.a;
        }
    }
}
