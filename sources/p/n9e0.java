package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n9e0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9e0(int i, long j, String str, int i2) {
        super(2);
        this.c = i;
        this.d = j;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(391);
                u4p1.j(this.c, iP, this.d, this.b, (b0k) obj);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                j7p1.h(this.c, iP2, this.d, this.b, (b0k) obj);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9e0(String str, int i, long j, int i2) {
        super(2);
        this.b = str;
        this.c = i;
        this.d = j;
    }
}
