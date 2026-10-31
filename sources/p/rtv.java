package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rtv extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ kp5 b;
    public final /* synthetic */ kvv c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtv(kp5 kp5Var, kvv kvvVar, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.b = kp5Var;
        this.c = kvvVar;
        this.e = iu30Var;
        this.d = qim0Var;
        this.f = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.b(iP, (b0k) obj, this.c, this.e, this.d);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.i(iP2, (b0k) obj, this.c, this.e, this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtv(kp5 kp5Var, kvv kvvVar, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = kp5Var;
        this.c = kvvVar;
        this.d = qim0Var;
        this.e = iu30Var;
        this.f = i;
    }
}
