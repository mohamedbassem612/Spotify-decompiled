package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ist extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lqc b;
    public final /* synthetic */ tst c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ist(lqc lqcVar, tst tstVar, iu30 iu30Var, boolean z, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = lqcVar;
                this.c = tstVar;
                this.d = iu30Var;
                this.e = z;
                this.f = function0;
                this.g = i;
                super(2);
                break;
            default:
                this.b = lqcVar;
                this.c = tstVar;
                this.d = iu30Var;
                this.e = z;
                this.f = function0;
                this.g = i;
                break;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.j(this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.m(this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
