package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bw6 extends hab0 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ Object P0;
    public final /* synthetic */ Object Q0;
    public final /* synthetic */ Object R0;
    public final /* synthetic */ Object S0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ lik1 c;
    public final /* synthetic */ d0r d;
    public final /* synthetic */ iac0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw6(hw2 hw2Var, String str, lik1 lik1Var, vzq0 vzq0Var, hvp0 hvp0Var, xyf1 xyf1Var, d0r d0rVar, iac0 iac0Var, kkw0 kkw0Var, njm njmVar, r6h1 r6h1Var, wks wksVar, zob1 zob1Var, w6a1 w6a1Var, cm0 cm0Var, u7h u7hVar, b9u0 b9u0Var, Context context) {
        super(2);
        this.f = hw2Var;
        this.b = str;
        this.c = lik1Var;
        this.g = vzq0Var;
        this.h = hvp0Var;
        this.i = xyf1Var;
        this.d = d0rVar;
        this.e = iac0Var;
        this.t = kkw0Var;
        this.X = njmVar;
        this.Y = r6h1Var;
        this.Z = wksVar;
        this.N0 = zob1Var;
        this.O0 = w6a1Var;
        this.P0 = cm0Var;
        this.Q0 = u7hVar;
        this.R0 = b9u0Var;
        this.S0 = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.S0;
        Object obj4 = this.R0;
        Object obj5 = this.Q0;
        Object obj6 = this.P0;
        Object obj7 = this.O0;
        Object obj8 = this.N0;
        Object obj9 = this.Z;
        Object obj10 = this.Y;
        Object obj11 = this.X;
        Object obj12 = this.t;
        Object obj13 = this.i;
        Object obj14 = this.h;
        Object obj15 = this.g;
        Object obj16 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP = czo1.p(1);
                zmo1.b((su6) obj16, (em0) obj15, this.b, this.d, (yzc0) obj14, this.e, this.c, (PlayOrigin) obj13, (pbq) obj12, (u961) obj11, (mxa1) obj10, (g0p) obj9, (rg51) obj8, (e0p) obj7, (f0p) obj6, (d0p) obj5, (mw6) obj4, qim0Var, (b0k) obj, iP);
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    b6p1.c(48, 1, apo.r(814277062, new d9a1((hw2) obj16, this.b, this.c, (vzq0) obj15, (hvp0) obj14, (xyf1) obj13, this.d, this.e, (kkw0) obj12, (njm) obj11, (r6h1) obj10, (wks) obj9, (zob1) obj8, (w6a1) obj7, (cm0) obj6, (u7h) obj5, (b9u0) obj4, (Context) obj3), x340Var2), x340Var2, null);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw6(su6 su6Var, em0 em0Var, String str, d0r d0rVar, yzc0 yzc0Var, iac0 iac0Var, lik1 lik1Var, PlayOrigin playOrigin, pbq pbqVar, u961 u961Var, mxa1 mxa1Var, g0p g0pVar, rg51 rg51Var, e0p e0pVar, f0p f0pVar, d0p d0pVar, mw6 mw6Var, qim0 qim0Var, int i) {
        super(2);
        this.f = su6Var;
        this.g = em0Var;
        this.b = str;
        this.d = d0rVar;
        this.h = yzc0Var;
        this.e = iac0Var;
        this.c = lik1Var;
        this.i = playOrigin;
        this.t = pbqVar;
        this.X = u961Var;
        this.Y = mxa1Var;
        this.Z = g0pVar;
        this.N0 = rg51Var;
        this.O0 = e0pVar;
        this.P0 = f0pVar;
        this.Q0 = d0pVar;
        this.R0 = mw6Var;
        this.S0 = qim0Var;
    }
}
