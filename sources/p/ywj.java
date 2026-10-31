package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ywj extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xtb0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywj(ven0 ven0Var, xtb0 xtb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.d = ven0Var;
        this.c = xtb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.d;
        xtb0 xtb0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new ywj(xtb0Var, ven0Var, lnmVar, (byte) 0);
            case 1:
                return new ywj(xtb0Var, ven0Var, lnmVar, (byte) 1);
            case 2:
                return new ywj(xtb0Var, ven0Var, lnmVar, (byte) 2);
            case 3:
                return new ywj(ven0Var, xtb0Var, lnmVar);
            default:
                return new ywj(xtb0Var, ven0Var, lnmVar, (byte) 4);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.d;
        xtb0 xtb0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(rwq.q(new ih1(xtb0Var, (byte) 13)));
                cy9 cy9Var = new cy9(ven0Var, (lnm) null, (byte) 2);
                this.b = true;
                return l4p1.q(mr20VarU, cy9Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
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
                if (((List) ven0Var.getValue()).isEmpty()) {
                    return rih1Var;
                }
                this.b = true;
                df41 df41Var = xtb0.y;
                return xtb0Var.f(0, 0, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
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
                mr20 mr20VarU2 = rqt0.u(rwq.q(new nxb0(xtb0Var, (byte) 15)));
                mp0 mp0Var = new mp0(ven0Var, (byte) 13);
                this.b = true;
                return mr20VarU2.collect(mp0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    return rih1Var;
                }
                this.b = true;
                df41 df41Var2 = xtb0.y;
                return xtb0Var.k(0, 0, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ = rwq.q(new nxb0(xtb0Var, (byte) 21));
                mp0 mp0Var2 = new mp0(ven0Var, (byte) 25);
                this.b = true;
                return m441VarQ.collect(mp0Var2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywj(xtb0 xtb0Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = xtb0Var;
        this.d = ven0Var;
    }
}
