package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class exj extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ txj b;
    public final /* synthetic */ hwq c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ tob1 g;
    public final /* synthetic */ r6h1 h;
    public final /* synthetic */ w061 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ exj(txj txjVar, hwq hwqVar, String str, String str2, boolean z, tob1 tob1Var, r6h1 r6h1Var, w061 w061Var, byte b) {
        super(3);
        this.a = b;
        this.b = txjVar;
        this.c = hwqVar;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = tob1Var;
        this.h = r6h1Var;
        this.i = w061Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hwq hwqVar = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    txj txjVar = this.b;
                    txjVar.b(txjVar.e.d(hwqVar, x340Var2), this.c, this.d, this.e, this.f, this.g, this.h, this.i, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    txj txjVar2 = this.b;
                    txjVar2.b(txjVar2.e.d(hwqVar, x340Var4), this.c, this.d, this.e, this.f, this.g, this.h, this.i, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }
}
