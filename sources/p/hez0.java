package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hez0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kuy b;
    public final /* synthetic */ iez0 c;
    public final /* synthetic */ aez0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hez0(kuy kuyVar, iez0 iez0Var, aez0 aez0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = kuyVar;
        this.c = iez0Var;
        this.d = aez0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        aez0 aez0Var = this.d;
        iez0 iez0Var = this.c;
        kuy kuyVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                kuyVar.h(iez0Var, aez0Var, b0kVar, czo1.p(1));
                break;
            default:
                kuyVar.h(iez0Var, aez0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
