package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ztk extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ auk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ztk(auk aukVar, byte b) {
        super(2);
        this.a = b;
        this.b = aukVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        auk aukVar = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = x340Var2.i(aukVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new hzb(aukVar, null, (byte) 18);
                        x340Var2.s0(objT);
                    }
                    qxd0.t(rih1Var, x340Var2, (vu30) objT);
                    iuk iukVar = aukVar.N1;
                    if (iukVar == null) {
                        u890.C("viewModel");
                        throw null;
                    }
                    boolean zI2 = x340Var2.i(aukVar);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new ytk(aukVar, (byte) 0);
                        x340Var2.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zI3 = x340Var2.i(aukVar);
                    Object objT3 = x340Var2.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new ytk(aukVar, (byte) 1);
                        x340Var2.s0(objT3);
                    }
                    c680.e(iukVar, function0, (Function0) objT3, (qim0) null, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-1546904720, new ztk(aukVar, b2), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
