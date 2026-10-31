package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iw10 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iw10(String str, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = iu30Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        iu30 iu30Var = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                eyo1.c(czo1.p(i | 1), str, b0kVar, iu30Var);
                break;
            default:
                eyo1.c(czo1.p(i | 1), str, b0kVar, iu30Var);
                break;
        }
        return rih1Var;
    }
}
