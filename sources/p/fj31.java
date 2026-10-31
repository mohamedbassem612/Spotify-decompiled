package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fj31 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nav0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj31(Function0 function0, Function0 function1, Function0 function2, nav0 nav0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.d = nav0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                fj31 fj31Var = new fj31(this.e, this.f, this.g, this.d, lnmVar);
                fj31Var.c = obj;
                return fj31Var;
            default:
                fj31 fj31Var2 = new fj31(this.d, this.e, this.f, this.g, lnmVar);
                fj31Var2.c = obj;
                return fj31Var2;
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j8d1 j8d1Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) this.c;
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
                lfa lfaVar = new lfa(new tj40(this.e, this.f, this.g, c9nVar), (lnm) null, (byte) 1);
                this.c = null;
                this.b = true;
                return j8d1Var.H1(lfaVar, this) == d9nVar ? d9nVar : rih1Var;
            default:
                c9n c9nVar2 = (c9n) this.c;
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
                fqf fqfVar = new fqf(this.e, c9nVar2, this.f, this.g, (lnm) null, (byte) 2);
                this.c = null;
                this.b = true;
                return s9p1.D(j8d1Var, fqfVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj31(nav0 nav0Var, Function0 function0, Function0 function1, Function0 function2, lnm lnmVar) {
        super(2, lnmVar);
        this.d = nav0Var;
        this.e = function0;
        this.f = function1;
        this.g = function2;
    }
}
