package p;

import com.spotify.nowplaying.scroll.container.ScrollCardsContainer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kz2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nz2 b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz2(nz2 nz2Var, tob1 tob1Var, byte b) {
        super(2);
        this.a = b;
        this.b = nz2Var;
        this.c = tob1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.c;
        nz2 nz2Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    rin0 rin0Var = (rin0) tob1Var.getValue();
                    if (rin0Var instanceof rin0) {
                        x340Var2.i0(-1888962164);
                        xfx xfxVar = nz2Var.e;
                        cce cceVar = nz2Var.f;
                        sp00 sp00Var = nz2Var.g;
                        v1k v1kVar = nz2Var.h;
                        v1k v1kVar2 = nz2Var.i;
                        FlowableObserveOn flowableObserveOn = nz2Var.t;
                        fbm fbmVar = nz2Var.X;
                        eyh0 eyh0Var = nz2Var.Y;
                        v1r0 v1r0Var = ((z4p0) nz2Var.e1.getValue()).f;
                        h72 h72Var = nz2Var.N0;
                        u961 u961Var = nz2Var.O0;
                        FlowableMap flowableMap = nz2Var.P0;
                        oj80 oj80Var = nz2Var.Q0;
                        boolean zB = nz2Var.R0.b();
                        kp5 kp5Var = nz2Var.S0;
                        uy2 uy2Var = nz2Var.T0;
                        ScrollCardsContainer scrollCardsContainer = nz2Var.a1;
                        if (scrollCardsContainer == null) {
                            u890.C("scrollCardsContainer");
                            throw null;
                        }
                        xto.a(rin0Var, xfxVar, cceVar, sp00Var, v1kVar, v1kVar2, flowableObserveOn, fbmVar, eyh0Var, v1r0Var, h72Var, u961Var, flowableMap, oj80Var, zB, kp5Var, uy2Var, scrollCardsContainer, (qim0) null, nz2Var.Y0, x340Var2, 4608);
                        x340Var2.r(false);
                    } else {
                        if (rin0Var != null) {
                            throw p3d1.k(x340Var2, -1888964821, false);
                        }
                        x340Var2.i0(-1888922861);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(440491983, new kz2(nz2Var, tob1Var, b2), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
