package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n0e extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o0e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0e(o0e o0eVar) {
        super(2);
        this.a = (byte) 2;
        this.b = o0eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o0e o0eVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                o0eVar.c((b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                o0eVar.c((b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    o0eVar.c(x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0e(o0e o0eVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = o0eVar;
    }
}
