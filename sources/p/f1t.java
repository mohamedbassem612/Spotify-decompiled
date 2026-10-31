package p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f1t extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qvm1 b;
    public final /* synthetic */ g1t c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ hlu f;
    public final /* synthetic */ upb0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1t(qvm1 qvm1Var, g1t g1tVar, iu30 iu30Var, qim0 qim0Var, hlu hluVar, upb0 upb0Var, byte b) {
        super(2);
        this.a = b;
        this.b = qvm1Var;
        this.c = g1tVar;
        this.d = iu30Var;
        this.e = qim0Var;
        this.f = hluVar;
        this.g = upb0Var;
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
                    WeakHashMap weakHashMap = osl1.x;
                    u85 u85Var = lhc.g(x340Var2).g;
                    iu30 iu30Var = this.d;
                    qvm1 qvm1Var = this.b;
                    g1t g1tVar = this.c;
                    irn1.u((qim0) null, apo.r(69644328, new won(qvm1Var, iu30Var, g1tVar, (byte) 16), x340Var2), (vu30) null, u85Var, apo.r(1930054818, new mse(qvm1Var, g1tVar, this.e, this.f, this.g, this.d, (byte) 1), x340Var2), x340Var2, 24624, 5);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    Object objT = x340Var4.T();
                    if (objT == fkj0.X) {
                        objT = d0t.g;
                        x340Var4.s0(objT);
                    }
                    dgo1.c("your_library_root_page", (iu30) objT, apo.r(-1997322437, new f1t(this.b, this.c, this.d, this.e, this.f, this.g, (byte) 0), x340Var4), x340Var4, 438);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-624516361, new f1t(this.b, this.c, this.d, this.e, this.f, this.g, (byte) 1), x340Var6), x340Var6, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
