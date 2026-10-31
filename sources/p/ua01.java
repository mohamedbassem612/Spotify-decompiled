package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ua01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua01(yxb0 yxb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yxb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yxb0 yxb0Var = this.b;
        switch (b) {
            case 0:
                m4e0 m4e0Var = (m4e0) yxb0Var.e;
                String str = ((ra01) obj).a;
                return new x010(rqt0.u(new ld2((mr20) m4e0Var.b, str, (byte) 24)), new xs4(yoi1.g(((uu00) yxb0Var.f).b(new oi("ereader", false, new q4z0(str, (byte) 9)))), str, (byte) 13), new cre0(3, (lnm) null, (byte) 2), (byte) 1);
            default:
                ((qtr) obj).b(new pnp0(yxb0Var, (lnm) null, (byte) 15));
                return rih1.a;
        }
    }
}
