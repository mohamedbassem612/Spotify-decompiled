package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d6a extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6a(int i, ceo ceoVar) {
        super(2);
        this.b = i;
        this.c = ceoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                long j = ((yr80) obj).a;
                long j2 = ((yr80) obj2).a;
                return gex0.c(i, (ceo) obj3);
            default:
                ((Number) obj2).intValue();
                fc11.c(i, (hcx) obj3, (b0k) obj, czo1.p(1));
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6a(int i, hcx hcxVar, int i2) {
        super(2);
        this.b = i;
        this.c = hcxVar;
    }
}
