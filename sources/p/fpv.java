package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fpv extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ short g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fpv(fcf0 fcf0Var, qim0 qim0Var, boolean z, boolean z2, bcf0 bcf0Var, int i, ddf0 ddf0Var, tl3 tl3Var, j6m j6mVar, int i2, int i3, int i4) {
        super(2);
        this.i = fcf0Var;
        this.b = qim0Var;
        this.c = z;
        this.d = z2;
        this.t = bcf0Var;
        this.e = i;
        this.X = ddf0Var;
        this.Y = tl3Var;
        this.Z = j6mVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        Object obj6 = this.t;
        Object obj7 = this.i;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                max maxVar = (max) obj4;
                lee1 lee1Var = (lee1) obj3;
                String str = (String) obj5;
                int iP = czo1.p(this.h | 1);
                short s = this.g;
                int i = this.e;
                eqn1.e((y7e1) obj7, i, (String) obj6, this.f, this.b, maxVar, this.c, this.d, lee1Var, str, (b0k) obj, iP, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.f | 1);
                int iP3 = czo1.p(this.g);
                int i2 = this.h;
                qim0 qim0Var = this.b;
                boolean z = this.c;
                boolean z2 = this.d;
                int i3 = this.e;
                mp10.f((fcf0) obj7, qim0Var, z, z2, (bcf0) obj6, i3, (ddf0) obj5, (tl3) obj4, (j6m) obj3, (b0k) obj, iP2, iP3, i2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fpv(y7e1 y7e1Var, int i, String str, int i2, qim0 qim0Var, max maxVar, boolean z, boolean z2, lee1 lee1Var, String str2, int i3, int i4) {
        super(2);
        this.i = y7e1Var;
        this.e = i;
        this.t = str;
        this.f = i2;
        this.b = qim0Var;
        this.Y = maxVar;
        this.c = z;
        this.d = z2;
        this.Z = lee1Var;
        this.X = str2;
        this.h = i3;
        this.g = i4;
    }
}
