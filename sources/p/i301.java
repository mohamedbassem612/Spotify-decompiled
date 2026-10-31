package p;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i301 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i301(Object obj, boolean z, byte b) {
        super(4);
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        long j;
        qim0 qim0VarN;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                ((Number) obj4).intValue();
                String strA = ((qxz0) ((b0i0) obj5).c).a(iIntValue);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).k;
                x340 x340Var2 = x340Var;
                if (z) {
                    x340Var2.i0(-1069397446);
                    j = cbx.a(x340Var2).b.a;
                } else {
                    x340Var2.i0(-1069396451);
                    j = cbx.a(x340Var2).b.b;
                }
                x340Var2.r(false);
                uwo1.e(strA, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                return rih1Var;
            default:
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                ((Number) obj4).intValue();
                int iOrdinal = ((sae1) ((ArrayList) obj5).get(iIntValue2)).ordinal();
                nim0 nim0Var = nim0.a;
                if (iOrdinal == 0) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(598613568);
                    x340Var4.r(false);
                    qim0VarN = anm1.N("text_selector_skeleton_bar_long", u291.f(nim0Var, 1.0f));
                } else {
                    if (iOrdinal != 1) {
                        throw p3d1.k(x340Var3, 598610980, false);
                    }
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(598620673);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var5).b;
                    qim0VarN = anm1.N("text_selector_skeleton_bar_short", u291.v(uyn1.z(0.0f, 16.0f, 1, nim0Var), 240.0f));
                    x340Var5.r(false);
                }
                uwr uwrVar3 = cbx.a;
                qim0 qim0VarH = u291.h(qim0VarN, cbx.b(x340Var3).b.a);
                cua cuaVar = cbx.b(x340Var3).f;
                qim0 qim0VarF = dug.f(i1p1.q(qim0VarH, er31.b(4.0f)), cbx.a(x340Var3).a.a.a(), d4o1.a);
                if (z) {
                    qim0VarF = cwl1.l0(qim0VarF, 0L, (hw61) null, 15);
                }
                t1c.a(qim0VarF, x340Var3, 0);
                return rih1Var;
        }
    }
}
