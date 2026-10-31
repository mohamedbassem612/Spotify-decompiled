package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f0k1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y0k1 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0k1(y0k1 y0k1Var, Function0 function0, byte b) {
        super(3);
        this.a = b;
        this.b = y0k1Var;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        y0k1 y0k1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO0 = cwl1.o0(x340Var, 2131963798);
                String strO1 = cwl1.o0(x340Var, 2131963797);
                boolean z = !y0k1Var.b;
                boolean z2 = !y0k1Var.e;
                x340 x340Var2 = x340Var;
                boolean zG = x340Var2.g(function0);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new izg1(function0, (byte) 9);
                    x340Var2.s0(objT);
                }
                zxo1.a(strO0, strO1, (qim0) null, z, z2, (iu30) objT, x340Var2, 0, 4);
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO2 = cwl1.o0(x340Var3, 2131963794);
                String strO3 = cwl1.o0(x340Var3, 2131963793);
                boolean z3 = !y0k1Var.c;
                boolean z4 = !y0k1Var.f;
                x340 x340Var4 = x340Var3;
                boolean zG2 = x340Var4.g(function0);
                Object objT2 = x340Var4.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new izg1(function0, (byte) 10);
                    x340Var4.s0(objT2);
                }
                zxo1.a(strO2, strO3, (qim0) null, z3, z4, (iu30) objT2, x340Var4, 0, 4);
                break;
            default:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO4 = cwl1.o0(x340Var5, 2131963801);
                String strO5 = cwl1.o0(x340Var5, 2131963800);
                boolean z5 = !y0k1Var.d;
                boolean z6 = !y0k1Var.g;
                x340 x340Var6 = x340Var5;
                boolean zG3 = x340Var6.g(function0);
                Object objT3 = x340Var6.T();
                if (zG3 || objT3 == fkj0.X) {
                    objT3 = new izg1(function0, (byte) 11);
                    x340Var6.s0(objT3);
                }
                zxo1.a(strO4, strO5, (qim0) null, z5, z6, (iu30) objT3, x340Var6, 0, 4);
                break;
        }
        return rih1Var;
    }
}
