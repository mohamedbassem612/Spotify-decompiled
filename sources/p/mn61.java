package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mn61 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y441 b;
    public final /* synthetic */ gu61 c;
    public final /* synthetic */ kn61 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn61(y441 y441Var, gu61 gu61Var, kn61 kn61Var, iu30 iu30Var, Function0 function0, Function0 function1, int i, byte b) {
        super(2);
        this.a = b;
        this.b = y441Var;
        this.c = gu61Var;
        this.d = kn61Var;
        this.e = iu30Var;
        this.f = function0;
        this.g = function1;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.c(this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.c(this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
