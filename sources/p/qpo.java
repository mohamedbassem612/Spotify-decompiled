package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qpo extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ upo b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ hnf e;
    public final /* synthetic */ hnf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpo(upo upoVar, long j, float f, hnf hnfVar, hnf hnfVar2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = upoVar;
        this.c = j;
        this.d = f;
        this.e = hnfVar;
        this.f = hnfVar2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new qpo(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            float fE = qui1.e(this.c);
            this.a = true;
            obj = this.b.f(fE, this.d, this.e, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        if (((wy71) obj) == wy71.c) {
            this.f.invoke();
        }
        return rih1.a;
    }
}
