package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ns extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ns(yxb0 yxb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yxb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yxb0 yxb0Var = this.b;
        switch (b) {
            case 0:
                return ((kw) yxb0Var.e).b();
            case 1:
                ls lsVar = (ls) obj;
                return new ms(lsVar.a, lsVar.b, ((Boolean) ((kw) yxb0Var.e).b().getValue()).booleanValue());
            default:
                ((qtr) obj).b(new js(yxb0Var, (lnm) null, (byte) 1));
                return rih1.a;
        }
    }
}
