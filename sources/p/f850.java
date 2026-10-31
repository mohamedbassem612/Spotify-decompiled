package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f850 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ c380 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f850(String str, c380 c380Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = c380Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c380 c380Var = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                j9k1.c(str, c380Var, b0kVar, czo1.p(1));
                break;
            case 1:
                cuo1.d(str, c380Var, b0kVar, czo1.p(1));
                break;
            default:
                j0o1.j(str, c380Var, b0kVar, czo1.p(65));
                break;
        }
        return rih1Var;
    }
}
