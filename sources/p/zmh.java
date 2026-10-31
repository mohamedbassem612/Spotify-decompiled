package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zmh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zmh(byte b, int i, int i2, String str, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = qim0Var;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        qim0 qim0Var = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                p8p1.d(czo1.p(1), b2, str, b0kVar, qim0Var);
                break;
            case 1:
                ybn0.d(czo1.p(1), b2, str, b0kVar, qim0Var);
                break;
            case 2:
                qro1.i(czo1.p(1), b2, str, b0kVar, qim0Var);
                break;
            default:
                wgo1.l(czo1.p(1), b2, str, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zmh(int i, int i2, String str, qim0 qim0Var) {
        super(2);
        this.a = (byte) 2;
        this.c = qim0Var;
        this.b = str;
        this.d = i2;
    }
}
