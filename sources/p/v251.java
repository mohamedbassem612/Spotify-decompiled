package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v251 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v251(z6d1 z6d1Var, int i, boolean z, boolean z2, e6d1 e6d1Var, f6d1 f6d1Var, iu30 iu30Var, int i2) {
        super(2);
        this.a = (byte) 2;
        this.b = z6d1Var;
        this.e = i;
        this.c = z;
        this.d = z2;
        this.f = e6d1Var;
        this.g = f6d1Var;
        this.h = iu30Var;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.i;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.c;
                boolean z2 = this.d;
                int i2 = this.e;
                y251.a((y7e1) obj5, z, z2, i2, (u251) obj4, (qim0) obj3, this.h, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP2 = czo1.p(i | 1);
                boolean z3 = this.c;
                boolean z4 = this.d;
                int i3 = this.e;
                y251.g((y7e1) obj5, z3, z4, i3, (u251) obj4, qim0Var, this.h, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                int i4 = this.e;
                boolean z5 = this.c;
                boolean z6 = this.d;
                zho1.d((z6d1) obj5, i4, z5, z6, (e6d1) obj4, (f6d1) obj3, this.h, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v251(y7e1 y7e1Var, boolean z, boolean z2, int i, u251 u251Var, qim0 qim0Var, iu30 iu30Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = y7e1Var;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = u251Var;
        this.g = qim0Var;
        this.h = iu30Var;
        this.i = i2;
    }
}
