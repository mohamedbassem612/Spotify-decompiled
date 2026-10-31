package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yn8 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bo8 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn8(bo8 bo8Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = bo8Var;
        this.c = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.c;
        bo8 bo8Var = this.b;
        switch (b) {
            case 0:
                return new yn8(bo8Var, str, lnmVar, (byte) 0);
            default:
                return new yn8(bo8Var, str, lnmVar, (byte) 1);
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
        String str = this.c;
        bo8 bo8Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                return bo8Var.d.a(str);
            default:
                hm5.M(obj);
                return f971.b(bo8Var.c, str, (String) null);
        }
    }
}
