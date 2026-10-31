package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class upv extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vpv b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ jwq d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upv(vpv vpvVar, tob1 tob1Var, jwq jwqVar, ven0 ven0Var) {
        super(2);
        this.b = vpvVar;
        this.c = tob1Var;
        this.d = jwqVar;
        this.e = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.e;
        jwq jwqVar = this.d;
        tob1 tob1Var = this.c;
        vpv vpvVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c((maa) tob1Var.getValue(), new dee(Uri.parse((String) ven0Var.getValue()), vpvVar.e.b, jwqVar.d, jwqVar.e), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    boolean zI = x340Var4.i(vpvVar);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new tpv(vpvVar, (byte) 1);
                        x340Var4.s0(objT);
                    }
                    dgo1.c("change-playlist-cover-art", (iu30) objT, apo.r(1933134589, new upv(tob1Var, jwqVar, vpvVar, ven0Var), x340Var4), x340Var4, 390);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upv(tob1 tob1Var, jwq jwqVar, vpv vpvVar, ven0 ven0Var) {
        super(2);
        this.c = tob1Var;
        this.d = jwqVar;
        this.b = vpvVar;
        this.e = ven0Var;
    }
}
