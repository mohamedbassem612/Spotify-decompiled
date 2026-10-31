package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kb90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mq20 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb90(mq20 mq20Var, boolean z, boolean z2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = mq20Var;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        mq20 mq20Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                nln.b(mq20Var, z2, z, b0kVar, czo1.p(i | 1));
                break;
            default:
                nln.m(mq20Var, z2, z, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
