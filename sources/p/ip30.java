package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ip30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdk b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip30(hdk hdkVar, long j, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hdkVar;
        this.c = j;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        long j = this.c;
        hdk hdkVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                z47.b(hdkVar, j, b0kVar, czo1.p(i | 1));
                break;
            default:
                z47.e(hdkVar, j, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
