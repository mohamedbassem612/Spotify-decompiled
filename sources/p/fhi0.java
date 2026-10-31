package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fhi0 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ xtb0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ igi0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ hdn0 h;
    public final /* synthetic */ j2i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fhi0(float f, float f2, int i, xtb0 xtb0Var, boolean z, igi0 igi0Var, int i2, hdn0 hdn0Var, j2i j2iVar) {
        super(3);
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = xtb0Var;
        this.e = z;
        this.f = igi0Var;
        this.g = i2;
        this.h = hdn0Var;
        this.i = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ozr ozrVarN;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        float fD = ((i2c) obj).d() * this.a;
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        zzq0 zzq0VarH = uyn1.h(2, this.b, 0.0f);
        d36 d36Var = new d36(this.c, true, new um5(false));
        if (this.e) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-77734795);
            e9r e9rVarA = wxa1.a(x340Var2);
            boolean zG = x340Var2.g(e9rVarA);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new ozr(e9rVarA);
                x340Var2.s0(objT);
            }
            ozrVarN = (ozr) objT;
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-77657295);
            ozrVarN = pno1.n(this.d, x340Var3);
            x340Var3.r(false);
        }
        ozr ozrVar = ozrVarN;
        x340 x340Var4 = x340Var;
        igi0 igi0Var = this.f;
        boolean zI = x340Var4.i(igi0Var) | x340Var4.d(fD) | x340Var4.e(this.g) | x340Var4.i(this.h);
        j2i j2iVar = this.i;
        boolean zG2 = zI | x340Var4.g(j2iVar);
        Object objT2 = x340Var4.T();
        if (zG2 || objT2 == m4cVar) {
            ehi0 ehi0Var = new ehi0(igi0Var, fD, this.g, this.h, j2iVar);
            x340Var4.s0(ehi0Var);
            objT2 = ehi0Var;
        }
        s3o1.e(qim0VarF, this.d, zzq0VarH, d36Var, (pl3) null, ozrVar, (h3h1) null, (iu30) objT2, x340Var4, 0, 168);
        return rih1.a;
    }
}
