package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cpb1 extends hab0 implements vu30 {
    public final /* synthetic */ short X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ maa b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ d0r d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ xu30 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ xu30 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cpb1(maa maaVar, Object obj, d0r d0rVar, koa0 koa0Var, qim0 qim0Var, vu30 vu30Var, xu30 xu30Var, int i, xu30 xu30Var2, int i2, int i3) {
        super(2);
        this.b = maaVar;
        this.c = obj;
        this.d = d0rVar;
        this.Y = koa0Var;
        this.e = qim0Var;
        this.f = vu30Var;
        this.g = xu30Var;
        this.h = i;
        this.i = xu30Var2;
        this.t = i2;
        this.X = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.t;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ipb1 ipb1Var = (ipb1) obj3;
                int iP = czo1.p(i | 1);
                short s = this.X;
                i1o1.e(this.b, this.c, this.d, this.e, ipb1Var, this.f, this.g, this.h, this.i, (b0k) obj, iP, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                short s2 = this.X;
                maa maaVar = this.b;
                Object obj4 = this.c;
                d0r d0rVar = this.d;
                i1o1.d(maaVar, obj4, d0rVar, (koa0) obj3, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP2, s2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cpb1(maa maaVar, Object obj, d0r d0rVar, qim0 qim0Var, ipb1 ipb1Var, vu30 vu30Var, xu30 xu30Var, int i, xu30 xu30Var2, int i2, int i3) {
        super(2);
        this.b = maaVar;
        this.c = obj;
        this.d = d0rVar;
        this.e = qim0Var;
        this.Y = ipb1Var;
        this.f = vu30Var;
        this.g = xu30Var;
        this.h = i;
        this.i = xu30Var2;
        this.t = i2;
        this.X = i3;
    }
}
