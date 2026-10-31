package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dhs0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhs0(int i, String str, String str2, int i2) {
        super(2);
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        String str2 = this.c;
        int i = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                rqo1.o(i, czo1.p(1), str2, str, b0kVar);
                break;
            default:
                boo1.d(i, czo1.p(1), str2, str, b0kVar);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhs0(String str, String str2, int i, int i2) {
        super(2);
        this.c = str;
        this.d = str2;
        this.b = i;
    }
}
