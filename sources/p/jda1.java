package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jda1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda1(boolean z, boolean z2, boolean z3, qam1 qam1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = qam1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new jda1(this.c, this.d, (xtb0) this.e, lnmVar);
            default:
                return new jda1(this.b, this.c, this.d, (qam1) this.e, lnmVar);
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
        Object obj2 = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        switch (b) {
            case 0:
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
                if (!z2 || z) {
                    return rih1Var;
                }
                this.b = true;
                df41 df41Var = xtb0.y;
                Object objK = ((xtb0) obj2).k(0, 0, this);
                d9n d9nVar = d9n.a;
                return objK == d9nVar ? d9nVar : rih1Var;
            default:
                hm5.M(obj);
                if (this.b && z2 && z) {
                    sam1.a((qam1) obj2);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda1(boolean z, boolean z2, xtb0 xtb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.d = z2;
        this.e = xtb0Var;
    }
}
