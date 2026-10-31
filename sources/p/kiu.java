package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kiu extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ aju b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ tm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kiu(tm tmVar, aju ajuVar, iu30 iu30Var) {
        super(2);
        this.d = tmVar;
        this.b = ajuVar;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tm tmVar = this.d;
        aju ajuVar = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    op0 op0Var = (op0) tmVar.c;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new hws(iu30Var, (byte) 11);
                        x340Var2.s0(objT);
                    }
                    ji0 ji0Var = ajuVar.a.a;
                    otw.c(op0Var, new kp0(new cs10(false), ila0.r(ji0Var.g.a), ji0Var.c, ji0Var, ji0Var.i, ji0Var.b, ji0Var.Z.getValue(), ji0Var.W0, ji0Var.Y0.a, false, (iu30) objT), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ji0 ji0Var2 = ajuVar.a.a;
                    j2i j2iVarR = apo.r(-981230435, new kiu(tmVar, ajuVar, iu30Var), x340Var4);
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new q7u(iu30Var, (byte) 1);
                        x340Var4.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zG3 = x340Var4.g(iu30Var);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new q7u(iu30Var, (byte) 2);
                        x340Var4.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean zG4 = x340Var4.g(iu30Var);
                    Object objT4 = x340Var4.T();
                    if (zG4 || objT4 == m4cVar) {
                        objT4 = new q7u(iu30Var, (byte) 3);
                        x340Var4.s0(objT4);
                    }
                    Function0 function2 = (Function0) objT4;
                    boolean zG5 = x340Var4.g(iu30Var);
                    Object objT5 = x340Var4.T();
                    if (zG5 || objT5 == m4cVar) {
                        objT5 = new q7u(iu30Var, (byte) 4);
                        x340Var4.s0(objT5);
                    }
                    e130.d(ji0Var2, j2iVarR, function0, function1, function2, (Function0) objT5, null, x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kiu(aju ajuVar, iu30 iu30Var, tm tmVar) {
        super(2);
        this.b = ajuVar;
        this.c = iu30Var;
        this.d = tmVar;
    }
}
