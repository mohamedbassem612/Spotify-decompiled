package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yci0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hob1 b;
    public final /* synthetic */ znb0 c;
    public final /* synthetic */ znb0 d;
    public final /* synthetic */ znb0 e;
    public final /* synthetic */ znb0 f;
    public final /* synthetic */ iu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yci0(hob1 hob1Var, znb0 znb0Var, znb0 znb0Var2, znb0 znb0Var3, znb0 znb0Var4, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = hob1Var;
        this.c = znb0Var;
        this.d = znb0Var2;
        this.e = znb0Var3;
        this.f = znb0Var4;
        this.g = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        znb0 znb0Var = this.f;
        znb0 znb0Var2 = this.e;
        znb0 znb0Var3 = this.d;
        znb0 znb0Var4 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    bth.k(this.b, (xho) znb0Var4.getValue(), (hft0) znb0Var3.getValue(), null, znb0Var2 != null ? (hjv0) znb0Var2.getValue() : null, znb0Var != null ? (njv0) znb0Var.getValue() : null, this.g, x340Var2, 32832);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    bth.k(this.b, (xho) znb0Var4.getValue(), (hft0) znb0Var3.getValue(), null, znb0Var2 != null ? (hjv0) znb0Var2.getValue() : null, znb0Var != null ? (njv0) znb0Var.getValue() : null, this.g, x340Var4, 32832);
                }
                break;
        }
        return rih1Var;
    }
}
