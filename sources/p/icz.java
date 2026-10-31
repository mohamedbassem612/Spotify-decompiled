package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class icz extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ znb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ icz(znb0 znb0Var, byte b) {
        super(3);
        this.a = b;
        this.b = znb0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        znb0 znb0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj3).intValue();
                otw.c((maa) znb0Var.getValue(), (rcz) obj, (qim0) null, (ipb1) null, (b0k) obj2, (iIntValue << 3) & 112, 12);
                break;
            default:
                ((Number) obj3).intValue();
                maa maaVar = (maa) znb0Var.getValue();
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                otw.c(maaVar, qu41.a, qim0VarF, (ipb1) null, (b0k) obj2, 0, 8);
                break;
        }
        return rih1Var;
    }
}
