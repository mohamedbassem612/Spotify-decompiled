package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qv51 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ga80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ pm31 e;
    public final /* synthetic */ cv30 f;

    public /* synthetic */ qv51(ga80 ga80Var, boolean z, boolean z2, pm31 pm31Var, cv30 cv30Var, byte b) {
        this.a = b;
        this.b = ga80Var;
        this.c = z;
        this.d = z2;
        this.e = pm31Var;
        this.f = cv30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        iu30 iu30Var = this.f;
        ga80 ga80Var = this.b;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-1525724089);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                idn0 idn0Var = (idn0) objT;
                qim0 qim0VarThen = da80.a(nim0Var, idn0Var, ga80Var).then(new iv51(this.c, idn0Var, (ga80) null, false, this.d, this.e, (Function0) iu30Var));
                x340Var.r(false);
                return qim0VarThen;
            default:
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-1525724089);
                Object objT2 = x340Var2.T();
                if (objT2 == fkj0.X) {
                    objT2 = ktd.n(x340Var2);
                }
                idn0 idn0Var2 = (idn0) objT2;
                qim0 qim0VarThen2 = da80.a(nim0Var, idn0Var2, ga80Var).then(new nze1(this.c, idn0Var2, (ga80) null, false, this.d, this.e, iu30Var));
                x340Var2.r(false);
                return qim0VarThen2;
        }
    }
}
