package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wdy extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zdy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wdy(zdy zdyVar, byte b) {
        super(3);
        this.a = b;
        this.b = zdyVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zdy zdyVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    xdy.a(zdyVar.c, zdyVar.o, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    String str = zdyVar.b;
                    boolean z2 = zdyVar.f;
                    boolean z3 = zdyVar.l;
                    if (zdyVar.k) {
                        x340Var4.i0(938604570);
                        boolean z4 = !((Boolean) x340Var4.k(xdy.a)).booleanValue();
                        x340Var4.r(false);
                        z = z4;
                    } else {
                        x340Var4.i0(-968028165);
                        x340Var4.r(false);
                        z = false;
                    }
                    xdy.b(str, z2, z3, z, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }
}
