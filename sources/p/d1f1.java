package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d1f1 extends hab0 implements xu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ short e;
    public final /* synthetic */ dlv f;
    public final /* synthetic */ hdn0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d1f1(List list, List list2, long j, lee1 lee1Var, int i, dlv dlvVar, hdn0 hdn0Var, int i2) {
        super(3);
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = lee1Var;
        this.e = i;
        this.f = dlvVar;
        this.g = hdn0Var;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fO;
        Float fValueOf;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        err0 err0Var = this.g;
        if (err0Var.s() >= 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-2101843189);
            int iS = err0Var.s();
            List list = this.a;
            int iMin = Math.min(iS, p7h.L(list));
            if (iMin >= 0) {
                int i = 0;
                while (true) {
                    int iS2 = err0Var.s() - i;
                    List list2 = this.b;
                    if (iS2 < 0) {
                        fO = 0.0f;
                    } else {
                        fO = iS2 < this.h ? yoi1.o(((Number) list2.get(iS2)).floatValue(), 0.0f, 1.0f) : 1.0f;
                    }
                    if (i != iMin || err0Var.s() > p7h.L(list)) {
                        fValueOf = null;
                    } else {
                        Float f = (Float) o7h.t0(0, list2);
                        fValueOf = Float.valueOf(f != null ? yoi1.o(f.floatValue(), 0.0f, 1.0f) : 0.0f);
                    }
                    t0c.e(fO, i, this.e, 0, this.c, fValueOf, (String) list.get(i), x340Var2, this.f, this.d);
                    if (i == iMin) {
                        break;
                    }
                    i++;
                }
            }
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-2101172411);
            x340Var3.r(false);
        }
        return rih1.a;
    }
}
