package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x77 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b87 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x77(b87 b87Var, byte b) {
        super(4);
        this.a = b;
        this.b = b87Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        b87 b87Var = this.b;
        switch (b) {
            case 0:
                jjm0 jjm0Var = (jjm0) obj;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-771313946);
                ven0 ven0VarS = v8r.s((o77) obj2, x340Var);
                boolean zI = x340Var.i(ven0VarS);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new wd2(ven0VarS, (lnm) null, (byte) 1);
                    x340Var.s0(objT);
                }
                jjm0Var.a((zu30) objT, x340Var, (iIntValue << 3) & 112);
                u77 u77VarM = b87Var.m((o77) ven0VarS.getValue());
                x340Var.r(false);
                return u77VarM;
            default:
                ((Number) obj3).intValue();
                return b87Var.l((o77) obj);
        }
    }
}
