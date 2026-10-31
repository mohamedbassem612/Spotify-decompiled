package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u6t0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6t0(float f, float f2, byte b) {
        super(3);
        this.a = b;
        this.b = f;
        this.c = f2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        switch (b) {
            case 0:
                ifh0 ifh0Var = (ifh0) obj;
                long j = ((hjl) obj3).a;
                int iX0 = (int) ifh0Var.X0(f2);
                int iX1 = (int) ifh0Var.X0(f);
                q5t0 q5t0VarH = ((afh0) obj2).H(j);
                return ifh0Var.S(q5t0VarH.a + iX0, q5t0VarH.b + iX1, b7x.a, new ro60(q5t0VarH, iX0, iX1, (byte) 3));
            default:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c8o.f(f2, f, null, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
        }
    }
}
