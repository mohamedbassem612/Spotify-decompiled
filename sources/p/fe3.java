package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fe3 extends hab0 implements xu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ mic0 b;
    public final /* synthetic */ ee3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ yqg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe3(long j, mic0 mic0Var, ee3 ee3Var, boolean z, iu30 iu30Var, ven0 ven0Var, yqg yqgVar) {
        super(3);
        this.a = j;
        this.b = mic0Var;
        this.c = ee3Var;
        this.d = z;
        this.e = iu30Var;
        this.f = ven0Var;
        this.g = yqgVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarE = zr7.E(x340Var, nim0Var);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        h2c h2cVar = h2c.a;
        op71.g(x340Var, dug.f(h2cVar.b(nim0Var), this.a, d4o1.a));
        op71.g(x340Var, dug.e(h2cVar.b(nim0Var), this.b, (hw61) null, 0.0f, 6));
        ven0 ven0Var = this.f;
        boolean zI = x340Var3.i(ven0Var);
        Object objT = x340Var3.T();
        if (zI || objT == fkj0.X) {
            objT = new xj0(ven0Var, (byte) 13);
            x340Var3.s0(objT);
        }
        c680.d(this.c, this.d, this.e, (iu30) objT, this.g, x340Var, 0);
        x340Var3.r(true);
        return rih1.a;
    }
}
