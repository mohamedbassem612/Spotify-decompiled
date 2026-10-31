package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class diw0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ niw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ diw0(niw0 niw0Var, byte b) {
        super(2);
        this.a = b;
        this.b = niw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        niw0 niw0Var = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = niw0Var.b;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, (qim0) null, (lee1) null, cbx.a(x340Var2).a.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2038);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    gfx.b(4, apo.r(-214725870, new diw0(niw0Var, objArr == true ? 1 : 0), x340Var4), x340Var4, 54);
                }
                break;
        }
        return rih1Var;
    }
}
