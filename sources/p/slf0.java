package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class slf0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slf0(mr20 mr20Var, boolean z, boolean z2, boolean z3, float f, Function0 function0, int i) {
        super(2);
        this.h = mr20Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = f;
        this.f = function0;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                wlf0.c((bmf0) obj3, this.b, this.e, this.f, this.c, this.d, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                pok1.f((mr20) obj3, this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slf0(bmf0 bmf0Var, boolean z, float f, Function0 function0, boolean z2, boolean z3, int i) {
        super(2);
        this.h = bmf0Var;
        this.b = z;
        this.e = f;
        this.f = function0;
        this.c = z2;
        this.d = z3;
        this.g = i;
    }
}
