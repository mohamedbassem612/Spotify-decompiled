package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o2l extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p2l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2l(p2l p2lVar, byte b) {
        super(2);
        this.a = b;
        this.b = p2lVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p2l p2lVar = this.b;
        boolean z = false;
        boolean z2 = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String strO0 = cwl1.o0(x340Var2, 2131956198);
                    String strO1 = cwl1.o0(x340Var2, 2131956195);
                    String strO2 = cwl1.o0(x340Var2, 2131956197);
                    String strO3 = cwl1.o0(x340Var2, 2131956196);
                    boolean zI = x340Var2.i(p2lVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        obj3 = objT;
                        n2l n2lVar = new n2l(p2lVar, z ? 1 : 0);
                        x340Var2.s0(n2lVar);
                        obj3 = n2lVar;
                    }
                    Function0 function0 = (Function0) obj3;
                    boolean zI2 = x340Var2.i(p2lVar);
                    Object objT2 = x340Var2.T();
                    Object obj4 = objT2;
                    if (zI2 || objT2 == m4cVar) {
                        n2l n2lVar2 = new n2l(p2lVar, b2);
                        x340Var2.s0(n2lVar2);
                        obj4 = n2lVar2;
                    }
                    y7y0.d(strO0, strO2, strO3, function0, (Function0) obj4, (qim0) null, strO1, (hux) null, x340Var2, 0, 160);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    gfx.b(6, apo.r(60568253, new o2l(p2lVar, z2 ? 1 : 0), x340Var4), x340Var4, 54);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(1734243858, new o2l(p2lVar, b2), x340Var6), x340Var6, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
