package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g5w extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;
    public final /* synthetic */ e5w c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5w(el9 el9Var, e5w e5wVar, byte b) {
        super(2);
        this.a = b;
        this.b = el9Var;
        this.c = e5wVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        e5w e5wVar = this.c;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    i1o1.e((m4o) el9Var.t, new b4o(e5wVar.a), el9Var.b, (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, x340Var2, 0, 252);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    i1o1.e((m4o) el9Var.t, new b4o(e5wVar.a), el9Var.b, (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, x340Var4, 0, 252);
                }
                break;
        }
        return rih1Var;
    }
}
