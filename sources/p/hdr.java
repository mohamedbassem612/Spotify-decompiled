package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hdr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hdr(xtb0 xtb0Var, c380 c380Var, iu30 iu30Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xtb0Var;
        this.c = c380Var;
        this.d = iu30Var;
        this.e = function0;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                p6p1.f(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                p6p1.f(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
