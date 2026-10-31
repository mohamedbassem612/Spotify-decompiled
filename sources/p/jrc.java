package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jrc extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrc(float f, lee1 lee1Var, boolean z, int i) {
        super(2);
        this.b = f;
        this.d = lee1Var;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        boolean z = this.c;
        float f = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                t4n1.i(f, (lee1) obj3, z, b0kVar, czo1.p(1));
                break;
            default:
                zuo.a(f, z, (qim0) obj3, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrc(float f, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.b = f;
        this.c = z;
        this.d = qim0Var;
    }
}
