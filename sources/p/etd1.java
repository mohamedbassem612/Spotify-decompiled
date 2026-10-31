package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class etd1 extends hab0 implements xu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ceo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etd1(int i, int i2, ceo ceoVar) {
        super(3);
        this.a = i;
        this.b = i2;
        this.c = ceoVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pxg1 pxg1VarJ0;
        dhg1 dhg1Var = (dhg1) obj;
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        x340Var.i0(-1384580075);
        if (((Boolean) dhg1Var.e()).booleanValue() || !((Boolean) dhg1Var.b()).booleanValue()) {
            pxg1VarJ0 = irn1.j0();
        } else {
            int i = this.b;
            int i2 = this.a;
            pxg1VarJ0 = new pxg1(i2, i - i2, this.c);
        }
        x340Var.r(false);
        return pxg1VarJ0;
    }
}
