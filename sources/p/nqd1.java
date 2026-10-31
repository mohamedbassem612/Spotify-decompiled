package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nqd1 extends z031 implements vu30 {
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ p9w0 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ xu30 h;
    public final /* synthetic */ iu30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqd1(c9n c9nVar, p9w0 p9w0Var, iu30 iu30Var, iu30 iu30Var2, xu30 xu30Var, iu30 iu30Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.d = c9nVar;
        this.e = p9w0Var;
        this.f = iu30Var;
        this.g = iu30Var2;
        this.h = xu30Var;
        this.i = iu30Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        nqd1 nqd1Var = new nqd1(this.d, this.e, this.f, this.g, this.h, this.i, lnmVar);
        nqd1Var.c = obj;
        return nqd1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            i8d1 i8d1Var = (i8d1) this.c;
            this.b = true;
            Object objG = rqd1.g(i8d1Var, this.d, this.e, this.f, this.g, this.h, this.i, this);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
