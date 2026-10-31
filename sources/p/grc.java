package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class grc extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hux b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ grc(hux huxVar, String str, int i, byte b) {
        super(2);
        this.a = b;
        this.b = huxVar;
        this.c = str;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        String str = this.c;
        hux huxVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                t4n1.c(huxVar, str, b0kVar, czo1.p(b2 | 1));
                break;
            case 1:
                o2w.c(huxVar, str, b0kVar, czo1.p(b2 | 1));
                break;
            case 2:
                vyo1.g(huxVar, str, b0kVar, czo1.p(b2 | 1));
                break;
            case 3:
                zho1.g(huxVar, str, b0kVar, czo1.p(b2 | 1));
                break;
            case 4:
                eio1.f(huxVar, str, b0kVar, czo1.p(b2 | 1));
                break;
            case 5:
                a8o.h(huxVar, str, b0kVar, czo1.p(b2 | 1));
                break;
            case 6:
                z6p1.c(huxVar, str, b0kVar, czo1.p(b2 | 1));
                break;
            default:
                b9p1.d(huxVar, str, b0kVar, czo1.p(b2 | 1));
                break;
        }
        return rih1Var;
    }
}
