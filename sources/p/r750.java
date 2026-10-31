package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r750 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p750 b;
    public final /* synthetic */ dh30 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r750(p750 p750Var, dh30 dh30Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = p750Var;
        this.c = dh30Var;
        this.d = iu30Var;
        this.e = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        dh30 dh30Var = this.c;
        p750 p750Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                cgj1.g(p750Var, dh30Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                cgj1.j(p750Var, dh30Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                cgj1.p(p750Var, dh30Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
