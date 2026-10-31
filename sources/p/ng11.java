package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ng11 extends hab0 implements xu30 {
    public final /* synthetic */ kjn0 N0;
    public final /* synthetic */ fx O0;
    public final /* synthetic */ o921 P0;
    public final /* synthetic */ lb9 X;
    public final /* synthetic */ ti51 Y;
    public final /* synthetic */ tr00 Z;
    public final /* synthetic */ xtb0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ hh11 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ sve e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gw3 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ br0 i;
    public final /* synthetic */ ecd1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng11(xtb0 xtb0Var, long j, hh11 hh11Var, boolean z, sve sveVar, boolean z2, gw3 gw3Var, boolean z3, br0 br0Var, ecd1 ecd1Var, lb9 lb9Var, ti51 ti51Var, tr00 tr00Var, kjn0 kjn0Var, fx fxVar, o921 o921Var) {
        super(3);
        this.a = xtb0Var;
        this.b = j;
        this.c = hh11Var;
        this.d = z;
        this.e = sveVar;
        this.f = z2;
        this.g = gw3Var;
        this.h = z3;
        this.i = br0Var;
        this.t = ecd1Var;
        this.X = lb9Var;
        this.Y = ti51Var;
        this.Z = tr00Var;
        this.N0 = kjn0Var;
        this.O0 = fxVar;
        this.P0 = o921Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(vzq0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, vzq0Var.a(), 7);
            boolean zF = x340Var2.f(this.b);
            hh11 hh11Var = this.c;
            boolean zG = zF | x340Var2.g(hh11Var) | x340Var2.h(this.d);
            sve sveVar = this.e;
            boolean zG2 = zG | x340Var2.g(sveVar) | x340Var2.h(this.f);
            gw3 gw3Var = this.g;
            boolean zG3 = zG2 | x340Var2.g(gw3Var) | x340Var2.h(this.h);
            br0 br0Var = this.i;
            boolean zG4 = zG3 | x340Var2.g(br0Var);
            ecd1 ecd1Var = this.t;
            boolean zG5 = zG4 | x340Var2.g(ecd1Var);
            Object objT = x340Var2.T();
            if (zG5 || objT == fkj0.X) {
                objT = new mg11(hh11Var, this.d, this.f, this.h, this.b, this.X, this.Y, this.Z, sveVar, this.N0, this.O0, gw3Var, br0Var, ecd1Var, this.P0);
                x340Var2.s0(objT);
            }
            ujo1.d(qim0VarD, this.a, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 6, 504);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
