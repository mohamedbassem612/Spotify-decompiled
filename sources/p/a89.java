package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a89 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a89(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        switch (b) {
            case 0:
                String str = (String) obj;
                new a89(i, (lnm) obj3, (byte) 0).b = str;
                hm5.M(rih1Var);
                return str;
            default:
                String str2 = (String) obj2;
                new a89(i, (lnm) obj3, (byte) 1).b = str2;
                hm5.M(rih1Var);
                return str2;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                break;
            default:
                hm5.M(obj);
                break;
        }
        return str;
    }
}
