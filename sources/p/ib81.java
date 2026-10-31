package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ib81 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s24 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib81(s24 s24Var, byte b) {
        super(3);
        this.a = b;
        this.b = s24Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        s24 s24Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(str) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var2.b0();
                } else {
                    otw.c((hho) ((idd1) s24Var.X).getValue(), new uho(str, null, null, kho.a, null, null, 246), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                }
                break;
            case 1:
                String str2 = (String) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.g(str2) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var4.b0();
                } else {
                    otw.c((luu) ((idd1) s24Var.Y).getValue(), new duu(str2), (qim0) null, (ipb1) null, x340Var4, 8, 12);
                }
                break;
            default:
                String str3 = (String) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var5.g(str3) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x340Var6.b0();
                } else {
                    otw.c((ly1) ((idd1) s24Var.N0).getValue(), new ky1(str3), (qim0) null, (ipb1) null, x340Var6, 8, 12);
                }
                break;
        }
        return rih1Var;
    }
}
