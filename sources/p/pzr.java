package p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pzr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h230 b;
    public final /* synthetic */ qzr c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ upb0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzr(qzr qzrVar, h230 h230Var, upb0 upb0Var, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.c = qzrVar;
        this.b = h230Var;
        this.f = upb0Var;
        this.d = iu30Var;
        this.e = qim0Var;
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
                    h230 h230Var = this.b;
                    qzr qzrVar = this.c;
                    irn1.u((qim0) null, apo.r(-914523514, new won(h230Var, iu30Var, qzrVar, (byte) 9), x340Var2), (vu30) null, u85Var, apo.r(2073943884, new jb1(h230Var, qzrVar, this.e, this.f, this.d, (byte) 12), x340Var2), x340Var2, 24624, 5);
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
                        objT = nvr.V0;
                        x340Var4.s0(objT);
                    }
                    dgo1.c("your_library_folder_compose_page", (iu30) objT, apo.r(813866195, new pzr(this.b, this.c, this.d, this.e, this.f, (byte) 0), x340Var4), x340Var4, 438);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1905998697, new pzr(this.b, this.c, this.d, this.e, this.f, (byte) 1), x340Var6), x340Var6, 3078, 6);
                }
                break;
            default:
                ((Number) obj2).intValue();
                this.c.a(this.b, this.f, this.d, this.e, (b0k) obj, czo1.p(3073));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pzr(h230 h230Var, qzr qzrVar, iu30 iu30Var, qim0 qim0Var, upb0 upb0Var, byte b) {
        super(2);
        this.a = b;
        this.b = h230Var;
        this.c = qzrVar;
        this.d = iu30Var;
        this.e = qim0Var;
        this.f = upb0Var;
    }
}
