package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ai3 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;

    public /* synthetic */ ai3(j2i j2iVar) {
        this.a = (byte) 1;
        this.b = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.b;
        x340 x340Var = (b0k) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                gi3.b(czo1.p(439), j2iVar, x340Var);
                break;
            case 1:
                int iIntValue = num.intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j2iVar.invoke(ew20.a, x340Var2, 6);
                }
                break;
            case 2:
                num.getClass();
                vno1.b(czo1.p(7), j2iVar, x340Var);
                break;
            case 3:
                num.getClass();
                ton1.g(czo1.p(7), j2iVar, x340Var);
                break;
            case 4:
                num.getClass();
                ly71.b(czo1.p(55), j2iVar, x340Var);
                break;
            default:
                num.getClass();
                cxm.n(czo1.p(1), j2iVar, x340Var);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ ai3(j2i j2iVar, int i, byte b) {
        this.a = b;
        this.b = j2iVar;
    }
}
