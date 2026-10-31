package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yyr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ ryx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yyr0(c9n c9nVar, ryx ryxVar, byte b) {
        super(2);
        this.a = b;
        this.b = c9nVar;
        this.c = ryxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = this.b;
        ryx ryxVar = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    eox eoxVar = eox.c;
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var2).b.b;
                    boolean zI = x340Var2.i(c9nVar) | x340Var2.i(ryxVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new xyr0(c9nVar, ryxVar, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    w0h1.a(eoxVar, isl.a, bin.x(nim0.a, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), j, 0L, false, x340Var2, eox.d | 48, 48);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    eox eoxVar2 = eox.c;
                    uwr uwrVar2 = cbx.a;
                    long j2 = cbx.a(x340Var4).b.b;
                    boolean zI2 = x340Var4.i(c9nVar) | x340Var4.i(ryxVar);
                    Object objT2 = x340Var4.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new xyr0(c9nVar, ryxVar, (byte) 1);
                        x340Var4.s0(objT2);
                    }
                    w0h1.a(eoxVar2, isl.a, bin.x(nim0.a, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15), j2, 0L, false, x340Var4, eox.d | 48, 48);
                }
                break;
        }
        return rih1Var;
    }
}
