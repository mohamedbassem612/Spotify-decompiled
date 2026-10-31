package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cve extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ eve c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cve(boolean z, eve eveVar, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = eveVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        eve eveVar = this.c;
        boolean z = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (!z) {
                    x340Var2.i0(-828384146);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-828562892);
                    otw.c(eveVar.g, new rve(eveVar.b.a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    bzn1.e((qim0) null, nbi.a, false, apo.r(1369010132, new cve(z, eveVar, b2), x340Var4), rgr0.a, (ngr0) null, (ygr0) null, (Function0) null, x340Var4, 3120, 229);
                }
                break;
        }
        return rih1Var;
    }
}
