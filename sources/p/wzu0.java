package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wzu0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzu0(float f, long j) {
        super(3);
        this.a = (byte) 2;
        this.b = f;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        long j = this.c;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        float f = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV = u291.v(nim0Var, f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                t1c.a(dug.f(u291.h(qim0VarV, 8.0f), j, er31.b(6.0f)), b0kVar, 0);
                break;
            case 1:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV2 = u291.v(nim0Var, f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                t1c.a(dug.f(u291.h(qim0VarV2, 16.0f), j, er31.b(6.0f)), b0kVar2, 0);
                break;
            default:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    w0h1.a(plx.c, isl.a, u291.r(uyn1.z(0.25f * f, 0.0f, 2, nim0Var), f * 0.8f), this.c, 0L, false, x340Var2, plx.d | 48, 48);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wzu0(float f, long j, cua cuaVar, byte b) {
        super(3);
        this.a = b;
        this.b = f;
        this.c = j;
    }
}
