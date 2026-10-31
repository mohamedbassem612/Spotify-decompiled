package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mni1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ nni1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mni1(String str, nni1 nni1Var, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = nni1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nni1 nni1Var = this.c;
        String str = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT);
                    }
                    c9n c9nVar = (c9n) objT;
                    boolean zI = x340Var2.i(nni1Var) | x340Var2.i(c9nVar);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new mah1(nni1Var, c9nVar, (byte) 11);
                        x340Var2.s0(objT2);
                    }
                    zro1.o(0, str, (Function0) objT2, x340Var2, (qim0) null);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(-532141628, new mni1(str, nni1Var, b2), x340Var4), x340Var4, 3072, 7);
                }
                break;
        }
        return rih1Var;
    }
}
