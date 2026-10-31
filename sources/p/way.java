package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class way extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ way(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                return new qr80(((long) ((Number) iu30Var.invoke(Integer.valueOf((int) (((yr80) obj).a & 4294967295L)))).intValue()) & 4294967295L);
            case 1:
                return new oy21(iu30Var.invoke(obj));
            default:
                ((Boolean) obj).getClass();
                iu30Var.invoke(iho.a);
                return rih1.a;
        }
    }
}
