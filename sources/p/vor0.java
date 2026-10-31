package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vor0 extends hab0 implements xu30 {
    public final /* synthetic */ bor0 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ vnr0 d;
    public final /* synthetic */ kor0 e;
    public final /* synthetic */ af5 f;
    public final /* synthetic */ a0e1 g;
    public final /* synthetic */ byte h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vor0(bor0 bor0Var, ven0 ven0Var, iu30 iu30Var, vnr0 vnr0Var, kor0 kor0Var, af5 af5Var, a0e1 a0e1Var, int i, boolean z, ven0 ven0Var2) {
        super(3);
        this.a = bor0Var;
        this.b = ven0Var;
        this.c = iu30Var;
        this.d = vnr0Var;
        this.e = kor0Var;
        this.f = af5Var;
        this.g = a0e1Var;
        this.h = i;
        this.i = z;
        this.t = ven0Var2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qim0 qim0Var;
        iu30 iu30Var;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        iu30 iu30Var2 = this.c;
        bor0 bor0Var = this.a;
        if (bor0Var != null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1610446694);
            ven0 ven0Var = this.b;
            boolean zI = x340Var2.i(ven0Var) | x340Var2.g(iu30Var2);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new i5r0(iu30Var2, ven0Var, (byte) 1);
                x340Var2.s0(objT);
            }
            iu30Var2 = (iu30) objT;
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1610555442);
            x340Var3.r(false);
        }
        iu30 iu30Var3 = iu30Var2;
        qim0 qim0Var2 = nim0.a;
        if (bor0Var != null) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(1610643234);
            boolean zG = x340Var4.g(this.d);
            Object objT2 = x340Var4.T();
            if (zG || objT2 == m4cVar) {
                objT2 = ern1.x(qim0Var2, new abh0(this.t, (byte) 22));
                x340Var4.s0(objT2);
            }
            qim0Var2 = (qim0) objT2;
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(1610755702);
            x340Var5.r(false);
        }
        kor0 kor0Var = this.e;
        if (kor0Var.d().a > 0.0f) {
            x340 x340Var6 = x340Var;
            x340Var6.i0(1610841882);
            qim0Var = qim0Var2;
            iu30Var = iu30Var3;
            wgo1.n(i2cVar, this.f, this.d, qim0Var, new phc1(((wat) x340Var6.k(t4k.h)).X0(kor0Var.d().a), 0.0f, 0, 1, (uw4) null, 22), this.g, this.h, this.i, iu30Var, x340Var6, (iIntValue & 14) | 32768, 0);
            x340Var6.r(false);
        } else {
            qim0Var = qim0Var2;
            iu30Var = iu30Var3;
            x340 x340Var7 = x340Var;
            x340Var7.i0(1611262800);
            x340Var7.r(false);
        }
        wgo1.n(i2cVar, this.f, this.d, qim0Var, null, this.g, this.h, this.i, iu30Var, x340Var, iIntValue & 14, 8);
        return rih1.a;
    }
}
