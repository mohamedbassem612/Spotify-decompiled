package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class daa1 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ tob1 e;
    public final /* synthetic */ j2i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daa1(boolean z, qim0 qim0Var, long j, long j2, tob1 tob1Var, j2i j2iVar) {
        super(2);
        this.a = z;
        this.b = qim0Var;
        this.c = j;
        this.d = j2;
        this.e = tob1Var;
        this.f = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        qim0 qim0VarQ;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            tob1 tob1Var = this.e;
            boolean z = this.a;
            qim0 qim0Var = this.b;
            if (z) {
                qim0VarQ = exd0.q(qim0Var, new qna((byte) 19, ((u7h) tob1Var.getValue()).a, this.c));
            } else {
                qim0VarQ = exd0.q(qim0Var, new faa1(this.d, ((u7h) tob1Var.getValue()).a, this.c));
            }
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarQ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            dv20.l(0, this.f, x340Var2, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
