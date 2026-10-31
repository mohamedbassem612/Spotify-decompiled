package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pta0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ qim0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pta0(c380 c380Var, iu30 iu30Var, qim0 qim0Var, boolean z, Function0 function0, int i) {
        super(2);
        this.b = c380Var;
        this.e = iu30Var;
        this.g = qim0Var;
        this.c = z;
        this.f = function0;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(this.d | 1);
                ltn1.c(this.b, this.e, this.g, this.c, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.g;
                int iP2 = czo1.p(1);
                kbb.l(this.b, this.c, this.d, this.e, this.f, qim0Var, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pta0(c380 c380Var, boolean z, int i, iu30 iu30Var, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.b = c380Var;
        this.c = z;
        this.d = i;
        this.e = iu30Var;
        this.f = function0;
        this.g = qim0Var;
    }
}
