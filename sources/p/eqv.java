package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eqv extends hab0 implements vu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ cqs0 Z;
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ vqv b;
    public final /* synthetic */ de21 c;
    public final /* synthetic */ ftv d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ftv f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ru31 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqv(vqv vqvVar, de21 de21Var, ftv ftvVar, int i, ftv ftvVar2, boolean z, ru31 ru31Var, boolean z2, boolean z3, boolean z4, eu31 eu31Var, cqs0 cqs0Var, int i2) {
        super(2);
        this.b = vqvVar;
        this.c = de21Var;
        this.d = ftvVar;
        this.e = i;
        this.f = ftvVar2;
        this.g = z;
        this.h = ru31Var;
        this.i = z2;
        this.t = z3;
        this.X = z4;
        this.Y = eu31Var;
        this.Z = cqs0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c(this.h, new fu31(this.e, this.d, this.f, this.g, this.i, this.t, (eu31) obj3, this.X, apo.r(77642961, new dqv(this.b, this.c), x340Var2), this.Z), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                this.b.d(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (eu31) obj3, this.Z, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nqm0 nqm0Var = (nqm0) obj3;
                    ftv ftvVar = this.d;
                    eu31 eu31Var = null;
                    if (nqm0Var != null) {
                        if (!nqm0Var.a.equals(ftvVar.a)) {
                            nqm0Var = null;
                        }
                        if (nqm0Var != null) {
                            eu31Var = new eu31(nqm0Var.d, nqm0Var.c);
                        }
                    }
                    this.b.d(this.c, ftvVar, this.e, this.f, this.g, this.h, this.i, this.t, this.X, eu31Var, this.Z, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqv(nqm0 nqm0Var, vqv vqvVar, de21 de21Var, ftv ftvVar, int i, ftv ftvVar2, boolean z, ru31 ru31Var, boolean z2, boolean z3, boolean z4, cqs0 cqs0Var) {
        super(2);
        this.Y = nqm0Var;
        this.b = vqvVar;
        this.c = de21Var;
        this.d = ftvVar;
        this.e = i;
        this.f = ftvVar2;
        this.g = z;
        this.h = ru31Var;
        this.i = z2;
        this.t = z3;
        this.X = z4;
        this.Z = cqs0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqv(ru31 ru31Var, int i, ftv ftvVar, ftv ftvVar2, boolean z, boolean z2, boolean z3, eu31 eu31Var, boolean z4, cqs0 cqs0Var, vqv vqvVar, de21 de21Var) {
        super(2);
        this.h = ru31Var;
        this.e = i;
        this.d = ftvVar;
        this.f = ftvVar2;
        this.g = z;
        this.i = z2;
        this.t = z3;
        this.Y = eu31Var;
        this.X = z4;
        this.Z = cqs0Var;
        this.b = vqvVar;
        this.c = de21Var;
    }
}
