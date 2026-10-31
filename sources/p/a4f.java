package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a4f extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4f(qim0 qim0Var, String str, String str2, int i) {
        super(2);
        this.a = (byte) 0;
        this.d = qim0Var;
        this.b = str;
        this.c = str2;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        String str = this.c;
        String str2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                fqo1.n(czo1.p(i | 1), str2, str, b0kVar, qim0Var);
                break;
            case 1:
                d9p1.d(czo1.p(i | 1), str2, str, b0kVar, qim0Var);
                break;
            case 2:
                j541.c(czo1.p(i | 1), str2, str, b0kVar, qim0Var);
                break;
            case 3:
                j1p1.g(czo1.p(i | 1), str2, str, b0kVar, qim0Var);
                break;
            default:
                j2p1.j(czo1.p(i | 1), str2, str, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4f(String str, String str2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = qim0Var;
        this.e = i;
    }
}
