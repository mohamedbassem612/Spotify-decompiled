package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rih extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rih(Function0 function0, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.c = function0;
        this.d = iu30Var;
        this.b = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.b;
        Function0 function0 = this.c;
        iu30 iu30Var = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                r6p1.c(czo1.p(1), function0, (b0k) obj, iu30Var, qim0Var);
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                qim0 qim0VarN = anm1.N("pre-save-button", qim0Var);
                String strO0 = cwl1.o0(x340Var2, 2131961036);
                boolean zG = x340Var2.g(function0) | x340Var2.g(iu30Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new wmf(function0, iu30Var, (byte) 8);
                    x340Var2.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.f(new gbx(new y50(strO0), function1), qim0VarN, (max) null, yla.s(x340Var2), (idn0) null, (vu30) null, j9j.b, j9j.c, x340Var2, 14155776, 52);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rih(qim0 qim0Var, Function0 function0, iu30 iu30Var) {
        super(2);
        this.b = qim0Var;
        this.c = function0;
        this.d = iu30Var;
    }
}
