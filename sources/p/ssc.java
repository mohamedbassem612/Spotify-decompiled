package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ssc implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ijr0 b;
    public final /* synthetic */ rzo0 c;

    public /* synthetic */ ssc(ijr0 ijr0Var, rzo0 rzo0Var, byte b) {
        this.a = b;
        this.b = ijr0Var;
        this.c = rzo0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rzo0 rzo0Var = this.c;
        ijr0 ijr0Var = this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                ijr0Var.c(rzo0Var, iIntValue, iIntValue2);
                break;
            default:
                ijr0Var.c(rzo0Var, iIntValue, iIntValue2);
                break;
        }
        return rih1Var;
    }
}
