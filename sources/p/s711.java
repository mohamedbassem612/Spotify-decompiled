package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s711 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ x711 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s711(x711 x711Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = x711Var;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new s711(this.c, lnmVar, (byte) 0);
            default:
                return new s711(this.c, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
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
                wzv0 wzv0Var = new wzv0(new h5y0(x711Var.i, (byte) 17), (byte) 9);
                this.b = true;
                Object objI = b5p1.i(wzv0Var, this);
                return objI == d9nVar ? d9nVar : objI;
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
                uop0 uop0Var = new uop0(x711Var.j, (byte) 29);
                this.b = true;
                Object objI2 = b5p1.i(uop0Var, this);
                return objI2 == d9nVar ? d9nVar : objI2;
        }
    }
}
