package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gvb extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gvb(String str, String str2, float f, qim0 qim0Var, u7h u7hVar, boolean z, int i, int i2) {
        super(2);
        this.g = str;
        this.h = str2;
        this.b = f;
        this.c = qim0Var;
        this.i = u7hVar;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                boolean z = this.d;
                float f = this.b;
                qim0 qim0Var2 = this.c;
                mp10.c((otn0) obj5, z, f, qim0Var2, (qim0) obj4, qim0Var, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                float f2 = this.b;
                qim0 qim0Var3 = this.c;
                w2g0.k((String) obj5, (String) obj4, f2, qim0Var3, (u7h) obj3, this.d, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gvb(otn0 otn0Var, boolean z, float f, qim0 qim0Var, qim0 qim0Var2, qim0 qim0Var3, int i, int i2) {
        super(2);
        this.g = otn0Var;
        this.d = z;
        this.b = f;
        this.c = qim0Var;
        this.h = qim0Var2;
        this.i = qim0Var3;
        this.e = i;
        this.f = i2;
    }
}
