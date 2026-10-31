package p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p1t extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kns b;
    public final /* synthetic */ jwm1 c;
    public final /* synthetic */ mxr d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ upb0 f;
    public final /* synthetic */ iu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1t(kns knsVar, jwm1 jwm1Var, mxr mxrVar, qim0 qim0Var, upb0 upb0Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = knsVar;
        this.c = jwm1Var;
        this.d = mxrVar;
        this.e = qim0Var;
        this.f = upb0Var;
        this.g = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    WeakHashMap weakHashMap = osl1.x;
                    u85 u85Var = lhc.g(x340Var2).g;
                    kns knsVar = this.b;
                    jwm1 jwm1Var = this.c;
                    irn1.u((qim0) null, apo.r(-1520535606, new o1t(knsVar, jwm1Var, (byte) 0), x340Var2), (vu30) null, u85Var, apo.r(1718371268, new jb1(jwm1Var, this.d, this.e, this.f, this.g, (byte) 13), x340Var2), x340Var2, 24624, 5);
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
                        objT = d0t.N0;
                        x340Var4.s0(objT);
                    }
                    dgo1.c("your_library_search_page", (iu30) objT, apo.r(-1919708387, new p1t(this.b, this.c, this.d, this.e, this.f, this.g, (byte) 0), x340Var4), x340Var4, 438);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1759218727, new p1t(this.b, this.c, this.d, this.e, this.f, this.g, (byte) 1), x340Var6), x340Var6, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
