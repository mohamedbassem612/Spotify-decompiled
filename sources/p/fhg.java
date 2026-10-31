package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fhg implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ga80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pm31 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Object f;

    public fhg(ga80 ga80Var, rze1 rze1Var, boolean z, pm31 pm31Var, Function0 function0) {
        this.b = ga80Var;
        this.f = rze1Var;
        this.c = z;
        this.d = pm31Var;
        this.e = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Object obj4 = this.f;
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
                qim0 qim0VarA = da80.a(nim0Var, idn0Var, ga80Var);
                pm31 pm31Var = this.d;
                Function0 function0 = this.e;
                qim0 qim0VarThen = qim0VarA.then(new dhg(idn0Var, (ga80) null, false, this.c, (String) obj4, pm31Var, function0));
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
                qim0 qim0VarThen2 = da80.a(nim0Var, idn0Var2, ga80Var).then(new bqg1((rze1) obj4, idn0Var2, (ga80) null, this.c, this.d, this.e));
                x340Var2.r(false);
                return qim0VarThen2;
        }
    }

    public fhg(ga80 ga80Var, boolean z, String str, pm31 pm31Var, Function0 function0) {
        this.b = ga80Var;
        this.c = z;
        this.f = str;
        this.d = pm31Var;
        this.e = function0;
    }
}
