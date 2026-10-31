package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t711 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ x711 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t711(x711 x711Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = x711Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new t711(this.c, lnmVar, (byte) 0);
            default:
                return new t711(this.c, lnmVar, (byte) 1);
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
        x711 x711Var = this.c;
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
                l5d0 l5d0Var = x711Var.b;
                s711 s711Var = new s711(x711Var, null, (byte) 0);
                this.b = true;
                Object objE = l5d0Var.e(h5d0.X, s711Var, this);
                return objE == d9nVar ? d9nVar : objE;
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
                l5d0 l5d0Var2 = x711Var.b;
                s711 s711Var2 = new s711(x711Var, null, (byte) 1);
                this.b = true;
                Object objE2 = l5d0Var2.e(h5d0.i, s711Var2, this);
                return objE2 == d9nVar ? d9nVar : objE2;
        }
    }
}
