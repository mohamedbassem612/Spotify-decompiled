package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xor extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ zor c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xor(zor zorVar, String str, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = zorVar;
        this.d = str;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new xor(this.c, this.d, lnmVar, (byte) 0);
            default:
                return new xor(this.c, this.d, lnmVar, (byte) 1);
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
        String str = this.d;
        zor zorVar = this.c;
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
                c3l c3lVar = zorVar.a;
                this.b = true;
                Object objE = c3lVar.e(str, this);
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
                c3l c3lVar2 = zorVar.a;
                this.b = true;
                Object objE2 = c3lVar2.e(str, this);
                return objE2 == d9nVar ? d9nVar : objE2;
        }
    }
}
