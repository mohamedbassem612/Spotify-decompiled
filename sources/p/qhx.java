package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qhx extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ hcx b;
    public final /* synthetic */ hux c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ c380 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhx(hcx hcxVar, hux huxVar, int i, boolean z, c380 c380Var) {
        super(2);
        this.b = hcxVar;
        this.c = huxVar;
        this.d = i;
        this.e = z;
        this.f = c380Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hcx hcxVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    hux huxVar = this.c;
                    if (huxVar != null) {
                        x340Var2.i0(-1409485959);
                        fc11.f(hcxVar, (qim0) null, apo.r(1357049298, new ozw(huxVar, hcxVar, (byte) 11), x340Var2), x340Var2, 384);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-744208216);
                        x340Var2.r(false);
                    }
                    int i = this.d;
                    if (huxVar != null) {
                        i--;
                    }
                    boolean z = this.e;
                    c380 c380Var = this.f;
                    boolean z2 = z && c380Var.size() > i && i > 0;
                    if (z2) {
                        i--;
                    }
                    x340Var2.i0(-1409472148);
                    Iterator it = o7h.d1(c380Var, i).iterator();
                    while (it.hasNext()) {
                        fc11.b((phx) it.next(), hcxVar, x340Var2, 0);
                    }
                    x340Var2.r(false);
                    if (!z2) {
                        x340Var2.i0(-743760824);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-743826172);
                        fc11.c(c380Var.size() - i, hcxVar, x340Var2, 0);
                        x340Var2.r(false);
                    }
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    Object objT = x340Var4.T();
                    if (objT == fkj0.X) {
                        objT = s8x.P0;
                        x340Var4.s0(objT);
                    }
                    bro1.c(hcxVar, i541.C(nim0.a, (iu30) objT), apo.r(-470739910, new qhx(this.c, this.b, this.d, this.e, this.f), x340Var4), x340Var4, 384);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhx(hux huxVar, hcx hcxVar, int i, boolean z, c380 c380Var) {
        super(2);
        this.c = huxVar;
        this.b = hcxVar;
        this.d = i;
        this.e = z;
        this.f = c380Var;
    }
}
