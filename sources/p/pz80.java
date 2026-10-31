package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pz80 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ qz80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz80(qz80 qz80Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = qz80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new pz80(this.c, lnmVar, (byte) 0);
            default:
                return new pz80(this.c, lnmVar, (byte) 1);
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
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.c.c();
                    qz80 qz80Var = this.c;
                    this.b = true;
                    ohd ohdVar = new ohd(1, aym.t(this));
                    ohdVar.t();
                    synchronized (qz80Var.c) {
                        qz80Var.d = (byte) 20;
                        qz80Var.f = ohdVar;
                    }
                    ohdVar.n(new ux70(qz80Var, (byte) 15));
                    if (ohdVar.r() == d9nVar) {
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
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    qz80 qz80Var2 = this.c;
                    this.b = true;
                    qz80Var2.getClass();
                    if (rc2.O(5000L, new pz80(qz80Var2, lnmVar, (byte) 0), this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }
}
