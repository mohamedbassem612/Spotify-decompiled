package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y841 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y841(vho vhoVar, byte b) {
        super(2);
        this.a = b;
        this.b = vhoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vho vhoVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean z = vhoVar.c;
                    tho thoVar = vhoVar.d;
                    w0h1.a(((thoVar instanceof pho) && ((pho) thoVar).a) ? z ? klx.c : irx.c : z ? ilx.c : hrx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var2, 56, 60);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwo1.e(vhoVar.c ? x0d.k(x340Var4, -1577548489, 2131954748, x340Var4, false) : x0d.k(x340Var4, -1577546410, 2131954747, x340Var4, false), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2046);
                }
                break;
        }
        return rih1Var;
    }
}
