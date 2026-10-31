package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y501 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ gw70 b;
    public final /* synthetic */ w501 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y501(gw70 gw70Var, w501 w501Var, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = gw70Var;
        this.c = w501Var;
        this.d = qim0Var;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    w501 w501Var = this.c;
                    v501 v501Var = w501Var.a;
                    String str = w501Var.b;
                    String strN0 = cwl1.n0(2131960858, new Object[]{v501Var.b, str}, x340Var2);
                    String strN1 = cwl1.n0(2131960859, new Object[]{str}, x340Var2);
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(x340Var2).a.a.a();
                    qim0 qim0VarF = u291.f(this.d, 1.0f);
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = k301.t;
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
                    boolean zG = x340Var2.g(w501Var) | x340Var2.g(strN1) | x340Var2.g(strN0);
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new ozu0(w501Var, strN1, strN0, (byte) 21);
                        x340Var2.s0(objT2);
                    }
                    w3d1.a(s161.a(qim0VarB, (iu30) objT2), (hw61) null, jA, 0L, 0.0f, 0.0f, (qqb) null, apo.r(94420028, new ffx0(this.e, w501Var, this.b, (byte) 14), x340Var2), x340Var2, 12582912, 122);
                }
                break;
            default:
                ((Number) obj2).intValue();
                oqo1.g(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y501(w501 w501Var, qim0 qim0Var, iu30 iu30Var, gw70 gw70Var) {
        super(2);
        this.c = w501Var;
        this.d = qim0Var;
        this.e = iu30Var;
        this.b = gw70Var;
    }
}
