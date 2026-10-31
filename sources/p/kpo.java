package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kpo extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o95 b;
    public final /* synthetic */ c9n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpo(o95 o95Var, c9n c9nVar, byte b) {
        super(2);
        this.a = b;
        this.b = o95Var;
        this.c = c9nVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = this.c;
        o95 o95Var = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Number) o95Var.e()).floatValue() + ((Number) obj2).floatValue();
                fn31.T(c9nVar, (o8n) null, 0, new jpo(o95Var, fFloatValue >= 0.0f ? fFloatValue : 0.0f, (lnm) null, (byte) 0), 3);
                break;
            default:
                float fFloatValue2 = ((Number) o95Var.e()).floatValue() + ((Number) obj2).floatValue();
                fn31.T(c9nVar, (o8n) null, 0, new jpo(o95Var, fFloatValue2 >= 0.0f ? fFloatValue2 : 0.0f, (lnm) null, (byte) 6), 3);
                break;
        }
        return rih1Var;
    }
}
