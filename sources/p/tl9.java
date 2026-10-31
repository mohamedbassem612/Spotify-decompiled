package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tl9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ds9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl9(ds9 ds9Var) {
        super(2);
        this.a = (byte) 0;
        this.b = ds9Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ds9 ds9Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    otw.c(this.b, new as9(2), dug.f(u291.d(nim0.a, 1.0f), u7h.b, d4o1.a), (ipb1) null, x340Var2, 8, 8);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                boolean zY = x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    nm1 nm1Var = ds9Var.g;
                    i1o1.e(nm1Var, rih1Var2, (d0r) nm1Var.b, (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, x340Var4, 56, 252);
                } else {
                    x340Var4.b0();
                }
                return rih1Var2;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                boolean zY2 = x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2);
                rih1 rih1Var3 = rih1.a;
                if (zY2) {
                    otw.c(ds9Var.b, rih1Var3, (qim0) null, (ipb1) null, x340Var6, 56, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var3;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY3 = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                rih1 rih1Var4 = rih1.a;
                if (zY3) {
                    otw.c(ds9Var.c, rih1Var4, (qim0) null, (ipb1) null, x340Var8, 56, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var4;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                boolean zY4 = x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2);
                rih1 rih1Var5 = rih1.a;
                if (zY4) {
                    otw.c(ds9Var.d, rih1Var5, (qim0) null, (ipb1) null, x340Var10, 56, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var5;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tm tmVar = ds9Var.e;
                    String str = ds9Var.a.a.h;
                    if (str == null) {
                        str = "";
                    }
                    otw.c(tmVar, str, (qim0) null, (ipb1) null, x340Var12, 8, 12);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            default:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                boolean zY5 = x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2);
                rih1 rih1Var6 = rih1.a;
                if (zY5) {
                    otw.c(ds9Var.f, rih1Var6, (qim0) null, (ipb1) null, x340Var14, 56, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl9(ds9 ds9Var, byte b) {
        super(2);
        this.a = b;
        this.b = ds9Var;
    }
}
