package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ot20 extends a8d1 implements zu30 {
    public boolean a;
    public /* synthetic */ Throwable b;
    public /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ vu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot20(long j, vu30 vu30Var, lnm lnmVar) {
        super(4, lnmVar);
        this.d = j;
        this.e = vu30Var;
    }

    @Override // p.zu30
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        ot20 ot20Var = new ot20(this.d, this.e, (lnm) obj4);
        ot20Var.b = (Throwable) obj2;
        ot20Var.c = jLongValue;
        return ot20Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.b;
        long j = this.c;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            if (j < this.d) {
                this.b = null;
                this.c = j;
                this.a = true;
                obj = this.e.invoke(th, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            }
            return yah0.m(z);
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        boolean z2 = ((Boolean) obj).booleanValue();
        return yah0.m(z2);
    }
}
