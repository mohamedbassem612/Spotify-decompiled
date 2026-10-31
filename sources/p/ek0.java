package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ek0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek0(int i, hj0 hj0Var, int i2, jkr0 jkr0Var, iu30 iu30Var, int i3) {
        super(2);
        this.b = i;
        this.e = hj0Var;
        this.c = i2;
        this.f = jkr0Var;
        this.g = iu30Var;
        this.d = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                int i2 = this.b;
                int i3 = this.c;
                u1p1.h(i2, (hj0) obj5, i3, (jkr0) obj4, (iu30) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                int i4 = this.b;
                int i5 = this.c;
                acq0.r((fw90) obj5, i4, (pp90) obj4, i5, (ldo) obj3, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                int i6 = this.b;
                int i7 = this.c;
                ((res) obj5).m(i6, i7, (h3o0) obj4, (Function0) obj3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek0(res resVar, int i, int i2, h3o0 h3o0Var, Function0 function0, int i3) {
        super(2);
        this.e = resVar;
        this.b = i;
        this.c = i2;
        this.f = h3o0Var;
        this.g = function0;
        this.d = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek0(fw90 fw90Var, int i, pp90 pp90Var, int i2, ldo ldoVar, int i3) {
        super(2);
        this.e = fw90Var;
        this.b = i;
        this.f = pp90Var;
        this.c = i2;
        this.g = ldoVar;
        this.d = i3;
    }
}
