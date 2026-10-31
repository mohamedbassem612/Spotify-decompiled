package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ja51 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ xtb0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ mlr0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja51(Function0 function0, xtb0 xtb0Var, int i, boolean z, mlr0 mlr0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = function0;
        this.d = xtb0Var;
        this.e = i;
        this.f = z;
        this.g = mlr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new ja51(this.c, this.d, this.e, this.f, this.g, lnmVar, (byte) 0);
            default:
                return new ja51(this.c, this.d, this.e, this.f, this.g, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mlr0 mlr0Var = this.g;
        boolean z = this.f;
        int i = this.e;
        xtb0 xtb0Var = this.d;
        d9n d9nVar = d9n.a;
        Function0 function0 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (function0 == null) {
                    return rih1Var;
                }
                mr20 mr20VarU = rqt0.u(rwq.q(new il9(xtb0Var, i, (byte) 2)));
                ia51 ia51Var = new ia51(z, mlr0Var, function0, (byte) 0);
                this.b = true;
                return mr20VarU.collect(ia51Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (function0 == null) {
                    return rih1Var;
                }
                mr20 mr20VarU2 = rqt0.u(rwq.q(new il9(xtb0Var, i, (byte) 3)));
                ia51 ia51Var2 = new ia51(z, mlr0Var, function0, (byte) 1);
                this.b = true;
                return mr20VarU2.collect(ia51Var2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
