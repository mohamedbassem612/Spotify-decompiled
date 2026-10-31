package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class buo extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ en31 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buo(lnm lnmVar, iu30 iu30Var, en31 en31Var, boolean z, boolean z2) {
        super(2, lnmVar);
        this.b = en31Var;
        this.c = z;
        this.d = z2;
        this.e = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new buo(lnmVar, this.e, this.b, this.c, this.d);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        en31 en31Var = this.b;
        boolean z2 = !(en31Var.m() && en31Var.n()) && this.c;
        iu30 iu30Var = this.e;
        en31 en31Var2 = this.b;
        boolean z3 = this.d;
        vu30 k4aVar = new k4a((lnm) null, iu30Var, en31Var2, z2, z3);
        this.a = true;
        Object objT = en31Var2.t(z3, k4aVar, this);
        d9n d9nVar = d9n.a;
        return objT == d9nVar ? d9nVar : objT;
    }
}
