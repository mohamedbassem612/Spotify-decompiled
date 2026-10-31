package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iop0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lop0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iop0(lop0 lop0Var, byte b) {
        super(1);
        this.a = b;
        this.b = lop0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lop0 lop0Var = this.b;
        switch (b) {
            case 0:
                cop0 cop0Var = (cop0) obj;
                return new x010(hu20.e(lop0Var.e.b(), new c6e0((lnm) null, lop0Var, cop0Var, (byte) 6)), lop0Var.f, new gop0(cop0Var, lop0Var, (lnm) null, (byte) 0), (byte) 1);
            default:
                ((qtr) obj).b(new jaz(lop0Var, (lnm) null, (byte) 20));
                return rih1.a;
        }
    }
}
