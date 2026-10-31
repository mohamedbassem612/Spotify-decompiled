package p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nc5 extends hab0 implements xu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ long d;
    public final /* synthetic */ lee1 e;
    public final /* synthetic */ dlv f;
    public final /* synthetic */ short g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ hdn0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nc5(List list, boolean z, List list2, long j, lee1 lee1Var, dlv dlvVar, int i, vu30 vu30Var, hdn0 hdn0Var, int i2) {
        super(3);
        this.a = list;
        this.b = z;
        this.c = list2;
        this.d = j;
        this.e = lee1Var;
        this.f = dlvVar;
        this.g = i;
        this.h = vu30Var;
        this.i = hdn0Var;
        this.t = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        float fO;
        Float fValueOf;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        err0 err0Var = this.i;
        if (err0Var.s() >= 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-672420623);
            int iS = err0Var.s();
            List list = this.a;
            int iMin = Math.min(iS, p7h.L(list));
            if (iMin >= 0) {
                int i = 0;
                while (true) {
                    List list2 = this.c;
                    boolean z = this.b;
                    if (z) {
                        int iS2 = err0Var.s() - i;
                        if (iS2 < 0) {
                            fO = 0.0f;
                        } else if (iS2 < this.t) {
                            fO = yoi1.o(((Number) list2.get(iS2)).floatValue(), 0.0f, 1.0f);
                        } else {
                            fO = 1.0f;
                        }
                    } else {
                        fO = 1.0f;
                    }
                    if (z && i == iMin && err0Var.s() <= p7h.L(list)) {
                        Float f = (Float) o7h.t0(0, list2);
                        fValueOf = Float.valueOf(f != null ? yoi1.o(f.floatValue(), 0.0f, 1.0f) : 0.0f);
                    } else {
                        fValueOf = null;
                    }
                    Float f2 = fValueOf;
                    qju qjuVar = (rju) list.get(i);
                    if (qjuVar instanceof qju) {
                        x340Var2.i0(948157844);
                        String str = qjuVar.a;
                        int i2 = i;
                        wqn1.d(fO, i2, this.g, 0, this.d, f2, str, x340Var2, this.f, this.e);
                        i = i2;
                        x340Var2.r(false);
                    } else {
                        float f3 = fO;
                        if (!(qjuVar instanceof pju)) {
                            throw p3d1.k(x340Var2, 948155761, false);
                        }
                        x340Var2.i0(948170073);
                        pju pjuVar = (pju) qjuVar;
                        x340 x340Var3 = x340Var2;
                        wqn1.a(i, this.f, pjuVar.a, pjuVar.b, f3, pjuVar.c, this.g, f2, this.h, x340Var3, 0);
                        x340Var2 = x340Var3;
                        x340Var2.r(false);
                    }
                    if (i == iMin) {
                        break;
                    }
                    i++;
                }
            }
            x340Var2.r(false);
        } else {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-671091560);
            x340Var4.r(false);
        }
        return rih1.a;
    }
}
