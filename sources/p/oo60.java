package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oo60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo60(un60 un60Var, gbx gbxVar, wj31 wj31Var, boolean z, boolean z2, boolean z3, int i) {
        super(2);
        this.f = un60Var;
        this.g = gbxVar;
        this.h = wj31Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                so60.b((un60) obj5, (gbx) obj4, (wj31) obj3, this.b, this.c, this.d, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                u4p1.h((ew71) obj5, (ew71) obj4, z, z2, z3, (iu30) obj3, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                whm1.a((i2c) obj5, (wj41) obj4, (ycl1) obj3, this.b, this.c, this.d, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo60(i2c i2cVar, wj41 wj41Var, ycl1 ycl1Var, boolean z, boolean z2, boolean z3, int i) {
        super(2);
        this.f = i2cVar;
        this.g = wj41Var;
        this.h = ycl1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo60(ew71 ew71Var, ew71 ew71Var2, boolean z, boolean z2, boolean z3, iu30 iu30Var, int i) {
        super(2);
        this.f = ew71Var;
        this.g = ew71Var2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.h = iu30Var;
        this.e = i;
    }
}
