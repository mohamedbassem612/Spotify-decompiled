package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d4z extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4z(yxb0 yxb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yxb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yxb0 yxb0Var = this.b;
        switch (b) {
            case 0:
                return hu20.e(new ht20((dt71) yxb0Var.f, new qjr(2, (lnm) null, (byte) 21)), new qd0((lnm) null, yxb0Var, (b4z) obj, (byte) 17));
            default:
                ((qtr) obj).b(new f3(yxb0Var, (lnm) null, (byte) 12));
                return rih1.a;
        }
    }
}
