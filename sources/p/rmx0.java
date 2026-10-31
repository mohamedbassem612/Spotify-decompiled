package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rmx0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ umx0 b;
    public final /* synthetic */ idd1 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rmx0(umx0 umx0Var, idd1 idd1Var, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = umx0Var;
        this.c = idd1Var;
        this.d = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uho uhoVar;
        byte b = this.a;
        qim0 qim0Var = nim0.a;
        iu30 iu30Var = this.d;
        idd1 idd1Var = this.c;
        umx0 umx0Var = this.b;
        rih1 rih1Var = null;
        rih1 rih1Var2 = rih1.a;
        switch (b) {
            case 0:
                nw31 nw31Var = (nw31) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(nw31Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var2.b0();
                } else {
                    String str = umx0Var.m;
                    if (str == null || ihc1.y0(str) || !nhc1.Y(str, "spotify:", false)) {
                        uhoVar = null;
                    } else {
                        String str2 = umx0Var.c;
                        Set set = s4b1.f;
                        if (uic.g(str2, blc0.de)) {
                            uhoVar = null;
                        } else {
                            uhoVar = new uho(umx0Var.d, umx0Var.m, oho.a, (nho) null, "", (Function0) null, 200);
                        }
                    }
                    if (uhoVar == null) {
                        x340Var2.i0(-515803979);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-515803978);
                        hon1.b((xho) idd1Var.getValue(), uhoVar, iu30Var, x340Var2, 8);
                        x340Var2.r(false);
                        rih1Var = rih1Var2;
                    }
                    if (rih1Var == null) {
                        x340Var2.i0(-2094840822);
                        op71.g(x340Var2, nw31Var.a(1.0f, qim0Var, true));
                    } else {
                        x340Var2.i0(-2094849967);
                    }
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    wcm wcmVar = umx0Var.u ? new wcm(umx0Var.d, (String) null, (String) null, rcm.a, (Function0) null, new z6v0(umx0Var, (byte) 24), false, (String) null, (String) null, 982) : null;
                    if (wcmVar == null) {
                        x340Var4.i0(-744596720);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-744596719);
                        hon1.a((idm) idd1Var.getValue(), wcmVar, iu30Var, x340Var4, 0);
                        x340Var4.r(false);
                        rih1Var = rih1Var2;
                    }
                    if (rih1Var == null) {
                        x340Var4.i0(-2102221032);
                        op71.g(x340Var4, u291.h(u291.v(qim0Var, 16.0f), 0.0f));
                    } else {
                        x340Var4.i0(-2102230270);
                    }
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var2;
    }
}
