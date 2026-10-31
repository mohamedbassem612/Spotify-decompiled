package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xhi1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aii1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xhi1(aii1 aii1Var, byte b) {
        super(4);
        this.a = b;
        this.b = aii1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        aii1 aii1Var = this.b;
        switch (b) {
            case 0:
                aii1Var.b.d((whi1) obj, (iu30) obj2, null, (b0k) obj3, ((Number) obj4).intValue() & 126);
                break;
            default:
                thi1 thi1Var = (whi1) obj;
                Function0 function0 = (Function0) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                thi1 thi1Var2 = thi1Var instanceof thi1 ? thi1Var : null;
                if (thi1Var2 != null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-263702950);
                    aii1Var.b.b(thi1Var2, function0, null, x340Var2, iIntValue & 112);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-263702951);
                    x340Var3.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
