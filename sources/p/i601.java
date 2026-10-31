package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i601 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j601 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ o501 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ e601 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i601(j601 j601Var, boolean z, o501 o501Var, boolean z2, e601 e601Var, byte b) {
        super(2);
        this.a = b;
        this.b = j601Var;
        this.c = z;
        this.d = o501Var;
        this.e = z2;
        this.f = e601Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qsw.c(new obk1(this.b.t), apo.r(-599882867, new pa0(this.c, this.d, this.e, this.f), x340Var2), x340Var2, 48);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    kiv kivVar = oi7.a;
                    j601 j601Var = this.b;
                    mod.b(kivVar.a(j601Var.a), apo.r(-2134784148, new i601(j601Var, this.c, this.d, this.e, this.f, (byte) 0), x340Var4), x340Var4, 56);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-183626708, new i601(this.b, this.c, this.d, this.e, this.f, (byte) 1), x340Var6), x340Var6, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
