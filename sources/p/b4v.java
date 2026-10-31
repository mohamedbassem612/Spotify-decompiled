package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b4v extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ idn0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4v(idn0 idn0Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = idn0Var;
        this.d = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new b4v(this.c, this.d, lnmVar, (byte) 0);
            case 1:
                return new b4v(this.c, this.d, lnmVar, (byte) 1);
            default:
                return new b4v(this.c, this.d, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.d;
        idn0 idn0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayListJ = hrt.j(obj);
                mr20 mr20VarC = idn0Var.c();
                a4v a4vVar = new a4v(arrayListJ, ven0Var, (byte) 0);
                this.b = true;
                return mr20VarC.collect(a4vVar, this) == d9nVar ? d9nVar : rih1Var;
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
                ArrayList arrayListJ2 = hrt.j(obj);
                mr20 mr20VarC2 = idn0Var.c();
                a4v a4vVar2 = new a4v(arrayListJ2, ven0Var, (byte) 1);
                this.b = true;
                return mr20VarC2.collect(a4vVar2, this) == d9nVar ? d9nVar : rih1Var;
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
                ArrayList arrayListJ3 = hrt.j(obj);
                mr20 mr20VarC3 = idn0Var.c();
                a4v a4vVar3 = new a4v(arrayListJ3, ven0Var, (byte) 2);
                this.b = true;
                return mr20VarC3.collect(a4vVar3, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
