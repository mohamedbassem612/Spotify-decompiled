package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iob0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ pob0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ e9r e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iob0(pob0 pob0Var, long j, e9r e9rVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = pob0Var;
        this.d = j;
        this.e = e9rVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new iob0(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new iob0(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        e9r e9rVar = this.e;
        long j = this.d;
        d9n d9nVar = d9n.a;
        pob0 pob0Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    o95 o95Var = pob0Var.g;
                    Float f = new Float((-qui1.d(j)) / pob0Var.k.s());
                    this.b = true;
                    if (o95Var.a(f, e9rVar, (iu30) null, this) == d9nVar) {
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
            default:
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
                o95 o95Var2 = pob0Var.h;
                Float f2 = new Float((-qui1.e(j)) / pob0Var.k.s());
                this.b = true;
                Object objA = o95Var2.a(f2, e9rVar, (iu30) null, this);
                return objA == d9nVar ? d9nVar : objA;
        }
    }
}
