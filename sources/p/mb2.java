package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mb2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb2(Integer num, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = num;
    }

    public final Object invoke(Object obj, Object obj2) {
        String strK;
        String strU;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Integer num = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    if (num != null) {
                        x340Var2.i0(2008655162);
                        strK = cwl1.n0(2131952034, new Object[]{num}, x340Var2);
                        x340Var2.r(false);
                    } else {
                        strK = x0d.k(x340Var2, 2008816486, 2131952033, x340Var2, false);
                    }
                    uwo1.e(strK, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2046);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    if (num == null) {
                        strU = x0d.k(x340Var4, -1302431949, 2131952067, x340Var4, false);
                    } else if (num.intValue() == 0) {
                        strU = x0d.k(x340Var4, -1302428624, 2131952069, x340Var4, false);
                    } else {
                        x340Var4.i0(-1302425019);
                        strU = cwl1.U(2131820566, num.intValue(), new Object[]{num}, x340Var4);
                        x340Var4.r(false);
                    }
                    String str = strU;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2018);
                }
                break;
            default:
                ((Number) obj2).intValue();
                j9k1.j(num, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb2(Integer num, byte b) {
        super(2);
        this.a = b;
        this.b = num;
    }
}
