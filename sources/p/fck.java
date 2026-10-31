package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fck extends hab0 implements vu30 {
    public final /* synthetic */ short X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ wck b;
    public final /* synthetic */ u7h c;
    public final /* synthetic */ fb5 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fck(wck wckVar, u7h u7hVar, fb5 fb5Var, boolean z, boolean z2, float f, int i, iu30 iu30Var, Function0 function0, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = wckVar;
        this.c = u7hVar;
        this.d = fb5Var;
        this.e = z;
        this.f = z2;
        this.g = f;
        this.h = i;
        this.i = iu30Var;
        this.t = function0;
        this.X = i2;
        this.Y = i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.X;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                short s2 = this.Y;
                rck.f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP, s2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                short s3 = this.Y;
                rck.f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP2, s3);
                break;
        }
        return rih1Var;
    }
}
