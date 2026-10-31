package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r9z0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p9z0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ vu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9z0(p9z0 p9z0Var, Function0 function0, vu30 vu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = p9z0Var;
        this.c = function0;
        this.d = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p9z0 p9z0Var = this.b;
        Function0 function0 = this.c;
        vu30 vu30Var = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                i5j1 i5j1Var = new i5j1(een.N0);
                String str = p9z0Var.c;
                boolean z = !(str == null || str.length() == 0);
                x340 x340Var2 = x340Var;
                boolean zG = x340Var2.g(function0);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new lpx0(function0, (byte) 11);
                    x340Var2.s0(objT);
                }
                ijo1.g(p9z0Var, e9k.n(62, bin.x(i5j1Var, z, (String) null, (pm31) null, (idn0) null, (Function0) objT, 14)), vu30Var, x340Var2, 0);
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                String str2 = p9z0Var.c;
                boolean z2 = p9z0Var.e;
                nim0 nim0Var = nim0.a;
                if (!z2) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(1308680748);
                    boolean z3 = !(str2 == null || str2.length() == 0);
                    boolean zG2 = x340Var4.g(function0);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new lpx0(function0, (byte) 13);
                        x340Var4.s0(objT2);
                    }
                    ijo1.g(p9z0Var, e9k.n(62, bin.x(nim0Var, z3, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 14)), vu30Var, x340Var4, 0);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(1308673380);
                    boolean z4 = !(str2 == null || str2.length() == 0);
                    boolean zG3 = x340Var5.g(function0);
                    Object objT3 = x340Var5.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new lpx0(function0, (byte) 12);
                        x340Var5.s0(objT3);
                    }
                    ijo1.o(p9z0Var, bin.x(nim0Var, z4, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 14), vu30Var, x340Var5, 0);
                    x340Var5.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
