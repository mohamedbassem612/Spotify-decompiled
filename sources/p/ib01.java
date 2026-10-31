package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ib01 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ xu30 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib01(xu30 xu30Var, long j, long j2, lnm lnmVar) {
        super(1, lnmVar);
        this.b = xu30Var;
        this.c = j;
        this.d = j2;
    }

    public final lnm create(lnm lnmVar) {
        return new ib01(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Long l = new Long(this.c);
            Long l2 = new Long(this.d);
            this.a = true;
            Object objInvoke = this.b.invoke(l, l2, this);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
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
