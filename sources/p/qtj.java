package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qtj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rtj b;
    public final /* synthetic */ j2i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtj(rtj rtjVar, j2i j2iVar, byte b) {
        super(2);
        this.a = b;
        this.b = rtjVar;
        this.c = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        rtj rtjVar = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Object value = b2p1.C(rtjVar.a, x340Var2).getValue();
                    if (value == null) {
                        x340Var2.i0(-1489057264);
                    } else {
                        x340Var2.i0(-1489057263);
                        j2iVar.J(value, rtjVar.d, x340Var2, 0);
                    }
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ld41 ld41VarG = sgc1.G(x340Var4);
                    if (!((Boolean) rtjVar.c.getValue()).booleanValue()) {
                        x340Var4.i0(-1797916401);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1798111484);
                        ld41VarG.c("ComposeConnectableUIHolder", apo.r(208131437, new qtj(rtjVar, j2iVar, b2), x340Var4), x340Var4, 54);
                        x340Var4.r(false);
                    }
                }
                break;
        }
        return rih1Var;
    }
}
