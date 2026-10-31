package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kik0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wik0 b;
    public final /* synthetic */ kak0 c;
    public final /* synthetic */ t4h1 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kik0(wik0 wik0Var, kak0 kak0Var, t4h1 t4h1Var, boolean z, byte b) {
        super(2);
        this.a = b;
        this.b = wik0Var;
        this.c = kak0Var;
        this.d = t4h1Var;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.e;
        t4h1 t4h1Var = this.d;
        kak0 kak0Var = this.c;
        wik0 wik0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    i1o1.e(wik0Var.Y, wik0.r(kak0Var, t4h1Var, z), wik0Var.a, (qim0) null, (ipb1) null, h2j.j, (xu30) null, 0, (xu30) null, x340Var2, 196608, 236);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    i1o1.e(wik0Var.Y, wik0.r(kak0Var, t4h1Var, z), wik0Var.a, (qim0) null, (ipb1) null, h2j.e, (xu30) null, 0, (xu30) null, x340Var4, 196608, 236);
                }
                break;
        }
        return rih1Var;
    }
}
