package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ye81 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ze81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye81(ze81 ze81Var, byte b) {
        super(1);
        this.a = b;
        this.b = ze81Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ze81 ze81Var = this.b;
        switch (b) {
            case 0:
                t7n0 t7n0Var = ze81Var.a;
                String str = ((ve81) obj).a;
                return h5p1.s(t7n0Var.a(str), t5p1.i(ze81Var.b.a()), ze81Var.c.a(str), new td1(4, (lnm) null, (byte) 10));
            default:
                ((qtr) obj).b(new gz0(ze81Var, (lnm) null, (byte) 25));
                return rih1.a;
        }
    }
}
