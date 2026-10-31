package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ijs extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kjs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ijs(kjs kjsVar, byte b) {
        super(2);
        this.a = b;
        this.b = kjsVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kjs kjsVar = this.b;
        switch (b) {
            case 0:
                kjsVar.b.invoke(new mn11(((Number) obj).intValue(), (String) obj2));
                break;
            default:
                kjsVar.b.invoke(new ln11(((Number) obj).intValue(), (String) obj2));
                break;
        }
        return rih1Var;
    }
}
