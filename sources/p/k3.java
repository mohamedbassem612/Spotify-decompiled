package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k3 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n3 b;
    public final /* synthetic */ c3 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ p811 e;
    public final /* synthetic */ p811 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(n3 n3Var, c3 c3Var, iu30 iu30Var, p811 p811Var, p811 p811Var2, byte b) {
        super(2);
        this.a = b;
        this.b = n3Var;
        this.c = c3Var;
        this.d = iu30Var;
        this.e = p811Var;
        this.f = p811Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    mod.b(oi7.a.a(this.b.d), apo.r(1473487051, new x2(this.c, this.d, this.e, this.f, (byte) 1), x340Var2), x340Var2, 56);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(1550822795, new k3(this.b, this.c, this.d, this.e, this.f, (byte) 0), x340Var4), x340Var4, 3072, 7);
                }
                break;
        }
        return rih1Var;
    }
}
