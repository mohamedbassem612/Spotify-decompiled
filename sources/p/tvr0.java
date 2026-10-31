package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tvr0 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvr0(int i, long j, int i2) {
        super(2);
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = q4r0.d1;
                x340Var2.s0(objT);
            }
            ijo1.h(this.a, this.b, 0, this.c, x340Var2, s161.b(nim0.a, false, (iu30) objT));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
