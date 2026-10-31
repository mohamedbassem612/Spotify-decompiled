package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class arf extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqg b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ arf(yqg yqgVar, Function0 function0, byte b) {
        super(3);
        this.a = b;
        this.b = yqgVar;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Function0 function0 = this.c;
        yqg yqgVar = this.b;
        switch (b) {
            case 0:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-2115790947);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = p3d1.m(0L, x340Var);
                }
                zqf zqfVar = new zqf(yqgVar, (frr0) objT, function0, (byte) 0);
                boolean zG = x340Var.g(zqfVar);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new lwe(zqfVar, (byte) 8);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarX = bin.x(qim0Var, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15);
                x340Var.r(false);
                return qim0VarX;
            default:
                qim0 qim0Var2 = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(533906131);
                Object objT3 = x340Var2.T();
                m4c m4cVar2 = fkj0.X;
                if (objT3 == m4cVar2) {
                    objT3 = p3d1.m(0L, x340Var2);
                }
                zqf zqfVar2 = new zqf(yqgVar, (frr0) objT3, function0, (byte) 1);
                boolean zG2 = x340Var2.g(zqfVar2);
                Object objT4 = x340Var2.T();
                if (zG2 || objT4 == m4cVar2) {
                    objT4 = new fjc1(zqfVar2, (byte) 17);
                    x340Var2.s0(objT4);
                }
                qim0 qim0VarX2 = bin.x(qim0Var2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15);
                x340Var2.r(false);
                return qim0VarX2;
        }
    }
}
