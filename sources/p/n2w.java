package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n2w extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ job1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2w(job1 job1Var, byte b) {
        super(2);
        this.a = b;
        this.b = job1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        job1 job1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    o2w.h(job1Var, x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (!(job1Var instanceof fnb1)) {
                    x340Var4.i0(2009938027);
                    String strO0 = cwl1.o0(x340Var4, 2131955368);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO0, (qim0) null, cbx.d(x340Var4).k, cbx.a(x340Var4).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2034);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(2009851196);
                    xto1.e((qim0) null, 2, 0L, 0L, x340Var4, 48, 13);
                    x340Var4.r(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                o2w.h(job1Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2w(job1 job1Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = job1Var;
    }
}
