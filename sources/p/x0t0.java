package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x0t0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y0t0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0t0(y0t0 y0t0Var, byte b) {
        super(2);
        this.a = b;
        this.b = y0t0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y0t0 y0t0Var = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = y0t0Var.Y1;
                    if (str == null) {
                        u890.C("title");
                        throw null;
                    }
                    String str2 = y0t0Var.Z1;
                    if (str2 == null) {
                        u890.C("subtitle");
                        throw null;
                    }
                    boolean zI = x340Var2.i(y0t0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        obj3 = objT;
                        w0t0 w0t0Var = new w0t0(y0t0Var, (byte) 0);
                        x340Var2.s0(w0t0Var);
                        obj3 = w0t0Var;
                    }
                    Function0 function0 = (Function0) obj3;
                    boolean zI2 = x340Var2.i(y0t0Var);
                    Object objT2 = x340Var2.T();
                    Object obj4 = objT2;
                    if (zI2 || objT2 == m4cVar) {
                        w0t0 w0t0Var2 = new w0t0(y0t0Var, (byte) 1);
                        x340Var2.s0(w0t0Var2);
                        obj4 = w0t0Var2;
                    }
                    puo1.g(str, str2, function0, (Function0) obj4, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gfx.b(6, apo.r(1631038451, new x0t0(y0t0Var, z ? 1 : 0), x340Var4), x340Var4, 54);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-1055812088, new x0t0(y0t0Var, b2), x340Var6), x340Var6, 3078, 6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
