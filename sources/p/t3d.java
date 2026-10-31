package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t3d extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3d(a4d a4dVar, vg41 vg41Var, boolean z, boolean z2, v3d v3dVar, j2i j2iVar, dmw0 dmw0Var, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, int i) {
        super(2);
        this.e = a4dVar;
        this.f = vg41Var;
        this.b = z;
        this.c = z2;
        this.g = v3dVar;
        this.h = j2iVar;
        this.i = dmw0Var;
        this.t = vu30Var;
        this.X = iu30Var;
        this.Y = iu30Var2;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.Y;
        Object obj4 = this.t;
        Object obj5 = this.i;
        Object obj6 = this.X;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                boolean z2 = this.c;
                ((a4d) obj10).f((vg41) obj9, z, z2, (v3d) obj8, (j2i) obj7, (dmw0) obj5, (vu30) obj4, (iu30) obj6, (iu30) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z3 = this.b;
                boolean z4 = this.c;
                yxo1.e((cce) obj10, (o0i) obj9, (q9l1) obj8, (z0i) obj7, z3, z4, (z0i) obj5, (u7h) obj4, (ew50) obj6, (qim0) obj3, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                boolean z5 = this.b;
                boolean z6 = this.c;
                h7w.k((String) obj10, (String) obj9, z5, z6, (rq31) obj8, (tq31) obj7, (iu30) obj6, (yqg) obj5, (hlq) obj4, (slq) obj3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3d(String str, String str2, boolean z, boolean z2, rq31 rq31Var, tq31 tq31Var, iu30 iu30Var, yqg yqgVar, hlq hlqVar, slq slqVar, int i) {
        super(2);
        this.e = str;
        this.f = str2;
        this.b = z;
        this.c = z2;
        this.g = rq31Var;
        this.h = tq31Var;
        this.X = iu30Var;
        this.i = yqgVar;
        this.t = hlqVar;
        this.Y = slqVar;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3d(cce cceVar, o0i o0iVar, q9l1 q9l1Var, z0i z0iVar, boolean z, boolean z2, z0i z0iVar2, u7h u7hVar, ew50 ew50Var, qim0 qim0Var, int i) {
        super(2);
        this.e = cceVar;
        this.f = o0iVar;
        this.g = q9l1Var;
        this.h = z0iVar;
        this.b = z;
        this.c = z2;
        this.i = z0iVar2;
        this.t = u7hVar;
        this.X = ew50Var;
        this.Y = qim0Var;
        this.d = i;
    }
}
