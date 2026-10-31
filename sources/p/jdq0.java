package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jdq0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fdq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jdq0(fdq0 fdq0Var, byte b) {
        super(3);
        this.a = b;
        this.b = fdq0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fdq0 fdq0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                ezy ezyVar = fdq0Var.c;
                String str2 = fdq0Var.f;
                int iOrdinal = ezyVar.ordinal();
                if (iOrdinal == 0) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(1187456007);
                    int i = fdq0Var.e;
                    String strU = cwl1.U(2131820884, i, new Object[]{Integer.valueOf(i)}, x340Var2);
                    x340Var2.r(false);
                    str = strU;
                } else {
                    if (iOrdinal != 1) {
                        throw p3d1.k(x340Var, 1187454111, false);
                    }
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1843370983);
                    String strO0 = cwl1.o0(x340Var3, 2131961090);
                    if (str2.length() > 0) {
                        strO0 = xcg1.i(strO0, " • ", str2);
                    }
                    x340Var3.r(false);
                    str = strO0;
                }
                uwo1.e(str, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1790);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                cjc0 cjc0Var = new cjc0(2);
                uwo1.e(fdq0Var.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, cjc0Var, 0, (qx8) null, (b0k) obj2, 0, 0, 1790);
                return rih1Var;
        }
    }
}
