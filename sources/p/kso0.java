package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kso0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8h1 b;
    public final /* synthetic */ ogl0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ uwy0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kso0(i8h1 i8h1Var, ogl0 ogl0Var, Function0 function0, uwy0 uwy0Var, byte b) {
        super(2);
        this.a = b;
        this.b = i8h1Var;
        this.c = ogl0Var;
        this.d = function0;
        this.e = uwy0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uwy0 uwy0Var = this.e;
        i8h1 i8h1Var = this.b;
        ogl0 ogl0Var = this.c;
        Function0 function0 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zI = x340Var2.i(i8h1Var) | x340Var2.i(ogl0Var) | x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new iso0(i8h1Var, ogl0Var, function0, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    mue1.o((Function0) objT, null, false, null, null, null, apo.r(408072752, new jso0(uwy0Var, (byte) 0), x340Var2), x340Var2, 805306368, 510);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    boolean zI2 = x340Var4.i(i8h1Var) | x340Var4.i(ogl0Var) | x340Var4.g(function0);
                    Object objT2 = x340Var4.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new iso0(i8h1Var, ogl0Var, function0, (byte) 2);
                        x340Var4.s0(objT2);
                    }
                    mue1.o((Function0) objT2, null, false, null, null, null, apo.r(439709874, new jso0(uwy0Var, (byte) 1), x340Var4), x340Var4, 805306368, 510);
                }
                break;
        }
        return rih1Var;
    }
}
