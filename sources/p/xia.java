package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xia extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xia() {
        super(5, (lnm) null);
        this.a = (byte) 2;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 5;
        switch (b) {
            case 0:
                if (obj3 != null) {
                    bhn0.d();
                    return null;
                }
                new xia(i, (lnm) obj5, (byte) 0).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                new xia(i, (lnm) obj5, (byte) 1).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                new xia(i, (lnm) obj5, (byte) 2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                new xia(i, (lnm) obj5, (byte) 3).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                new xia(i, (lnm) obj5, (byte) 4).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                break;
            case 1:
                hm5.M(obj);
                break;
            case 2:
                hm5.M(obj);
                break;
            case 3:
                hm5.M(obj);
                break;
            default:
                hm5.M(obj);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xia(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
