package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cu2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cu2(qim0 qim0Var, int i, boolean z, boolean z2, Integer num, int i2, int i3) {
        super(2);
        this.g = qim0Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.h = num;
        this.e = i2;
        this.f = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                int i2 = this.b;
                boolean z = this.c;
                boolean z2 = this.d;
                k4k.b((qim0) obj4, i2, z, z2, (Integer) obj3, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                int i3 = this.b;
                odf1.h((rdf1) obj4, i3, (nef1) obj3, this.c, this.d, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cu2(rdf1 rdf1Var, int i, nef1 nef1Var, boolean z, boolean z2, int i2, int i3) {
        super(2);
        this.g = rdf1Var;
        this.b = i;
        this.h = nef1Var;
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = i3;
    }
}
