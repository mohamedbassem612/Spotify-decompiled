package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l9i0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ q9i0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9i0(int i, long j, long j2, q9i0 q9i0Var, String str, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = q9i0Var;
        this.f = str;
        this.g = str2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new l9i0(this.b, this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            long j = this.b;
            long j2 = this.c;
            long j3 = j * j2;
            long jMin = Math.min(j2, this.d - j3);
            se11 se11Var = r8i0.e;
            tn21 u9i0Var = new u9i0(bmq0.w("application/octet-stream"), jMin, this.f, j3);
            this.a = true;
            Object objC = this.e.c(u9i0Var, this.g, this);
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
