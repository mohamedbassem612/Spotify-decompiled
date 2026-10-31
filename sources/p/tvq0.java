package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tvq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mwq0 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tvq0(mwq0 mwq0Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = mwq0Var;
        this.c = j2iVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        j2i j2iVar = this.c;
        mwq0 mwq0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                fdg1.i(mwq0Var, j2iVar, b0kVar, czo1.p(i | 1));
                break;
            default:
                fdg1.o(mwq0Var, j2iVar, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
