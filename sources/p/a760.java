package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a760 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ nmo c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ q10 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a760(nmo nmoVar, q10 q10Var, float f, boolean z) {
        super(3);
        this.a = (byte) 2;
        this.c = nmoVar;
        this.e = q10Var;
        this.b = f;
        this.d = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nmo nmoVar = this.c;
        float f = this.b;
        et40 et40Var = et40.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                gt40 gt40VarE0 = dm5.e0(et40Var, f);
                String str = nmoVar.a;
                boolean z = this.d;
                q10 q10Var = this.e;
                poo1.a(str, gt40VarE0, z, q10Var, (String) null, 1, b0kVar, 0, 16);
                j2h1.b(eqr0.H(dm5.Q(dm5.J(et40Var), f), 16.0f, 0.0f, 0.0f, 0.0f, 14), ql3.f, apo.r(248269741, new gf(nmoVar, q10Var, f, (byte) 8), b0kVar), b0kVar, 384, 0);
                break;
            case 1:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                poo1.a(nmoVar.a, dm5.e0(et40Var, f), this.d, this.e, (String) null, 1, b0kVar2, 0, 16);
                j2h1.b(dm5.Q(dm5.J(et40Var), f), ql3.e, asi.a, b0kVar2, 384, 0);
                break;
            default:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                et40 et40Var2 = et40.a;
                gt40 gt40VarJ = dm5.J(et40Var2);
                float f2 = this.b;
                nmo nmoVar2 = this.c;
                boolean z2 = this.d;
                q10 q10Var2 = this.e;
                jch0.f(gt40VarJ, 0, apo.r(-1953480089, new a760(f2, nmoVar2, z2, q10Var2, (byte) 1), b0kVar3), b0kVar3, 3072, 6);
                f5p1.h(nmoVar2.c, nmoVar2.d, q10Var2, eqr0.H(et40Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), (kee1) null, (kee1) null, "TEST_TAG_HERO_TITLE", "TEST_TAG_HERO_SUBTITLE", 2, b0kVar3, 114819072, 48);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a760(float f, nmo nmoVar, boolean z, q10 q10Var, byte b) {
        super(3);
        this.a = b;
        this.b = f;
        this.c = nmoVar;
        this.d = z;
        this.e = q10Var;
    }
}
