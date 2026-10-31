package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f0b extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ g0b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0b(g0b g0bVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = g0bVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        g0b g0bVar = this.c;
        switch (b) {
            case 0:
                return new f0b(g0bVar, lnmVar, (byte) 0);
            default:
                return new f0b(g0bVar, lnmVar, (byte) 1);
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
        ddd1 ddd1Var = ddd1.i;
        g0b g0bVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
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
                xyc0 xyc0Var = g0bVar.d;
                String str = g0bVar.f;
                this.b = true;
                Object objU = xyc0Var.u(str, ddd1Var, this);
                return objU == d9nVar ? d9nVar : objU;
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
                xyc0 xyc0Var2 = g0bVar.d;
                String str2 = g0bVar.f;
                this.b = true;
                Object objU2 = xyc0Var2.u(str2, ddd1Var, this);
                return objU2 == d9nVar ? d9nVar : objU2;
        }
    }
}
