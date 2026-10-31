package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lb01 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ long b;
    public /* synthetic */ long c;
    public final /* synthetic */ qb01 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb01(qb01 qb01Var, String str, int i, int i2, boolean z, lnm lnmVar) {
        super(3, lnmVar);
        this.d = qb01Var;
        this.e = str;
        this.f = i;
        this.g = i2;
        this.h = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        int i = this.g;
        boolean z = this.h;
        lb01 lb01Var = new lb01(this.d, this.e, this.f, i, z, (lnm) obj3);
        lb01Var.b = jLongValue;
        lb01Var.c = jLongValue2;
        return lb01Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j = this.b;
        long j2 = this.c;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            this.b = j;
            this.c = j2;
            this.a = true;
            int i = qb01.i;
            Object objC = this.d.c(this.e, this.f, this.g, this.h, j, j2, this);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
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
