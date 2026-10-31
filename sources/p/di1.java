package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class di1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ei1 b;
    public final /* synthetic */ fi1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di1(ei1 ei1Var, fi1 fi1Var, byte b) {
        super(2);
        this.a = b;
        this.b = ei1Var;
        this.c = fi1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fi1 fi1Var = this.c;
        ei1 ei1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c(ei1Var.b, new w27(l1d.m("spotify:show:", fi1Var.a)), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    otw.c(ei1Var.c, new rgx0(fi1Var.c, fi1Var.d, l1d.m("spotify:show:", fi1Var.a), l1d.m("spotify:episode:", fi1Var.b)), (qim0) null, (ipb1) null, x340Var4, 8, 12);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    otw.c(ei1Var.d, new hle(l1d.m("spotify:episode:", fi1Var.b), true), (qim0) null, (ipb1) null, x340Var6, 8, 12);
                }
                break;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    otw.c(ei1Var.e, new yh1(fi1Var.a, fi1Var.b, fi1Var.c, fi1Var.d, fi1Var.e), (qim0) null, (ipb1) null, x340Var8, 72, 12);
                }
                break;
            default:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else {
                    otw.c(ei1Var.f, new e591(fi1Var.c, fi1Var.d, fi1Var.a, fi1Var.b), (qim0) null, (ipb1) null, x340Var10, 8, 12);
                }
                break;
        }
        return rih1Var;
    }
}
