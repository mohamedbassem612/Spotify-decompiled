package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ei2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ fi2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei2(int i, String str, boolean z, fi2 fi2Var, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = fi2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        Function0 function1;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Function0 function2 = null;
                    boolean z = this.d;
                    fi2 fi2Var = this.e;
                    int i = this.b;
                    if (z && i == 2) {
                        x340Var2.i0(-1757875622);
                        boolean zI = x340Var2.i(fi2Var);
                        Object objT = x340Var2.T();
                        if (zI || objT == m4cVar) {
                            objT = new g82(fi2Var, (byte) 2);
                            x340Var2.s0(objT);
                        }
                        function0 = (Function0) objT;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1757806027);
                        x340Var2.r(false);
                        function0 = null;
                    }
                    int i2 = this.b;
                    if (z) {
                        x340Var2.i0(-1757702208);
                        boolean zI2 = x340Var2.i(fi2Var) | x340Var2.e(l1d.C(i2));
                        Object objT2 = x340Var2.T();
                        if (zI2 || objT2 == m4cVar) {
                            objT2 = new di2(fi2Var, i2, (byte) 0);
                            x340Var2.s0(objT2);
                        }
                        function1 = (Function0) objT2;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1757638379);
                        x340Var2.r(false);
                        function1 = null;
                    }
                    if (z) {
                        x340Var2.i0(-1757533537);
                        boolean zI3 = x340Var2.i(fi2Var) | x340Var2.e(l1d.C(i2));
                        Object objT3 = x340Var2.T();
                        if (zI3 || objT3 == m4cVar) {
                            objT3 = new di2(fi2Var, i2, (byte) 1);
                            x340Var2.s0(objT3);
                        }
                        function2 = (Function0) objT3;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1757468747);
                        x340Var2.r(false);
                    }
                    m87.a(i, this.c, (qim0) null, function0, function1, function2, this.d, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1111465241, new ei2(this.b, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
