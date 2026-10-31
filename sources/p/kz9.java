package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kz9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jlw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz9(jlw0 jlw0Var, byte b) {
        super(2);
        this.a = b;
        this.b = jlw0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jlw0 jlw0Var = this.b;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarD = u291.d(anm1.N("background.with.sticker.sticker", nim0Var), 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    l2p1.d(jlw0Var, uyn1.z(12.0f, 0.0f, 2, qim0VarD), x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qim0 qim0VarD2 = u291.d(anm1.N("entity.share.sticker", nim0Var), 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    l2p1.d(jlw0Var, uyn1.z(12.0f, 0.0f, 2, qim0VarD2), x340Var4, 0);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var6).b;
                    w361.e(jlw0Var, uyn1.z(12.0f, 0.0f, 2, qim0VarD3), x340Var6, 0);
                }
                break;
        }
        return rih1Var;
    }
}
