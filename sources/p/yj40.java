package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yj40 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ g6o0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj40(long j, g6o0 g6o0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = j;
        this.d = g6o0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        yj40 yj40Var = new yj40(this.c, this.d, lnmVar);
        yj40Var.b = ((qui1) obj).a;
        return yj40Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j = ((qui1) obj).a;
        yj40 yj40Var = new yj40(this.c, this.d, (lnm) obj2);
        yj40Var.b = j;
        return yj40Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j = this.b;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            long j2 = this.c;
            long jG = j2h1.g(qui1.d(j2) - qui1.d(j), qui1.e(j2) - qui1.e(j));
            this.b = j;
            this.a = true;
            Object objA = this.d.a(jG, j, this);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
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
