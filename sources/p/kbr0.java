package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kbr0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rzo0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kbr0(rzo0 rzo0Var, long j, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = rzo0Var;
        this.e = j;
        this.f = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                kbr0 kbr0Var = new kbr0(this.d, this.e, this.f, lnmVar, (byte) 0);
                kbr0Var.c = obj;
                return kbr0Var;
            default:
                kbr0 kbr0Var2 = new kbr0(this.d, this.e, this.f, lnmVar, (byte) 1);
                kbr0Var2.c = obj;
                return kbr0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mmr0 mmr0Var = (mmr0) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(mmr0Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gbr0 gbr0Var = ((hbr0) mmr0Var.a).a;
                this.c = null;
                this.b = true;
                Object objN = this.d.n(gbr0Var, this.e, this.f, this);
                return objN == d9nVar ? d9nVar : objN;
            default:
                mmr0 mmr0Var2 = (mmr0) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gbr0 gbr0Var2 = (gbr0) mmr0Var2.a;
                this.c = null;
                this.b = true;
                Object objN2 = this.d.n(gbr0Var2, this.e, this.f, this);
                return objN2 == d9nVar ? d9nVar : objN2;
        }
    }
}
