package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zdv0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdv0(iu30 iu30Var, List list) {
        super(2);
        this.a = (byte) 3;
        this.c = iu30Var;
        this.b = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        List list = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                v9p1.n(list, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                v9p1.n(list, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("top_collaborators_ui", u291.f(nim0Var, 1.0f));
                    uwr uwrVar = cbx.a;
                    zzq0 zzq0VarH = uyn1.h(2, cbx.b(x340Var2).e.b, 0.0f);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    d36 d36Var = new d36(16.0f, true, new um5(false));
                    boolean zG = x340Var2.g(list) | x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new v40(list, iu30Var, (byte) 3);
                        x340Var2.s0(objT);
                    }
                    ujo1.e(qim0VarN, null, zzq0VarH, d36Var, null, null, false, null, (iu30) objT, x340Var2, 0, 490);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                qim0 qim0VarB = uyn1.B(h2c.a.a(nim0Var, een.h), 0.0f, 8.0f, 0.0f, 36.0f, 5);
                String strO0 = cwl1.o0(x340Var4, 2131962436);
                boolean zG2 = x340Var4.g(iu30Var) | x340Var4.g(list);
                Object objT2 = x340Var4.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new vnk(iu30Var, list, (byte) 3);
                    x340Var4.s0(objT2);
                }
                Function0 function0 = (Function0) objT2;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.f(new gbx(new y50(strO0), function0), qim0VarB, null, null, null, null, null, lqj.a, x340Var4, 12582912, 124);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zdv0(List list, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = list;
        this.c = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdv0(List list, iu30 iu30Var) {
        super(2);
        this.a = (byte) 2;
        this.b = list;
        this.c = iu30Var;
    }
}
