package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p6k extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6k(ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(2);
        this.a = b;
        this.b = ven0Var;
        this.c = ven0Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        ven0 ven0Var2 = this.c;
        switch (b) {
            case 0:
                ven0Var.setValue((Object) null);
                ven0Var2.setValue(new mmr0((String) obj, (tv80) obj2));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                    boolean zG = x340Var2.g(ven0Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new xs3(ven0Var, ven0Var2, (byte) 15);
                        x340Var2.s0(objT);
                    }
                    iu30 iu30Var = (iu30) objT;
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = new abh0(ven0Var2, (byte) 19);
                        x340Var2.s0(objT2);
                    }
                    dm5.b(iu30Var, qim0VarD, (iu30) null, (iu30) objT2, (iu30) null, x340Var2, 3120, 20);
                }
                break;
            default:
                ven0Var2.setValue(new mmr0(Integer.valueOf(((Number) obj).intValue() - ((Number) ven0Var.getValue()).intValue()), Integer.valueOf(((Number) obj2).intValue() - ((Number) ven0Var.getValue()).intValue())));
                break;
        }
        return rih1Var;
    }
}
