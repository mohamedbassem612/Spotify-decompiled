package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jgr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kgr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgr0(kgr0 kgr0Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.b = kgr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        kgr0 kgr0Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    bzn1.e((qim0) null, kgr0Var.getTitle(), false, kgr0Var.getActions(), kgr0Var.getBackground(), (ngr0) null, kgr0Var.getScrollState(), kgr0Var.getOnBackPressed(), x340Var2, 2097152, 37);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1650323812, new jgr0(kgr0Var, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    ywo1.e(6, apo.r(258512847, new jgr0(kgr0Var, b2), x340Var6), x340Var6);
                }
                break;
            default:
                ((Number) obj2).intValue();
                kgr0Var.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgr0(kgr0 kgr0Var, byte b) {
        super(2);
        this.a = b;
        this.b = kgr0Var;
    }
}
