package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dex extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dex(rnu rnuVar, String str, Boolean bool, boolean z, nbb1 nbb1Var, boolean z2, iu30 iu30Var, xb10 xb10Var, qim0 qim0Var, yqi1 yqi1Var, rbb1 rbb1Var, int i) {
        super(2);
        this.g = rnuVar;
        this.h = str;
        this.i = bool;
        this.b = z;
        this.t = nbb1Var;
        this.c = z2;
        this.d = iu30Var;
        this.X = xb10Var;
        this.e = qim0Var;
        this.Y = yqi1Var;
        this.Z = rbb1Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        Object obj6 = this.t;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj3;
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                iu30 iu30Var = this.d;
                boolean z2 = this.c;
                i1k0.d(z, iu30Var, (qex) obj9, (lex) obj8, (hw61) obj7, (max) obj6, z2, (idn0) obj5, (ga80) obj4, this.e, j2iVar, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z3 = this.b;
                boolean z4 = this.c;
                iu30 iu30Var2 = this.d;
                qim0 qim0Var = this.e;
                ((rnu) obj9).b((String) obj8, (Boolean) obj7, z3, (nbb1) obj6, z4, iu30Var2, (xb10) obj5, qim0Var, (yqi1) obj4, (rbb1) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dex(boolean z, iu30 iu30Var, qex qexVar, lex lexVar, hw61 hw61Var, max maxVar, boolean z2, idn0 idn0Var, ga80 ga80Var, qim0 qim0Var, j2i j2iVar, int i) {
        super(2);
        this.b = z;
        this.d = iu30Var;
        this.g = qexVar;
        this.h = lexVar;
        this.i = hw61Var;
        this.t = maxVar;
        this.c = z2;
        this.X = idn0Var;
        this.Y = ga80Var;
        this.e = qim0Var;
        this.Z = j2iVar;
        this.f = i;
    }
}
