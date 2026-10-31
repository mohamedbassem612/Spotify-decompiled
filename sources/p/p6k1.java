package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p6k1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6k1(j2i j2iVar) {
        super(2);
        this.a = (byte) 0;
        this.b = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j2iVar.invoke(u291.d(nim0.a, 1.0f), x340Var2, 54);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                j82.v(czo1.p(7), j2iVar, (b0k) obj);
                break;
            default:
                ((Number) obj2).intValue();
                c921.m(czo1.p(7), j2iVar, (b0k) obj);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6k1(j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j2iVar;
    }
}
