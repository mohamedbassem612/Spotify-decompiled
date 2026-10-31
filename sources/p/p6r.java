package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p6r extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pe30 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6r(pe30 pe30Var, float f, int i, byte b) {
        super(2);
        this.a = b;
        this.b = pe30Var;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        pe30 pe30Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                r4p1.d(pe30Var, f, b0kVar, czo1.p(1));
                break;
            default:
                r4p1.f(pe30Var, f, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
