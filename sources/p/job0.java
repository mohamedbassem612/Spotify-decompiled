package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class job0 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ pob0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yj40 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public job0(pob0 pob0Var, boolean z, yj40 yj40Var, long j, lnm lnmVar) {
        super(1, lnmVar);
        this.b = pob0Var;
        this.c = z;
        this.d = yj40Var;
        this.e = j;
    }

    public final lnm create(lnm lnmVar) {
        return new job0(this.b, this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            rz20 rz20Var = rz20.a;
            pob0 pob0Var = this.b;
            pob0Var.e(rz20Var);
            mug mugVar = new mug(this.d, pob0Var, this.e, t5p1.m(this.c ? 100.0f : 0.1f, 1), (lnm) null, (byte) 2);
            this.a = true;
            Object objS = smo1.s(mugVar, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
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
