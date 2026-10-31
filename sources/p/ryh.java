package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ryh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryh(String str, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = str;
        this.d = qim0Var;
        this.c = z;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        boolean z = this.c;
        String str = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                xap1.a(czo1.p(i | 1), str, (b0k) obj, qim0Var, z);
                break;
            case 1:
                ((Number) obj2).intValue();
                y1a1.a(czo1.p(i | 1), str, (b0k) obj, qim0Var, z);
                break;
            case 2:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.d;
                int iP = czo1.p(1);
                sbl.d(this.e, iP, this.b, (b0k) obj, qim0Var2, this.c);
                break;
            case 3:
                ((Number) obj2).intValue();
                qim0 qim0Var3 = this.d;
                int iP2 = czo1.p(1);
                sbl.d(this.e, iP2, this.b, (b0k) obj, qim0Var3, this.c);
                break;
            case 4:
                ((Number) obj2).intValue();
                a8o.b(czo1.p(i | 1), str, (b0k) obj, qim0Var, z);
                break;
            case 5:
                ((Number) obj2).intValue();
                h0p1.h(czo1.p(i | 1), str, (b0k) obj, qim0Var, z);
                break;
            case 6:
                ((Number) obj2).intValue();
                vgo1.k(czo1.p(i | 1), str, (b0k) obj, qim0Var, z);
                break;
            default:
                ((Number) obj2).intValue();
                crn1.f(czo1.p(i | 1), str, (b0k) obj, qim0Var, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ryh(int i, String str, boolean z, qim0 qim0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = i;
        this.b = str;
        this.c = z;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ryh(String str, boolean z, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = z;
        this.d = qim0Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryh(boolean z, String str, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 6;
        this.c = z;
        this.b = str;
        this.d = qim0Var;
        this.e = i;
    }
}
