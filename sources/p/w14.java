package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w14 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ vu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w14(Function0 function0, vu30 vu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = function0;
        this.e = vu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                w14 w14Var = new w14(this.d, this.e, lnmVar, (byte) 0);
                w14Var.c = obj;
                return w14Var;
            case 1:
                w14 w14Var2 = new w14(this.d, this.e, lnmVar, (byte) 1);
                w14Var2.c = obj;
                return w14Var2;
            default:
                w14 w14Var3 = new w14(this.d, this.e, lnmVar, (byte) 2);
                w14Var3.c = obj;
                return w14Var3;
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
        vu30 vu30Var = this.e;
        Function0 function0 = this.d;
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
                hm5.M(obj);
                c9n c9nVar = (c9n) this.c;
                p811 p811Var = new p811();
                m441 m441VarQ = rwq.q(function0);
                v14 v14Var = new v14(p811Var, c9nVar, vu30Var, (byte) 0);
                this.b = true;
                return m441VarQ.collect(v14Var, this) == d9nVar ? d9nVar : rih1Var;
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
                c9n c9nVar2 = (c9n) this.c;
                p811 p811Var2 = new p811();
                m441 m441VarQ2 = rwq.q(function0);
                v14 v14Var2 = new v14(p811Var2, c9nVar2, vu30Var, (byte) 1);
                this.b = true;
                return m441VarQ2.collect(v14Var2, this) == d9nVar ? d9nVar : rih1Var;
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
                c9n c9nVar3 = (c9n) this.c;
                p811 p811Var3 = new p811();
                m441 m441VarQ3 = rwq.q(function0);
                v14 v14Var3 = new v14(p811Var3, c9nVar3, vu30Var, (byte) 2);
                this.b = true;
                return m441VarQ3.collect(v14Var3, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
