package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eh1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh1(byte b, yg1 yg1Var, iu30 iu30Var) {
        super(3);
        this.a = b;
        this.b = yg1Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        nim0 nim0Var = nim0.a;
        yg1 yg1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                x340 x340Var = (b0k) obj2;
                boolean zG = x340Var.g(iu30Var);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new qj(iu30Var, (byte) 25);
                    x340Var.s0(objT);
                }
                b6p1.a(yg1Var, qim0VarZ, (iu30) objT, x340Var, 0);
                break;
            case 1:
                ((Number) obj3).intValue();
                p10 p10Var = yg1Var.j;
                qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                x340 x340Var2 = (b0k) obj2;
                boolean zG2 = x340Var2.g(iu30Var) | x340Var2.g(yg1Var);
                Object objT2 = x340Var2.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new ze1((byte) 2, yg1Var, iu30Var);
                    x340Var2.s0(objT2);
                }
                j6p1.a(p10Var, qim0VarZ2, (Function0) objT2, x340Var2, 0);
                break;
            case 2:
                ((Number) obj3).intValue();
                qim0 qim0VarZ3 = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                x340 x340Var3 = (b0k) obj2;
                boolean zG3 = x340Var3.g(iu30Var);
                Object objT3 = x340Var3.T();
                if (zG3 || objT3 == fkj0.X) {
                    objT3 = new qj(iu30Var, (byte) 26);
                    x340Var3.s0(objT3);
                }
                z5p1.a(yg1Var, qim0VarZ3, (iu30) objT3, x340Var3, 0);
                break;
            default:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = yg1Var.g.c;
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var4).h;
                qim0 qim0VarE = aqb0.e((aqb0) obj, uyn1.x(anm1.N("RemoveAddOnTitle", nim0Var), 16.0f));
                x340 x340Var5 = x340Var4;
                boolean zG4 = x340Var5.g(iu30Var) | x340Var5.g(yg1Var);
                Object objT4 = x340Var5.T();
                if (zG4 || objT4 == fkj0.X) {
                    objT4 = new ze1((byte) 3, yg1Var, iu30Var);
                    x340Var5.s0(objT4);
                }
                uwo1.e(str, bin.x(qim0VarE, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2024);
                break;
        }
        return rih1Var;
    }
}
