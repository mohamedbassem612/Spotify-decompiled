package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kfx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gw70 b;
    public final /* synthetic */ yyr c;
    public final /* synthetic */ zu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kfx(gw70 gw70Var, yyr yyrVar, zu30 zu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = gw70Var;
        this.c = yyrVar;
        this.d = zu30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zu30 zu30Var = this.d;
        yyr yyrVar = this.c;
        gw70 gw70Var = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    mod.b(oi7.a.a(gw70Var), apo.r(-1996220960, new ozw(yyrVar, zu30Var, (byte) 7), x340Var2), x340Var2, 56);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-218840416, new kfx(gw70Var, yyrVar, zu30Var, objArr == true ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
