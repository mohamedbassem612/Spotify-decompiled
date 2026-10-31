package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cxj extends hab0 implements zu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ dw91 d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxj(String str, float f, float f2, dw91 dw91Var, j2i j2iVar, int i) {
        super(4);
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = dw91Var;
        this.e = j2iVar;
        this.f = i;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 129) != 128)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(Float.MAX_VALUE, x340Var2);
            }
            drr0 drr0Var = (drr0) objT;
            String str = this.a;
            boolean zG = x340Var2.g(str);
            Object objT2 = x340Var2.T();
            dw91 dw91Var = this.d;
            if (zG || objT2 == m4cVar) {
                objT2 = new puh(dw91Var, str, (byte) 23);
                x340Var2.s0(objT2);
            }
            qxd0.i(str, (iu30) objT2, x340Var2);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).a.c;
            qim0 qim0VarX = lrn1.x(nim0.a, 3.0f);
            boolean zG2 = x340Var2.g(str);
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new o0d(dw91Var, str, drr0Var, (byte) 17);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarX2 = ern1.x(qim0VarX, (iu30) objT3);
            float f = this.b;
            boolean zD = x340Var2.d(f);
            float f2 = this.c;
            boolean zD2 = zD | x340Var2.d(f2);
            Object objT4 = x340Var2.T();
            if (zD2 || objT4 == m4cVar) {
                objT4 = new axj(f, f2, drr0Var);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarC = i541.C(qim0VarX2, (iu30) objT4);
            boolean zD3 = x340Var2.d(f) | x340Var2.d(f2) | x340Var2.f(j);
            Object objT5 = x340Var2.T();
            if (zD3 || objT5 == m4cVar) {
                bxj bxjVar = new bxj(this.b, this.c, j, drr0Var);
                x340Var2.s0(bxjVar);
                objT5 = bxjVar;
            }
            qim0 qim0VarF = dug.f(exd0.q(qim0VarC, (iu30) objT5), j, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            this.e.J(str, Integer.valueOf(this.f), x340Var2, 0);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
