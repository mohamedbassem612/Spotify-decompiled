package p;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pfm extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfm(int i, c380 c380Var, boolean z) {
        super(3);
        this.d = c380Var;
        this.b = i;
        this.c = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        BottomSheetBehavior bottomSheetBehaviorG;
        lee1 lee1Var;
        byte b = this.a;
        boolean z = this.c;
        int i = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                hsl1 hsl1Var = (hsl1) obj2;
                rfm rfmVar = (rfm) obj4;
                int iIntValue = ((Number) ((haa) rfmVar).V1.getValue()).intValue() - hsl1Var.a.i(519).b;
                cwb cwbVar = ((t2u) rfmVar).Q1;
                if (cwbVar != null && (bottomSheetBehaviorG = cwbVar.g()) != null) {
                    if (!z) {
                        int iIntValue2 = ((Number) rfmVar.m2.getValue()).intValue();
                        if (iIntValue2 >= i) {
                            i = iIntValue2;
                        }
                        if (i <= iIntValue) {
                            iIntValue = i;
                        }
                    }
                    bottomSheetBehaviorG.J(iIntValue);
                }
                return hsl1Var;
            case 1:
                uwr uwrVar = cbx.a;
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("NavigableHeadingTitle", nim0.a);
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = k8b0.S0;
                    x340Var.s0(objT);
                }
                qim0 qim0VarThen = s161.b(qim0VarN, false, (iu30) objT).then(qim0Var);
                int iC = l1d.C(i);
                if (iC == 0) {
                    x340Var.i0(429118164);
                    lee1Var = cbx.d(x340Var).d;
                    x340Var.r(false);
                } else if (iC == 1) {
                    x340Var.i0(429120595);
                    lee1Var = cbx.d(x340Var).e;
                    x340Var.r(false);
                } else if (iC == 2) {
                    x340Var.i0(429123032);
                    lee1Var = cbx.d(x340Var).f;
                    x340Var.r(false);
                } else {
                    if (iC != 3) {
                        throw p3d1.k(x340Var, 429115935, false);
                    }
                    x340Var.i0(429125655);
                    lee1Var = cbx.d(x340Var).h;
                    x340Var.r(false);
                }
                uwo1.e(((xqn0) obj4).a, qim0VarThen, lee1Var, cbx.a(x340Var).b.a, new a0e1(5), (iu30) null, 2, false, z ? new cjc0(1) : new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1696);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                qxd0.z((Long) null, (c380) obj4, (qim0) null, this.b, this.c, (String) null, (String) null, (b0k) obj2, 6, 100);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfm(int i, xqn0 xqn0Var, boolean z) {
        super(3);
        this.b = i;
        this.d = xqn0Var;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfm(rfm rfmVar, boolean z, int i) {
        super(3);
        this.d = rfmVar;
        this.c = z;
        this.b = i;
    }
}
