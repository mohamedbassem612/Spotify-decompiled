package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jxs extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ txs c;
    public final /* synthetic */ s5l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jxs(txs txsVar, s5l s5lVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = txsVar;
        this.d = s5lVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        s5l s5lVar = this.d;
        txs txsVar = this.c;
        switch (b) {
            case 0:
                return new jxs(txsVar, s5lVar, lnmVar, (byte) 0);
            default:
                return new jxs(txsVar, s5lVar, lnmVar, (byte) 1);
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
        s5l s5lVar = this.d;
        d9n d9nVar = d9n.a;
        txs txsVar = this.c;
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
                ixs ixsVar = new ixs(new pya(txsVar.a.c(), (byte) 3), txsVar, s5lVar, (byte) 0);
                this.b = true;
                Object objI = b5p1.i(ixsVar, this);
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
                ixs ixsVar2 = new ixs(new pya(txsVar.a.c(), (byte) 3), txsVar, s5lVar, (byte) 1);
                this.b = true;
                Object objI2 = b5p1.i(ixsVar2, this);
                return objI2 == d9nVar ? d9nVar : objI2;
        }
    }
}
