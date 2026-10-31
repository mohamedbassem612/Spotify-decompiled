package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vm20 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xvu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm20(xvu xvuVar, byte b) {
        super(5);
        this.a = b;
        switch (b) {
            case 1:
                this.b = xvuVar;
                super(5);
                break;
            default:
                ym20 ym20Var = ym20.b;
                this.b = xvuVar;
                break;
        }
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ksw kswVar = (ksw) obj;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                int i = (iIntValue & 6) == 0 ? (x340Var.g(kswVar) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? x340Var.g(obj2) : x340Var.i(obj2) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= x340Var.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 1171) != 1170)) {
                    x340Var2.b0();
                } else {
                    this.b.d.a(((i >> 3) & 112) | ((i << 6) & 896), ym20.b.get(obj2), x340Var2, kswVar, iu30Var);
                }
                break;
            default:
                ksw kswVar2 = (ksw) obj;
                tm20 tm20Var = (tm20) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var3.g(kswVar2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= x340Var3.g(tm20Var) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= x340Var3.i(iu30Var2) ? 256 : 128;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    x340Var4.b0();
                } else {
                    int i3 = tm20Var.c().c;
                    int i4 = i3 == 0 ? -1 : wm20.a[l1d.C(i3)];
                    wxn wxnVar = i4 != 1 ? i4 != 2 ? null : wxn.b : wxn.a;
                    yvg1 yvg1Var = new yvg1(kswVar2.c, tm20Var.c().a, wxnVar);
                    kiv kivVar = oi7.a;
                    xvu xvuVar = this.b;
                    mod.b(kivVar.a((gw70) xvuVar.g), apo.r(184132089, new uk20(tm20Var, xvuVar, iu30Var2, wxnVar, yvg1Var, (byte) 1), x340Var4), x340Var4, 56);
                }
                break;
        }
        return rih1Var;
    }
}
