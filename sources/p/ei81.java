package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ei81 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ci81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei81(ci81 ci81Var, byte b) {
        super(3);
        this.a = b;
        this.b = ci81Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ci81 ci81Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                g9p1.m(384, ci81Var.c, apo.r(199766778, new di81(ci81Var, (byte) 0), b0kVar), b0kVar, (qim0) null);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                n9p1.i(384, ci81Var.c, apo.r(-1339269663, new di81(ci81Var, (byte) 1), b0kVar2), b0kVar2, (qim0) null);
                break;
        }
        return rih1Var;
    }
}
