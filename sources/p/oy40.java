package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oy40 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ gbx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy40(String str, String str2, gbx gbxVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = gbxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gbx gbxVar = this.d;
        String str = this.c;
        String str2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                w361.b(str2, str, gbxVar, b0kVar, czo1.p(1));
                break;
            case 1:
                w361.c(str2, str, gbxVar, b0kVar, czo1.p(1));
                break;
            default:
                w361.d(str2, str, gbxVar, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
