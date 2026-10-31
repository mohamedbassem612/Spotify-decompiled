package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cfb extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ y7e1 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfb(boolean z, y7e1 y7e1Var, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = y7e1Var;
        this.d = function0;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Function0 function0 = this.d;
        y7e1 y7e1Var = this.c;
        switch (b) {
            case 0:
                return new cfb(function0, y7e1Var, lnmVar);
            default:
                return new cfb(this.b, y7e1Var, function0, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        y7e1 y7e1Var = this.c;
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
                if (function0 == null) {
                    return rih1Var;
                }
                m441 m441VarQ = rwq.q(new tr1(y7e1Var, (byte) 10));
                bfb bfbVar = new bfb(function0, (byte) 0);
                this.b = true;
                Object objCollect = m441VarQ.collect(bfbVar, this);
                d9n d9nVar = d9n.a;
                return objCollect == d9nVar ? d9nVar : rih1Var;
            default:
                hm5.M(obj);
                if (this.b) {
                    h4e1 h4e1VarH = y7e1Var.h();
                    try {
                        h4e1VarH.k(0, h4e1VarH.c.length(), "");
                        y7e1Var.a(h4e1VarH);
                        y7e1Var.c();
                        function0.invoke();
                    } catch (Throwable th) {
                        y7e1Var.c();
                        throw th;
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfb(Function0 function0, y7e1 y7e1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = function0;
        this.c = y7e1Var;
    }
}
