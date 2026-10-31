package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nd81 extends hab0 implements vu30 {
    public final /* synthetic */ i091 X;
    public final /* synthetic */ ubw0 Y;
    public final /* synthetic */ od81 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ he81 d;
    public final /* synthetic */ hob1 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ kd81 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ znb0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd81(od81 od81Var, float f, iu30 iu30Var, he81 he81Var, hob1 hob1Var, float f2, kd81 kd81Var, boolean z, boolean z2, znb0 znb0Var, i091 i091Var, ubw0 ubw0Var) {
        super(2);
        this.a = od81Var;
        this.b = f;
        this.c = iu30Var;
        this.d = he81Var;
        this.e = hob1Var;
        this.f = f2;
        this.g = kd81Var;
        this.h = z;
        this.i = z2;
        this.t = znb0Var;
        this.X = i091Var;
        this.Y = ubw0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            od81 od81Var = this.a;
            idd1 idd1Var = od81Var.f;
            idd1 idd1Var2 = od81Var.d;
            idd1 idd1Var3 = od81Var.c;
            idd1 idd1Var4 = od81Var.e;
            idd1 idd1Var5 = od81Var.g;
            yqg yqgVar = od81Var.m;
            qim0 qim0VarZ = uyn1.z(this.b, 0.0f, 2, nim0.a);
            iu30 iu30Var = this.c;
            boolean zG = x340Var2.g(iu30Var);
            he81 he81Var = this.d;
            boolean zI = zG | x340Var2.i(he81Var);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new jd81(iu30Var, he81Var, (byte) 2);
                x340Var2.s0(objT);
            }
            qim0 qim0VarW = jzn1.w(qim0VarZ, (iu30) objT, x340Var2);
            boolean zI2 = x340Var2.i(od81Var) | x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new et61(od81Var, iu30Var, (byte) 10);
                x340Var2.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            ubw0 ubw0Var = this.Y;
            boolean zI3 = x340Var2.i(ubw0Var) | x340Var2.i(he81Var);
            Object objT3 = x340Var2.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new c861(ubw0Var, he81Var, (byte) 28);
                x340Var2.s0(objT3);
            }
            rpo1.e(this.e, this.f, iu30Var2, this.g, idd1Var, idd1Var2, idd1Var3, idd1Var4, this.h, qim0VarW, this.i, (znb0) null, (znb0) null, false, this.t, (znb0) null, false, (znb0) null, idd1Var5, (znb0) null, yqgVar, this.X, false, (vu30) null, (String) null, (iu30) objT3, x340Var2, 0, 0, 30128128);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
