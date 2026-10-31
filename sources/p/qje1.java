package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qje1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qje1(j2i j2iVar, byte b) {
        super(3);
        this.a = b;
        this.b = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.b;
        switch (b) {
            case 0:
                j2iVar.invoke((ew20) obj, (b0k) obj2, Integer.valueOf((((Number) obj3).intValue() & 14) | 48));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j2iVar.invoke(x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var3, 0);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, nim0.a);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(hmb0.t1);
                } else {
                    x340Var5.v0();
                }
                nko1.H(mbhVarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                j2iVar.invoke(pbh.a, x340Var3, 6);
                x340Var5.r(true);
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
        }
    }
}
