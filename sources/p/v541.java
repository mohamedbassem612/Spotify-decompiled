package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v541 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q541 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v541(q541 q541Var, int i, String str, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = q541Var;
        this.c = i;
        this.d = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        int i = this.c;
        q541 q541Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                nb51.b(q541Var, i, str, b0kVar, czo1.p(1));
                break;
            default:
                nb51.b(q541Var, i, str, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
